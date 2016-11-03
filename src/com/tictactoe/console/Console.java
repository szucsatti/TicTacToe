package com.tictactoe.console;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

import com.tictactoe.game.Move;

public class Console {

  private final PrintStream outStream;
  private final Scanner scanner;


  public Console(final PrintStream outStream, final InputStream inStream) {
    this.outStream = outStream;
    this.scanner = new Scanner(inStream);
  }


  public String readMark() {
    this.outStream.print("Enter mark: ");
    return this.scanner.next();
  }


  public int readCoordinateFor(final String coordinate) {
    this.outStream.print("Enter " + coordinate + ": ");
    return this.scanner.nextInt();
  }


  public Move readMove() {
    String mark = readMark();
    int row = readCoordinateFor("row");
    int column = readCoordinateFor("column");
    return new Move(mark.charAt(0), row, column);
  }


  public PrintStream getOutStream() {
    return this.outStream;
  }

}
