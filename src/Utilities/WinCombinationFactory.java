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

        winConditions.add(new int[]{1, 2, 3});
        winConditions.add(new int[]{4, 5, 6});
        winConditions.add(new int[]{7, 8, 9});
        winConditions.add(new int[]{1, 4, 7});
        winConditions.add(new int[]{2, 5, 8});
        winConditions.add(new int[]{3, 6, 9});
        winConditions.add(new int[]{1, 5, 9});
        winConditions.add(new int[]{3, 5, 7});

        return winConditions;
    }
}
