package chapter4;

import java.util.Scanner;

/*
 * FOR LOOP:
 * Write a cashier program that will scan a given number of items and tally the cost.
 */
public class Cashier {

    public static void main (String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many items you purchased? ");
        int quantity = scanner.nextInt();
        double totalCost = 0;
        for(int i=0; i< quantity; i++)
        {
            System.out.println("Enter the cost of the item: ");
            double price = scanner.nextDouble();
            totalCost += price;
        }
        System.out.println("Total cost of items are "+ totalCost + " dollar");
    }
}
