import javax.swing.*;

public class AddTwoNumbersGUI 
{
    public static void main(String[] args) 
    {
        // Create and configure the JFrame
        JFrame frame = new JFrame("Add Two Numbers");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.PAGE_AXIS));

        // Create the input fields and button
        JTextField num1Field = new JTextField();
        JTextField num2Field = new JTextField();
        JButton addButton = new JButton("Add");

        // Add the input fields and button to the frame
        frame.add(new JLabel("Enter two numbers:"));
        frame.add(num1Field);
        frame.add(num2Field);
        frame.add(addButton);
  
        // Add a label to display the result
        JLabel resultLabel = new JLabel("Result: ");
        frame.add(resultLabel);

        // Add an action listener to the button
        addButton.addActionListener(e -> 
        {
            // Parse the input fields and add the numbers
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());
            int sum = num1 + num2;

            // Update the result label
            resultLabel.setText("Result: " + sum);
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}