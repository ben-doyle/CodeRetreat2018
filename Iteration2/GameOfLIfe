package com.coderetreat;

public class GameOfLife {

    private int length;
    private int height;

    private GameBoard board;
    private GameBoard nextBoard;

    public GameOfLife(int length, int height) {
        board = new GameBoard(length, height);
        nextBoard = new GameBoard(board.getState());
        this.length = length;
        this.height = height;
    }

    public boolean[][] getState() {
        return board.getState();
    }

    private int checkNeighbours(int x, int y) {
        return 0;
    }

    public void changeState(int x, int y) {
        board.changeState(x, y);
    }

    public void nextState() {
        boolean[][]state = board.getState();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < height; j++) {
                int neighbours = checkNeighbours(i, j);
                boolean alive = state[i][j];
                if (!alive) {
                    if (neighbours == 3) {
                        nextBoard.changeState(i, j);
                    }
                } else {
                    if (neighbours < 2 || neighbours > 3) {
                        nextBoard.changeState(i, j);
                    }
                }
            }
        }
        board = nextBoard;
        nextBoard = new GameBoard(board.getState());
    }

    @Override
    public String toString() {
        String output = "";
        boolean[][] state = board.getState();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < height; j++) {
                if (state[i][j]) {
                    output = output.concat("O");
                } else {
                    output = output.concat("X");
                }
            }
            output = output.concat("\n");
        }
        return output;
    }
}
