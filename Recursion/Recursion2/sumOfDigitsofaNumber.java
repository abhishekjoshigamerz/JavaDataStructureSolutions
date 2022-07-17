package Recursion.Recursion2;

public class sumOfDigitsofaNumber {
    public static int sumofDigits(int N) {
        if (N == 0) {
            return 0;
        }
        return N % 10 + sumofDigits(N / 10);
    }

    public static void main(String[] args) {
        int n = 257;
        System.out.println(sumofDigits(n));
    }
}
