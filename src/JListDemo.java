
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.*;

public class JListDemo implements ListSelectionListener {

    JFrame f1;
    JTextField t1;
    JList l1;
    String[] subject = {"JAVA", "PHP", "C", "C#", "PYTHON", "RUBY", "C++", "ANDROID"};

    public JListDemo() {
        f1 = new JFrame();
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setSize(300, 300);
        f1.setLayout(new FlowLayout());

        t1 = new JTextField(10);
        f1.add(t1);
        l1 = new JList(subject);
       
        l1.setVisibleRowCount(5);
        l1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane jsp = new JScrollPane(l1);
        f1.add(jsp);
        l1.addListSelectionListener(this);
        f1.setVisible(true);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
//        String select=l1.getSelectedValuesList().toString();
//        t1.setText(select);
        java.util.List<String> value = new ArrayList();//ambiguity because list is presented in java awt as well as in java util
        value = l1.getSelectedValuesList();
        String str = "";
        for (String item : value) {
            str += item + " ";
        }
        t1.setText(str);

    }

    public static void main(String[] args) {
        new JListDemo();
    }

}
