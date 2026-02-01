
package simplePrograms;

import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {
        System.out.println("Enter any to run the loop");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for (int i = 1; i <= input; i++) {
            System.out.println(i);
        }

    }

}
