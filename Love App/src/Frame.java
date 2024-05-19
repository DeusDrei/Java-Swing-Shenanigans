package src;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;



public class Frame extends JFrame implements ActionListener{
    JButton button1 = new JButton("Yes");
    JButton button2 = new JButton("No");
    JLabel label1 = new JLabel();
    int WIDTH = 100;
    int HEIGHT = 30;

    Frame(){
        label1.setText("Do you Love me?");
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

        this.setTitle("Love Detector");
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
            JOptionPane.showMessageDialog(null, "I LOVE YOU MORE", "<3", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            Random rand1 = new Random();
            int random1 = rand1.nextInt(400);
            Random rand2 = new Random();
            int random2 = rand2.nextInt(300);

            button2.setBounds(random1, random2, WIDTH -= 7, HEIGHT -= 2);
        }
    }
}
