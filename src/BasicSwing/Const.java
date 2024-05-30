package BasicSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Const {
    public  static void main(String[] args){
        JFrame j = new JFrame("BCA");
        j.setResizable(true);
        j.setSize(500, 500);
        j.setVisible(true);
        j.setLocation(100,100);
//        j.setBounds(200,250,300,270);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        j.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        j.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        JPanel panel = new JPanel(){
            public  void paint(Graphics g ){
                Graphics2D g2d = (Graphics2D) g;

                g2d.drawLine(50,50,200,180);
                g2d.setColor(Color.RED);
                g2d.drawRect(200,200,200,200);
                g2d.setColor(Color.BLUE);
                g2d.draw(new Ellipse2D.Double(400,400,200,200) {
                });


            }
        };
        j.add(panel);
        j.setVisible(true);

    }
}
