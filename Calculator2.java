
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel num1Label = new JLabel("Number 1:");
        JTextField num1Field = new JTextField(10);
        JLabel num2Label = new JLabel("Number 2:");
        JTextField num2Field = new JTextField(10);
        JLabel choiceLabel = new JLabel("Choose operation:");
        String[] choices = {"Sum", "Difference"};
        JComboBox<String> choiceBox = new JComboBox<>(choices);
        JButton calculateButton = new JButton("Calculate");
        JButton exitButton = new JButton("Exit!");
        JLabel resultLabel = new JLabel("Result:");
        JTextField resultField = new JTextField(10); // Result text field

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(num1Field.getText());
                    double num2 = Double.parseDouble(num2Field.getText());
                    String choice = (String) choiceBox.getSelectedItem();
                    double result = choice.equals("Sum") ? num1 + num2 : num1 - num2;
                    resultField.setText(String.valueOf(result)); // Display result in text field
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid input");
                }
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {    
                frame.dispose(); // Close the JFrame
                System.exit(0);

            }
        });


        frame.add(num1Label);
        frame.add(num1Field);
        frame.add(num2Label);
        frame.add(num2Field);
        frame.add(choiceLabel);
        frame.add(choiceBox);
        frame.add(calculateButton);
        frame.add(resultLabel);
        frame.add(resultField);
        frame.add(exitButton);
        frame.pack();
        frame.setVisible(true);
    }
}


//In this updated code, I added a JTextField component named resultField to display the result. In the actionPerformed method, I set the text of resultField to the result of the calculation using resultField.setText(String.valueOf(result)).