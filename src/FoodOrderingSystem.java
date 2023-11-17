import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderingSystem extends JFrame{
    private JCheckBox cSundae;
    private JCheckBox cTea;
    private JCheckBox cSoftDrinks;
    private JCheckBox cFries;
    private JCheckBox cBurger;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JButton btnOrder;
    private javax.swing.JPanel JPanel;

    public FoodOrderingSystem() {

        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double total = 0;

                if(cPizza.isSelected()) {
                    total += 100;
                }
                if(cBurger.isSelected()) {
                    total += 80;
                }
                if(cFries.isSelected()) {
                    total += 65;
                }
                if(cSoftDrinks.isSelected()) {
                    total += 55;
                }
                if(cTea.isSelected()) {
                    total += 50;
                }
                if(cSundae.isSelected()) {
                    total += 40;
                }
                if(rb5.isSelected()) {
                    total *= .95;
                }
                if(rb10.isSelected()) {
                    total *= .90;
                }
                if(rb15.isSelected()) {
                    total *= .85;
                }

                JOptionPane.showMessageDialog(null, "The total price is Php " + String.format("%.2f", total));
            }
        });
    }

    public static void main(String[] args) {
        FoodOrderingSystem fos = new FoodOrderingSystem();
        fos.setTitle("Food Ordering System");
        fos.setContentPane(fos.JPanel);
        fos.setSize(450, 450);
        fos.setLocationRelativeTo(null);
        fos.setVisible(true);
        fos.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
