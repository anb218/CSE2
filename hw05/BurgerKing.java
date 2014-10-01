/////////////////////////////////////////////////////////////////////////////
// hw05-BurgerKing
// Burger King Java Program
//
/*Write a program that prompts the user 
to enter a choice of a burger, a soda,
or fries. Then the program prompts the users 
for details of their choices*/

//Arik Baer

//Here we import the Scanner
import java.util.Scanner;

//Here define the class
public class BurgerKing {

    //Here we create a method
    public static void main(String[] args) {

        //Here we define the Scanner
        Scanner myScanner = new Scanner(System.in);

        //Here we prompt the user to enter their choice.
        System.out.println("Enter a choice of\n Burger (B or b) \n Soda (S or s)\n Fries (F or f)");
        String choice = myScanner.next().toUpperCase(); //Here we use the .toUpperCase so that the inputed value is read as an upper case, resulting into half the amount of switch statement.

        //Here we make sure that the entered String is no longer than one charachter long.
        if (choice.length() > 1) {
            System.err.println("Error: Single character input expected.");
            return; //Stop the program if a wrong value is entered
        } else {
            //Here we create a switch statement for the possible options.
            switch (choice) {
                case "B":
                    //Here we prompt the user to enter more detail about their burger.
                    System.out.println("Enter A or a for \"all the fixins\" \n C or c for cheese \n N or n for none of the above");
                    String bChoice = myScanner.next().toUpperCase();
                    
                    //Here once again we make sure the entered chocie is only one character long.
                    if (bChoice.length() > 1) {
                        System.err.println("Error: Single character input expected.");
                        return;
                    } else {
                        //Here we create a switch to account for the users choice on their extras for their brugers.
                        switch (bChoice) {
                            case "A":
                                System.out.println("You ordered a burger with \"all the fixins\"");
                                return;
                            case "C":
                                System.out.println("You ordered a burger with cheese");
                                return;
                            case "N":
                                System.out.println("You ordered a plain burger with no extras");
                                return;
                            //Here we print an error message if none of the presented choice are selected.
                            default:
                                System.err.println("You did not enter A, a, C, c, N or n");
                                return;
                        } //here we end the switch statement corresponding with the extras on the burgers.

                    } //ending the else statement.
                    
                //This case is for the soda selection.
                case "S": 
                    System.out.println("Do you want Pepsi (P or p) \n Sprite (S or s)\n or Mountain Dew (M or m)");
                    String sChoice = myScanner.next().toUpperCase();

                    //Here we make sure that the entered value is only one character long
                    if (sChoice.length() > 1) {
                        System.err.println("Error: Single character input expected.");
                        return;

                    } else { 
                        //Here we create a switch statement for the soda choices
                        switch (sChoice) {
                            case "P":
                                System.out.println("You ordered Pepsi");
                                return;

                            case "S":
                                System.out.println("You ordered Sprite");
                                return;

                            case "M":
                                System.out.println("You ordered Mountain Dew");
                                return;

                            //Here we print an error message if none of the presented values are inputed
                            default:
                                System.out.println("You did not enter P, p, S, s, M or m");
                                return;
                        } //Here we end the switch statement corresponding to the choice of soda
                    } //Here we end the else statement
                
                //This case is for the fries
                case "F": 
                    System.out.println("Do you want Large fries (L or l) or Small fries (S or s)");
                    String fChoice = myScanner.next().toUpperCase();
                    
                    //Here we make sure that the entered value is only one character long
                    if (fChoice.length() > 1) {
                        System.err.println("Error: Single character input expected.");
                        return;

                    } else {
                        //Here we create a switch to respond to the users inuput on the size of the fries. 
                        switch (fChoice) {
                            case "L":
                                System.out.println("You ordered large fries.");
                                return;
                            case "S":
                                System.out.println("You ordered small fries.");
                                return;
                            //Here we print an error message if none of the displayed choices are selected
                            default:
                                System.err.println("You have not entered B, b, S, s, F or f");
                        }//Here we end the switch statement corresonding to the choide for the size of the fries.
                    }//Here we end the else statement
                

            } //Here we end the main switch statement corresponding to choice of Burgers, Soda or Fries.
        }  //Here we end the switch statement.

    } //Here we end the method.
} //Here we end the class.