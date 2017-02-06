
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author student
 */
public class Calculator implements ActionListener {

    private JFrame f1;
    JLabel l1;
    JLabel l2;
    JLabel result;
    JTextField t3;
    JTextField t1;
    JTextField t2;
    JButton b1;
    JButton b2;

    public Calculator() {
        f1 = new JFrame();
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new GridLayout(4, 2, 5, 5));
        f1.setBounds(100, 100, 300, 300);
        l1 = new JLabel("first");
        l2 = new JLabel("second");
        result = new JLabel("Result");
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        b1 = new JButton("+");
        b2 = new JButton("-");

        f1.add(l1);
        f1.add(t1);
        f1.add(l2);
        f1.add(t2);
        f1.add(result);
        f1.add(t3);
        f1.add(b1);
        f1.add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);
        f1.setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double result = 0;
        double second = 0;
        double first = 0;
        try {

            first = Double.parseDouble(t1.getText());
            second = Double.parseDouble(t2.getText());
        } catch (Exception e1) {
        }
        if (e.getSource() == b1) {
            result = first + second;
            t3.setText(Double.toString(result));
        } else {
            result = first - second;
            t3.setText(result + "");
        }


    }
}
