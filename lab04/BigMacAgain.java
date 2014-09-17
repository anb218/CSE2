/////////////////////////////////////////////////////////////////////////////
// lab04-BigMacTime
// BigMac Time Java Program
//
//Write a program that uses the Scanner
//class to obtain from users how many Big Macs
//they want and whether they want an order of 
//fries. It then prints out the total cost of the meal.
//
//Arik Baer

//First we import a Scanner
import java.util.Scanner;

// here we define a class
public class BigMacAgain{
    
    //next, we add the main method
    public static void main(String[] args) {
        
        //Here we declare the Scanner
        Scanner myScanner=new Scanner(System.in);
        
       // Here we make the Scanner available to the user by asking how many BigMacs they would like
        System.out.print("Please enter the number of BigMacs: ");
        int nBigM=0;
        
        //Here we make force the program to stop running if an incorrect value is entered
        if (myScanner.hasNextInt()){
             nBigM=myScanner.nextInt();
        }
        
        else {
            System.out.println("You have not entered a int bigger than 0");
            return;
        }
        //Here we define a few constants
        double pricePerBigM=2.22,
        priceForFries=2.15;
        
        //Here we define the cost of the big macs without the fries
        double totalCost=pricePerBigM*nBigM;
        
        //Here we print the price of their pre-fries decision
        System.out.printf("You ordered %d for a cost of %.2f * %d = $ %.2f",nBigM,pricePerBigM,nBigM, totalCost);
        
        //Here we ask them if they want fries
        System.out.println("\n Would you like fries with your BigMac? (Y (or y) / N (or n))" );
        String choice = myScanner.next(); //We use String because the value is alphabetical.
       
        //The next step allows the user to enter upper or lower case.
        choice = choice.toLowerCase(); 
        choice = choice.substring(0,1).toUpperCase() + choice.substring(1);
        
        //Here we tell the program what output we would like depending on the users decison, using if, else if and else satements.
        if (choice.equals("Y")){
            System.out.println("You ordered fries that costs $ 2.15");
            System.out.printf("The total cost of your meal is = $ %.2f",(totalCost+priceForFries));
        }
        else if (choice.equals("N")){
            System.out.printf("The total cost of your meal is = $ %.2f",totalCost);
        }
        else {
            System.out.println("You did not enter a valid answer, please answer with Y,y or N,n");
        }
        
    }
}