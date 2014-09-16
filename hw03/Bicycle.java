//
//Arik Baer
//hw03-Bicycle 
// Bicycle Java Program
//
//Write a program that prompts the user to enter two digits,
//the first giving the number of counts on a cyclometer and
//the second giving the number of seconds during which the
//counts occurred, and then an then prints out the distance
//traveled and the average miles per hour


//Here we import the scanner
import java.util.Scanner;

//Here we define a class
public class Bicycle{
    
    //Next, we add the main method
    public static void main(String[] args) {
        
        // Here we define the Scanner
        Scanner myScanner = new Scanner(System.in);
        
        //We prompt the user to enter the number of counts
        System.out.println("Please enter the number of counts on the cyclometer:");
        double numberCounts=myScanner.nextDouble();
        
        // We prompt the user to enter the number of seconds over hwich the count occured
        System.out.println("Please enter the amount of seconds over which the count happened in: ");
        double amountSeconds=myScanner.nextDouble();
        
        //Here we define the diameter of the wheel
         double wheelDiameter=27.0, // here we set the size fo the wheel. One of the variables needed for the cyclometer
        PI=3.14159, //here we define PI to be able to use them in later calculations
        feetPerMile=5280, // here we implement the distance convertion factors
        inchesPerFoot=12, //here we implement the distance convertion factors
        secondsPerMinute=60; //here we implement the time convertion factors
        
        
        // Here we compute the wanted output, in this case, the total distance traveled and the average miles per hour
        double totalDistance = numberCounts * wheelDiameter * PI;
        totalDistance = totalDistance / (inchesPerFoot * feetPerMile); // Here we convert inches in miles
        double mins = amountSeconds / secondsPerMinute; // here we convert seconds into minutes
        double averageSpeed = totalDistance / (mins/60); // here we convert miles per minute into miles per hour
        
         
        // We then proceed to print the output
            System.out.printf("The total distance traveled in miles is %.2f",totalDistance);
            System.out.printf("\nThe amount of minutes the trip took was %.2f",mins);
            System.out.printf("\nThe average milage per hour of the trip was %.2f",averageSpeed);
    }
}