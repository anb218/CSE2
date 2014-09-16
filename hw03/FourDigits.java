//
//Arik Baer
//hw03-FourDigits 
//Four Digits Java Program
//Write a program that prompts the user to enter a 
//double and  then prints out the first four digits 
//to the right of the decimal point.


//Here we import the scanner
import java.util.Scanner;

//Here we define a class
public class FourDigits{
    
    //Next, we add the main method
    public static void main(String[] args) {
        
        Scanner myScanner= new Scanner (System.in);
        
        System.out.println("Please enter a digit with 4 decimals places");
        // Here we define the variable
        double digit=myScanner.nextDouble();
        
        //Now we cast this double into an int
        int intDigit= (int) digit;
        
        int int4Dig= intDigit*10000; //Here we multiply by 100000 after making it an int to be able to later eliminate the numbers places before the decimals
        
        double double4Dig=digit*10000; // Here we leave it a double while multiplying to keep the value after the decimal point
        int int4Final= (int) double4Dig;// here we cast it into an int to make it compatible to calculation with the previously casted int
        
        System.out.format("The 4 digits after the decimal place are %04d%n",int4Final-int4Dig); // here we print the result
        
    }
    
}