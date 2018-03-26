package com.coderetreat;

public class GameBoard {

    private boolean[][] board;

    public GameBoard(int length, int height) {
        board = new boolean[length][height];
    }

    public GameBoard(boolean[][] state) {
        board = state;
    }

    public boolean[][] getState() {
        return board.clone();
    }

    public void changeState(int x, int y) {
        board[x][y] = !board[x][y];
    }
}
