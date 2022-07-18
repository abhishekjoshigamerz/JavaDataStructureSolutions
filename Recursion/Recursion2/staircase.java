package Recursion.Recursion2;

public class staircase {
    public static int stairRe(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        return stairRe(n - 3) + stairRe(n - 2) + stairRe(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(stairRe(n));
    }
}
