
import java.util.Scanner;

public class SetMatrixToZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the rows");
        int n=sc.nextInt();
        System.out.println("Enter the size of the columns");
        int m=sc.nextInt();
        int matrix[][]=new int[n][m] ;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               matrix[i][j] = sc.nextInt();
            }         
        }
        System.out.println("After setting Zeroes");
        int sol[][] = setMarixToZeroes(matrix,n,m);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.err.print(sol[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] setMarixToZeroes(int matrix[][],int n,int m){
       int[] row = new  int[n];
       int[] column = new int[m];
        // Default values will be 0
    //    for (int i = 0; i < n; i++) {
    //      row[i] = -1; 
    //    }
    
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(matrix[i][j]==0){
                row[i] = 1;
                column[j] = 1;
            }
        }
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(matrix[i][j]!=0){
                if(row[i]==1 || column[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
    }
    return matrix;
    }
}
