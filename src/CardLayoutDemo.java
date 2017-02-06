
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Meelon
 */
public class CardLayoutDemo implements ActionListener {

    JFrame frame;
    JPanel p, p1, p2;
    JTextField t1;
    JComboBox c1;
    JButton b1, b2;
    String language[] = {"JAVA", "PHP", "C", "C++", "PYTHON"};
    CardLayout c;

    public CardLayoutDemo() {
        frame = new JFrame("using card layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 150, 160, 150);
        frame.setLayout(new FlowLayout());

        p = new JPanel();
        p1 = new JPanel();
        p2 = new JPanel();
        t1 = new JTextField(12);
        c1 = new JComboBox(language);
        b1 = new JButton("one");
        b2 = new JButton("two");
        c = new CardLayout();

        p1.add(t1);
        p2.add(c1);
        p.setLayout(c);
        p.add(p1, "one");
        p.add(p2, "two");

        frame.add(p);
        frame.add(b1);
        frame.add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        CardLayoutDemo cardLayoutDemo = new CardLayoutDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            c.show(p, "one");
        } else {
            c.show(p, "two");
        }
    }
}
