package Utilities;

import java.util.ArrayList;
import java.util.List;

// This factory builds and returns a list of positions that are required to win a tic-tac-toe
// game with 9 spaces (3x3 grid).

// This assumes that the numbered positions begin in the top left of the grid,
// are numbered left-to-right, and will start with the top row, working down.
public class WinCombinationFactory {

    public List<int[]> buildWinCombinations(){
        List<int[]> winConditions = new ArrayList<int[]>();

        winConditions.add(new int[]{0, 1, 2});
        winConditions.add(new int[]{3, 4, 5});
        winConditions.add(new int[]{6, 7, 8});
        winConditions.add(new int[]{0, 3, 6});
        winConditions.add(new int[]{1, 4, 7});
        winConditions.add(new int[]{2, 5, 8});
        winConditions.add(new int[]{0, 4, 8});
        winConditions.add(new int[]{2, 4, 6});

        return winConditions;
    }
}
