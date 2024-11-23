package opening;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Start16 extends JFrame {
    public Start16() {
        setTitle("Start16");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setContentPane(new Start16.MyPanel());
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
        private ImageIcon WasteBasket = new ImageIcon("images/opening/휴지통.png");
        private Image img = WasteBasket.getImage();


        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
        }
    }
    private void goToNextPage() {
        Start16.this.dispose();
        new Start17();
    }
    public static void main(String[] args) {
        new Start16();
    }
}


