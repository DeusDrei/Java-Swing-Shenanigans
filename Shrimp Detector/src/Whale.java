package src;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.Image;
import java.io.File;


public class Whale{
    Whale(){
        JFrame frame = new JFrame();
        JLabel label = new JLabel();

        ImageIcon imageIcon = new ImageIcon("assets/whale_point.png");
        Image image = imageIcon.getImage(); 
        Image newimg = image.getScaledInstance(1450, 750,  java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg);
        
        label.setIcon(imageIcon);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        
        frame.setTitle("SHRIMP!!!!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1500, 800);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.add(label);

        play("assets/cat_laughing.wav");
        
    }
    public static void play(String filename){
        try{
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(new File(filename)));
            clip.start();
        }
        catch (Exception exc){
            exc.printStackTrace(System.out);
        }
    }
}
