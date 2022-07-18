package Recursion.Recursion2;

public class countZeros {
    public static int countNumberofZero(int n) {
        if (n < 10) {
            if (n == 0) {
                return 1;
            } else {
                return 0;
            }
        }
        if (n % 10 == 0) {
            return countNumberofZero(n / 10) + 1;
        } else {
            return countNumberofZero(n / 10);
        }

    }

    public static void main(String[] args) {
        int n = 1000;
        System.out.println(countNumberofZero(n));
    }
}
