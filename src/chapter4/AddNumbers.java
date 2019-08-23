package chapter4;

import java.util.Scanner;

/*
 * DO WHILE LOOP:
 * Write a program that allows a user to enter two numbers,
 * and then sums up the two numbers. The user should be able to
 * repeat this action until they indicate they are done.
 */
public class AddNumbers {

        public static void main (String args[])
        {
            Scanner scanner = new Scanner(System.in);
            String ans;
            do {
                System.out.print("Enter first number for addition: ");
                double num1 = scanner.nextDouble();

                System.out.print("Enter second number for addition: ");
                double num2 = scanner.nextDouble();

                double sum = num1 + num2;
                System.out.println("The sum is "+ sum);

                System.out.println("Would you like to try again? Yes/No");
                ans = scanner.next();
            }
            while (!ans.equals("No"));
            scanner.close();
        }
}
