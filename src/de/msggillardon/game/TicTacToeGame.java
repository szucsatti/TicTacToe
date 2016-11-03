package de.msggillardon.game;

import de.msggillardon.console.Console;
import de.msggillardon.model.Board;

public class TicTacToeGame {

  private final Board board;
  private final Console console;


  public TicTacToeGame(final Board board, final Console console) {
    super();
    this.board = board;
    this.console = console;
  }


  public void start() {
    printBoardTo(this.console);
    while (!isGameFinished()) {
      Move move = this.console.readMove();
      makeMove(move);
      printBoardTo(this.console);
    }
  }


  private void printBoardTo(final Console console) {
    this.board.printBoardTo(console.getOutStream());
  }


  private void makeMove(final Move move) {
    this.board.put(move.getMark(), move.getRow(), move.getColumn());
  }


  private boolean isGameFinished() {
    return false;
  }

}
