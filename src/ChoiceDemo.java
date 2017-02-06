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
public class ChoiceDemo extends WindowAdapter implements ItemListener{
    Frame f;
    Choice c;
    TextField field;

    public ChoiceDemo() {
        f=new Frame();
        f.setBounds(150, 100, 300, 300);
        f.setLayout(new FlowLayout());
        f.addWindowListener(this);
        
        c=new Choice();
        field=new TextField(10);
        c.add("Java");
        c.add("PHP");
        c.add("HTML");
        c.add("RUBY");
        c.add("C");
        c.add("C#");
        c.add("C++");
        c.add("SQL");
        c.add("QA");
        
        f.add(c);
        f.add(field);
        c.addItemListener(this);
        f.setVisible(true);
    }
    @Override
    public void windowClosing(WindowEvent event){
        f.dispose();
    }
    @Override
    public void itemStateChanged(ItemEvent event){
        field.setText(c.getSelectedItem());
    }
    public static void main(String[] args) {
        new ChoiceDemo();
    }
    }
