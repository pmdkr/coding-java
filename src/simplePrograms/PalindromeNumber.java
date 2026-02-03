package simplePrograms;

import java.util.*;

public class PalindromeNumber {

    public static boolean isPalindrome(int num) {
        int original = num;
        int reverse = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num = num / 10;
        }
        return original == reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        boolean palindrome = isPalindrome(num);
        if (palindrome) {
            System.out.println("Palindrome number");

        } else {
            System.out.println("Not a palindrome number");
        }
        sc.close();
    }
}
