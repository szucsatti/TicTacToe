package com.tictactoe.game;

public class Move {

  private final Character sign;
  private final int row;
  private final int column;


  public Move(final Character sign, final int row, final int column) {
    super();
    this.sign = sign;
    this.row = row;
    this.column = column;
  }


  public Character getMark() {
    return this.sign;
  }


  public int getRow() {
    return this.row;
  }


  public int getColumn() {
    return this.column;
  }

}
