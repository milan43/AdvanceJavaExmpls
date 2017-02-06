import java.awt.*;
import java.awt.event.*;
public class ListDemo1 extends WindowAdapter implements ItemListener{
    Frame f1;
    List l1;
    TextField t1;
    ListDemo1(){
        f1=new Frame();
        f1.setSize(300,300);
        f1.setLayout(new FlowLayout());
        f1.addWindowListener(this);        
        l1=new List(5,true);
        l1.add("Book");
        l1.add("Copy");
        l1.add("Pen");
        l1.add("Pencil");
        l1.add("Box");
        l1.add("Eraser");
        f1.add(l1);
        t1=new TextField(15);
        f1.add(t1);
        f1.setVisible(true);
        l1.addItemListener(this);
    }
    public void windowClosing(WindowEvent e){
        f1.dispose();
    }
    public static void main(String []args){
        new ListDemo1();
    }
    public void itemStateChanged(ItemEvent e){
        String items[]=l1.getSelectedItems();
        String str="";
        for(String item:items){
            t1.setText(item);
            str+=item+" ";
        }
        t1.setText(str);
    }
    
}
