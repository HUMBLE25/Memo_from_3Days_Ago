package opening;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Start24 extends JFrame {
    public Start24() {
        setTitle("Start24");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // 화면 크기를 디스플레이 크기로 설정
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int width = (int) screenSize.getWidth();
        int height = (int) screenSize.getHeight();
        setSize(width, height);

        setContentPane(new Start24.MyPanel());
        getContentPane().setBackground(Color.BLACK);
        getContentPane().setLayout(null);

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
        private ImageIcon SmokingIn= new ImageIcon("images/opening/흡연실안_말풍선.png");
        private Image img = SmokingIn.getImage();


        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
        }
    }
    private void goToNextPage() {
        Start24.this.dispose();
        new Start25();
    }
    public static void main(String[] args) {
        new Start24();
    }
}


