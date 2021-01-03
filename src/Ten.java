/*Write a program to display all odd numbers from 1 to 20 by using continue 
statement in while loop. */

public class Ten {
    public static void main(String[] args) {
        String numbers = "";

        int i = 0;
        while (i < 20) {
            i++;
            if (i % 2 == 0) continue;
            numbers += i + " ";
        }

        System.out.println(numbers);
    }
}