package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {

    public static void main (String args[])
    {
        double overminuteRate = .25;
        double taxRate = .15;

        Scanner scanner  = new Scanner(System.in);
        System.out.println("Please enter Plan Fee. ");
        double planFee = scanner.nextDouble();
        System.out.println("Please enter number of overage minutes");
        double overageMinutes = scanner.nextDouble();

    }

    public static void taxCalculation ()
    {

    }
}
