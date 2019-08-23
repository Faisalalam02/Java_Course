package chapter4;

import java.awt.event.KeyEvent;

import java.util.Random;
import java.util.Scanner;

public class RollTheDieGame {
    public static void main (String args[])
    {
        int spaces = 20;
        int maxRoll = 5;
        int currentSpace = 0;

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome on Roll The Die Game.");
        System.out.println("Game instructions: Press enter to Roll the dice. In order to win the game you need " +
                "to complete 20 spaces within 5 turns. You will be lose if spaces less than 20 in 5 turns " +
                "OR spaces more than 20 in 5 turns or less then 5 turns. Lets begin the game!");
        for (int i = 1; i <= 5; i++) {

            int die = random.nextInt(6) + 1;
            currentSpace += die;
            System.out.println(String.format("Roll #%d: You have rolled a %d ", i, die));

            if (currentSpace == spaces) {
                System.out.println("You are now on space " + currentSpace + ". Congrats, You Win!");
                break;
            } else if (currentSpace > spaces) {
                System.out.println("Unfortunately, You exceeded from the " + spaces + ". You lose!");
                break;
            } else if (i == maxRoll && currentSpace < spaces) {
                System.out.println("You are now on space " + currentSpace + ".");
                System.out.println("Unfortunately, You didn't make it up to the all " + spaces + " spaces. You lose!");
                break;
            } else {
                System.out.println("You are now on space " + currentSpace + ".");
                System.out.println((spaces - currentSpace) + " more to go.");
            }
            System.out.println();
        }

    }

}
