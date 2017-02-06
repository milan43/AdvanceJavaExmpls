/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meelon
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class ToggleButton implements ItemListener{
    JFrame f1;
    JTextField t1;
    JToggleButton b1;

    public ToggleButton() {
        f1=new JFrame();
        f1.setSize(400, 400);
        f1.setLayout(new FlowLayout());
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        t1=new JTextField(10);
        b1=new JToggleButton("ON/OFF");
        
        f1.add(t1);
        f1.add(b1);
        b1.addItemListener(this);
        
        
        f1.setVisible(true);
        
    }
    public static void main(String[] args) {
        new ToggleButton();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getStateChange()==ItemEvent.SELECTED){
            t1.setBackground(Color.blue);
            t1.setText("On");
        }
        else{
            t1.setText("Off");
            t1.setBackground(Color.gray);
    }
    }
    
}
