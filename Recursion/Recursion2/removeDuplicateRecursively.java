package Recursion.Recursion2;

public class removeDuplicateRecursively {
    public static String removeConsecutiveDuplicates(String s) {
        if (s.length() <= 1) {
            return s;
        }

        if (s.charAt(0) == s.charAt(1)) {
            return removeConsecutiveDuplicates(s.substring(1));
        } else {
            return s.charAt(0) + removeConsecutiveDuplicates(s.substring(1));
        }

    }

    public static void main(String[] args) {
        String S1 = "geeksforgeeks";
        System.out.println(removeConsecutiveDuplicates(S1));

        String S2 = "aabcca";
        System.out.println(removeConsecutiveDuplicates(S2));
    }
}
