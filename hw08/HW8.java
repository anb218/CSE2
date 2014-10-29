
/////////////////////////////////////////////////////////////////////////////
// hw08-Methods
// HW8 Java Program
//
/*Using the definition of methods, write a program that will prompt the user to answer some questions and 
perform error handling.*/

//Arik Baer

import java.util.Scanner;

public class HW8 {

    public static void main(String[] arg) {
        char input;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");

        input = getInput(scan, "Cc");
        System.out.println("You entered '" + input + "'");
        System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");

        input = getInput(scan, "yYnN", 5); //give up after 5 attempts
        if (input != ' ') {
            System.out.println("You entered '" + input + "'");
        }

        input = getInput(scan, "Choose a digit.", "0123456789");
        System.out.println("You entered '" + input + "'");
    }

    private static char getInput(Scanner scan, String s, String q) {
        System.out.println("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'-");
        String number = scan.next();
        String testString = "1234567890";
        while (!testString.contains(number)) {
            if (number.length() > 1) {
                System.out.println("You should enter exactly one character");
                number = scan.next();
            } else {
                System.out.println("Enter exactly one character");
                number = scan.next();
            }
        }
        return number.charAt(0);
    }

    private static char getInput(Scanner scan, String cc) {
        String input = scan.nextLine();
        String testString = "abdefghijklmnopqrstuvwxyzABDEFGHIJKLMNOPQRSTUVWXYZ";
        while (!cc.contains(input)) {
            if (input.length() > 1) {
                System.out.println("You should enter exactly one character");
            } else if (testString.contains(input)) {
                System.exit(0);
            } else {
                System.out.println("You did not enter a character from the list 'Cc'; try again");
            }
            input = scan.nextLine();
        }
        return input.charAt(0);
    }

    private static char getInput(Scanner scan, String yYnN, int i) {
        String letter = scan.next();
        while (!yYnN.contains(letter) && i <= 5) {
            System.out.print("You did not enter a character from the list 'yYnN'; try again-");
            letter = scan.next();
            i--;
            if (i == 1) {
                System.out.println("You failed after 5 tries");
                break;
            }
        }
        return letter.charAt(0);
    }
}
