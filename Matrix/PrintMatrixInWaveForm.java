package Matrix;

import java.util.Scanner;

public class PrintMatrixInWaveForm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Rows");
        int row = sc.nextInt();
        System.out.println("Enter number of Columns");
        int column = sc.nextInt();

        int matix[][] = new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                matix[i][j] = sc.nextInt();
            }
        }
        int n = matix[0].length;
        for(int i=0;i<n;i++){
            if(i%2==0){
                for(int j=0;j<row;j++){
                    System.out.print(matix[j][i]);
                }
            }
            else{
                for(int k=row-1;k>=0;k--){
                    System.out.print(matix[k][i]);
                }
                
            }
            System.out.println();

        }

        
        
    }
}
