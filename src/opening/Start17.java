package opening;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Start17 extends JFrame {
    public Start17() {
        setTitle("Start17");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setContentPane(new Start17.MyPanel());
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
        private ImageIcon memo = new ImageIcon("images/opening/3일뒤메모.png");
        private Image img = memo.getImage();


        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
        }
    }
    private void goToNextPage() {
        Start17.this.dispose();
        new Start18();
    }
    public static void main(String[] args) {
        new Start3();
    }
}


