package chapter4;

import java.util.Scanner;

public class LetterSearch {

    public static void main (String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text: ");
        String text = scanner.next();

        boolean letterFound = false;
        for(int i=0; i<text.length(); i++)
        {
            char currentLetter = text.charAt(i);
            if(currentLetter == 'A' || currentLetter == 'a')
            {
                letterFound = true;
                break;
            }
        }
        if(letterFound)
        {
            System.out.println("The text contains the letter A");
        }
        else
        {
            System.out.println("The text does not contain letter A");
        }

    }
}
