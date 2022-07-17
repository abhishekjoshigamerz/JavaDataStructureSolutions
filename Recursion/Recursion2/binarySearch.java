package Recursion.Recursion2;

public class binarySearch {
    public static int recursiveSearch(int[] input, int start, int range, int x) {
        if (range >= start) {
            int mid = start + (range - start) / 2;
            if (input[mid] == x) {
                return mid;
            }
            if (input[mid] > x) {
                return recursiveSearch(input, start, mid - 1, x);
            } else {
                return recursiveSearch(input, mid + 1, range, x);
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] input = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(recursiveSearch(input, 0, input.length - 1, 5));
    }
}
