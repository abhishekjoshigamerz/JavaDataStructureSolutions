package Recursion.Recursion2;

public class geometricSum {

    public static double getSum(int k) {
        if (k == 0) {
            return 1;
        }
        double ans = 1 / Math.pow(2, k) + getSum(k - 1);

        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(getSum(n));
    }
}
