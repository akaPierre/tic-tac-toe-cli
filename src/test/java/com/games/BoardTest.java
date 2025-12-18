package com.games;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BoardTest {

    private Board board;

    @BeforeEach
    void setUp() {
        board = new Board();
    }

    @Test
    void testPlaceMarkValid() {
        assertTrue(board.placeMark('X', 1));
        assertTrue(board.placeMark('O', 2));
        assertFalse(board.placeMark('X', 1)); // taken
        assertFalse(board.placeMark('X', 10)); // out of bounds
    }

    @Test
    void testXRowWinTop() {
        board.placeMark('X', 1);
        board.placeMark('X', 2);
        board.placeMark('X', 3);
        assertTrue(board.isGameOver());
    }

    @Test
    void testOWinColumnMiddle() {
        board.placeMark('O', 4);
        board.placeMark('O', 5);
        board.placeMark('O', 6);
        assertTrue(board.isGameOver());
    }

    @Test
    void testXDiagonalWin() {
        board.placeMark('X', 1);
        board.placeMark('X', 5);
        board.placeMark('X', 9);
        assertTrue(board.isGameOver());
    }

    @Test
    void testBoardNotFullEarly() {
        board.placeMark('X', 1);
        board.placeMark('O', 3);
        assertFalse(board.isGameOver());
        assertEquals("Game continues...", board.getGameResult());
    }

    @Test
    void testAllPositionsEmptyInitially() {
        for (int i = 1; i <= 9; i++) {
            assertTrue(board.placeMark(' ', i)); // space is empty
        }
    }
}