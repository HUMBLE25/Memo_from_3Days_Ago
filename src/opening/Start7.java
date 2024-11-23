package opening;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Start7 extends JFrame {
    public Start7() {
        setTitle("Start7");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setContentPane(new Start7.MyPanel());
        getContentPane().setBackground(Color.BLACK);
        getContentPane().setLayout(null);

        setSize(1440, 1024);
        setVisible(true);

        // 키보드 리스너 추가
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
        private ImageIcon roofTop = new ImageIcon("images/opening/옥상.png");
        private Image img = roofTop.getImage();


        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
        }
    }
    private void goToNextPage() {
        Start7.this.dispose();
        new Start8();
    }

    public static void main(String[] args) {
        new Start5();
    }
}

