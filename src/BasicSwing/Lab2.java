package BasicSwing;

import javax.swing.*;
import java.awt.*;

public class Lab2 {
    public static void main(String[] args) {
        JFrame f = new JFrame(" Bodhan's Lab: NIST COLLEGE");
//        JTextField text = new JTextField();
        f.setSize(800, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        text.add("we are learning advanced java")
        JPanel panel = new JPanel() {
            public void paint(Graphics g) {
                Graphics2D g2d = (Graphics2D) g;
                g2d.setColor(Color.GREEN);
                g2d.setFont(new Font("Times New Roman",Font.ITALIC,50));
                g2d.drawString("We are learning advanced java", 100,100);

            }
        };
        f.add(panel);

    }
}
