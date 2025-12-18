package com.games;

import java.util.Scanner;

public class TicTacToeApp {
    private final Board board;
    private final Scanner scanner;
    private final Player playerX;
    private final Player playerO;

    public TicTacToeApp() {
        this.board = new Board();
        this.scanner = new Scanner(System.in);
        this.playerX = new Player('X');
        this.playerO = new Player('O');
    }

    public static void main(String[] args) {
        new TicTacToeApp().run();
    }

    public void run() {
        System.out.println("[TIC-TAC-TOE] Console Edition");
        System.out.println("=============================");
        System.out.println();

        boolean playAgain = true;
        while (playAgain) {
            playGame();
            playAgain = askPlayAgain();
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }

    private void playGame() {
        board.clear();
        Player currentPlayer = playerX;

        System.out.println("New game started! X goes first.");
        board.print();

        while (!board.isGameOver()) {
            boolean validMove = false;
            while (!validMove) {
                int position = readPosition(currentPlayer);
                validMove = board.placeMark(currentPlayer.getMark(), position);
                if (!validMove) {
                    System.out.println("Invalid move. Try again.");
                }
            }
            board.print();
            currentPlayer = currentPlayer == playerX ? playerO : playerX;
        }

        String result = board.getGameResult();
        System.out.println("=== GAME OVER ===");
        System.out.println(result);
    }

    private int readPosition(Player player) {
        System.out.print(player.getMark() + " player, enter position (1-9): ");
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.print("Please enter a number 1-9: ");
            }
        }
    }

    private boolean askPlayAgain() {
        System.out.print("\nPlay again? (y/n): ");
        String response = scanner.nextLine().trim().toLowerCase();
        return response.startsWith("y");
    }
}