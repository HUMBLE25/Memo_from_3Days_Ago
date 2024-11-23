package opening;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Start5 extends JFrame {
    public Start5() {
        setTitle("Start5");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setContentPane(new Start5.MyPanel());
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
        private ImageIcon Opening3 = new ImageIcon("images/opening/에필로그_3.png");
        private Image img = Opening3.getImage();


        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
        }
    }
    private void goToNextPage() {
        Start5.this.dispose();
        new Start6();
    }

    public static void main(String[] args) {
        new Start5();
    }
}

