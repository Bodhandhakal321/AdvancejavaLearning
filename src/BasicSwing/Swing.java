package BasicSwing;

import javax.swing.*;

public class Swing {
    public static void main(String[] args) { //main is already defined on jvm
        // TODO Auto-generated method stub
        JFrame frame = new JFrame();
        JButton button  = new JButton("clickme");
        button.setBounds(100, 100 , 100 ,100);
        frame.add(button);
        frame.setLayout(null);
        frame.setSize(500,500);
        frame.setVisible(true);



        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


}
