
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author student
 */
public class MenuBarDemo implements ActionListener {

    private JFrame frame;
    private JMenuBar bar;
    private JMenu menu1;
    private JMenu menu2;
    private JMenuItem item1;
    private JMenuItem item2;
    private JMenuItem item3;

    public MenuBarDemo() {

        frame = new JFrame("Menu Demo");
        frame.setSize(300, 300);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        bar = new JMenuBar();
        menu1 = new JMenu("FIle");
        menu2 = new JMenu("Window");
        item1 = new JMenuItem("Calc");
        item2 = new JMenuItem("Exit");
        item3 = new JMenuItem("Close");
        menu1.add(item1);

        menu1.add(item2);
        menu1.addSeparator();
        menu1.setMnemonic('f');
        menu2.add(item3);

        bar.add(menu1);
        bar.add(menu2);
        frame.setJMenuBar(bar);
        frame.setVisible(true);
        item1.addActionListener(this);
        item2.addActionListener(this);
        item3.addActionListener(this);

        item1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
        item2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.ALT_MASK));

    }

    public static void main(String[] args) {
        new MenuBarDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == item1) {
            new Calculator();
//            JFileChooser chooser = new JFileChooser();            int i = chooser.showOpenDialog(null);
//            if (i == 0) {
//                System.out.println("HI");
//            }

        }
        if (e.getSource() == item2) {
            System.out.println("asdasd");
            System.exit(0);
        }
    }
}
