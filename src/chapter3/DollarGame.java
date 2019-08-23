package chapter3;

import java.util.Scanner;
/*
    You'll ask them how many pennies would you like?
    How many nickels would you like?
    How many dimes?
    And then, how many quarters?

    If it's exactly one dollar then they win the game.
    If it's more than one dollar, then you need to tell them that it's more than one dollar and how much they went over.
    If it's less than one dollar, tell them how much they went under.
    */
public class DollarGame {

    public static void main (String args[])
    {
        //Initialize known values
        int count = 100;

        // Gt unknown values
        System.out.println("For winning this game, you need to enter enough change to make $1 exactly ");

        System.out.println("How many pennies you have: ");
        Scanner scanner = new Scanner(System.in);
        int pennyCount = scanner.nextInt();

        System.out.println("How many nickels you have: ");
        int nickelCount = scanner.nextInt();

        System.out.println("How many dimes you have: ");
        int dimesCount = scanner.nextInt();

        System.out.println("How many quarters you have: ");
        int quarterCount = scanner.nextInt();
        scanner.close();

        int nickel = 5 * nickelCount;
        int dimes = 10 * dimesCount;
        int quarter = 25 * quarterCount;

        int sum = pennyCount + nickel + dimes + quarter;
        if(sum == count)
        {
            System.out.println("Hurrah! You win the game.");
        }
        else if(sum > count)
        {
           int exceedingAmount = sum - count;
           System.out.println("You are exceeding "+ exceedingAmount + " cent from a dollar");
        }
        else
        {
            int underAmount = count - sum;
            System.out.println("You are "+ underAmount + " cent shorter from a dollar");
        }
    }
}
