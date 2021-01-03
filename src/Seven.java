/* Write a program that displays the result of the following evaluations based on the number entered by the user.

a) absolute value of a number

b) square root of a number

c) cube root of a number.

d) random number between 0 and 1*/

import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("1) absolute value of a number\n" +
                           "2) square root of a number\n" +
                           "3) cube root of a number.\n" +
                           "4) random number between 0 and 1\n");
        System.out.println("Enter number:");

        int choice = s.nextInt();

        switch(choice) {
            case 1:
            System.out.println("Enter a number");
            int n1 = s.nextInt();
            System.out.println(Math.abs(n1));
            break;
            case 2:
            System.out.println("Enter a number");
            int n2 = s.nextInt();
            System.out.println(Math.sqrt(n2));
            break;
            case 3:
            System.out.println("Enter a number");
            int n3 = s.nextInt();
            System.out.println(Math.cbrt(n3));
            break;
            case 4:
            System.out.println(Math.random());
            break;
        }
    }
}