/////////////////////////////////////////////////////////////////////////////
// lab03-BigMac
// BigMac Java Program
//
// Write a program that computes the cost of buying a some Big Macs. 
//to obtain: how many Big Macs, the cost per Big Mac and the percentage tax.
//Then displays the total cost.
//
//Arik Baer

//First we import a Scanner
import java.util.Scanner;

// here we define a class
public class BigMac{
    
    //next, we add the main method
    public static void main(String[] args) {
        
        //Here we declare the Scanner
        Scanner myScanner=new Scanner(System.in);
        
        //Now java is ready to accpet the input
        //Here we ask the user to enter the amount of big mac he ate using the scanner. 
        System.out.print("\n Enter the amount of Big Macs purchased (as an interger > 0): ");
        int nBigMac=myScanner.nextInt();
        
        //Here we ask the user the price per big mac using the sanner.
        System.out.print("\n Enter the price per Big Mac in dollars in the form of xx.xx please: ");
        double bigMacCost=myScanner.nextDouble();
        
        //Here we ask the user to enter the tax in the subject's state
        System.out.print("\n Enter the tax percentage in your state (whole numbers only): ");
        double taxRate=myScanner.nextDouble();
        double decimalTax=taxRate/100;
        
        //Here we make all the calulations needed so that the print statements are easier to read
        double preTaxBigMac=nBigMac*bigMacCost;
        double salesTax=preTaxBigMac*decimalTax;
        double totalCost=preTaxBigMac+salesTax;
        
        //We now proceed to printing the output in a pleasing way
        System.out.printf("\n The pre-tax price of your purchase of "+nBigMac+" Big Macs is $ %.2f",preTaxBigMac);
        System.out.printf("\n The sale tax for your purchase of "+nBigMac+" Big Macs is $ %.2f",salesTax);
        System.out.printf("\n The total cost of your purchase of "+nBigMac+" Big Macs including tax is $ %.2f",totalCost);
    }
}
        