package BasicSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class Lab1 {
    public static void main(String[] args){
        JFrame f = new JFrame();
//        f.setBounds(500,500,500,500);
        f.setSize(500,500);
//        f.setResizable(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        JPanel panel = new JPanel(){
            public void paint(Graphics g ){
                Graphics2D g2d = (Graphics2D) g;
                g2d.setColor(Color.RED);
                g2d.setStroke(new BasicStroke(10));
                g2d.draw(new Line2D.Double(100,10,200,200));

                g2d.setColor(Color.BLUE);
                g2d.fillRect(300,200,100,100);

                g2d.setColor(Color.cyan);
                g2d.fillOval(180,200,110,120);


        }

        };
        f.add(panel);
//        panel.setVisible(true);
    }


}
