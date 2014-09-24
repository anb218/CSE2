/////////////////////////////////////////////////////////////////////////////
// hw04-Month
// Month Java Program
//
//Write a program that prompts the user to enter an integer for the month 
//and then displays the number of days in the month.
//
//Arik Baer

//First we import a Scanner
import java.util.Scanner;

// here we define a class
public class Month{
    
    //next, we add the main method
    public static void main(String[] args) {
        
        //Here we declare the Scanner
        Scanner myScanner=new Scanner(System.in);
        
        //We prompt the user to input his value to be used in switch statement
        System.out.println("Enter an int giving the number of the month (1-12) ");
        int month=myScanner.nextInt();
        

        
        //Here we define variable needed to determine the amount of days in a specific month
        int days = 0;
        int yearOnDemand = 0; //only to be used for February
        
        //Here we implement a series of if statement checks, using a switch statement
        // Each number corresponds to a case that indicates its String name and sets the day variable
        String monthString;
        switch (month) {
            case 1:  monthString = "January";
                    days=31;
                     break;
            case 2:  monthString = "February";
                    System.out.println("Please specify the year: ");
                    yearOnDemand=myScanner.nextInt();
                    days=leapYear(yearOnDemand); //Case 2 calls leapYear method
                     break;
            case 3:  monthString = "March";
                    days=31;
                     break;
            case 4:  monthString = "April";
                    days=30;
                     break;
            case 5:  monthString = "May";
                    days=31;
                     break;
            case 6:  monthString = "June";
                    days=30;
                     break;
            case 7:  monthString = "July";
                    days=31;
                     break;
            case 8:  monthString = "August";
                    days=31;
                     break;
            case 9:  monthString = "September";
                    days=30;
                     break;
            case 10: monthString = "October";
                    days=31;
                     break;
            case 11: monthString = "November";
                    days=30;
                     break;
            case 12: monthString = "December";
                    days=31;
                     break;
            default: System.out.println("You have not entered a valid month"); //Only allowing hte user to enter a number between 1 and 12
                     return;
                     
        }
        
        //Here we print the final output using variables instead of seperate print statements.
        System.out.println("The month, "+monthString+", has "+days+" days.");
    }
    
            //Method ot determine whether or not its a leap year, only called in case of february. 
            //This is a method decleration. It must be placed outside the main method because it is a methid itself.
        public static int leapYear(int year){
            int febDays = 0;
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) { //logic to determine a leap yar
            febDays=29;
            } else {
            febDays=28;
            }
            return febDays;  //returns 29 or 28 days  
        }
    
}