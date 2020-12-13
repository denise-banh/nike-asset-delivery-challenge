package Question1.DataStructure1;

public interface IBoard{

    // A 3x3 bar is initialized as an array of 9 Square objects
    Square[] Board = new Square[9];

    // Returns whether the Board is empty
    boolean isEmpty();

    // Returns whether the Board is full/has no empty spaces
    boolean isFull();

    // Returns whether the Board has empty and filled spaces
    // Should not return true if the board is complete
    boolean inProgress();

    // Saves value in the indicated position.
    // Returns whether the save is successful
    boolean playSquare(int position, SquareValue value);
}
