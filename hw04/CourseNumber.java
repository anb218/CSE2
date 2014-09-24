/////////////////////////////////////////////////////////////////////////////
// hw04-Month
// Month Java Program
//
//Write a program that reads in a 6 digit number, and then prints out the semester 
// and year corresponding to the course code and year entered.
//
//Arik Baer

//Here we import the scanner
import java.util.Scanner;

//Here we define a class
public class CourseNumber {

//Here we define a method
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter a six digit number giving the course semester: ");
        int code = myScanner.nextInt(); // we prompt the user to enter his course code
        if (Integer.toString(code).length() > 6) { //coverted int to string, then inputed digit length limit
            System.err.println("You did not a six digit number.");
        } else if (code < 186510 || code > 201440) { //Here we define the range, hence the range of years.
            System.err.println("The number was outside the range. [186510,201440] ");
        } else { //Here we seperate the year and the course code, so that we can define which code corresponds to which course.
            String year = Integer.toString(code).substring(0, 4); //.substring is a built-in method which finds the substring, given a range between the first and fourth character.
            String semester = Integer.toString(code).substring(4, 6); // given a range between the last and second last number.
            switch (semester) { // Here we use a switch statment defining whihc code corresponds to which class.
                case "10":
                    System.out.println("The course was offered in the Spring semester of " + year);
                    break;
                case "20":
                    System.out.println("The course was offered in the Summer 1 semster of " + year);
                    break;
                case "30":
                    System.out.println("The course was offered in the Summer 2 semester of " + year);
                    break;
                case "40":
                    System.out.println("The course was offered in the Fall semester of " + year);
                    break;
                default:
                    System.err.println(semester + " is not a legitimate semester.");
            }
        }
    }
}
