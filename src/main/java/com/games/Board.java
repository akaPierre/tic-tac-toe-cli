package com.games;

public class Board {
    private final char[] cells = new char[9];

    public Board() {
        clear();
    }

    public void clear() {
        for (int i = 0; i < 9; i++) {
            cells[i] = ' ';
        }
    }

    public boolean placeMark(char mark, int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        int index = position - 1;
        if (cells[index] != ' ') {
            return false;
        }
        cells[index] = mark;
        return true;
    }

    public void print() {
        System.out.println("   |   |   ");
        System.out.println(" " + cells[0] + " | " + cells[1] + " | " + cells[2] + " ");
        System.out.println("___|___|___");
        System.out.println("   |   |   ");
        System.out.println(" " + cells[3] + " | " + cells[4] + " | " + cells[5] + " ");
        System.out.println("___|___|___");
        System.out.println("   |   |   ");
        System.out.println(" " + cells[6] + " | " + cells[7] + " | " + cells[8] + " ");
        System.out.println("   |   |   ");
    }

    public boolean isGameOver() {
        // CHECK WIN FIRST, then DRAW
        if (isWinner('X') || isWinner('O')) {
            return true;
        }
        return isFull();
    }

    public String getGameResult() {
        if (isWinner('X')) return "[WINNER] Player X wins!";
        if (isWinner('O')) return "[WINNER] Player O wins!";
        if (isFull()) return "[DRAW] It's a draw!";
        return "Game continues...";
    }

    private boolean isWinner(char mark) {
        // Rows
        for (int i = 0; i < 9; i += 3) {
            if (cells[i] == mark && cells[i + 1] == mark && cells[i + 2] == mark) {
                return true;
            }
        }
        // Columns
        for (int i = 0; i < 3; i++) {
            if (cells[i] == mark && cells[i + 3] == mark && cells[i + 6] == mark) {
                return true;
            }
        }
        // Diagonals
        if (cells[0] == mark && cells[4] == mark && cells[8] == mark) {
            return true;
        }
        if (cells[2] == mark && cells[4] == mark && cells[6] == mark) {
            return true;
        }
        return false;
    }

    private boolean isFull() {
        for (char cell : cells) {
            if (cell == ' ') {
                return false;
            }
        }
        return true;
    }
}