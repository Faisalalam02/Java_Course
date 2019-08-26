package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {

    static double overminuteRate = .25;
    static double taxRate = .15;

    public static void main (String args[])
    {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Please enter base cost of the plan: ");
        double planFee = scanner.nextDouble();
        System.out.println("Please enter number of overage minutes");
        double overageMinutes = scanner.nextDouble();
        scanner.close();
        // calling  overagefeeCalculation
        double overageTotal1 = overagefeeCalculation(overageMinutes);

        // calling tax calculation method
        double calculatedTax = taxCalculation(planFee, overageTotal1);

        // calling totalBill method
         totalBill(planFee, overageTotal1, calculatedTax);

    }

    public static double overagefeeCalculation(double overageMinutes1)
    {
        double overageTotal = overageMinutes1 * overminuteRate;
        return overageTotal;
    }

    public static double taxCalculation (double planFee1 , double overageTotal1)
    {
           double totalTax =  (planFee1 + overageTotal1) * taxRate;
           return totalTax;
    }
    public static void totalBill (double planFee2, double overagetotal2 , double calculatedTax1)
    {
        double billtotal = planFee2 + overagetotal2 + calculatedTax1;
        System.out.println("Phone bill statement.");
        System.out.println("Plan: $" + planFee2);
        System.out.println("Overage: $" + overagetotal2);
        System.out.println(String.format("Tax: $%.2f" , calculatedTax1));
        System.out.println(String.format("Total Bill: $%.2f" , billtotal));

    }
}
