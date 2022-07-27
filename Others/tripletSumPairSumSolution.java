import java.util.Arrays;

public class Solution {

    public static int tripletSum(int arr[], int num) {

        Arrays.sort(arr); // O(nlogn)
        int n = arr.length;
        int numTriplets = 0;

        for (int i = 0; i < n; i++) {

            int pairSumFor = num - arr[i];
            int numPairs = pairSum(arr, (i + 1), (n - 1), pairSumFor);
            numTriplets = numTriplets + numPairs;
        }
        return numTriplets;
    }

    public static int pairSum(int[] arr, int i, int j, int num) {

        Arrays.sort(arr);
        int count = 0;

        while (i < j) {

            if (arr[i] + arr[j] == num) {

                if (arr[i] == arr[j]) {
                    int n = (j - i) + 1;
                    count += (n * (n - 1)) / 2;
                    return count;
                }
                int si = i + 1;
                int ei = j - 1;

                while (si <= ei && arr[si] == arr[i]) {
                    si++;
                }
                while (ei >= si && arr[ei] == arr[j]) {
                    ei--;
                }
                int totalElementFromStart = si - i;
                int totalElementsFromEnd = j - ei;

                count += (totalElementFromStart * totalElementsFromEnd);
                i = si;
                j = ei;
            } else if (arr[i] + arr[j] > num) {
                j--;
            } else if (arr[i] + arr[j] < num) {
                i++;
            }
        }
        return count;
    }
}
