//Write a program using swing to accept values in two textboxes then find the largest number and display the result in third text box.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class LargestNumberFinder extends JFrame implements ActionListener {
    JTextField textField1, textField2, textField3;
    JButton button;
    
    public LargestNumberFinder() {
        setTitle("Find the largest number");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        textField1 = new JTextField(10);
        textField2 = new JTextField(10);
        textField3 = new JTextField(10);
        textField3.setEditable(false);
        
        
        button = new JButton("Find the largest number");
        button.addActionListener(this);
        
        
        JPanel panel = new JPanel(new GridLayout(4, 1));
        panel.add(new JLabel("First number:"));
        panel.add(textField1);
        panel.add(new JLabel("Second number:"));
        panel.add(textField2);
        panel.add(button);
        panel.add(new JLabel("Largest number:"));
        panel.add(textField3);
        add(panel);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        
        String text1 = textField1.getText();
        String text2 = textField2.getText();
        
        
        int num1 = Integer.parseInt(text1);
        int num2 = Integer.parseInt(text2);
        
        
        int largest = Math.max(num1, num2);
        
       
        textField3.setText(Integer.toString(largest));
    }
    
    public static void main(String[] args) {
        new LargestNumberFinder();
    }
}
