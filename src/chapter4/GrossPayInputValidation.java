package chapter4;

/*
 * WHILE LOOP:
 * Each store employee makes $15 an hour. Write a program that allows the employee
 * to enter the number of hours worked for the week. Do not allow overtime.
 */

import java.util.Scanner;

public class GrossPayInputValidation {

    public static void main (String args[])
    {
        int rate = 15;
        int maxHours = 40;

        System.out.println("How many hours did you work this week? ");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        while(hoursWorked>maxHours || hoursWorked < 1)
        {
            System.out.println("Oops! Wrong input. Hours should be in between 1 to 40. Try again.");
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();

        double grossPay = hoursWorked * rate;
        System.out.println("Your gross pay is "+ grossPay + " dollar.");
    }
}
