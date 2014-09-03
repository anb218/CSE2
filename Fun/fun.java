import java.util.Scanner;
public class fun{
    public static void main(String[] args){
        Scanner myScanner= new Scanner(System.in);
        System.out.println("Please enter name");
        String MyName=myScanner.next();
    
        System.out.println("Please enter your partners name");
        String HerName=myScanner.next();
        
        System.out.println( MyName+"+"+HerName+"= <3");
    }
}