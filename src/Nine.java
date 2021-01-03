/*Write the program to accept any 10 numbers. 
Print the sum of only the negative values. */

import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter 10 numbers");
        int sum = 0;
        for (int i = 0; i < 10; i ++) {
            int n = s.nextInt();
            if (n < 0) sum += n;
        }

        System.out.println(sum);
    }
}