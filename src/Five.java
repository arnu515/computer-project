/* 
Upto 20000          Ac—5%       TV 2.5%

20001-40000         AC – 7.5%   TV 5%

40001-60000         AC-10%      TV-7%

More than 60000     AC 12%      TV 8.5%

Write a program to input the amount of purchase. The customer has to pay 12.5% as 
sales tax on price after the discount. Print net amount. Enter ‘1’ for AC and ‘2’
for TV
*/

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int amount = s.nextInt();
        int x = s.nextInt();
        // false = TV, true = AC
        boolean acOrTv = false;

        if (x == 1) acOrTv = true;
        else if (x == 2) acOrTv = false;
        else System.exit(1);

        double discount = 0;
        double total = amount;

        if (amount <= 20000) discount = acOrTv ? 5 : 2.5;
        else if (amount > 20000 && amount <= 40000) discount = acOrTv ? 7.5 : 5;
        else if (amount > 40000 && amount <= 60000) discount = acOrTv ? 10 : 7;
        else discount = acOrTv ? 12 : 8.5;

        // applying discount;
        total -= amount * (discount / 100);

        // sales tax
        total += total * 0.125;

        System.out.println(total);
    }
}
