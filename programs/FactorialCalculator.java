//Write a swing program to accept a value in a textbox then find the factorial of that number and display the result in the second textbox

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FactorialCalculator extends JFrame implements ActionListener {
    JTextField textField1, textField2;
    JButton button;
    
    public FactorialCalculator() {
        setTitle("Factorial Calculator");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        textField1 = new JTextField(10);
        textField2 = new JTextField(10);
        textField2.setEditable(false);
        
        
        button = new JButton("Calculate");
        button.addActionListener(this);
        
        
        JPanel panel = new JPanel(new GridLayout(2, 2));
        panel.add(new JLabel("Enter a number:"));
        panel.add(textField1);
        panel.add(button);
        panel.add(new JLabel("Factorial:"));
        panel.add(textField2);
        add(panel);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        
        String text1 = textField1.getText();
        
        // convert value to integer
        int num = Integer.parseInt(text1);
        
        
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        
        
        textField2.setText(Integer.toString(factorial));
    }
    
    public static void main(String[] args) {
        new FactorialCalculator();
    }
}
