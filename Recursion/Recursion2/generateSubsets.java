package Recursion.Recursion2;

public class generateSubsets {
    public static void helperSet(String s, String curr, int i) {
        if (i == s.length()) {
            System.out.print(curr + " ");
            return;
        }

        helperSet(s, curr, i + 1);
        helperSet(s, curr + s.charAt(i), i + 1);
    }

    public static void generateSets(String s) {
        helperSet(s, "", 0);
    }

    public static void main(String[] args) {
        String s = "abc";
        generateSets(s);
    }
}
