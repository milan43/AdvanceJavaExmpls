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

public class GridBagDemo {

    JFrame frame;
    // JButton one, two, three, four, five, six, seven;
    // String btnname[] = {"one", "two", "three", "four", "five", "six", "seven"};
    JButton b1, b2, b3, b4, b5, b6, b7, b8;

    GridBagDemo() {
        frame = new JFrame("using GridBagLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 300, 300);
        GridBagConstraints gbc = new GridBagConstraints();
        GridBagLayout gbl = new GridBagLayout();
        frame.setLayout(gbl);

//        for (int i = 0; i < btnname.length; i++) {
//            b[i] = new JButton("Btn");
//        }
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbl.setConstraints(b1, gbc);
        frame.add(b1);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbl.setConstraints(b2, gbc);
        frame.add(b2);

        gbc.gridx = 2;
        gbc.gridy = 0;
        gbl.setConstraints(b3, gbc);
        frame.add(b3);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbl.setConstraints(b4, gbc);
        frame.add(b4);

        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbl.setConstraints(b5, gbc);
        frame.add(b5);

        gbc.gridx = 0;
        gbc.gridy = 2;
        //gbc.gridheight = 1;
        //gbc.fill = GridBagConstraints.VERTICAL;
        gbl.setConstraints(b6, gbc);
        frame.add(b6);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.gridheight = 2;
        gbc.fill = GridBagConstraints.BOTH;
        gbl.setConstraints(b7, gbc);
        frame.add(b7);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbl.setConstraints(b8, gbc);
        frame.add(b8);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        GridBagDemo gridBagDemo = new GridBagDemo();
    }
}
