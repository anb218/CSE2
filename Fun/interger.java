import java.util.Scanner;
//inmports the scanner to make it accessible
public class interger{
  public static void main(String[] args){
    Scanner myScanner= new Scanner(System.in);
    //declares myScanner as a variable of type Scanner to be used to read in data 
    System.out.println("input an interger, A:");
    //Prints a texts of coders choice
    double A=myScanner.nextDouble();
    //sets scanner to be any interger within the limits of double
    System.out.println("input an interger, B:");
    //Prints a texts of coders choice
    double B=myScanner.nextDouble();
    //sets scanner to be any interger within the limits of double
    double sum=A+B;
    //adds varaible defines as "A" and varaible defines as "B"
    System.out.println("The sum of intergers A and B is: "+sum);
     //Prints a texts of coders choice
  }
}
