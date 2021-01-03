/*
Write a program to enter three sides of a triangle and check whether the triangle
 is possible or not. If possible then display whether it is equilateral, an isosceles 
 or scalene triangle otherwise display the message “triangle is not possible”
*/

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        if (!(a + b > c && b + c > a && c + a > b)) {
            System.out.println("Triangle is not possible");
            return;
        }

        String typeOfTriangle = "";

        if (a == b && b == c) typeOfTriangle = "equilateral";
        else if (a == b || b == c || c == a) typeOfTriangle = "isosceles";
        else typeOfTriangle = "scalene";

        System.out.println("The triangle is " + typeOfTriangle)
    }
}
