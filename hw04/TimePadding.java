/////////////////////////////////////////////////////////////////////////////
// hw04-TimePadding
// Time Padding Java Program
//
//Write a program that has the user enter an positive integer giving the number
//of seconds that have passed during the day and then displays the time in conventional
//form.
//
//Arik Baer

//First we import a Scanner
import java.util.Scanner;

// here we define a class
public class TimePadding{
    
    //next, we add the main method
    public static void main(String[] args) {
        
        //Here we declare the Scanner
        Scanner myScanner=new Scanner(System.in);
        
        //Here we prompt the user to enter the amount of seconds elapsed
        System.out.print("Please enter the amount of seconds elapsed: ");
        int amntSeconds=myScanner.nextInt();
        
        //Here I implement the convertion from seconds to minutes and hours
        double secondsPerMinute = 60,
        minutesPerHour = 60,
        secondsPerHour=3600;
        
        //Here we do the maths to compartmentalise hours, munites and seconds 
        double amntHours=amntSeconds/secondsPerHour;
        double roundDownHours=Math.floor(amntHours); // Here we round down so that when later substracted we have the net amount of minutes
        int intHours= (int) amntHours; //Here we make it an int so that the displayed time does not have any decimal places
        
        double amntMinutes=amntHours-roundDownHours; 
        double properMinutes=amntMinutes*minutesPerHour;
        double rounDownMinutes=Math.floor(properMinutes); // Here we round down so that when later substracted we have the net amount of seconds
        int intMinutes=(int) properMinutes; //Here we make it an int so that the displayed time does not have any decimal places
        
        double leftSeconds=properMinutes-rounDownMinutes;
        double netSeconds=leftSeconds*secondsPerMinute;
        int intSeconds=(int) netSeconds; //Here we make it an int so that the displayed time does not have any decimal places
        
        //Here we print the result
        System.out.format("The time is %d:%02d:%02d",intHours,intMinutes,intSeconds);
    }
}
     
        
        