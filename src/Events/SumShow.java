package Events;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SumShow {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(500,500);
        f.setLayout(null);

        JLabel label1 = new JLabel("Num1");
        label1.setBounds(100,60,100,10);

        JTextField field1 = new JTextField();
        field1.setBounds(190,44,100,30);

        JLabel label2 = new JLabel("Num2");
        label2.setBounds(100,60,120,60);

        JTextField field2 = new JTextField();
        field2.setBounds(190,80,100,30);


        JButton button = new JButton("Sum");
        button.setBounds(180,120,70,40);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    int num1 = Integer.parseInt(field1.getText());
                    int num2 = Integer.parseInt(field2.getText());

                    int sum = num1 + num2;

                    JOptionPane.showMessageDialog(f, "The sum is ::" + sum);
                }
                catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(f, "Please Enter Valid Number", "Error",JOptionPane.ERROR_MESSAGE);

                }
            }
        });


        f.add(label1);
        f.add(field1);
        f.add(label2);
        f.add(field2);
        f.add(button);
        f.setVisible(true);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
