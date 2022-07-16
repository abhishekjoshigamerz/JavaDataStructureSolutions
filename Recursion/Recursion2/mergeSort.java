package Recursion.Recursion2;

import java.util.Scanner;

public class mergeSort {

    public static void merge(int[] s1, int[] s2, int[] d) {
        int i = 0, j = 0, k = 0;
        while (i < s1.length && j < s2.length) {
            if (s1[i] <= s2[j]) {
                d[k] = s1[i];
                i++;
                k++;
            } else {
                d[k] = s2[j];
                k++;
                j++;
            }
        }
        if (i < s1.length) {
            while (i < s1.length) {
                d[k] = s1[i];
                i++;
                k++;
            }
        }
        if (j < s2.length) {
            while (j < s2.length) {
                d[k] = s2[j];
                k++;
                j++;
            }
        }
    }

    public static void mergeSortfunction(int[] input) {
        if (input.length <= 1) {
            return;
        }

        int a[] = new int[input.length / 2];
        int b[] = new int[input.length - a.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = input[i];
        }
        for (int i = input.length / 2; i < input.length; i++) {
            b[i - input.length / 2] = input[i];
        }
        mergeSortfunction(a);
        mergeSortfunction(b);
        merge(a, b, input);
    }

    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static void printArray(int input[]) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] input = takeInput();
        mergeSortfunction(input);
        printArray(input);
    }
}
