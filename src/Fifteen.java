/** 
Write a program to input any 10 numbers (including positive and negative). 
Perform the following tasks: 
(a) Count the positive numbers
(b) Count the negative numbers
(c) Sum of positive numbers 
(d) Sum of negative numbers
*/

import java.util.Scanner;
public class Fifteen {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int p = 0, n = 0, sP = 0, sN = 0;
        
        for (int i = 0; i < 10; i++) {
            int num = s.nextInt();
            if (num > 0) {
                p++;
                sP += num;
            } else if (num < 0) {
                n++;
                sN += num;
            }
        }

        System.out.println(p);
        System.out.println(n);
        System.out.println(sP);
        System.out.println(sN);
    }
}