import Question1.DataStructure1.Board;
import Question1.DataStructure1.Square;
import Question1.DataStructure1.SquareValue;
import Question2And3.BoardUtilities;
import Enum.Player;

// This class is just used as a helper for Main to run a test game.
public class Game {
    private Board board;
    private BoardUtilities boardUtilities;

    public Game(String row1, String row2, String row3){
        board = new Board(populateGameBoard(row1, row2, row3));
        boardUtilities = new BoardUtilities();
    }

    public Player DetermineWinner(){
        return boardUtilities.determineWinner(board);
    }

    public boolean IsComplete(){
        return boardUtilities.isGameComplete(board);
    }

    public Square[] populateGameBoard(String row1, String row2, String row3) {

        Square[] squares = {
                new Square(getSquareValue(row1.charAt(0))),
                new Square(getSquareValue(row1.charAt(1))),
                new Square(getSquareValue(row1.charAt(2))),
                new Square(getSquareValue(row2.charAt(0))),
                new Square(getSquareValue(row2.charAt(1))),
                new Square(getSquareValue(row2.charAt(2))),
                new Square(getSquareValue(row3.charAt(0))),
                new Square(getSquareValue(row3.charAt(1))),
                new Square(getSquareValue(row3.charAt(2))),
        };

        return squares;
    }

    private SquareValue getSquareValue(char value) {
        String valueString = Character.toString(value).toUpperCase();
        if(valueString.equals(SquareValue.X.toString())) {
            return SquareValue.X;
        }

        if(valueString.equals(valueString == SquareValue.O.toString())) {
            return SquareValue.X;
        }

        return SquareValue.EMPTY;
    }
}
