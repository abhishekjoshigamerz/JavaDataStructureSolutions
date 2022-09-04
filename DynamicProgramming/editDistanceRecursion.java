package DynamicProgramming;

public class editDistanceRecursion {
    public static int editDistanceHelper(int i, int j, String a, String b) {
        if (i == 0) {
            return j;
        }
        if (j == 0) {
            return i;
        }
        int ans = 1 + Math.min(Math.min(editDistanceHelper(i, j - 1, a, b), editDistanceHelper(i - 1, j, a, b)),
                editDistanceHelper(i - 1, j - 1, a, b));
        if (a.charAt(i - 1) == b.charAt(j - 1)) {
            ans = Math.min(ans, editDistanceHelper(i - 1, j - 1, a, b));
        }
        return ans;
    }

    public static int editDistance(String a, String b) {
        int n = a.length();
        int m = b.length();
        return editDistanceHelper(n, m, a, b);
    }

    public static void main(String[] args) {
        String a = "abc";
        String b = "dc";

        System.out.println("Edit Distance is " + editDistance(a, b));

    }
}
