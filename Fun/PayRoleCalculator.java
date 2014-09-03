import java.util.Scanner;
public class PayRoleCalculator{
  public static void main (String[] args){
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Enter employee's name: ");
    String nameEmployee=myScanner.next();
    System.out.println("Enter number of hours worked in a week: ");
    double hoursWorked=myScanner.nextDouble();
    System.out.println("Enter hourly pay rate: ");
    double payRate=myScanner.nextDouble();
    System.out.println("Enter federal tax withholding rate (in decimals): ");
    double federalTax=myScanner.nextDouble();
    System.out.println("Enter state tax withholding rate (in decimals): ");
    double stateTax=myScanner.nextDouble();
    double grossPay=hoursWorked*payRate;
    double totalDeduction=(((federalTax)*grossPay)+((stateTax)*grossPay));
    System.out.println("Employee Name: "+nameEmployee);
    System.out.println("Hours worked: "+hoursWorked);
    System.out.println("Pay rate per hour: "+payRate);
    System.out.println("Gross Pay: $"+(grossPay));
    System.out.println("Deductions:");
    System.out.println("       Federal Withholding ("+(federalTax)*100+"%) : $"+((federalTax)*grossPay));
    System.out.println("       State Withholding ("+(stateTax)*100+"%) : $"+((stateTax)*grossPay));
    System.out.println("       Total Deduction: $"+totalDeduction);
    System.out.println("Net Pay: $"+(grossPay-totalDeduction));
    }
}