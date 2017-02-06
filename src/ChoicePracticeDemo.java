
import java.awt.Choice;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;

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

public class ChoicePracticeDemo extends WindowAdapter implements KeyListener, ItemListener {
    
    Frame f1;
    Choice c1;
    TextField t1, t2, t3;
    Label l1, l2, l3, l4, l5, l6;
    String items[] = {"Book", "Copy", "Pencil", "Pen", "Bag"};
    String price[] = {"200", "100", "10", "20", "500"};
    
    public ChoicePracticeDemo() {
        f1 = new Frame();
        f1.setBounds(100, 100, 200, 250);
        f1.setLayout(new GridLayout(5, 2, 5, 2));
        f1.addWindowListener(this);
        
        c1 = new Choice();
        c1.addItem("001");
        c1.addItem("002");
        c1.addItem("003");
        c1.addItem("004");
        c1.addItem("005");
        
        l1 = new Label("Item id");
        l2 = new Label("Name");
        l3 = new Label("Price");
        l4 = new Label("Quantity");
        l5 = new Label("Total");
        l6 = new Label("result");
        
        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();
        
        f1.add(l1);
        f1.add(c1);
        f1.add(l2);
        f1.add(t1);
        f1.add(l3);
        f1.add(t2);
        f1.add(l4);
        f1.add(t3);
        f1.add(l5);
        f1.add(l6);
        
        c1.addItemListener(this);
        t3.addKeyListener(this);
        t3.addKeyListener(this);
        f1.setVisible(true);
        
    }
    
    @Override
    public void windowClosing(WindowEvent e) {
        f1.dispose();
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
   }
    
    @Override
    public void keyPressed(KeyEvent e) {
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
        int price1 = Integer.parseInt(t2.getText());
        int qty = Integer.parseInt(t3.getText());
        l6.setText(price1 * qty + "");
    }
    
    @Override
    public void itemStateChanged(ItemEvent e) {
        int index = c1.getSelectedIndex();
        t1.setText(items[index]);
        t2.setText(price[index]);
    }
    
    public static void main(String[] args) {
        new ChoicePracticeDemo();
    }
}
