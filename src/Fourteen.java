/*Write a program in java to display the first 10 numbers of the Fibonacci series */

public class Fourteen {
    public static void main(String[] args) {
        int a = 0, b = 1, f = 1;

        for (int i = 1; i <= 10; i++) {
            System.out.print(f + " ");
            f = a + b;
            a = b;
            b = f;
        }
        System.out.println("");
    }
}