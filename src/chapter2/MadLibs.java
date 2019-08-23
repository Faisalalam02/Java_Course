package chapter2;

import java.util.Scanner;

public class MadLibs {

    public static void main (String args[])
    {
        Scanner scanner = new Scanner(System.in);

        // Asking season of the year.
        System.out.println("Enter the season of year: ");
        String season = scanner.next();

        // Asking whole number.
        System.out.println("Enter the whole number: ");
        int number = scanner.nextInt();

        // Asking whole number.
        System.out.println("Enter an adjective: ");
        String adjective = scanner.next();

        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffee.");

    }
}
