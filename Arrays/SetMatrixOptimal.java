package Arrays;

import java.util.Scanner;

public class SetMatrixOptimal {
    
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
       // int[] row = new  int[n]-> matrix[..][0]
       //int[] column = new int[m] -> matrix[0][]
     int col = 1;
     for(int i=0;i<n;i++){
     for(int j=0;j<m;j++){
         if(matrix[i][j]==0){
             matrix[i][0] =0;
             if(j!=0){
                matrix[0][j] = 0;
             }
             else{
                col=0;
             }
         }
     }
 }
 for(int i=1;i<n;i++){
     for(int j=1;j<m;j++){
         if(matrix[i][j]!=0){
             if(matrix[i][0]==0 || matrix[0][j]==0){
                 matrix[i][j]=0;
             }
         }
     }
 }
 if(matrix[0][0]==0){
    for(int j=0;j<m;j++){
        matrix[0][j] = 0;
    }
 }
 if(col==0){
    for(int i=0;i<n;i++){
        matrix[i][0] = 0;
    }
 }
 
 return matrix;
 }
}
