/////////////////////////////////////////////////////////////////////////////
// hw04-IncomeTax
// Income Tax Java Program
//
//Write a program that prompts the user to enter an int that gives the
//thousands of dollars of income and then writes out the amount of tax on the income.
//
//Arik Baer

//First we import a Scanner
import java.util.Scanner;

// here we define a class
public class IncomeTax{
    
    //next, we add the main method
    public static void main(String[] args) {
        
        //Here we declare the Scanner
        Scanner myScanner=new Scanner(System.in);
        
        // Here we make the Scanner available to the user by asking them to enter their income in thousands
        System.out.print("Please enter your income in thousands (e.g 25 = 25'000$): ");
        int income=0;
        
        //Here we make force the program to stop running if an incorrect value is entered
        
         if (myScanner.hasNextInt()){
             income=myScanner.nextInt();
        }
     
        
         else{
            System.out.println("You have entered an incorrect value (not an int)");
            return;
        }
        
        
        if (income < 0) {
            System.out.println("Enter a value > 0 ");
             return;
        }
          
        // Here we define the tax limits
         int incomeMax1=20,
        incomeMax2=40,
        incomeMax3=78;
        
        // this is so that is it easier to read through he print statements
        double netIncome=income*1000;
        
        //Here we print the output corresponding to each income classs.
        if (income<incomeMax1) {
             System.out.printf("The tax rate on $ %.2f is 5.0%%, and the tax is $ %.2f", netIncome, ((netIncome)*0.05));
            } 
            
        if (incomeMax1<=income && income<incomeMax2) {
            System.out.printf("The tax rate on $ %.2f is 7.0%%, and the tax is $ %.2f", netIncome, ((netIncome)*0.07));
            } 
            
         if (incomeMax2<=income && income<incomeMax3) {
             System.out.printf("The tax rate on $ %.2f is 12.0%%, and the tax is $ %.2f", netIncome, ((netIncome)*0.12));
            }  
            
        if (incomeMax3<=income) {
         System.out.printf("The tax rate on $ %.2f is 14.0%%, and the tax is $ %.2f", netIncome, ((netIncome)*0.14));
            }
    }
}