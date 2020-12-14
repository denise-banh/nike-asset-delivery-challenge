package Question4;

import Enum.Player;
import Question1.DataStructure1.Board;
import Question1.DataStructure1.Square;
import Question1.DataStructure1.SquareValue;
import Question2And3.BoardUtilities;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class BoardUtilitiesTests {

    @Test(expected = IllegalArgumentException.class)
    public void testDetermineWinner_BoardIsNull_IllegalArgumentExceptionThrown() {
        // Arrange
        BoardUtilities utilities = new BoardUtilities();

        // Act/Assert
        utilities.determineWinner(null);
    }

    @Test
    public void testDetermineWinner_Row1Has3Xs_PlayerOneReturned(){
        // Arrange
        BoardUtilities utilities = new BoardUtilities();
        Board board = new Board();
        board.playSquare(0, SquareValue.X);
        board.playSquare(1, SquareValue.X);
        board.playSquare(2, SquareValue.X);

        // Act
        Player winner = utilities.determineWinner(board);

        // Assert
        Assert.assertEquals(Player.ONE, winner);
    }

    @Test
    public void testDetermineWinner_Row1Has3Os_PlayerTwoReturned(){
        // Arrange
        BoardUtilities utilities = new BoardUtilities();
        Board board = new Board();
        board.playSquare(0, SquareValue.O);
        board.playSquare(1, SquareValue.O);
        board.playSquare(2, SquareValue.O);

        // Act
        Player winner = utilities.determineWinner(board);

        // Assert
        Assert.assertEquals(Player.TWO, winner);
    }

    @Test
    public void testDetermineWinner_NoPlaysMade_NullReturned(){
        // Arrange
        BoardUtilities utilities = new BoardUtilities();
        Board board = new Board();

        // Act
        Player winner = utilities.determineWinner(board);

        // Assert
        Assert.assertEquals(null, winner);
    }

    @Test
    public void testIsGameComplete_FullBoard_ReturnTrue(){
        // Arrange
        BoardUtilities utilities = new BoardUtilities();

        Square[] newBoard = new Square[9];
        Square square = new Square();
        square.setValue(SquareValue.X);

        Arrays.fill(newBoard, square);

        Board board = new Board(newBoard);

        // Act
        boolean complete = utilities.isGameComplete(board);

        Assert.assertTrue(complete);
    }

    @Test
    public void testIsGameComplete_PartialBoardNoWinner_ReturnFalse(){
        // Arrange
        BoardUtilities utilities = new BoardUtilities();
        Board board = new Board();
        board.playSquare(0, SquareValue.O);
        board.playSquare(1, SquareValue.O);
        board.playSquare(2, SquareValue.X);

        // Act
        boolean complete = utilities.isGameComplete(board);

        Assert.assertFalse(complete);
    }

    @Test
    public void testIsGameComplete_PartialBoardWithWinner_ReturnTrue(){
        // Arrange
        BoardUtilities utilities = new BoardUtilities();
        Board board = new Board();
        board.playSquare(0, SquareValue.O);
        board.playSquare(2, SquareValue.X);
        board.playSquare(4, SquareValue.O);
        board.playSquare(5, SquareValue.X);
        board.playSquare(8, SquareValue.O);

        // Act
        boolean complete = utilities.isGameComplete(board);

        Assert.assertTrue(complete);
    }
}
