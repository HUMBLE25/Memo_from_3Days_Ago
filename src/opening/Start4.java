package opening;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Start4 extends JFrame {
    public Start4() {
       setTitle("Start4");
       setDefaultCloseOperation(EXIT_ON_CLOSE);

       setContentPane(new Start4.MyPanel());
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
        private ImageIcon Opening2 = new ImageIcon("images/opening/에필로그_2.png");
        private Image img = Opening2.getImage();


        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
        }
    }
    private void goToNextPage() {
        Start4.this.dispose();
        new Start5();
    }

    public static void main(String[] args) {
        new Start4();
    }
}

