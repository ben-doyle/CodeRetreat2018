package com.coderetreat;

public class GameOfLife {

    private static final int INITIAL_SIZE = 100;
    private static boolean[][] grid;

    public GameOfLife(int size) {
        grid = setup(size);
    }

    public GameOfLife() {
        grid = setup(INITIAL_SIZE);
    }

    public int checkNeighbours(int x, int y){
        int neighbours = 0;

        for (int row = (x - 1); row < (x + 1); ++row){
            for (int column = (y - 1); column < (y + 1); ++column) {
                if (grid[row][column]) {
                    neighbours++;
                }
            }
        }
        return neighbours;
    }

    public void changeState(int x, int y) {
        int neighbours = checkNeighbours(x, y);
        final boolean alive = grid[x][y];

        if (!alive) {
            if (neighbours == 3) {
                grid[x][y] = true;
            }
        } else {
            switch(neighbours) {
                case 2:
                case 3:
                    break;
                default:
                    grid[x][y] = false;
                    break;
            }
        }
    }

    public boolean[][] setup(final int size) {
        return new boolean[size][size];
    }
}
