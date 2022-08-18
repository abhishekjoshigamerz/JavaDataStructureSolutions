package Recursion3;

import java.util.Scanner;

public class PrintSubSequence {

    public static void PrintAllSubSequence(String input, String soFarString) {
        if (input.length() == 0) {
            System.out.println(soFarString);
            return;
        }

        String smallInput = input.substring(1);
        PrintAllSubSequence(smallInput, soFarString);
        PrintAllSubSequence(smallInput, soFarString + input.substring(0));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String");
        String input = s.next();
        PrintAllSubSequence(input, "");
    }
}
