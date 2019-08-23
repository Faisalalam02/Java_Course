package chapter3;

/*
IF Statement.
All sales people get a payment of $1000 a week.
Sales people who exceed 10 sales get an additional bonus of $250.
 */

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class SalaryCalculator {

    public static void main (String args[])
    {
        // initialize known values
        int salary = 1000;
        int bonus = 250;
        int salesCount = 10;

        // Get input for unknown values
        System.out.println("How many sales did employee make this week? ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();

        // Quick detour for the bonus earner
        if(sales > salesCount)
        {
            salary = salary + bonus;
        }

        //output
        System.out.println("The employee salary is: " + salary);
    }
}
