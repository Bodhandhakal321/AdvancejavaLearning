package Events;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEvents {
    public static void main(String[] args){
        JFrame frame = new JFrame("MOUSE EVENTS");
        JLabel label = new JLabel();
        frame.add(label);
        label.setText("NO EVENTS");

        frame.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                label.setText("MOUSE IS CLICKED");

            }

            @Override
            public void mousePressed(MouseEvent e) {
                label.setText("MOUSE IS PRESSED");

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                label.setText("MOUSE IS RELEASED");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                label.setText("MOUSE ENTEERD");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                label.setText("MOUSE IS EXITED ");

            }
        });



        frame.setVisible(true);
//        frame.setLayout(null);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
