package src;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Frame extends JFrame implements ActionListener{
    JButton button = new JButton("Start Detection");
    JLabel label = new JLabel();
    Frame(){
        label.setText("Shrimp Detector");
        label.setFont(new Font("Century Gothic", Font.BOLD, 50));
        label.setBounds(200,100, 500, 300);

        button.setBounds(290,400, 200, 50);
        button.addActionListener(this);
        button.setBackground(Color.black);
        button.setForeground(Color.white);
        button.setFocusable(false);

        this.setTitle("Shrimp Detector");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 700);
        this.setResizable(false);
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(255, 255, 255));

        this.add(label);
        this.add(button);

        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            new Detector();
            this.setVisible(false);
        }
    }
}
