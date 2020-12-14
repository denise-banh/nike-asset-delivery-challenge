package Question2And3;

import Question1.DataStructure1.Board;
import Question1.DataStructure1.IBoard;
import Question1.DataStructure1.Square;
import Question1.DataStructure1.SquareValue;
import Utilities.WinCombinationFactory;
import Enum.Player;

import java.util.ArrayList;
import java.util.List;

public class BoardUtilities {

    private List<int[]> winCombinations;
    
    public BoardUtilities() {
        WinCombinationFactory factory = new WinCombinationFactory();
        winCombinations = factory.buildWinCombinations();
    }

    // QUESTION 2
    public Player determineWinner(Board value) {
        if(value == null) {
            throw new IllegalArgumentException("Board is required");
        }

        Square[] board = value.getBoard();

        for (int[] positions : winCombinations) {

            // Find the Squares required for this win combination
            List<Square> squares = new ArrayList<Square>();
            squares.add(board[positions[0]]);
            squares.add(board[positions[1]]);
            squares.add(board[positions[2]]);

            // Check to see if either of the players have played their mark (X or O) in
            // all the squares

            if(playerClaimedAllSquares(squares, Player.ONE)) {
                return Player.ONE;
            }

            if(playerClaimedAllSquares(squares, Player.TWO)) {
                return Player.TWO;
            }
        }

        // Neither player has won
        return null;
    }

    // Determines if a player has marked all squares
    private boolean playerClaimedAllSquares(List<Square> squares, Player player){
        SquareValue playerSymbol = player == Player.ONE ? SquareValue.X : SquareValue.O;

        for(Square square : squares){
            if(square.getValue() != playerSymbol){
                return false;
            }
        }

        return true;
    }

    // QUESTION 3
    // A game is complete if the game board is full (all spaces are filled)
    // Or if a winner is determined
    public boolean isGameComplete(Board board){

        // First determine if all squares were played
        if(board.isFull()) {
            return true;
        }

        // Then check if a winner was determined
        return determineWinner(board) != null;
    }
}
