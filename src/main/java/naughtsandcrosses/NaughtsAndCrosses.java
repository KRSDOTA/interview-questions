package naughtsandcrosses;

import java.util.*;

public class NaughtsAndCrosses {

    private static final String CROSS = "X";
    private static final String NAUGHT = "0";

    final List<Point> availableBoardPositions;

    final String [][] board;

    final int positionsToFill;

    public NaughtsAndCrosses(int boardSize) {
        board = new String[boardSize][boardSize];
        positionsToFill = boardSize*boardSize;
        availableBoardPositions = new ArrayList<>(positionsToFill);
        this.initialiseBoard();
    }

    private void initialiseBoard() {
        for (int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                availableBoardPositions.add(new Point(i, j));
                board[i][j] = "";
            }
        }
    }

    /**
     * Play a simulated naughts and crosses game
     */
    public void play() {
        for (int i = 0; i < positionsToFill; i++) {
            boolean shouldInsertCross = i % 2 == 0; // Crosses if even, Naughts if odd.
            final Point pointToAdd = availableBoardPositions.remove(0);
            Collections.shuffle(availableBoardPositions);
            board[pointToAdd.getXCoordinate()][pointToAdd.getYCoordinate()] = shouldInsertCross ? CROSS : NAUGHT;
        }
        printBoard();
    }

    void printBoard() {
        System.out.printf(Arrays.deepToString(board));

    }

    private boolean hasWon(){
        return true;
    }
}
