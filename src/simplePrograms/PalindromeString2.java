package simplePrograms;
import java.util.Scanner;

public class PalindromeString2 {
    public static void main(String[] args){
        System.out.println("Palindrome using two pointer approch");

        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        boolean isPalindrome=false;

        int left=0;
        int right=str.length()-1;
        while(left<right){
            if (str.charAt(left) == str.charAt(right)) {
                isPalindrome = true;

                break;
            }
            left++;
            right--;
        }
        if(isPalindrome){
            System.out.println("Palindrome string");

        }else{
            System.out.println("Not a palindrome string");

        }


    }
}
