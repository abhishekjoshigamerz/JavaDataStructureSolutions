package DynamicProgramming;

public class knapsack01 {

    public static int knapSack(int W, int val[], int wt[], int i) {
        int ans;
        if (i == val.length) {
            return 0;
        }

        if (wt[i] <= W) {
            int ans1 = val[i] + knapSack(W - wt[i], val, wt, i + 1);
            int ans2 = knapSack(W, val, wt, i + 1);
            ans = Math.max(ans1, ans2);
        } else {
            ans = knapSack(W, val, wt, i + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        int val[] = { 200, 300, 100 };
        int wt[] = { 20, 25, 30 };
        int W = 50;
        int ans = knapSack(W, val, wt, 0);
        System.out.println("Answer here is " + ans);
    }
}
