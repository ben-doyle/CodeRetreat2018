package com.coderetreat;

public class GameOfLife {
    Grid currentGrid;
    Grid newGrid;

    public GameOfLife(Grid grid) {
        currentGrid = grid;
    }

    public void setAlive(int x, int y) {
        currentGrid.setAlive(x, y);
    }

    public boolean isAlive(int x, int y) {
        return currentGrid.isAlive(x, y);
    }

    public int checkNeighbours(int x, int y) {
        int neighbours = 0;

        int startX;
        int endX;
        int startY;
        int endY;

        if (x <= 0) {
            startX = 0;
        } else {
            startX = x -1;
        }

        if (x == currentGrid.getX()) {

        }

        for (startX; i < (x+1); ++i) {
            for (int j = (y-1); j < (y+1); ++j) {
                if (i == x && j == y) {
                    continue;
                } else {
                    if (currentGrid.isAlive(i, j)){
                        neighbours++;
                    }
                }
            }
        }
        return neighbours;
    }

    public void iterate() {
        newGrid = new Grid(currentGrid.getX(), currentGrid.getY());

        for (int x = 0; x < currentGrid.getX(); x++) {
            for (int y = 0; y < currentGrid.getY(); y++) {
                changeState(x, y, checkNeighbours(x, y));
            }
        }

        currentGrid = new Grid(newGrid.getGrid());
        newGrid = new Grid(currentGrid.getX(), currentGrid.getY());
    }

    private void changeState(int x, int y, int neighbours) {
        boolean alive = currentGrid.isAlive(x, y);
        boolean aliveCondition = false;

        if (!alive && neighbours == 3) {
            newGrid.setAlive(x, y);
        } else if (alive && (neighbours == 2 || neighbours == 3)) {
            newGrid.setAlive(x, y);
        }

        if (!alive && neighbours == 3) {
            newGrid.setAlive(x, y);
        }

        if(neighbours == 2 || neighbours ==3){
            aliveCondition = true;
        }

        if(alive && !aliveCondition){


        }
    }

}
