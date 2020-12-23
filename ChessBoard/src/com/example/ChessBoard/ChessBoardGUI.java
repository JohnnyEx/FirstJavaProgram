package com.example.ChessBoard;

import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;

public class ChessBoardGUI extends JPanel{

    private JPanel mainPanel;

    public void paint(Graphics g){

            g.fillRect(0, 0, 400, 400);
            for(int i = 0; i <= 400; i+=100){
                for(int j = 0; j <= 400; j+=100){
                    g.clearRect(i, j, 50, 50);
                }
            }

            for(int i = 50; i <= 450; i+=100){
                for(int j = 50; j <= 450; j+=100){
                    g.clearRect(i, j, 50, 50);
                }
            }
        }
        public static void main(String[] args){
            JFrame frame = new JFrame();
            frame.setSize(410,439);
            frame.getContentPane().add(new ChessBoardGUI());
            frame.setLocationRelativeTo(null);
            frame.setBackground(Color.LIGHT_GRAY);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        }

}
