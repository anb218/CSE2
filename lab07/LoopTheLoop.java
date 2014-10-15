/////////////////////////////////////////////////////////////////////////////
// lab07
// Loop The Loop Java Program
//
/*This program prints out 10 stars followed by a pyramide with a base of 10.
It then prompts the user to enter an int between 1-15 and then proceed to 
print a pyramide with the base of the int entered*/

//Arik Baer

//Here we import the Scanner
import java.util.Scanner;

//Here we define a class
public class LoopTheLoop {
  
  //Here we define a main method
  public static void main(String[] args) {
    //Here we define all the variables
    Scanner myScanner = new Scanner(System.in);
    int nStars = 10;
    boolean infLoop = true;
    String choice = "";
    nStars = -1;
    String num = "";
    
    //Here we call our method to print the pyramide of 10
    printStars(10);
    printPyramid(10);
    
    
    while (infLoop) { //loop a
      boolean flag = true;
      while(flag) { //loop b
        System.out.println("Enter an int between 1 and 15: ");
        num = myScanner.next();
        try {
          nStars = Integer.parseInt(num);
          if(nStars > 15 || nStars < 1) {
            System.out.println("\nYour int was not in the range [1 - 15]\n");
            flag = true;
          }
          else {
            flag = false;
          }
        }
        catch(Exception ex) {
          System.out.println("\nYour int was not in the range [1 - 15]\n");
          flag = true;
        }
      }
      
      printStars(nStars);
      printPyramid(nStars);
      
      System.out.println("Enter y or Y to go again: ");
      choice = myScanner.next().toUpperCase();
      if (choice.equals("Y")) {
        infLoop = true;
        System.out.println();
      } else {
        infLoop = false;
      }
    }
  }
  
  //printing methods
  //This method is placed outside the main method but is called in the main method to print the correct amount of stars in a line
  public static void printStars(int nStars) {
    int count = nStars;
    while (count >= 1) {
      System.out.print("*");
      count--;
    }
  }
  //This method is placed outside the main method but is called in the main method to print the correct dimensions of the pyramide.
  public static void printPyramid(int nStars) {
    System.out.println("\n");
    int hight = 1;
    int width;
    while (hight <= nStars) {
      width = 1;
      while (width <= hight) {
        System.out.print("*");
        width++;
      }
      System.out.println();
      hight++;
    }
    System.out.println();
  }  
}