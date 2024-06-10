package Events;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ColorChange {
    public static void main(String[] args) {
        JFrame frame = new JFrame("COLOR CHANGING");
        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Graphics g =frame.getGraphics();
                g.setColor(Color.red);
                g.fillOval(e.getX(), e.getY(),10,10);


            }
        });





        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
