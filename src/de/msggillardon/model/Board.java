package de.msggillardon.model;

import java.io.PrintStream;

public class Board {

  private static final String EMPTY_STRING = " ";
  private static final String VERTICAL_BAR = "|";
  private static final String EMPTY_CELL = "-";
  private final Character board[][];
  private final int size;


  public Board(final int size) {
    this.size = size;
    this.board = new Character[this.size][this.size];
  }


  @SuppressWarnings("unused")
  public void init() {
    for (Character[] column : this.board) {
      for (Character element : column) {
        element = null;
      }
    }
  }


  public boolean isFull() {
    for (Character[] column : this.board) {
      for (Character element : column) {
        if (!isEmpty(element)) {
          return false;
        }
      }
    }
    return true;
  }


  public void put(final Character mark, final int row, final int column) {
    if (isCoordinateValid(row) && isCoordinateValid(column) && !isEmpty(mark)) {
      this.board[row][column] = mark;
    }
  }


  private boolean isCoordinateValid(final int position) {
    return position >= 0 && position <= this.size - 1;
  }


  private boolean isEmpty(final Character character) {
    return character == null;
  }


  public int getSize() {
    return this.size;
  }


  public void printBoardTo(final PrintStream outStream) {
    for (Character[] column : this.board) {
      printFirstBar(outStream);
      for (Character character : column) {
        outStream.print(replaceIfNull(character) + EMPTY_STRING);
      }
      printLastBar(outStream);
      printNewLine(outStream);
    }
  }


  private void printLastBar(final PrintStream outStream) {
    outStream.print(VERTICAL_BAR);
  }


  private void printFirstBar(final PrintStream outStream) {
    outStream.print(VERTICAL_BAR + EMPTY_STRING);
  }


  private void printNewLine(final PrintStream outStream) {
    outStream.println();
  }


  private String replaceIfNull(final Character character) {
    return character == null ? EMPTY_CELL : character.toString();
  }

}
