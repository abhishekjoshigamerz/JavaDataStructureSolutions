package DynamicProgramming;

public class longestCommonSubsequenceRecursion {

    public static int LCS(String s, String t, int i, int j) {
        if (i >= s.length() || j >= t.length()) {
            return 0;
        }
        int myAns;
        if (s.charAt(i) == t.charAt(j)) {
            int smallAns = LCS(s, t, i + 1, j + 1);
            myAns = 1 + smallAns;
        } else {
            // Recursion call of 2 strings and find the max one here
            int ans1 = LCS(s, t, i + 1, j);
            int ans2 = LCS(s, t, i, j + 1);
            myAns = Math.max(ans1, ans2);
        }
        return myAns;
    }

    public static void main(String[] args) {
        String s = "bedgmc";
        String t = "abdfglc";
        System.out.println("Longest Common subSequence " + LCS(s, t, 0, 0));
    }
}
