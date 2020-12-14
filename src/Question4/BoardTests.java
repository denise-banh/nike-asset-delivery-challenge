package Question4;

import Question1.DataStructure1.Board;
import Question1.DataStructure1.Square;
import Question1.DataStructure1.SquareValue;
import Question2And3.BoardUtilities;
import org.junit.Assert;
import org.junit.Test;

public class BoardTests {

    @Test
    public void testIsEmpty_BoardIsEmpty_ReturnTrue(){
        // Arrange
        Board board = new Board();

        // Act/Assert
        Assert.assertTrue(board.isEmpty());
    }

    @Test
    public void testIsEmpty_BoardIsNotEmpty_ReturnFalse(){
        // Arrange
        Square[] newBoard = new Square[9];
        Square square = new Square();
        square.setValue(SquareValue.X);
        newBoard[3] = square;
        Board board = new Board(newBoard);

        // Act/Assert
        Assert.assertFalse(board.isEmpty());
    }

    @Test
    public void testIsFull_BoardIsEmpty_ReturnFalse(){
        // Arrange
        Board board = new Board();

        // Act/Assert
        Assert.assertFalse(board.isFull());
    }

    @Test
    public void testIsFull_BoardIsInProgress_ReturnFalse(){
        // Arrange
        Square[] newBoard = new Square[9];
        Square square = new Square();
        square.setValue(SquareValue.X);
        newBoard[3] = square;
        Board board = new Board(newBoard);

        // Act/Assert
        Assert.assertFalse(board.isFull());
    }

    @Test
    public void testIsFull_BoardIsFull_ReturnTrue(){
        // Arrange
        Square[] newBoard = new Square[9];
        Square square = new Square();
        square.setValue(SquareValue.X);

        for(int i = 0; i < newBoard.length; ++i) {
            newBoard[i] = square;
        }

        Board board = new Board(newBoard);

        // Act/Assert
        Assert.assertTrue(board.isFull());
    }

    @Test
    public void testIsInProgress_BoardIsEmpty_ReturnFalse(){
        // Arrange
        Board board = new Board();

        // Act/Assert
        Assert.assertFalse(board.inProgress());
    }

    @Test
    public void testIsInProgress_BoardIsInProgress_ReturnFalse(){
        // Arrange
        Square[] newBoard = new Square[9];
        Square square = new Square();
        square.setValue(SquareValue.X);
        newBoard[3] = square;
        Board board = new Board(newBoard);

        // Act/Assert
        Assert.assertTrue(board.inProgress());
    }

    @Test
    public void testIsInProgress_BoardIsFull_ReturnTrue(){
        // Arrange
        Square[] newBoard = new Square[9];
        Square square = new Square();
        square.setValue(SquareValue.X);

        for(int i = 0; i < newBoard.length; ++i) {
            newBoard[i] = square;
        }

        Board board = new Board(newBoard);

        // Act/Assert
        Assert.assertFalse(board.inProgress());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBoardConstructor_NewBoardIsNot9InLength_IllegalArgumentExceptionThrown() {
        // Arrange
        Square[] newBoard = new Square[7];

        // Act/Assert
        Board board = new Board(newBoard);
    }
}
