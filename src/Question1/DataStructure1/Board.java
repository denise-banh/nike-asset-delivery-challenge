package Question1.DataStructure1;

public class Board implements IBoard {

    private Square[] board;

    // Initialize a brand new board
    public Board(){
        board =  new Square[9];
        initializeBoard();
    }

    public Board(Square[] newBoard) {
        if(newBoard.length != 9) {
            throw new IllegalArgumentException("new board must be an array of size 9");
        }

        board = newBoard;
        initializeBoard();
    }

    private void initializeBoard() {
        for(int i = 0; i < board.length; ++i){
            if(board[i] == null) {
                board[i] = new Square();
            }
        }
    }

    public Square[] getBoard(){
        return board;
    }

    @Override
    public boolean isEmpty() {
        for(int i = 0; i < 9; ++i){
            if(board[i].getValue() != SquareValue.EMPTY) {
                return false;
            }
        }

        return true;
    }

    @Override
    public boolean isFull() {
        for(int i = 0; i < 9; ++i){
            if(board[i].getValue() == SquareValue.EMPTY) {
                return false;
            }
        }

        return true;
    }

    @Override
    public boolean inProgress() {
        int emptyCount = 0;
        int playedCount = 0;

        for(int i = 0; i < 9; ++i){
            if(board[i].getValue() == SquareValue.EMPTY) {
                ++emptyCount;
            }
            else {
                ++playedCount;
            }

            if(emptyCount > 0 && playedCount > 0) {
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean playSquare(int position, SquareValue value) {
        if(position >8 || board[position].getValue() != SquareValue.EMPTY) {
            return false;
        }

        board[position].setValue(value);
        return true;
    }
}
