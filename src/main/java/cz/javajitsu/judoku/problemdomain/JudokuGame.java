package cz.javajitsu.judoku.problemdomain;

import cz.javajitsu.judoku.constants.GameState;

import java.io.Serializable;

public class JudokuGame implements Serializable {
    private final GameState gameState;
    private final int[][] gridState;

    private static final int GRID_BOUNDARY = 9;

    public JudokuGame(GameState gameState, int[][] gridState) {
        this.gameState = gameState;
        this.gridState = gridState;
    }

    public GameState getGameState() {
        return gameState;
    }

    public int[][] getCopyOfGridState() {
        return SudokuUtilities.copyToNewArray(gridState);
    }
}
