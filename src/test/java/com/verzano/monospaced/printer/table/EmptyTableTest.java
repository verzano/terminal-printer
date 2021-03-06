package com.verzano.monospaced.printer.table;

import static org.junit.Assert.assertEquals;

import com.verzano.monospaced.printer.table.model.DefaultTablePrinterModel;
import com.verzano.monospaced.printer.table.view.TablePrinterView;
import com.verzano.monospaced.printer.test.helper.TestHelper;
import org.junit.Test;

public class EmptyTableTest {
  @Test
  public void createTable0x0Empty() throws Exception {
    String table0x0Empty = TestHelper.getTestResourceAsString("table/empty/Table0x0Empty.txt");

    DefaultTablePrinterModel model = new DefaultTablePrinterModel(
        new Object[][]{},
        null,
        null);
    String printedTable = TestHelper.printTableAsString(new TablePrinter(model, null, null));

    assertEquals(table0x0Empty, printedTable);
  }

  @Test
  public void createTable0x1EmptyWithHeaders() throws Exception {
    String table0x1EmptyWithHeaders = TestHelper
        .getTestResourceAsString("table/empty/Table0x1EmptyWithHeaders.txt");

    DefaultTablePrinterModel model = new DefaultTablePrinterModel(
        new Object[][]{},
        new Object[]{"C1"},
        null);
    TablePrinterView view = new TablePrinterView(
        model,
        null,
        null,
        null,
        null,
        null,
        true,
        false,
        null);
    String printedTable = TestHelper.printTableAsString(new TablePrinter(model, view, null));

    assertEquals(table0x1EmptyWithHeaders, printedTable);
  }

  @Test
  public void createTable0x1EmptyWithTitle() throws Exception {
    String table0x1EmptyWithTitle = TestHelper
        .getTestResourceAsString("table/empty/Table0x1EmptyWithTitle.txt");

    DefaultTablePrinterModel model = new DefaultTablePrinterModel(
        new Object[][]{},
        new Object[]{},
        "Title");
    TablePrinterView view = new TablePrinterView(
        model,
        null,
        null,
        null,
        null,
        null,
        false,
        true,
        null);
    String printedTable = TestHelper.printTableAsString(new TablePrinter(model, view, null));

    assertEquals(table0x1EmptyWithTitle, printedTable);
  }

  @Test
  public void createTable0x2EmptyWithHeaders() throws Exception {
    String table0x2EmptyWithHeaders = TestHelper
        .getTestResourceAsString("table/empty/Table0x2EmptyWithHeaders.txt");

    DefaultTablePrinterModel model = new DefaultTablePrinterModel(
        new Object[][]{},
        new Object[]{"C1", "C2"},
        null);
    TablePrinterView view = new TablePrinterView(
        model,
        null,
        null,
        null,
        null,
        null,
        true,
        false,
        null);
    String printedTable = TestHelper.printTableAsString(new TablePrinter(model, view, null));

    assertEquals(table0x2EmptyWithHeaders, printedTable);
  }

  @Test
  public void createTable0x2EmptyWithHeadersAndTitle() throws Exception {
    String table0x2EmptyWithHeadersAndTitle = TestHelper
        .getTestResourceAsString("table/empty/Table0x2EmptyWithHeadersAndTitle.txt");

    DefaultTablePrinterModel model = new DefaultTablePrinterModel(
        new Object[][]{},
        new Object[]{"C1", "C2"},
        "Title");
    TablePrinterView view = new TablePrinterView(
        model,
        null,
        null,
        null,
        null,
        null,
        true,
        true,
        null);
    String printedTable = TestHelper.printTableAsString(new TablePrinter(model, view, null));

    assertEquals(table0x2EmptyWithHeadersAndTitle, printedTable);
  }

  @Test
  public void createTable1x1Empty() throws Exception {
    String table1x1Empty = TestHelper.getTestResourceAsString("table/empty/Table1x1Empty.txt");

    DefaultTablePrinterModel model = new DefaultTablePrinterModel(
        new Object[][]{
            {null}
        },
        null,
        null);
    String printedTable = TestHelper.printTableAsString(new TablePrinter(model, null, null));

    assertEquals(table1x1Empty, printedTable);
  }

  @Test
  public void createTable1x1EmptyWithHeaders() throws Exception {
    String table1x1EmptyWithHeaders = TestHelper
        .getTestResourceAsString("table/empty/Table1x1EmptyWithHeaders.txt");

    DefaultTablePrinterModel model = new DefaultTablePrinterModel(
        new Object[][]{
            {null}
        },
        new Object[]{"C1"},
        null);
    TablePrinterView view = new TablePrinterView(
        model,
        null,
        null,
        null,
        null,
        null,
        true,
        false,
        null);
    String printedTable = TestHelper.printTableAsString(new TablePrinter(model, view, null));

    assertEquals(table1x1EmptyWithHeaders, printedTable);
  }

