package opening;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Start3 extends JFrame {
    public Start3() {
        setTitle("Start");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setContentPane(new Start3.MyPanel());
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
        private ImageIcon Opening1 = new ImageIcon("images/opening/에필로그_1.png");
        private Image img = Opening1.getImage();


        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
        }
    }
    private void goToNextPage() {
        Start3.this.dispose();
        new Start4();
    }
    public static void main(String[] args) {
        new Start3();
    }
}


