package Recursion.Recursion2;

import java.util.*;

public class print2dArray {
    static Scanner s = new Scanner(System.in);

    public static void print2DArray(int input[][]) {
        // Write your code here

        for (int i = 0; i < input.length; i++) {
            int row = i;
            while (row < input.length) {
                for (int j = 0; j < input[i].length; j++) {
                    System.out.print(input[i][j] + " ");
                }
                System.out.println(" ");
                row++;
            }

        }
    }

    public static void main(String[] args) {

        int numRows = s.nextInt();
        int numCols = s.nextInt();

        int[][] input = new int[numRows][numCols];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                input[i][j] = s.nextInt();
            }
        }
        print2DArray(input);

    }
}
