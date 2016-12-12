package com.verzano.terminalprinter.table.metrics;

public class Size {
  public int width;
  public int height;

  public Size() {
    this(0, 0);
  }

  public Size(int width, int height) {
    this.width = width;
    this.height = height;
  }
}
