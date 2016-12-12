package com.verzano.terminalprinter.table.model;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;

public class ReflectionTablePrinterModel extends TablePrinterModel {
  public ReflectionTablePrinterModel(Collection<?> rows) {
    this(rows, null);
  }

  public ReflectionTablePrinterModel(Collection<?> rows, String title) {
    super(null, null, title);

    String[] headers = null;
    Object[][] reflectionRows = null;

    if (rows.size() > 0) {
      Field[] fields = rows.iterator().next().getClass().getDeclaredFields();
      headers = Arrays.stream(fields)
          .map(Field::getName)
          .toArray(String[]::new);

      reflectionRows = new Object[rows.size()][headers.length];
      int index = 0;
      for (Object row : rows) {
        reflectionRows[index] = Arrays.stream(fields)
            .map(field -> {
              try {
                return field.get(row);
              } catch (IllegalAccessException e) {
                return null;
              }
            }).toArray(Object[]::new);

        index++;
      }
    }

    setRows(reflectionRows);
    setHeaders(headers);
  }
}