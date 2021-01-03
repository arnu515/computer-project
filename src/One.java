/*
 Write a program to enter two numbers.
 If the first number is greater than display square of the smaller number
 and cube of the greater number otherwise vice versa. 
 If the numbers are equal, display the message “both number are equal
*/

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();

        if (a > b) {
            System.out.println(Math.pow(a, 3) + " "  + Math.pow(b, 2));
        } else if (a < b) {
            System.out.println(Math.pow(a, 3) + " "  + Math.pow(b, 2));
        } else {
            System.out.println("Both numbers are equal");
        }
    }
}