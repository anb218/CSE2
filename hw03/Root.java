//
//Arik Baer
//hw03-Root 
//Root Java Program
//Write a program that prompts
//the user to enter a double and
//then prints out a crude estimate
//of the cube root of the number
//and the value of this crude guess when cubed.

//Here we import the scanner
import java.util.Scanner;

//Here we define a class
public class Root{
    
    //Next, we add the main method
    public static void main(String[] args) {
        
        //Here we define the Scanner
        Scanner myScanner= new Scanner (System.in);
        
        //Here we make the Scanner available for the user
        System.out.println("Please enter number here:");
        double number=myScanner.nextDouble();
        
        //Here we start the array of guesses
        double guess=number/3; //The first guess is x/3
        double guess2=(2*guess*guess*guess+number)/(3*guess*guess); //The next guess is more precise, but far from correct
        double guess3=(2*guess2*guess2*guess2+number)/(3*guess2*guess2); //We use our previous guess in the formula 
        double guess4=(2*guess3*guess3*guess3+number)/(3*guess3*guess3); //We now proceed to make the next guess with the same method
        double guess5=(2*guess4*guess4*guess4+number)/(3*guess4*guess4); //We now proceed to make the next guess with the same method
        double guess6=(2*guess5*guess5*guess5+number)/(3*guess5*guess5); //We now proceed to make the next guess with the same method
        
        //Next we print the output
        System.out.println("The cube root is: "+guess6);
        System.out.println(guess6+"*"+guess6+"*"+guess6);
        System.out.println("By cubing the number above we achieve a result of "+ Math.pow(guess6,3));
        
    }
}