package dp;

import java.util.Arrays;
import java.util.Scanner;

public class DPStairs {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        if(n<=2){
            System.out.println(n);
            return ;
        }
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(findNumberOfSquences(n,dp));
    }
    static int findNumberOfSquences(int n,int[] dp){
        dp[0]=0;
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
