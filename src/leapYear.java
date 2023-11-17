import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class leapYear extends JFrame {
    private JTextField tfYear;
    private JButton btnCheckYear;
    private javax.swing.JPanel JPanel;
    private JLabel label;

    public leapYear() {
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String yearStr = tfYear.getText();
                    int year = Integer.parseInt(yearStr);

                    if(year < 1) {
                        JOptionPane.showMessageDialog(null, "Error: Invalid Input");
                    } else {
                        if (year % 4 == 0 && year % 100 != 0 || year % 100 == 0 && year % 400 == 0) {
                            JOptionPane.showMessageDialog(null, "Leap year");
                        } else {
                            JOptionPane.showMessageDialog(null, "Not a leap year");
                        }
                    }

                } catch (Exception exc) {
                    JOptionPane.showMessageDialog(null, "Error: Invalid Input");
                }

            }
        });
    }

    public static void main(String[] args) {
        leapYear app = new leapYear();
        app.setTitle("Leap Year Checker");
        app.setContentPane(app.JPanel);
        app.setSize(450, 250);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}


