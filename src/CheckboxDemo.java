import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CheckboxDemo extends WindowAdapter implements ActionListener {
    Frame f1;
    Checkbox c1,c2,c3,c4,c5;
    Button b1;
    CheckboxDemo(){
        f1=new Frame();
        f1.setLayout(new FlowLayout());
        f1.setSize(300,200);
        f1.addWindowListener(this);
        c1=new Checkbox("Music");
        c2=new Checkbox("Dance");
        c3=new Checkbox("Travelling");
        f1.add(c1);f1.add(c2);f1.add(c3);
        CheckboxGroup group=new CheckboxGroup();
        c4=new Checkbox("Male",group,false);
        c5=new Checkbox("Female",group,false);
        f1.add(c4);f1.add(c5);
        b1=new Button("OK");
        f1.add(b1);
        f1.addWindowListener(this);
        b1.addActionListener(this);
        f1.setVisible(true);
    }
    public void windowClosing(WindowEvent e){
        f1.dispose();
    }
    public static void main(String []args){
        new CheckboxDemo();
    }
    public void actionPerformed(ActionEvent e){
        String gender="";
        if(c4.getState()==true){
            gender=c4.getLabel();
        }
        else if(c5.getState()==true){
            gender=c5.getLabel();
        }
        String hobbies="";
        if(c1.getState()==true){
            hobbies+=c1.getLabel()+" ";
        }
        if(c2.getState()==true){
            hobbies+=c2.getLabel()+" ";
        }
        if(c3.getState()==true){
            hobbies+=c3.getLabel()+" ";
        }
        JOptionPane.showMessageDialog(null,"Gender: "+gender+"\nHobbies: "+hobbies);
    }
}
