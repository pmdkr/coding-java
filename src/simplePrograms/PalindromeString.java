package simplePrograms;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        System.out.println("Enter a string : ");

        Scanner str = new Scanner(System.in);
        String inputStr = str.nextLine();
        String reverseStr = "";
        for (int i = inputStr.length() - 1; i >= 0; i--) {
            reverseStr = reverseStr + inputStr.charAt(i);
        }

        if (inputStr.equals(reverseStr)) {
            System.out.println("Palindrome");

        } else {
            System.out.println("Not a Palindrome");

        }
        str.close();


    }
}
