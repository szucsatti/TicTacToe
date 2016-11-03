package de.msggillardon.application;

import de.msggillardon.console.Console;
import de.msggillardon.game.TicTacToeGame;
import de.msggillardon.model.Board;

public class Application {

  public static void main(final String[] args) {
    Console console = new Console(System.out, System.in);
    Board board = new Board(3);
    TicTacToeGame game = new TicTacToeGame(board, console);

    game.start();
  }

}
