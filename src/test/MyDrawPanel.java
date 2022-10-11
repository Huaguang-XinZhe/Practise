package test;

import javax.swing.*;
import java.awt.*;

public class MyDrawPanel extends JPanel {
    public void paintComponent(Graphics g) {
//        Image image = new ImageIcon("D:\\Pictures\\catzilla.jpeg").getImage();
//        g.drawImage(image, 3, 4, this);
//_______________________________________________________________________
//        g.fillRect(0, 0, this.getWidth(), this.getHeight());
//
//        int red = (int) (Math.random() * 255);
//        int green = (int) (Math.random() * 255);
//        int blue = (int) (Math.random() * 255);
//
//        Color randomColor = new Color(red, green, blue);
//        g.setColor(randomColor);
//        g.fillOval(70, 70, 100, 100);
//_______________________________________________________________________
//        Graphics2D g2 = (Graphics2D) g;
//
//        GradientPaint gradient = new GradientPaint(70, 70,
//                Color.blue, 300, 300, Color.orange);
//
//        g2.setPaint(gradient);
//        g2.fillOval(70, 70, 200, 150);
//_______________________________________________________________________
        Graphics2D g2 = (Graphics2D) g;

        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        Color startColor = new Color(red, green, blue);

        red = (int) (Math.random() * 255);
        green = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);
        Color endColor = new Color(red, green, blue);

        GradientPaint gradient = new GradientPaint(70, 70,
                startColor, 150, 150, endColor);

        g2.setPaint(gradient);
        g2.fillOval(70, 70, 100, 100);

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyDrawPanel panel = new MyDrawPanel();
        frame.getContentPane().add(panel);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
