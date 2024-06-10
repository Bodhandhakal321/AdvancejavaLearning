package Events;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FreeHandColor {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                Graphics g = frame.getGraphics();
                g.setColor(Color.BLUE);
                g.fillRect(e.getX(),e.getY(),10,10);



            }
        });

        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
