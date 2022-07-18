package Recursion.Recursion2;

public class checkAB {

    public static boolean checkABf(String s) {
        if (s.length() == 0) {
            return true;
        }
        if (s.charAt(0) == 'a') {
            if (s.substring(1).length() > 1 && s.substring(1, 3).equals("bb")) {
                return checkABf(s.substring(3));
            } else {
                return checkABf(s.substring(1));
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String s = "abb";
        System.out.println(checkABf(s));
    }
}
