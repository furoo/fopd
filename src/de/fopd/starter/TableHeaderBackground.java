package de.fopd.starter;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

public class TableHeaderBackground {
  public static void main(String[] args) {
    Integer[][] data = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    String[] cols = { "A", "B", "C" };

    JTable table = new JTable(data, cols);

    JTableHeader header = table.getTableHeader();
    header.setBackground(Color.red);
    header.setForeground(Color.gray);

    JOptionPane.showMessageDialog(null, new JScrollPane(table));
  }
}