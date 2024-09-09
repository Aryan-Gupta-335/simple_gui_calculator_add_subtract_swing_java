# simple_gui_calculator_add_subtract_swing_java
This Java program creates a simple graphical calculator with the following features:

1. Two text fields to input two numbers
2. A dropdown menu to select the operation (Sum or Difference)
3. A "Calculate" button to perform the selected operation
4. A text field to display the result
5. An "Exit" button to close the application

Here's a brief overview of the code:

- It creates a JFrame with a FlowLayout manager.
- It adds labels, text fields, a JComboBox (dropdown menu), and buttons to the frame.
- The "Calculate" button's ActionListener performs the selected operation and displays the result in the resultField.
- The "Exit" button's ActionListener closes the JFrame and exits the application.
- It uses try-catch blocks to handle invalid input (NumberFormatException).

Note that this program can be enhanced by adding more features, such as:

- More operations (e.g., multiplication, division, modulus)
- Input validation for non-numeric characters
- Memory functions (e.g., storing previous results)
- A clearer user interface with better layout management

Overall, this program demonstrates basic GUI programming in Java using Swing components.
