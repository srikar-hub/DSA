package dp;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSumDP {
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
            int n = sc.nextInt();
            int arr[] = new int[n];
            int dp[] = new int[n];
            Arrays.fill(dp,-1);
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            if(n==1){
                System.out.println(arr[0]);
                return;
            }
            System.out.println(solve(arr,arr.length-1,dp));
    }
    public static int solve(int arr[],int n,int[] dp){
        dp[0] = arr[0]; 
        for(int i=1;i<=n;i++){
            int pick =  arr[i];
            if(i>1){
                pick = arr[i]+dp[i-2];
            }
            int notpick = 0+dp[i-1];
            dp[i] = Math.max(pick,notpick);
        }  
        return dp[n];
    }
}
