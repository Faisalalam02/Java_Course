package chapter7;

import java.util.Scanner;

public class DayOfTheWeek {

    static Scanner scanner = new Scanner(System.in);
    static String month = "";
    public static void main (String args[])
    {
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        weekDays(number);
        System.out.println(month);
    }

    public static String weekDays(int number)
    {
         String[] weekDays = new String[]{"Monday","Tuesday","Wednesday",
                "Thursday","Friday","Saturday","Sunday"};

            switch(number){
                case 1 :
                    month = weekDays[0];
                   break;
                case 2 :
                    month = weekDays[1];
                    break;
                case 3 :
                    month = weekDays[2];
                    break;
                case 4 :
                    month = weekDays[3];
                    break;
                case 5 :
                    month = weekDays[4];
                    break;
                case 6 :
                    month = weekDays[5];
                    break;
                case 7 :
                    month = weekDays[6];
                    break;
                default:
                    System.out.println("The number you entered is out of range");
            }
                return month;
    }
}
