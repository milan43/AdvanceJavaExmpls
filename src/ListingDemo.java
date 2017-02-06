/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
import java.awt.event.*;
import java.awt.*;

public class ListingDemo extends WindowAdapter implements ActionListener {

    Frame frame;
    List l1, l2;
    TextField t1, t2;
    TextField f1, f2;
    Button b1, b2, b3, b4;

    public ListingDemo() {
        frame = new Frame();
        frame.setSize(280, 300);
        frame.setLocation(150, 100);
        frame.setLayout(null);
        frame.addWindowListener(this);
        frame.setBackground(Color.GRAY);

        l1 = new List(6, true);
        l2 = new List(6, true);
        t1 = new TextField();
        t2 = new TextField();
        b1 = new Button(">");
        b2 = new Button("<");
        b3 = new Button(">>");
        b4 = new Button("<<");
        f1 = new TextField();
        f2 = new TextField();


//        l1.add("JAVA");
//        l1.add("PHP");
//        l1.add("C");
//        l1.add("C#");
//        l1.add("C++");
//        l1.add("JS");
//        
//        l2.add("RHCE");
//        l2.add("CCNA");
//        l2.add("CCNP");
//        l2.add("ORACLE");
//        l2.add("RHCJA");
//        l2.add("NA");
        f1.setBounds(10, 50, 80, 30);
        f2.setBounds(190, 50, 80, 30);

        t1.setBounds(10, 100, 80, 120);
        t2.setBounds(190, 100, 80, 120);
        l1.setBounds(10, 100, 80, 120);
        l2.setBounds(190, 100, 80, 120);
        b1.setBounds(115, 100, 50, 25);
        b2.setBounds(115, 128, 50, 25);
        b3.setBounds(115, 155, 50, 25);
        b4.setBounds(115, 185, 50, 25);



        frame.add(l1);
        frame.add(l2);
        frame.add(f1);
        frame.add(f2);
        frame.add(t1);
        frame.add(t2);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);

        // frame.add(l1);
        f1.addActionListener(this);
        f2.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        frame.setVisible(true);
    }

    @Override
    public void windowClosing(WindowEvent event) {
        frame.dispose();
    }

    public static void main(String[] args) {
        new ListingDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        l1.setForeground(Color.red);
        l2.setForeground(Color.MAGENTA);
        if (e.getSource() == f1) {
            String item = f1.getText();
            if (!item.equals("")) {
                f1.setText("");
                l1.add(item);
            }
        } else if (e.getSource() == f2) {
            String item = f2.getText();
            if (!item.equals("")) {
                f2.setText("");
                l2.add(item);
            }
        } else if (e.getSource() == b1) {

            String item = l1.getSelectedItem();
            if (item != null) {
                
                l2.add(item);
                l1.remove(item);
            }

        } else if (e.getSource() == b2) {

            String item = l2.getSelectedItem();
            if (item != null) {
                l1.add(item);
                l2.remove(item);
            }

        } else if (e.getSource() == b3) {

            String items[] = l1.getSelectedItems();
            if (items != null) {
                for (String item : items) {
                    l2.add(item);
                    l1.remove(item);

                }
            }

        } else if (e.getSource() == b4) {

            String items[] = l2.getSelectedItems();
            if (items != null) {
                for (String item : items) {
                    l1.add(item);
                    l2.remove(item);

                }
            }

        }

    }
}
