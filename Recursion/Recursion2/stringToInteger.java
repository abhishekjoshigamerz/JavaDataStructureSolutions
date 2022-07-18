package Recursion.Recursion2;

public class stringToInteger {

    public static int convertToString(String s) {
        if (s.length() == 1) {
            return (s.charAt(0) - '0');
        }
        int smallOutput = convertToString(s.substring(0, s.length() - 1));
        int lastDigit = s.charAt(s.length() - 1) - '0';
        return smallOutput * 10 + lastDigit;
    }

    public static void main(String[] args) {
        String s = "1234";
        System.out.println(convertToString(s));
    }

}
