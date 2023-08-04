package com.veysel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class hesapmakinesigörsel extends JFrame {
    private JTextField textField;
    private double firstNumber;
    private String operation;

    public hesapmakinesigörsel() {
        initializeUI();
    }

    private void initializeUI() {
        setTitle("Görsel Hesap Makinesi");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 400);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        textField = new JTextField();
        textField.setEditable(false);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        add(textField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 4));
        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (String button : buttons) {
            JButton btn = new JButton(button);
            buttonPanel.add(btn);
            btn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String buttonText = e.getActionCommand();
                    if ("0123456789.".contains(buttonText)) {
                        textField.setText(textField.getText() + buttonText);
                    } else if ("+-*/".contains(buttonText)) {
                        firstNumber = Double.parseDouble(textField.getText());
                        operation = buttonText;
                        textField.setText("");
                    } else if (buttonText.equals("=")) {
                        double secondNumber = Double.parseDouble(textField.getText());
                        double result = 0;
                        switch (operation) {
                            case "+":
                                result = firstNumber + secondNumber;
                                break;
                            case "-":
                                result = firstNumber - secondNumber;
                                break;
                            case "*":
                                result = firstNumber * secondNumber;
                                break;
                            case "/":
                                result = firstNumber / secondNumber;
                                break;
                        }
                        textField.setText(String.valueOf(result));
                    }
                }
            });
        }

        add(buttonPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new hesapmakinesigörsel();
            }
        });
    }
}
