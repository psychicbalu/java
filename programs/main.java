import javax.swing.*;
import java.awt.event.*;
class calcu extends JFrame implements ActionListener{
    JButton b1;
    JTextField t1,t2;
    calcu(){
        b1=new JButton("Reverse");
        t1= new JTextField(null,null,10);
        t2= new JTextField(null,null,10);
        b1.setBounds(300, 100, 300, 40);
        t1.setBounds(300, 10, 300, 30);
        t2.setBounds(300, 50, 300, 30);
        b1.addActionListener(this);;
        this.add(b1);
        this.add(t1);
        this.add(t2);
        this.setLayout(null);
        this.setBounds(EXIT_ON_CLOSE, ABORT, 900, 400);
        this.setVisible(true); 
    }
    public void actionPerformed(ActionEvent e){
        t2.setText(String.valueOf((new StringBuilder(t1.getText())).reverse()));
    }
    public static void main(String args[]){
        new calcu();
    } 
}