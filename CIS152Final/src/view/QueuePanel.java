package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.LinkedList;
import java.util.Queue;

public class QueuePanel extends JPanel {
    private JButton addButton, removeButton, closeButton;
    private JTextField inputField;
    private JTextArea queueDisplay;

    // Queue data
    private static Queue<String> queue = new LinkedList<>();
    
    public QueuePanel() {
    	// Initialize the queue
    	initializeQueue();
    	
        // Set up the layout for the panel
        setLayout(new FlowLayout());

        addButton = new JButton("Add to Queue");
        removeButton = new JButton("Remove from Queue");
        closeButton = new JButton("Close");
        inputField = new JTextField(15);
        queueDisplay = new JTextArea(10, 20);
        queueDisplay.setEditable(false);

        add(new JLabel("Enter string:"));
        add(inputField);
        add(addButton);
        add(removeButton);
        add(closeButton);
        add(new JScrollPane(queueDisplay));

        // Button actions
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = inputField.getText();
                if (!input.isEmpty()) {
                    queue.add(input);  
                    inputField.setText("");  
                    updateQueueDisplay();  
                } else {
                    JOptionPane.showMessageDialog(QueuePanel.this, "Please enter a string.");
                }
            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!queue.isEmpty()) {
                    queue.poll();  
                    updateQueueDisplay();  
                } else {
                    JOptionPane.showMessageDialog(QueuePanel.this, "Queue is empty.");
                }
            }
        });

        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(QueuePanel.this);
                topFrame.setVisible(false); 
                topFrame.dispose();  
            }
        });

        // Initially update the queue display to show the current queue data
        updateQueueDisplay();
    }
    
    // Method to initialize queue
    private void initializeQueue() {
        // Add items to the queue at startup
        queue.add("Paint Order #9102378");
        queue.add("Order more gloves for Weld Department");
        queue.add("Assemble Order #4837462");
        queue.add("Check progress on sales goals");
    }
    
    // Method to update the queue display area
    private void updateQueueDisplay() {
        queueDisplay.setText("");  // Clear the display
        if (queue.isEmpty()) {
            queueDisplay.append("Queue is empty.\n");  // Display message when queue is empty
        } else {
            for (String item : queue) {
                queueDisplay.append(item + "\n");  // Add each item in the queue to the display
            }
        }
    }
}