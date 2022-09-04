
// You are given N, and for a given N x N chessboard, find a way to place N queens such that no queen can attack any other queen on the chess board. A queen can be killed when it lies in the same row, or same column, or the same diagonal of any of the other queens. You have to print all such configurations.
// Input Format :
// Line 1 : Integer N
// Output Format :
// One Line for every board configuration. 
// Every line will have N*N board elements printed row wise and are separated by space
// Note : Don't print anything if there isn't any valid configuration.
// Constraints :
// 1<=N<=10
// Sample Input 1:
// 4
// Sample Output 1 :
// 0 1 0 0 0 0 0 1 1 0 0 0 0 0 1 0 
// 0 0 1 0 1 0 0 0 0 0 0 1 0 1 0 0 

package BackTracking;

import java.util.*;

public class nQueenCode {

    static boolean isPossible(int n, int row, int col, int board[][]) {

        // Same Column
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 1) {
                return false;
            }
        }
        // Upper Left Diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // Upper Right Diagonal

        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    private static void placeQueen(int n, int row, int board[][]) {

        if (row == n) {
            // We have reached some solution.
            // Print the board matrix
            // return

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(board[i][j] + " ");
                    // cout << board[i][j] << " ";
                }

            }
            System.out.println("");
            // cout<<endl;
            return;

        }

        // Place at all possible positions and move to smaller problem
        for (int j = 0; j < n; j++) {

            if (isPossible(n, row, j, board)) {
                board[row][j] = 1;
                placeQueen(n, row + 1, board);
                board[row][j] = 0;
            }
        }
        return;

    }

    public static void placeNQueens(int n) {

        /*
         * Your class should be named Solution.
         * Don't write main() function.
         * Don't read input, it is passed as function argument.
         * Print output as specified in the question
         */
        int board[][] = new int[n][n];
        placeQueen(n, 0, board);

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        placeNQueens(n);
    }
}
