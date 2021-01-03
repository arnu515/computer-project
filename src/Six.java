/*
Write a program to accept length and breadth of a rectangle. 
Calculate and display the area, perimeter or diagonal of the rectangle as per 
the user’s choice
*/

import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int l = s.nextInt();
        int b = s.nextInt();

        System.out.println("Enter option a/p/d for area, perimeter and diagonal respectively: ");
        char ch = s.next().charAt(0);

        double ans = 0;

        switch(ch) {
            case 'a':
            ans = l * b;
            break;
            case 'p':
            ans = 2 * (b + l);
            break;
            case 'd':
            ans = Math.sqrt(Math.pow(l, 2) + Math.pow(b, 2));
            break;
            default: 
            break;
        }
        
        System.out.println(ans);
    }
}
