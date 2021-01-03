/*
Write a program to accept a number and check whether the number is divisible by 3 
as well as 5. Otherwise, decide: 
(a) Is the number divisible by 3 and not by 5? 
(b) Is the number divisible by 5 and not by 3? 
(c) Is the number neither divisible by 3 nor by 5? 
The program displays the message accordingly.
*/

import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        int n = new Scanner(System.in).nextInt();

        if (n % 15 == 0) System.out.println("Divisible by both 3 and by 5");
        else if (n % 3 == 0 && n % 5 != 0) System.out.println("Divisible by 3 but not by 5");
        else if (n % 5 == 0 && n % 3 != 0) System.out.println("Divisible by 5 but not by 3");
        else System.out.println("Not divisible by 3 or by 5");
    }
}
