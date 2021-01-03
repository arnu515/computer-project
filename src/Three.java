/*
Write a program to input three unequal numbers and display the second smallest number.
*/

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        if (a == b || a == c || b == c) {
            System.out.println("Numbers are equal");
            return;
        }

        int min = 0;

        if (a < b && a > c || a < c && a > b) {min = a;}
        else if (b < a && b > c || b < c && b > a) {min = b;}
        else if (c < b && c > a || c < a && c > b) {min = c;}

        System.out.println(min);
    }
}