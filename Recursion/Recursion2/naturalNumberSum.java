package Recursion.Recursion2;

public class naturalNumberSum {

    public static int getSum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + getSum(n - 1);
    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println("Sum is " + getSum(n));
    }
}
