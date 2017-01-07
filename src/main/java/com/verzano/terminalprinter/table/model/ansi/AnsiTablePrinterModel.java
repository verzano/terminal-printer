package com.verzano.terminalprinter.table.model.ansi;

import com.verzano.terminalprinter.table.model.TablePrinterModel;

import static com.verzano.terminalprinter.table.model.ansi.AnsiCodes.CLEAR;
import static com.verzano.terminalprinter.table.model.ansi.AnsiCodes.generateCode;

public class AnsiTablePrinterModel implements TablePrinterModel {
  private TablePrinterModel decoratedModel;
  private String[][] attributes;
  private String[][] foregrounds;
  private String[][] backgrounds;

  public AnsiTablePrinterModel(
      TablePrinterModel decoratedModel,
      String[][] attributes,
      String[][] foregrounds,
      String[][] backgrounds) {
    this.decoratedModel = decoratedModel;
    this.attributes = attributes;
    this.foregrounds = foregrounds;
    this.backgrounds = backgrounds;
  }

  @Override
  public Object dataAt(int row, int col) {
    return generateCode(attributes[row][col], foregrounds[row][col], backgrounds[row][col])
        + decoratedModel.dataAt(row, col)
        + CLEAR;
  }

  @Override
  public int rowCount() {
    return decoratedModel.rowCount();
  }

  @Override
  public int columnCount() {
    return decoratedModel.columnCount();
  }

  @Override
  public int dataWidthAt(int row, int col) {
    return decoratedModel.dataWidthAt(row, col);
  }

  @Override
  public Object headerAt(int head) {
    return decoratedModel.headerAt(head);
  }

  @Override
  public int headerCount() {
    return decoratedModel.headerCount();
  }

  @Override
  public Object getTitle() {
    return decoratedModel.getTitle();
  }

  @Override
  public int headerWidthAt(int header) {
    return decoratedModel.headerWidthAt(header);
  }

  @Override
  public int titleWidth() {
    return decoratedModel.titleWidth();
  }
}
