package Patterns;

import java.util.Scanner;

public class Pattern1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       // starPattern(n);
        starPatternWithNum(n);
    }
    static void starPattern(int n){
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=i;j++){
               System.out.print("*");
            }
            System.out.println();
        }
        
    }
    static void starPatternWithNum(int n){
        int count = 1;
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=i;j++){
               System.out.print(count);
               count++;
            }
            System.out.println();
        }
        
    }

}
