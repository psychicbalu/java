//Swing program to accept a value in a textbox then find the area of a circle and display the result in the second textbox? 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CircleAreaCalculator extends JFrame implements ActionListener {
    private JTextField radiusField;
    private JTextField resultField;
    private JButton calculateButton;

    public CircleAreaCalculator() {
        
        setTitle("Circle Area Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));
        add(new JLabel("Enter the radius:"));
        radiusField = new JTextField();
        add(radiusField);
        add(new JLabel("Area of the circle:"));
        resultField = new JTextField();
        resultField.setEditable(false);
        add(resultField);
        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(this);
        add(calculateButton);
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        
        double radius = Double.parseDouble(radiusField.getText());
        double area = Math.PI * radius * radius;
        resultField.setText(String.format("%.2f", area));
    }

    public static void main(String[] args) {
        
        new CircleAreaCalculator();
    }
}
