package dp;

import java.util.*;

public class MemStairsProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        // int arr[] = new int[n];
        // for(int i=0;i<n;i++){
        //   arr[i] = sc.nextInt();
        // }
        System.out.println(findNumberOfSquences(n,dp));
    }
    static int findNumberOfSquences(int n,int[] dp){
        
        if(n<=2){
            return dp[n];
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        return dp[n] = findNumberOfSquences(n-1,dp)+findNumberOfSquences(n-2,dp);
    }

}
