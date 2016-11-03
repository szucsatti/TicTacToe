package com.tictactoe.application;

import com.tictactoe.console.Console;
import com.tictactoe.game.TicTacToeGame;
import com.tictactoe.model.Board;

public class Application {

  public static void main(final String[] args) {
    Console console = new Console(System.out, System.in);
    Board board = new Board(3);
    TicTacToeGame game = new TicTacToeGame(board, console);

    game.start();
  }

}
