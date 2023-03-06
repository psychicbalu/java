//Write a swing program to accept a value in a textbox then find the Volume of a sphere and display the result in the second textbox?

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SphereVolumeCalculator extends JFrame implements ActionListener {
    private JTextField radiusField;
    private JTextField resultField;
    private JButton calculateButton;

    public SphereVolumeCalculator() {
        
        setTitle("Sphere Volume Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        
        add(new JLabel("Enter the radius:"));
        radiusField = new JTextField();
        add(radiusField);
        add(new JLabel("Volume of the sphere:"));
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
        double volume = 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
        resultField.setText(String.format("%.2f", volume));
    }

    public static void main(String[] args) {
        
        new SphereVolumeCalculator();
    }
}
