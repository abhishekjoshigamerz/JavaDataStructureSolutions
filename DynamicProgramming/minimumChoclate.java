package DynamicProgramming;

public class minimumChoclate {
    public static int getMin(int arr[], int N) {
        int dp[] = new int[N + 1];
        int minimum = 0;
        dp[0] = 1;
        for (int i = 1; i < N; i++) {
            if (arr[i] > arr[i - 1]) {
                dp[i] += dp[i - 1] + 1;
            } else {
                dp[i] = 1;
            }
        }
        for (int i = N - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1] && dp[i] <= dp[i + 1]) {
                dp[i] = dp[i] + 1;
            }
        }
        for (int i = 0; i < N; i++) {
            minimum += arr[i];
        }
        return minimum;
    }
}
