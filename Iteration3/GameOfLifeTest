package com.coderetreat;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GameOfLIfeTest {

    @Test
    public void gridSet(){
        Grid grid = new Grid(10, 10);
        GameOfLife gameOfLife = new GameOfLife(grid);

        int x = 1;
        int y =4;

        gameOfLife.setAlive(x,y);

        assertTrue(gameOfLife.isAlive(x,y));

    }

    @Test
    public void cellAlive(){

        Grid grid = new Grid(3, 3);
        GameOfLife gameOfLife = new GameOfLife(grid);

        gameOfLife.setAlive(0,0);
        gameOfLife.setAlive(0,2);
        gameOfLife.setAlive(2,0);

        gameOfLife.iterate();

        assertTrue(gameOfLife.isAlive(1,1));
    }
}
