package com.example.untitled;

import javax.swing.*;

public class NewAWTFrame extends JFrame{
    private JButton button1;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JPanel mainPanel;

    public NewAWTFrame() {
        frameInit();

        comboBox1.addItem(new FItem("Element1", "Value???"));
        comboBox2.addItem(new FItem("Element2", "Easy"));
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
    }

    public static void main(String[] args) {
        JFrame frame = new NewAWTFrame();
        frame.setVisible(true);
    }

}
