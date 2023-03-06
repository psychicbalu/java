//Write a swing program to accept an integer in a textbox then find the sum of digits of that number and display the result in the second textbox?

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class DigitSumCalculator extends JFrame implements ActionListener {
    private JTextField numberField;
    private JTextField resultField;
    private JButton calculateButton;

    public DigitSumCalculator() {
        // Set up the GUI
        setTitle("Digit Sum Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        // Add components to the GUI
        add(new JLabel("Enter the number:"));
        numberField = new JTextField();
        add(numberField);
        add(new JLabel("Sum of digits:"));
        resultField = new JTextField();
        resultField.setEditable(false);
        add(resultField);
        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(this);
        add(calculateButton);

        // Display the GUI
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // When the button is clicked, calculate the sum of digits and display it
        int number = Integer.parseInt(numberField.getText());
        int digitSum = 0;
        while (number != 0) {
            int digit = number % 10;
            digitSum += digit;
            number /= 10;
        }
        resultField.setText(Integer.toString(digitSum));
    }

    public static void main(String[] args) {
        // Create and display the GUI
        new DigitSumCalculator();
    }
}
