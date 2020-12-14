import java.util.Scanner;
import Enum.Player;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER TIC TAC TOE GAME BOARD");
        System.out.println("Row can contain 'X', 'O', or '*' (to denote blank space) ");

        System.out.println("Row 1: ");
        String row1 = scanner.next();

        System.out.println("Row 2: ");
        String row2 = scanner.next();

        System.out.println("Row 3: ");
        String row3 = scanner.next();

        Game game = new Game(row1, row2, row3);

        Player winner = game.DetermineWinner();
        System.out.println("Winner: " + (winner == null ? "draw" : winner.toString()));
        System.out.println("Complete: " + (game.IsComplete() ? "Yes" : "No"));
    }
}
