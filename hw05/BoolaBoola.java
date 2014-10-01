//first establish the scanner
import java.util.Scanner;

//Now we establish the class
public class BoolaBoola {
//main method is required for this java program

    public static void main(String[] args) {

//Here we define the Scanner
        Scanner myScanner = new Scanner(System.in);

// Here we initiate the random component and cast it as an int. 
        int AI = (int) (2 * Math.random());  //we reinitialise the randomiser so that they are all independently random

// Here we make our true or false statement random
        boolean test1;
        if (AI == 1) {
            test1 = true;
        } else {
            test1 = false;
        }
        AI = (int) (2 * Math.random());
        boolean test2;
        if (AI == 1) {
            test2 = true;
        } else {
            test2 = false;
        }

        AI = (int) (2 * Math.random());
        boolean test3;
        if (AI == 1) {
            test3 = true;
        } else {
            test3 = false;
        }
        
        // Here we make the signs random
        int aiSign = (int) (2 * Math.random());
        String sign1 = "";
        String sign2 = "";
        if (aiSign == 0) {
            sign1 = "||";
        } else {
            sign1 = "&&";
        }
        aiSign = (int) (2 * Math.random());
        if (aiSign == 0) {
            sign2 = "||";
        } else {
            sign2 = "&&";
        }
        
        //logic to determine correct answer, by displaying all possible forms
        boolean correctAnswer = true;
        if (test1 == true && sign1.equals("||") && test2 == true && sign2.equals("||") && test3 == true) {
            correctAnswer = true;

        } else if (test1 == true && sign1.equals("||") && test2 == true && sign2.equals("||") && test3 == false) {
            correctAnswer = true;

        } else if ((test1 == true && sign1.equals("||") && test2 == false && sign2.equals("||") && test3 == true)) {
            correctAnswer = true;

        } else if (test1 == true && sign1.equals("||") && test2 == false && sign2.equals("||") && test3 == false) {
            correctAnswer = true;

        } else if (test1 == false && sign1.equals("||") && test2 == false && sign2.equals("||") && test3 == false) {
            correctAnswer = false;

        } else if ((test1 == false && sign1.equals("||") && test2 == true && sign2.equals("||") && test3 == true)) {
            correctAnswer = true;

        } else if ((test1 == false && sign1.equals("||") && test2 == false && sign2.equals("||") && test3 == true)) {
            correctAnswer = true;

        } else if ((test1 == false && sign1.equals("||") && test2 == true && sign2.equals("||") && test3 == false)) {
            correctAnswer = true;

        } else if ((test1 == true && sign1.equals("&&") && test2 == true && sign2.equals("&&") && test3 == true)) {
            correctAnswer = true;

        } else if ((test1 == true && sign1.equals("&&") && test2 == true && sign2.equals("&&") && test3 == false)) {
            correctAnswer = false;

        } else if ((test1 == true && sign1.equals("&&") && test2 == true && sign2.equals("&&") && test3 == false)) {
            correctAnswer = false;

        } else if ((test1 == true && sign1.equals("&&") && test2 == false && sign2.equals("&&") && test3 == false)) {
            correctAnswer = false;

        } else if ((test1 == false && sign1.equals("&&") && test2 == false && sign2.equals("&&") && test3 == false)) {
            correctAnswer = false;

        } else if ((test1 == false && sign1.equals("&&") && test2 == false && sign2.equals("&&") && test3 == true)) {
            correctAnswer = false;

        } else if ((test1 == false && sign1.equals("&&") && test2 == true && sign2.equals("&&") && test3 == true)) {
            correctAnswer = false;

        } else if ((test1 == false && sign1.equals("&&") && test2 == true && sign2.equals("&&") && test3 == false)) {
            correctAnswer = false;

        } else if ((test1 == true && sign1.equals("&&") && test2 == true && sign2.equals("||") && test3 == true)) {
            correctAnswer = true;

        } else if ((test1 == true && sign1.equals("&&") && test2 == true && sign2.equals("||") && test3 == false)) {
            correctAnswer = true;

        } else if ((test1 == true && sign1.equals("&&") && test2 == false && sign2.equals("||") && test3 == true)) {
            correctAnswer = true;

        } else if ((test1 == true && sign1.equals("&&") && test2 == false && sign2.equals("||") && test3 == false)) {
            correctAnswer = false;

        } else if ((test1 == false && sign1.equals("&&") && test2 == false && sign2.equals("||") && test3 == false)) {
            correctAnswer = false;

        } else if ((test1 == false && sign1.equals("&&") && test2 == false && sign2.equals("||") && test3 == true)) {
            correctAnswer = true;

        } else if ((test1 == false && sign1.equals("&&") && test2 == true && sign2.equals("||") && test3 == true)) {
            correctAnswer = true;

        } else if ((test1 == false && sign1.equals("&&") && test2 == true && sign2.equals("||") && test3 == false)) {
            correctAnswer = false;

        } else if ((test1 == false && sign1.equals("||") && test2 == false && sign2.equals("&&") && test3 == false)) {
            correctAnswer = false;

        } else if ((test1 == false && sign1.equals("||") && test2 == true && sign2.equals("&&") && test3 == false)) {
            correctAnswer = false;

        } else if ((test1 == false && sign1.equals("||") && test2 == false && sign2.equals("&&") && test3 == true)) {
            correctAnswer = false;

        } else if ((test1 == false && sign1.equals("||") && test2 == true && sign2.equals("&&") && test3 == true)) {
            correctAnswer = true;
        } else if ((test1 == true && sign1.equals("||"))) {
            correctAnswer = true;
        } 
        
        // Here we prompt the user to input what he thinks is the right solution to the problem
        System.out.println("Does " + test1 +" "+ sign1 +" " +test2 +" "+ sign2 +" "+ test3 +" have the value of True (T/t) or False (F/t)");
        String answer = myScanner.next().toUpperCase();

        // Here we verify the solution and confirm the answer or display an error message.
        if (answer.equals("T") && correctAnswer == true) {
            System.out.println("Correct!");
        } else if (answer.equals("F") && correctAnswer == false) {
            System.out.println("Correct!");
        } else {
            System.err.println("Wrong! Try again!");
        }
    }
}