package src;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Detector extends JFrame implements ActionListener{
    JButton button1 = new JButton("Yes");
    JButton button2 = new JButton("No");
    JLabel label1 = new JLabel();
    Detector(){
        label1.setText("Are you a shrimp?");
        label1.setFont(new Font("Century Gothic", Font.BOLD, 30));
        label1.setBounds(110,100, 300, 100);

        button1.setBounds(100,200, 100, 30);
        button1.addActionListener(this);
        button1.setBackground(Color.black);
        button1.setForeground(Color.white);
        button1.setFocusable(false);

        button2.setBounds(290,200, 100, 30);
        button2.addActionListener(this);
        button2.setBackground(Color.black);
        button2.setForeground(Color.white);
        button2.setFocusable(false);

        this.setTitle("Shrimp Detector");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 400);
        this.setResizable(false);
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(255, 255, 255));
        
        this.add(label1);
        this.add(button1);
        this.add(button2);

        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            new Whale();
            this.setVisible(false);
        }
        else {
            new Yehey();
            this.setVisible(false);
        }
    }
}
