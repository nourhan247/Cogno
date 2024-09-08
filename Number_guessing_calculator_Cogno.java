/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.number_guessing_calculator_cogno;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
/**
 *
 * @author nourh
 */
public class Number_guessing_calculator_Cogno {
    private JFrame frame;
    private JTextField guessField;
    private JTextArea resultArea;
    private JButton guessButton;
    private Random random;
    private int randomNumber;
    private int count;

    public Number_guessing_calculator_Cogno() {
        // Initialize the random number generator
        random = new Random();
        randomNumber = random.nextInt(100) + 1;
        count = 0;

        // Set up the frame
        frame = new JFrame("Number Guessing Game");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.PINK);
        // Create components
        JLabel guessLabel = new JLabel("Enter your guess:");
        guessLabel.setBounds(50, 50, 150, 30);
        guessLabel.setForeground(Color.WHITE);
        frame.add(guessLabel);

        guessField = new JTextField();
        guessField.setBounds(200, 50, 100, 30);
        guessField.setBackground(Color.WHITE);
        frame.add(guessField);

        guessButton = new JButton("Guess");
        guessButton.setBounds(150, 100, 100, 30);
          guessButton.setBackground(Color.PINK);
        guessButton.setForeground(Color.WHITE);
        frame.add(guessButton);

        resultArea = new JTextArea();
        resultArea.setBounds(50, 150, 300, 100);
         resultArea.setBackground(Color.PINK); 
        resultArea.setForeground(Color.WHITE);
        resultArea.setEditable(false);
        frame.add(resultArea);

        // Add button click event handler
        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleGuess();
            }
        });

        // Display the frame
        frame.setVisible(true);
    }

    private void handleGuess() {
       
            int playerGuess = Integer.parseInt(guessField.getText());
            count++;

            if (playerGuess == randomNumber) {
                resultArea.setText("Congratulations!\nYou guessed the number in " + count + " tries.");
                guessButton.setEnabled(false);
            } else if (playerGuess < randomNumber) {
                resultArea.setText("Nope! The number is higher. Guess again.");
            } else {
                resultArea.setText("Nope! The number is lower. Guess again.");
            }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Number_guessing_calculator_Cogno());
}
    }