  @Test
  public void createTable1x1EmptyWithHeadersAndTitle() throws Exception {
    String table1x1EmptyWithHeadersAndTitle = TestHelper
        .getTestResourceAsString("table/empty/Table1x1EmptyWithHeadersAndTitle.txt");

    DefaultTablePrinterModel model = new DefaultTablePrinterModel(
        new Object[][]{
            {null}
        },
        new Object[]{"C1"},
        "Title");
    TablePrinterView view = new TablePrinterView(
        model,
        null,
        null,
        null,
        null,
        null,
        true,
        true,
        null);
    String printedTable = TestHelper.printTableAsString(new TablePrinter(model, view, null));

    assertEquals(table1x1EmptyWithHeadersAndTitle, printedTable);
  }

  @Test
  public void createTable1x1EmptyWithTitle() throws Exception {
    String table1x1EmptyWithTitle = TestHelper
        .getTestResourceAsString("table/empty/Table1x1EmptyWithTitle.txt");

    DefaultTablePrinterModel model = new DefaultTablePrinterModel(
        new Object[][]{
            {null}
        },
        new Object[]{},
        "Title");
    TablePrinterView view = new TablePrinterView(
        model,
        null,
        null,
        null,
        null,
        null,
        false,
        true,
        null);
    String printedTable = TestHelper.printTableAsString(new TablePrinter(model, view, null));

    assertEquals(table1x1EmptyWithTitle, printedTable);
  }

  @Test
  public void createTable1x2Empty() throws Exception {
    String table1x2Empty = TestHelper.getTestResourceAsString("table/empty/Table1x2Empty.txt");

    DefaultTablePrinterModel model = new DefaultTablePrinterModel(
        new Object[][]{
            {null, null}
        },
        null,
        null);
    String printedTable = TestHelper.printTableAsString(new TablePrinter(model, null, null));

    assertEquals(table1x2Empty, printedTable);
  }

  @Test
  public void createTable1x2EmptyWithHeaders() throws Exception {
    String table1x2EmptyWithHeaders = TestHelper
        .getTestResourceAsString("table/empty/Table1x2EmptyWithHeaders.txt");

    DefaultTablePrinterModel model = new DefaultTablePrinterModel(
        new Object[][]{
            {null, null}
        },
        new Object[]{"C1", "C2"},
        null);
    TablePrinterView view = new TablePrinterView(
        model,
        null,
        null,
        null,
        null,
        null,
        true,
        false,
        null);
    String printedTable = TestHelper.printTableAsString(new TablePrinter(model, view, null));

    assertEquals(table1x2EmptyWithHeaders, printedTable);
  }

  @Test
  public void createTable1x2EmptyWithHeadersAndTitle() throws Exception {
    String table1x2EmptyWithHeadersAndTitle = TestHelper
        .getTestResourceAsString("table/empty/Table1x2EmptyWithHeadersAndTitle.txt");

    DefaultTablePrinterModel model = new DefaultTablePrinterModel(
        new Object[][]{
            {null, null}
        },
        new Object[]{"C1", "C2"},
        "Title");
    TablePrinterView view = new TablePrinterView(
        model,
        null,
        null,
        null,
        null,
        null,
        true,
        true,
        null);
    String printedTable = TestHelper.printTableAsString(new TablePrinter(model, view, null));

    assertEquals(table1x2EmptyWithHeadersAndTitle, printedTable);
  }

  @Test
  public void createTable1x2EmptyWithTitle() throws Exception {
    String table1x2EmptyWithTitle = TestHelper
        .getTestResourceAsString("table/empty/Table1x2EmptyWithTitle.txt");

    DefaultTablePrinterModel model = new DefaultTablePrinterModel(
        new Object[][]{
            {null, null}
        },
        new Object[]{},
        "Title");
    TablePrinterView view = new TablePrinterView(
        model,
        null,
        null,
        null,
        null,
        null,
        false,
        true,
        null);
    String printedTable = TestHelper.printTableAsString(new TablePrinter(model, view, null));

    assertEquals(table1x2EmptyWithTitle, printedTable);
  }

  @Test
  public void createTable2x1Empty() throws Exception {
    String table2x1Empty = TestHelper.getTestResourceAsString("table/empty/Table2x1Empty.txt");

    DefaultTablePrinterModel model = new DefaultTablePrinterModel(
        new Object[][]{
            {null},
            {null}
        },
        null,
        null);
    String printedTable = TestHelper.printTableAsString(new TablePrinter(model, null, null));

    assertEquals(table2x1Empty, printedTable);
  }

  @Test
  public void createTable2x2Empty() throws Exception {
    String table2x2Empty = TestHelper.getTestResourceAsString("table/empty/Table2x2Empty.txt");

    DefaultTablePrinterModel model = new DefaultTablePrinterModel(
        new Object[][]{
            {null, null},
            {null, null}
        },
        null,
        null);
    String printedTable = TestHelper.printTableAsString(new TablePrinter(model, null, null));

    assertEquals(table2x2Empty, printedTable);
  }
}
