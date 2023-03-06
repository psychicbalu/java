//swing program to accept an integer in a textbox then reverse that number and display the result in the second textbox 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ReverseNumberProgram extends JFrame implements ActionListener {
    private JTextField inputField, outputField;
    private JButton reverseButton;

    public ReverseNumberProgram() {
        setTitle("Reverse Number Program");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 2));

        
        JLabel inputLabel = new JLabel("Enter an integer:");
        inputField = new JTextField();
        add(inputLabel);
        add(inputField);
        JLabel outputLabel = new JLabel("Reversed integer:");
        outputField = new JTextField();
        outputField.setEditable(false);
        add(outputLabel);
        add(outputField);
        reverseButton = new JButton("Reverse");
        reverseButton.addActionListener(this);
        add(reverseButton);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String inputText = inputField.getText();
        StringBuilder reversedText = new StringBuilder(inputText).reverse();
        outputField.setText(reversedText.toString());
    }
    public static void main(String[] args) {
        new ReverseNumberProgram();
    }
}
