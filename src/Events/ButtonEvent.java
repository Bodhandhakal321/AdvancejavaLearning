package Events;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonEvent {
    public static void   main(String[] args){
        JFrame f = new JFrame("Event");
        f.setSize(500,500);


        JButton button = new JButton("CLICK ME");
        button.setBounds(100,50,100,30);
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("BUTTON CLICKED");
                JOptionPane.showMessageDialog(f, "BUTTON CLICKED");
            }
        });
        f.add(button);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
