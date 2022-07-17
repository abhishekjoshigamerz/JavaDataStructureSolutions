package Recursion.Recursion2;

public class isStringPalindrome {
    public static boolean isPalindrome(String input, int start, int end) {

        if (start >= end) {
            return true;
        }

        return (input.charAt(start) == input.charAt(end)) && isPalindrome(input, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String s = "abbcbba";
        System.out.println(isPalindrome(s, 0, s.length() - 1));
    }
}
