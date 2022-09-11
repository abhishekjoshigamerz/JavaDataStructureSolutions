package DynamicProgramming;

public class shortestCommonSuperSequence {

    public static int shortestSuper(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int l = longestCommonSubSequence(s1, s2, n, m);
        return (n + m - l);
    }

    private static int longestCommonSubSequence(String s1, String s2, int n, int m) {
        int[][] dp = new int[n + 1][m + 1];
        int i, j;
        for (i = 0; i <= n; i++) {
            for (j = 0; j <= m; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }

        }
        return dp[n][m];
    }

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "ac";

        System.out.println("shortest Common super sequence is " + shortestSuper(s1, s2));
    }
}
