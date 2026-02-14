import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class AgeCalculator extends Thread {

    DefaultTableModel model;
    Calendar cal;
    JLabel label;
    String month;
    int year;
    int month1;
    int date;
    JFrame jf;
    Main m;
    JTable table;

    AgeCalculator(Main main) {
        cal = new GregorianCalendar();
        m = main;
    }

    public void run() {
        jf = new JFrame("Age Calculator Calendar");
        jf.setLayout(new BorderLayout(10, 10));
        jf.setSize(440, 340);
        jf.setLocationRelativeTo(null);
        jf.setResizable(false);
        jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // ===== Title =====
        label = new JLabel("", JLabel.CENTER);
        label.setFont(new Font("Segoe UI", Font.BOLD, 20));
        label.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        // ===== Buttons =====
        JButton prevMonth = createBtn("< Month");
        JButton nextMonth = createBtn("Month >");
        JButton prevYear  = createBtn("< Year");
        JButton nextYear  = createBtn("Year >");

        prevMonth.addActionListener(e -> { cal.add(Calendar.MONTH, -1); updateMonth(); });
        nextMonth.addActionListener(e -> { cal.add(Calendar.MONTH, 1);  updateMonth(); });
        prevYear.addActionListener(e  -> { cal.add(Calendar.YEAR, -1);  updateMonth(); });
        nextYear.addActionListener(e  -> { cal.add(Calendar.YEAR, 1);   updateMonth(); });

        JPanel left = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 5));
        JPanel right = new JPanel(new FlowLayout(FlowLayout.RIGHT, 5, 5));
        JPanel topPanel = new JPanel(new BorderLayout());

        left.add(prevMonth);
        left.add(prevYear);

        right.add(nextYear);
        right.add(nextMonth);

        topPanel.add(left, BorderLayout.WEST);
        topPanel.add(label, BorderLayout.CENTER);
        topPanel.add(right, BorderLayout.EAST);

        // ===== Calendar Table =====
        String days[] = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
        model = new DefaultTableModel(null, days) {
            public boolean isCellEditable(int r, int c) { return false; }
        };

        table = new JTable(model);
        table.setRowHeight(32);
        table.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        table.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // ===== Cell Renderer (center + today highlight) =====
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer() {
            public Component getTableCellRendererComponent(
                    JTable table, Object value, boolean selected,
                    boolean focus, int row, int col) {

                super.getTableCellRendererComponent(
                        table, value, selected, focus, row, col);

                setHorizontalAlignment(CENTER);
                setForeground(Color.BLACK);
                setBackground(Color.WHITE);

                if (value instanceof Integer) {
                    Calendar today = Calendar.getInstance();

                    int d = (Integer) value;
                    if (d == today.get(Calendar.DATE)
                            && month1 == today.get(Calendar.MONTH)
                            && year == today.get(Calendar.YEAR)) {

                        setBackground(new Color(0x2ECC71));
                        setForeground(Color.WHITE);
                        setFont(getFont().deriveFont(Font.BOLD));
                    }
                } else {
                    setText("");
                }
                return this;
            }
        };

        for (int i = 0; i < 7; i++)
            table.getColumnModel().getColumn(i).setCellRenderer(renderer);

        // ===== Mouse Click =====
        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int r = table.getSelectedRow();
                int c = table.getSelectedColumn();
                try {
                    date = (Integer) table.getValueAt(r, c);
                } catch (Exception ex) {
                    date = 0;
                }

                if (date != 0) {
                    String s = date + "/" + month1 + "/" + year;
                    m.getResult(s);
                    jf.dispose();
                }
            }
        });

        jf.add(topPanel, BorderLayout.NORTH);
        jf.add(new JScrollPane(table), BorderLayout.CENTER);

        updateMonth();
        jf.setVisible(true);
    }

    // ===== Helper Button Style =====
    JButton createBtn(String text) {
        JButton b = new JButton(text);
        b.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        b.setFocusPainted(false);
        return b;
    }

    void updateMonth() {
        cal.set(Calendar.DATE, 1);

        month1 = cal.get(Calendar.MONTH);
        month  = cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault());
        year   = cal.get(Calendar.YEAR);

        label.setText(month + " " + year);

        int start = cal.get(Calendar.DAY_OF_WEEK) - 1;
        int days  = cal.getActualMaximum(Calendar.DATE);
        int weeks = cal.getActualMaximum(Calendar.WEEK_OF_MONTH);

        model.setRowCount(0);
        model.setRowCount(weeks);

        int index = start;
        for (int i = 1; i <= days; i++) {
            model.setValueAt(i, index / 7, index % 7);
            index++;
        }
    }
}
