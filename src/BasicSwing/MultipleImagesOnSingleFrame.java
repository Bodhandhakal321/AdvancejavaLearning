package BasicSwing;
import javax.swing.*;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class MultipleImagesOnSingleFrame extends JFrame {

    public MultipleImagesOnSingleFrame(String[] imagePaths) {
        // Create a panel with a flow layout to hold the images
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10)); // No gaps between images

        // Load and add resized images to the panel
        for (String path : imagePaths) {
            ImageIcon imageIcon = loadImage(path, 100, 100); // Resize to 100x100
            if (imageIcon != null) {
                JLabel label = new JLabel(imageIcon);
                panel.add(label);
            }
        }

        // Add the panel to a scroll pane
        JScrollPane scrollPane = new JScrollPane(panel);

        // Set the content pane of the JFrame
        setContentPane(scrollPane);

        // Set JFrame properties
        setTitle("Multiple Images on Single JFrame");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private ImageIcon loadImage(String path, int width, int height) {
        try {
            BufferedImage img = ImageIO.read(new File(path));
            java.awt.Image resizedImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            return new ImageIcon(resizedImg);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        // Example image paths (replace with your actual image paths)
        String[] imagePaths = {
                "C:\\Users\\Bodhan\\Pictures\\Screenshots\\flaptopnavy2.png",
                "C:\\Users\\Bodhan\\Pictures\\Screenshots\\flaptopnavy2.png",
                "C:\\Users\\Bodhan\\Pictures\\Screenshots\\flaptopnavy2.png"
        };

        // Run the GUI in the Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(() -> {
            MultipleImagesOnSingleFrame frame = new MultipleImagesOnSingleFrame(imagePaths);
            frame.setVisible(true);
        });
    }
}
