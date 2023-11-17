import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    private JPanel JPanel;
    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JTextField tfResult;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JLabel lblResult;
    private JLabel firstNumlbl;
    private JLabel secondNumlbl;

    public Calculator() {
        btnCompute.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String input1 = tfNumber1.getText();
                    String input2 = tfNumber2.getText();

                    int num1 = Integer.parseInt(input1);
                    int num2 = Integer.parseInt(input2);
                    int result = 0;
                    switch (cbOperations.getSelectedIndex()) {
                        case 0:
                            result = num1 + num2;
                            tfResult.setText(Integer.toString(result));
                            break;
                        case 1:
                            result = num1 - num2;
                            tfResult.setText(Integer.toString(result));
                            break;
                        case 2:
                            result = num1 * num2;
                            tfResult.setText(Integer.toString(result));
                            break;
                        case 3:
                            result = num1 / num2;
                            tfResult.setText(Integer.toString(result));
                            break;
                    }
                } catch (Exception exc) {
                    JOptionPane.showMessageDialog(null, "Error: Invalid Input");
                }
            }
        });
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.setTitle("Simple Calculator");
        calc.setContentPane(calc.JPanel);
        calc.setSize(600, 300);
        calc.setLocationRelativeTo(null);
        calc.setVisible(true);
        calc.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
