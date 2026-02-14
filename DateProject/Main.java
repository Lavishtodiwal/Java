import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import javax.swing.*;

public class Main extends JFrame implements ActionListener {

    JButton selectAge;
    JTextField dateSelected, todaysDate, age;
    Font bigFont;
    AgeCalculator child;

    Main() {
        setLayout(new GridLayout(4,1,10,10));

        bigFont = new Font("Segoe UI", Font.BOLD, 22);

        selectAge = new JButton("Select Your Birthday");
        selectAge.setFont(bigFont);
        selectAge.setBackground(new Color(0xE74C3C));
        selectAge.setForeground(Color.WHITE);
        selectAge.addActionListener(this);

        dateSelected = createField();
        todaysDate = createField();
        age = createField();

        add(selectAge);
        add(dateSelected);
        add(todaysDate);
        add(age);

        dateSelected.setVisible(false);
        todaysDate.setVisible(false);
        age.setVisible(false);

        setTitle("Age Calculator");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    JTextField createField() {
        JTextField t = new JTextField();
        t.setFont(bigFont);
        t.setEditable(false);
        t.setHorizontalAlignment(JTextField.CENTER);
        return t;
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == selectAge) {
            child = new AgeCalculator(this);
            child.start();
        }
    }

    public String calculate(int dob[], int today[]) {
        LocalDate d1 = LocalDate.of(dob[2], dob[1], dob[0]);
        LocalDate d2 = LocalDate.of(today[2], today[1], today[0]);

        Period p = Period.between(d1, d2);

        if(p.getYears() >= 0) {
            return "Years: " + p.getYears() +
                   "  Months: " + p.getMonths() +
                   "  Days: " + p.getDays();
        }
        return "You are not born yet";
    }

    public void getResult(String s) {
        String arr[] = s.split("/");
        int dob[] = {
            Integer.parseInt(arr[0]),
            Integer.parseInt(arr[1]),
            Integer.parseInt(arr[2])
        };

        Calendar c = Calendar.getInstance();
        int today[] = {
            c.get(Calendar.DATE),
            c.get(Calendar.MONTH)+1,
            c.get(Calendar.YEAR)
        };

        age.setText("Your Age : " + calculate(dob, today));
        todaysDate.setText("Today : " + today[0]+"/"+today[1]+"/"+today[2]);
        dateSelected.setText("DOB : " + s);

        dateSelected.setVisible(true);
        todaysDate.setVisible(true);
        age.setVisible(true);
    }
}
