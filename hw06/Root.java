import java.util.Scanner;

public class Root {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        double x = -1;

        while (x < 0) {
           System.out.println("Please inout the number you want to find the root of: " );
            x = myScanner.nextDouble();
        }
        double low = 0;
        double high = 1 + x;
        double middle = (low + high) / 2;

        while ((high - low) > (0.0000001*(1 + x))) {
            middle = (low + high) / 2;
            if (Math.pow(middle, 2) > x) {
                high = middle;
            } else {
                low = middle;
            }
        }
        System.out.println("The square root of " + x + " is " + middle);
    }

}
