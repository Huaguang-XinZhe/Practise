package test;

import javax.swing.*;
import java.awt.*;

public class SimpleAnimation {
    int x = 20;
    int y = 150;

    public static void main(String[] args) {
        SimpleAnimation c = new SimpleAnimation();
        c.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawPanel4 drawPanel4 = new MyDrawPanel4();
        frame.getContentPane().add(drawPanel4);

        frame.setSize(300, 300);
        frame.setVisible(true);

        for (int i = 0;  i < 130; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            drawPanel4.repaint();
            x++;
            y--;
        }
    }

    class MyDrawPanel4 extends JPanel {
        public void paintComponent(Graphics g) {
            Color bgColor = new Color(238, 238, 238);
            g.setColor(bgColor);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());

            g.setColor(Color.ORANGE);
            g.fillOval(x, y, 100, 100);
        }
    }
}
