package DynamicProgramming;

public class subSetsum {

    public static boolean SubSetSumExists(int array[], int n, int sum) {
        boolean subSet[][] = new boolean[sum + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            subSet[0][i] = true;
        }

        for (int i = 1; i <= sum; i++) {
            subSet[i][0] = false;
        }

        for (int i = 1; i <= sum; i++) {
            for (int j = 1; j <= n; j++) {
                subSet[i][j] = subSet[i][j - 1];
                if (i >= array[j - 1]) {
                    subSet[i][j] = subSet[i][j] || subSet[i - array[j - 1]][j - 1];
                }
            }
        }
        return subSet[sum][n];
    }
}
