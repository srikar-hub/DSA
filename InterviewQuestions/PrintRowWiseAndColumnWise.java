package InterviewQuestions;

import java.util.Scanner;

public class PrintRowWiseAndColumnWise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Rows and columns");
        int n = sc.nextInt();
       

        int matix[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matix[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            System.out.print("Row"+(i+1)+":");
            for(int j=0;j<n;j++){
                
                System.out.print(matix[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            System.out.print("Column"+(i+1)+":");
            for(int j=0;j<n;j++){
                
                System.out.print(matix[j][i]+" ");
            }
            System.out.println();
        }
    }
}
