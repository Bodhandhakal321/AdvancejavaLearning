package Events;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuFrame {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JMenuBar menuBar = new JMenuBar();
       JMenu file = new JMenu("File");
       JMenu edit = new JMenu("Edit");
       JMenu help = new JMenu("Help");

       JMenuItem  item1 = new JMenuItem("New");
       JMenuItem item2 = new JMenuItem("Open");
       JMenuItem item3 = new JMenuItem("Save");
       JMenuItem item4 = new JMenuItem("Exit");

       item4.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               System.exit(0);
           }
       });

       menuBar.add(file);
       menuBar.add(edit);
       menuBar.add(help);
       file.add(item1);
       file.add(item2);
       file.add(item3);
       file.add(item4);
       frame.setJMenuBar(menuBar);

        frame.setVisible(true);
        frame.setSize(500,500);
    }
}
