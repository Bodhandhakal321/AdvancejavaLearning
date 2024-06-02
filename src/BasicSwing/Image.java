package BasicSwing;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Image {
    public static void main(String[] args) throws MalformedURLException {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(500, 500);

        JLabel label = new JLabel();

        URL url = new URL("https://th.bing.com/th/id/OIP.rjExmgmKTbfTBdhiO6pcZAAAAA?rs=1&pid=ImgDetMain");
        ImageIcon img =new ImageIcon(url);
        label.setIcon(img);

//        ImageIcon img = new ImageIcon("C:\\Users\\Bodhan\\Pictures\\Screenshots\\flaptopnavy2.png");
//        label.setIcon(img);

        frame.add(label);

    };
}
