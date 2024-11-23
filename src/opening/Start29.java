package opening;

import stage1.Stage1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Start29 extends JFrame {
    public Start29() {
        setTitle("Start29");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setContentPane(new Start29.MyPanel());
        getContentPane().setBackground(Color.BLACK);
        getContentPane().setLayout(null);

        setSize(1440, 1024);
        setVisible(true);


        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER || e.getKeyCode() == KeyEvent.VK_SPACE) {
                    goToNextPage();
                }
            }
        });

        setFocusable(true);
        requestFocusInWindow();
    }

    class MyPanel extends JPanel {
        private ImageIcon Map= new ImageIcon("images/opening/지도.png");
        private Image img = Map.getImage();


        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
        }
    }
    private void goToNextPage() {
        Start29.this.dispose();
        new stage1.Stage1();
    }
    public static void main(String[] args) {
        new Start29();
    }
}


