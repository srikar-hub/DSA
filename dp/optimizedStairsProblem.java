package dp;

import java.util.Currency;
import java.util.Scanner;

public class optimizedStairsProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=2){
             System.out.println(n);
             return;
        }
        System.out.println(solve(n));
    }
    static int solve(int n){
        int prev1 = 2;
        int prev2 = 1;
        int current =0;
        for(int i=3;i<=n;i++){
            current = prev1+prev2;
            prev2 = prev1;
            prev1 = current; 
        }
        return current;
    }
}
