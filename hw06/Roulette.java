public class Roulette {

    public static void main(String[] args) {
        int cash = 100;
        int zeroWins = 0;
        int spinWin = 0;
        // 
        for (int play = 0; play < 1000; play++) {
            int choice = (int) (Math.random() * ((38 - 0) + 1));
            cash = 100;
            for (int spins = 0; spins < 100; spins++) {
                int roulette = (int) (Math.random() * ((38 - 0) + 1));
                if (choice == roulette) {
                    cash += 36;
                } else if (choice != roulette) {
                    cash--;
                }
                if (cash == 0) {
                    zeroWins++;
                }
            }
            if (cash > 100) {
                spinWin++;
            }
        }
        System.out.println("Number of times lost all: " + zeroWins);
        System.out.println("Total winnings: " + cash);
        System.out.println("Number of winning 100 spins: " + spinWin);
    }
}
