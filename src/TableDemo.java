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
public class TableDemo {
    JFrame f1;
    JTable t1;
    TableDemo()
    {
        f1=new JFrame();
        f1.setSize(400,400);
        f1.setLayout(new BorderLayout());
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String cols[]={"Id","Name","Salary"};
        Object data[][]={{1,"Ram","2000"},
                     {2,"Hari","3000"},
                     {3,"Sita","5000"}};
        t1=new JTable(data,cols);
        JScrollPane jp=new JScrollPane(t1);
        f1.add(jp);
        f1.setVisible(true);
        }
    public static void main(String[] args) {
        new TableDemo();
    }
    }

