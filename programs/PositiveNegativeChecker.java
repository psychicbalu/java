//Write a java program to accept a number then check whether a given number is positive or negative and display the result in the second textbox?

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PositiveNegativeChecker extends JFrame implements ActionListener {
    JTextField textField1, textField2;
    JButton button;
    
    public PositiveNegativeChecker() {
        setTitle("Positive or Negative Checker");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        textField1 = new JTextField(10);
        textField2 = new JTextField(10);
        textField2.setEditable(false);
        
        
        button = new JButton("Check");
        button.addActionListener(this);
        
        
        JPanel panel = new JPanel(new GridLayout(2, 2));
        panel.add(new JLabel("Enter a number:"));
        panel.add(textField1);
        panel.add(button);
        panel.add(new JLabel("Result:"));
        panel.add(textField2);
        add(panel);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        
        String text1 = textField1.getText();
        
        // convert value to double
        double num = Double.parseDouble(text1);
        
        
        if (num > 0) {
            textField2.setText("Positive");
        } else if (num < 0) {
            textField2.setText("Negative");
        } else {
            textField2.setText("Zero");
        }
    }
    
    public static void main(String[] args) {
        new PositiveNegativeChecker();
    }
}
