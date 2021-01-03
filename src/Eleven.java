/* Write a program to display the sum of positive even numbers and negative odd
 numbers entered by the user. */

import java.util.Scanner;

public class Eleven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.println("Enter numbers. Enter 0 to quit");

            int num = s.nextInt();

            if (num < 0 && num % 2 != 0) sum += num;
            else if (num > 0 && num % 2 == 0) sum += num;
            else if (num == 0) break;
        }
        
        System.out.println(sum);
    }
}
