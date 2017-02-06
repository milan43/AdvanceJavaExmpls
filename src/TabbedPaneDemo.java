/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meelon
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TabbedPaneDemo {
    JFrame f1;
    JTabbedPane jt;
    JButton b1,b2,b3,b4,b5,b6;
    JPanel p1,p2;
    
    
    public TabbedPaneDemo() {
        f1=new JFrame();
        f1.setSize(300, 300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new BorderLayout());
        jt=new JTabbedPane();
        
        b1=new JButton("Apple");
        b2=new JButton("Orange");
        b3=new JButton("Mango");
        b4=new JButton("KTM");
        b5=new JButton("BKT");
        b6=new JButton("BTL");
        p1=new JPanel();
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        
        
        p2=new JPanel();
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        
        jt.addTab("Fruits", p1);
        jt.addTab("Cities", p2);
        f1.add(jt,BorderLayout.CENTER);
        f1.setVisible(true);
    }
    public static void main(String[] args) {
        new TabbedPaneDemo();
    }
    
}
