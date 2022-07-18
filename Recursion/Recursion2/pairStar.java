package Recursion.Recursion2;

public class pairStar {
    public static String addStar(String input) {
        if (input.length() == 1) {
            return input;
        }
        String smallAns = addStar(input.substring(1));
        if (input.charAt(0) == input.charAt(1)) {
            return input.charAt(0) + "*" + smallAns;
        } else {
            return input.charAt(0) + smallAns;
        }
    }

    public static void main(String[] args) {
        String s = "hello";

        System.out.println(addStar(s));
    }
}
