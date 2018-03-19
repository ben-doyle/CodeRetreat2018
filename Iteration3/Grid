package com.coderetreat;

public class Grid {

    int x;
    int y;
    private boolean[][] grid;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Grid(int x, int y) {
        this.x = x;
        this.y = y;
        grid = new boolean[x][y];
    }

    public Grid(boolean[][] grid) {
        this.grid = grid;
    }

    public boolean[][] getGrid() {
        return grid.clone();
    }

    public boolean isAlive(int x, int y) {
        return grid[x][y];
    }

    public void setAlive(int x, int y) {
        grid[x][y] = true;
    }
}
