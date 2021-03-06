package com.verzano.monospaced.printer.table.view;

import com.verzano.monospaced.printer.metrics.Padding;
import com.verzano.monospaced.printer.metrics.Size;
import com.verzano.monospaced.printer.table.model.TablePrinterModel;
import com.verzano.monospaced.printer.table.view.ui.GridUI;
import com.verzano.monospaced.printer.table.view.ui.TableUI;

public class TablePrinterView {
  private TablePrinterModel model;

  private TableUI tableUI;

  private Size[][] minSizes;
  private Size[][] maxSizes;

  private Size[] minHeaderSizes;
  private Size[] maxHeaderSizes;

  // TODO pick a better default or allow choice in the constructor
  // TODO so far this can't be null
  // TODO pick a better way to expand more evenly
  private Expansion expansion = Expansion.ALL;

  private boolean showHeaders;

  private boolean showTitle;

  private Padding pads;
  
  public TablePrinterView(TablePrinterModel model) {
    this(model, null, null, null, null, null, null);
  }

  // TODO throws if model is null
  public TablePrinterView(
      TablePrinterModel model,
      TableUI tableUI,
      Size[][] minSizes,
      Size[][] maxSizes,
      Size[] minHeaderSizes,
      Size[] maxHeaderSizes,
      Padding pads) {
    this(model, tableUI, minSizes, maxSizes, minHeaderSizes, maxHeaderSizes, model.headerCount() > 0, model.getTitle() != null, pads);
  }

  public TablePrinterView(
      TablePrinterModel model,
      TableUI tableUI,
      Size[][] minSizes,
      Size[][] maxSizes,
      Size[] minHeaderSizes,
      Size[] maxHeaderSizes,
      boolean showHeaders,
      boolean showTitle,
      Padding pads) {
    if (model == null) {
      throw new IllegalArgumentException("model cannot be null");
    }

    this.model = model;

    this.tableUI = tableUI == null ? new TableUI() : tableUI;

    int columnCount = model.columnCount();
    int rowCount = model.rowCount();
    if (minSizes == null) {
      minSizes = new Size[rowCount][columnCount];
      for (int row = 0; row < rowCount; row++) {
        for (int col = 0; col < columnCount; col++) {
          minSizes[row][col] = new Size(0, 1);
        }
      }
    }
    this.minSizes = minSizes;

    if (maxSizes == null) {
      maxSizes = new Size[rowCount][columnCount];
      for (int row = 0; row < rowCount; row++) {
        for (int col = 0; col < columnCount; col++) {
          maxSizes[row][col] = new Size(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
      }
    }
    this.maxSizes = maxSizes;

    this.showHeaders = showHeaders;

    int headerCount = model.headerCount();
    if (minHeaderSizes == null) {
      minHeaderSizes = new Size[headerCount];
      for (int header = 0; header < headerCount; header++) {
        minHeaderSizes[header] = new Size(0, 0);
      }
    }
    this.minHeaderSizes = minHeaderSizes;

    if (maxHeaderSizes == null) {
      maxHeaderSizes = new Size[headerCount];
      for (int header = 0; header < headerCount; header++) {
        maxHeaderSizes[header] = new Size(Integer.MAX_VALUE, Integer.MAX_VALUE);
      }
    }
    this.maxHeaderSizes = maxHeaderSizes;

    this.showTitle = showTitle;

    this.pads = pads == null ? new Padding(0, 0, 0, 0) : pads;
  }

  public TablePrinterModel getModel() {
    return model;
  }

  public TableUI getTableUI() {
    return tableUI;
  }

  public Size[][] getMinSizes() {
    return minSizes;
  }

  public Size[][] getMaxSizes() {
    return maxSizes;
  }

  public Size[] getMinHeaderSizes() {
    return minHeaderSizes;
  }

  public Size[] getMaxHeaderSizes() {
    return maxHeaderSizes;
  }

  public Expansion getExpansion() {
    return expansion;
  }

  public void setExpansion(Expansion expansion) {
    this.expansion = expansion;
  }

  public boolean isShowHeaders() {
    return showHeaders;
  }

  public void setShowHeaders(boolean showHeaders) {
    this.showHeaders = showHeaders;
  }

  public boolean isShowTitle() {
    return showTitle;
  }

  public void setShowTitle(boolean showTitle) {
    this.showTitle = showTitle;
  }

  public Padding getPads() {
    return pads;
  }

  public int maxHeightAt(int row, int col) {
    return maxSizes[row][col].height;
  }

  public int maxWidthAt(int row, int col) {
    return maxSizes[row][col].width;
  }

  public int minHeightAt(int row, int col) {
    return minSizes[row][col].height;
  }

  public int minWidthAt(int row, int col) {
    return minSizes[row][col].width;
  }

  public int maxHeaderHeightAt(int col) {
    return maxHeaderSizes[col].height;
  }

  public int maxHeaderWidthAt(int col) {
    return maxHeaderSizes[col].width;
  }

  public int minHeaderHeightAt(int col) {
    return minHeaderSizes[col].height;
  }

  public int minHeaderWidthAt(int col) {
    return minHeaderSizes[col].width;
  }

  public GridUI cellUI() {
    return tableUI.getCellUI();
  }

  public GridUI headerUI() {
    return tableUI.getHeaderUI();
  }

  public GridUI titleUI() {
    return tableUI.getTitleUI();
  }
}
