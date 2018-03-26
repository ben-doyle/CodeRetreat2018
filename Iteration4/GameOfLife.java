// KEEP YOUR METHODS WITHIN 5 LINES

package com.coderetreat;

import java.util.Arrays;

public class GameOfLife {

    int rows;
    int cols;
    private int[][] board;
    private int[][] newBoard;

    GameOfLife(int row, int col) {
        this.rows = row;
        this.cols = col;
        board = new int[row][col];
    }

    public void setState(int row, int col, int state) {
        board[row][col] = state;
    }

    public int getState(int row, int col) {
        return board[row][col];
    }

    public int checkNeighbours(int row, int col) {
        int alive = getState(row, col);
        int[] starts = createXBoundaries(row);
        starts = createYBoundaries(row, starts);
        int result = getResult(starts);
        return result - alive;
    }

    private int getResult(int[] starts) {
        int result = 0;
        for (int i = starts[0]; i <= starts[1]; ++i) {
            for (int j = starts[2]; j <= starts[3]; ++j) {
                result += board[i][j];
            } } return result;
    }

    private int[] createXBoundaries(int row) {
        int startX = (row == 0) ? 0 : row - 1;
        int endX = (row == rows - 1) ? row : row + 1;
        int[] returnArray = {startX, endX, 0, 0};
        return returnArray;
    }

    private int[] createYBoundaries(int col, int[] returnArray) {
        int startY = (cols == 0) ? 0 : col - 1;
        int endY = (col == cols - 1) ? col : col + 1;
        returnArray[3] = startY;
        returnArray[4] = endY;
        return returnArray;
    }

    private void iterate() {
        newBoard = new int[rows][cols];
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                newBoard[i][j] = getNextState(i, j);
            } }
        board = newBoard;
    }

    private int getNextState(int i, int j) {
        int result = checkNeighbours(i, j);
        int alive = board[i][j];
        if (result == 3) { return 1;
        } else if (result == 2 && alive == 1){ return 1;
        } else { return 0; }
    }

    @Override
    public String toString() {
        String result = "";
        for (int[] j : board) {
            result.concat(Arrays.toString(j));
        }
        return result;
    }
}
