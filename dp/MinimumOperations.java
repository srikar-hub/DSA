package dp;

public class MinimumOperations {
    public static void main(String[] args) {
        String str1 = "abcdg";
        String str2 = "abc";
        System.out.println(findMinimumOperations(str1,str2));
    }

    static int findMinimumOperations(String str1,String str2){
        int m = str1.length();
        int n = str2.length();
        if(str1.equals(str2)){
            return 0;
        }
        int dp[][] = new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            dp[i][0] = i;
        }
        for(int j=0;j<=n;j++){
            dp[0][j] = j;
        }
        for(int i=1;i<=m;i++){

            for(int j=1;j<=n;j++){
                int cost;
                if(str1.charAt(i-1)==(str2.charAt(j-1))){

                    cost = 0;
                }
                else{
                    cost = 1;
                }
            dp[i][j] = Math.min(Math.min(dp[i-1][j-1]+cost,dp[i-1][j]+1),dp[i][j-1]+1);
            }
        }
        return dp[m][n];
    }
}
