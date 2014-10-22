/////////////////////////////////////////////////////////////////////////////
// hw07-Number Stacking
// Number Stacking Java Program
//
/*Write a program that promts the user to input an int between 1-9 and will print 3 times 
identical stacks of number using for loops, while loops and do while loops*/

//Arik Baer

import java.util.Scanner; // Here in import the Scanner

public class NumberStack { //here we define a class

    public static void main(String[] args) { //Here we create the method
        Scanner myScanner = new Scanner(System.in); // Here we define the scanner
        System.out.println("Enter a number between 1 and 9: "); // here we promt the user to enter a value
        int x = myScanner.nextInt(); //Here we prompt the user to enter a value
        System.out.println("Using for loops: "); // Here we print which method we are using to create this stack of numbers

        for (int i = 1; i < (x + 1); i++) { //for each number group
            for (int k = i; k > 0; k--) { //for each row
                for (int spaces = 0; spaces < (x - i); spaces++) { // for the spaces
                    System.out.print(" ");

                }
                for (int j = 0; j < i + (i - 1); j++) { //for each column
                    System.out.print(i); //print number
                }
                System.out.println(""); //end row
            }
            for (int spaces = 0; spaces < (x - i); spaces++) { //for the tab spaces
                System.out.print(" ");

            }
            for (int j = 0; j < i + (i - 1); j++) { //for the tabs to be printed
                System.out.print("-");
            }
            System.out.println("");
        }

        System.out.println("Using while loops: "); //Declaring what method is used
        int i = 1; // Declaring the variables outside the loop as it is a while loop
        int j = 0;
        int k = i;
        int spaces = 0;
        while (i < (x + 1)) { // For each number group
            k = i; // setting the variables inside the loop as it is  while loop
            while (k > 0) { // For each row
                spaces = 0;
                while (spaces < (x - i)) { // for the spaces
                    System.out.print(" "); //print space
                    spaces++;
                }
                j = 0;

                while (j < i + (i - 1)) { //for each column
                    System.out.print(i); // print number
                    j++;
                }
                System.out.println(""); //end row
                k--;
            }
            spaces = 0;
            while (spaces < (x - i)) { // for the tab spaces
                System.out.print(" ");
                spaces++;
            }
            j = 0;

            while (j < i + (i - 1)) { // for the tabs
                System.out.print("-"); //printing the tabs
                j++;
            }
            System.out.println("");
            i++;
        }

        System.out.println("Using do while loop"); // declaring what method  is used
        i = 1; // resetting the variables
        j = 0;
        k = i;
        spaces = 0;

        do { // setting the output
            k = i;
            do {
                spaces = 0; // setting the output
                do {
                    System.out.print(" "); 
                    spaces++;
                } while (spaces < (x - i)); // for the spaces
                j = 0;
                do {
                    System.out.print(i);
                    j++;
                } while (j < i + (i - 1)); // for each column
                System.out.println("");
                k--;
                spaces = 0;
            } while (k > 0); // for each row

            do {
                System.out.print(" ");
                spaces++;
            } while (spaces < (x - i)); // for each tab spaces
            j = 0;
            do {
                System.out.print("-");
                j++;
            } while (j < i + (i - 1)); //for the tabs
            System.out.println("");
            i++;
        } while (i < (x + 1)); //for each number group

    } // end method
} // end class

// I know there is a space too much on the last row, it is a stupid mistake because it is just that I cannot find where to reset the vlue of spaces back to 0
