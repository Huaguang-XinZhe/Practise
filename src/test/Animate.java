package test;

import javax.swing.*;
import java.awt.*;

public class Animate {
    int x = 1;
    int y = 1;

    public static void main(String[] args) {
        Animate gui = new Animate();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyDrawPanel5 drawP = new MyDrawPanel5();
        frame.getContentPane().add(drawP);
        frame.setSize(500, 270);
        frame.setVisible(true);

        for (int i = 0; i < 124; i++, x++, y++) {
            drawP.repaint();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    class MyDrawPanel5 extends JPanel {
        public void paintComponent(Graphics g) {
            Color bgColor = new Color(238, 238, 238);
            g.setColor(bgColor);
            g.fillRect(0, 0, 500, 250);

            g.setColor(Color.blue);
            g.fillRect(x, y, 500-x*4, 250-y*2);
        }
    }
}
