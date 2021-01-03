/*
Write a program to enter three numbers and A character. Find and print sum of the numbers 
If a given character is ‘s’ and product of the numbers If a given character is ‘p’. 
The program displays a message “invalid character” if the user enters another alphabet
*/

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        char ch = s.next().charAt(0);

        switch(ch) {
            case 's':
            System.out.println(a + b + c);
            break;
            case 'p':
            System.out.println(a * b * c);
            break;
            default:
            System.out.println("invalid character");
            break;
        }
    }
}