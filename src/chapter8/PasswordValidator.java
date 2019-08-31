package chapter8;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class PasswordValidator
{
    static boolean capLetter = false;
    static boolean pass = false;
    static boolean specialChar = false;
    static boolean usrNme = true;
    static boolean oldPass = true;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String args[])
    {
        passwordRules();
        String oldPass = "";
        System.out.println("\nEnter User Name: ");
        String userName = scanner.next();
        System.out.println("Enter old password: ");
        String oldpswd = scanner.next();
        System.out.println("Enter a new password: ");
        String password = scanner.next();

        scanner.close();


        oldPassword(oldpswd , password);
        validatePassword(password, userName, oldpswd);
    }

    public static boolean lengthVerification(String password) {
        if (password.length() >= 8){
            pass = true;
        }
            return pass;
    }

    public static boolean passUser (String userName, String password) {
        if (password.contentEquals(userName)){
            usrNme = false;
        }
            return usrNme;
    }

    public static boolean upperCase (String password) {
        char ch ;
        for (int i=0; i<password.length(); i++) {
            ch = password.charAt(i);
            if (Character.isUpperCase(ch))
            {
                capLetter = true;
                i++;
                break;


            }

        }
        return capLetter;
    }

    public static boolean specChar(String password) {
        char ch ;
        for (int i=0; i<password.length(); i++)
        {
            ch = password.charAt(i);
            if (Character.isLetterOrDigit(ch))
            {
                specialChar = false;
            }
            else
            {
                specialChar = true;
                break;
            }
        }
        return specialChar;
    }

    public static void validatePassword (String password, String userName , String oldpswd) {

        System.out.println("");
        System.out.println("Your Password complexity results: \n");
        if(lengthVerification(password))
        {
            System.out.println("Password length is: " + password.length());
        }
        else
        {
            System.out.println("Password length is less than 8 characters");
        }
        if(passUser(userName , password))
        {
            System.out.println("Password name is not same as User Name");
        }
        else
        {
            System.out.println("Password is same as userName");
        }
        if(upperCase(password))
        {
            System.out.println("Password contains upper case letter");
        }
        else
        {
            System.out.println("Password does not contain any upper case letter");
        }
        if(specChar(password))
        {
            System.out.println("Password contains special character");
        }
        else
        {
            System.out.println("Password does not contain any special case letter");
        }
        if(oldPassword(oldpswd , password))
        {
            System.out.println("New password is not same as old password");
        }
        else
        {
            System.out.println("New password is same as old password");
        }
    }

    public static void passwordRules() {
        System.out.println("Your password must meet following criteria: \n");
        System.out.println("1. Your password must contains at least 8 characters.");
        System.out.println("2. Your password must contains one upper case letter.");
        System.out.println("3. Your password must contains on special character.");
        System.out.println("4. Your password should not be same as User name.");
        System.out.println("5. Your password should not be same as old password.");
    }

    public static boolean oldPassword(String oldpswd, String password) {

        if(oldpswd.contentEquals(password))
        {
            oldPass = false;
        }
        return oldPass;

    }
}


