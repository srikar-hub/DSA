package dp;

import java.util.Scanner;

public class PractiseMinOperationRequired {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        if(n==0){
            System.out.println("0");
            return ;
        }
        if(n==1){
            System.out.println("1");
            return;
        }
        if(n==2){
            System.out.println("1");
            return;
        }
        int dp[] = new int[n+1];

        System.out.println(findNumberOfSquences(n,dp));
    }
   static int findNumberOfSquences(int n,int[] dp){
      dp[0] = 0;
      dp[1] = 1;
      dp[2] = 2;
      for(int i=3;i<=n;i++){
        dp[i] = Math.min(dp[i-1],dp[i-2])+1;
      }
      return dp[n];

        

    }
}
