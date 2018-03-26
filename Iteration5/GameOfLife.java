// AN INFINITE SIZE GRID

package com.coderetreat;

public class GameOfLife {

    boolean firstboard;

    boolean[][] board;

    GameOfLife north;
    GameOfLife northEast;
    GameOfLife east;
    GameOfLife southEast;
    GameOfLife south;
    GameOfLife southWest;
    GameOfLife west;
    GameOfLife northWest;

    public GameOfLife(int size) {
        firstboard = true;
        board = new boolean[size][size];
    }

    public GameOfLife(int size, boolean firstboard) {
        this.firstboard = firstboard;
        board = new boolean[size][size];
    }

    public boolean getValue(int x, int y) {
        if (x >= board.length) {
            if (east == null) {
                east = new GameOfLife(board.length, false);
                return east.getValue(x - board.length, y);
            }
        }
        //TODo rest;
        return false;
    }

    private void checkEmpty() {
        // Check if board is empty
        // Checks Neighbour boards to see if I can be deleted.
        // If so, tells only neighbour board I am deleting.
        // Neighbour Board becomes firstBoard.
    }
}
