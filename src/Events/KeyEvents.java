package Events;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEvents {
    public  static void main(String[] args){
        JFrame frame = new JFrame("KEY EVENTS");
        JLabel label = new JLabel();
        label.setText("no key is pressed");


        //adapter class implemented by events we can use it for no declaring dereived abstract methodsa

        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                label.setText("KEY is typed");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                label.setText(" KEY is pressed");

            }

            @Override
            public void keyReleased(KeyEvent e) {
                label.setText(" KEY is relased");


            }
        });

        frame.add(label);
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}
