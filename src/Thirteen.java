//Write a program to display the sum of any two numbers for ten iterations. 
// If sum of two numbers is negative then the program terminates

import java.util.Scanner;

public class Thirteen {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            int sum = a + b;
            if (sum < 0) return;
            else System.out.println(sum);
        }
    }
}
