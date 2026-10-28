import java.util.Random;

public class Q4DiceGame {
    private static int rollDie(Random random) {
        return random.nextInt(6) + 1;
    }

    public static void main(String[] args) {
        Random random = new Random();

        int player1First = rollDie(random);
        int player1Second = rollDie(random);
        int player2First = rollDie(random);
        int player2Second = rollDie(random);

        int player1Total = player1First + player1Second;
        int player2Total = player2First + player2Second;

        System.out.println("Player 1 rolls: " + player1First + " and " + player1Second);
        System.out.println("Player 1 total: " + player1Total);
        System.out.println("Player 2 rolls: " + player2First + " and " + player2Second);
        System.out.println("Player 2 total: " + player2Total);

        if (player1Total > player2Total) {
            System.out.println("Player 1 wins!");
        } else if (player2Total > player1Total) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("The game is a tie.");
        }
    }
}
