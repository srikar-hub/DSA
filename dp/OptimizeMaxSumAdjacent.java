package dp;

import java.util.Scanner;

public class OptimizeMaxSumAdjacent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if (n == 1) {
            System.out.println(arr[0]);
            return;
        }
        System.out.println(solve(arr, arr.length - 1));
    }

    public static int solve(int arr[], int n) {
        int prev1 = arr[0];
        int prev2 = 0;
        int current = 0;
        for (int i = 1; i <= n; i++) {
            int pick = arr[i];
            if (i > 1) {
                pick = arr[i] + prev2;
            }
            int notpick = 0 + prev1;
            current = Math.max(pick, notpick);
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }
}
