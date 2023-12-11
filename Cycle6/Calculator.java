import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {
    private JTextField textField;
    private double num1, num2, ans;
    private String operator = "", result;

    public Calculator() {
        // Frame
        JFrame win = new JFrame("Calculator");
        win.setSize(400, 400);
        win.setLayout(new BorderLayout());

        // Text Field
        textField = new JTextField();
        textField.setBackground(Color.WHITE);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        Font font1 = new Font("SansSerif", Font.BOLD, 20); 
        textField.setFont(font1);
        win.add(textField, BorderLayout.NORTH);


        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        // Digits
        for (int i = 0; i <= 9; i++) {
                JButton button = new JButton(String.valueOf(i));
                button.addActionListener(this);
                buttonPanel.add(button);
        }

        // Operations
        String[] operators = {"+", "-", "*", "/", "="};
        for (String op : operators) {
                JButton button = new JButton(op);
                button.setBackground(Color.CYAN);
                button.addActionListener(this);
                buttonPanel.add(button);
        }


        // Clear button
        JButton clearButton = new JButton("C");
        clearButton.setBackground(Color.RED);
        clearButton.addActionListener(e -> textField.setText(""));
        buttonPanel.add(clearButton);

        win.add(buttonPanel, BorderLayout.CENTER);

        // Setup
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.getContentPane().setBackground(Color.BLACK);
        win.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            String buttonText = source.getText();

            if (buttonText.equals("=")) {
                if(textField.getText().isEmpty()){
                    return;
                }
                num2 = Double.parseDouble(textField.getText());
                calculate();
                num1 = Double.parseDouble(result);
                operator = null;
            } 
            else if (buttonText.equals("C")) {
                textField.setText("");
                num1 = num2 = ans = 0;
                operator = null;
            } 
            else if (buttonText.matches("[0-9]")) {
                if(textField.getText().equals("Error: Divide by zero")){
                    textField.setText(buttonText);
                }
                textField.setText(textField.getText() + buttonText);
            } 
            else {
                if (!textField.getText().isEmpty()) {
                    if(textField.getText().equals("Error: Divide by zero")){
                        textField.setText("0.0");
                        return;
                    }
                    if(operator != null){
                        num2 = Double.parseDouble(textField.getText());
                        calculate();
                        num1 = Double.parseDouble(result);
                    }
                    num1 = Double.parseDouble(textField.getText());
                    operator = buttonText;
                    textField.setText("");
                }
            }
    }

    private void calculate() {
        if(operator == null){
            ans = 0.0;
            return;
        }
        switch (operator) {
            case "+":
                ans = num1 + num2;
                textField.setText(String.valueOf(ans));
                break;
            case "-":
                ans = num1 - num2;
                textField.setText(String.valueOf(ans));
                break;
            case "*":
                ans = num1 * num2;
                textField.setText(String.valueOf(ans));
                break;
            case "/":
                if (num2 == 0) {
                    textField.setText("Error: Divide by zero");
                    num1 = num2 = ans = 0;
                    operator = null;
                    return;
                }
                ans = num1 / num2;
                break;
        }
        result = String.valueOf(ans);
        System.out.println(result);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
