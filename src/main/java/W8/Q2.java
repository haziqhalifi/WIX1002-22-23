
package W8;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class Q2 {
    public static void main(String[] args) {

        System.out.println("Author\t\t\tTitle\t\t\t\tISBN");
        String[] columnNames = {"Name", "Title", "ISBN"};
        String[][] data = {
            {"Daniel Liang", "Introduction to Java Programming", "9780136520238"},
            {"Cay Horstmann", "Core Java: Fundamentals", "9780135166307"},
            {"Joshua Bloch", "Effective Java", "9780134685991"},
            {"Herbert Schildt", "Java: A Baginner's Guide", "9781260440218"},
            {"Kathy Sierra", "Java : Head First", "992193293221"}};
        TableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(model);

        TableRowSorter<TableModel> sorter = new TableRowSorter<>(model);
        table.setRowSorter(sorter);

        JFrame frame = new JFrame("Table Sorter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JScrollPane(table));
        frame.pack();
        frame.setVisible(true);
        }
}
          
