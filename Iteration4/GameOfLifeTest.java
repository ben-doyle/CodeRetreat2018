package com.coderetreat;

import org.junit.Before;
import org.junit.Test;

public class GameOfLifeTest {

    @Test
    public void initalTest() {
        GameOfLife gameOfLife = new GameOfLife(20, 10);
        gameOfLife.setState(2, 5, 1);
        System.out.println(gameOfLife.toString());
    }
}
