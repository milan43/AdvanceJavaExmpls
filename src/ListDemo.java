/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
import java.awt.*;
import java.awt.event.*;

public class ListDemo extends WindowAdapter implements ItemListener {

    Frame f;
    List l;
    TextField field;

    public ListDemo() {
        f = new Frame();
        f.setSize(300, 300);
        f.setLayout(new FlowLayout());
        f.addWindowListener(this);

        field = new TextField(20);
        l = new List(5, true);
        l.add("JAVA");
        l.add("PHP");
        l.add("C");
        l.add("C#");
        l.add("C+");
        l.add("PYTHON");

        f.add(l);
        f.add(field);
        l.addItemListener(this);
        f.setVisible(true);
    }

    public void windowClosing(WindowEvent event) {
        f.dispose();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String[] s;
        s = l.getSelectedItems();
        String str = "";
        for (String item : s) {
            str += item + " ";
        }
        field.setText(str);
    }

    public static void main(String[] args) {
        new ListDemo();
    }
}
