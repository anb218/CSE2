import java.util.Scanner;

public class RandomGames {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        int AI = -1 + (int) (Math.random() * ((36 - (-1)) + 1));

        System.out.println("Enter R or r for Roulette, C or c for craps, P or p for pick a card- ");
        String choice = myScanner.next().toUpperCase();

        if (choice.length() > 1) {
            System.err.println("Error: Single character input expected.");
            return;
        } 
        switch(choice) {
            case "C": 
                System.err.println("Error: This option has not yet been implemented.");
                break;
            case "P":
                System.err.println("Error: This option has not yet been implemented.");
                break;
            case "R":
                roulette(AI);
                break;
            default:
                System.err.println("Error: Invalid character.");
        }
    }

    public static void roulette(int AI) {
        if (AI == -1) {
            System.out.println("Roulette: 00");
        } else {
            System.out.println("Roulette: " + AI);
        }
    }
}