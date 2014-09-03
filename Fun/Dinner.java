import java.util.Scanner;
public class Dinner{
  public static void main (String[] args){
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Please enter the price of your dinner ");
    double myDinner= myScanner.nextDouble();
    System.out.println("Please enter the price of your friends dinner ");
    double yourDinner=myScanner.nextDouble();
    System.out.println("Please enter the % of tip you would like to leave ");
    double preTip=myDinner+yourDinner;
    double tipFactor=myScanner.nextDouble();
    double tip=(tipFactor/100)*(preTip);
    double total=tip+(preTip);
    System.out.println("My dinner costs "+myDinner+" Dollars");
    System.out.println("Your dinner costs " +yourDinner+ " Dollars");
    preTip=Math.round(preTip*100);
    System.out.println("Our pre-Tip total is: " +(preTip/100) +" Dollars");
    total = Math.round(total * 100);
    System.out.println("Our post-Tip total is: "+ (total/100) + " Dollars");
  }
}