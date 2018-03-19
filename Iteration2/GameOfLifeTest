package com.coderetreat;

import org.junit.Before;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GameOfLifeTest {
    private GameOfLife gameOfLife;

    @Test
    public void trueShouldBeTrue() {
        assertThat(true).isEqualTo(true);
    }

    @Before
    public void setup() {
        gameOfLife = new GameOfLife(10, 10);

    }

    @Test
    public void gameSetup() {
        final boolean[][] initialState = gameOfLife.getState();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                assertEquals(initialState[i][j], false);
            }
        }
    }

    @Test
    public void stateChangeTest() {
        final boolean initialState = gameOfLife.getState()[1][4];
        gameOfLife.changeState(1, 4);
        assertEquals(gameOfLife.getState()[1][4], !initialState);
    }

    @Test
    public void progressGameCellDies() {
        gameOfLife.changeState(2, 2);
        gameOfLife.nextState();
        final boolean[][] state = gameOfLife.getState();
        assertEquals(state[2][2], false);
    }

    @Test
    public void printEmptyBoard() {
        String output = gameOfLife.toString();
        String expected =   "XXXXXXXXXX\n" +
                            "XXXXXXXXXX\n" +
                            "XXXXXXXXXX\n" +
                            "XXXXXXXXXX\n" +
                            "XXXXXXXXXX\n" +
                            "XXXXXXXXXX\n" +
                            "XXXXXXXXXX\n" +
                            "XXXXXXXXXX\n" +
                            "XXXXXXXXXX\n" +
                            "XXXXXXXXXX\n";

        assertTrue(expected.equals(output));

    }
}
