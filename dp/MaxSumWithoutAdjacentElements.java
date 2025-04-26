    package dp;
    import java.util.*;
    public class MaxSumWithoutAdjacentElements {
        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            int n = sc.nextInt();
            int arr[] = new int[n];
            int dp[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            Arrays.fill(dp,-1);
            System.out.println(solve(arr,arr.length-1,dp));
        }
        public static int solve(int arr[],int i,int[] dp){
            if(i<0){
                return 0;
            }
            if(i==0){
                return arr[i];
            }
            if(dp[i]!=-1){
                return dp[i];
            }
            int pick =  solve(arr, i-2,dp) + arr[i];
            int notpick = 0+solve(arr,i-1,dp);
            return dp[i] = Math.max(pick,notpick);
        }
    }
