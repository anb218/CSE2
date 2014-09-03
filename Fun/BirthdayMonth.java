import java.util.Scanner;

public class BirthdayMonth{
  public static void main(String[] args){
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Enter your month of birth: ");
    String month = myScanner.next();
    if(month.equals("January") || month == "january" || month == "1"){
     System.out.println("Wolfgang was also born in January!"); 
    }
    if(month == "February" || month == "february" || month == "2"){
      System.out.println("Bethoven was also born in Februray!");
    }
    else if(!month.equals("January") && !month.equals("February")){
     System.out.println("Someone was probably born in this months too!"); 
    }
    
  }
}