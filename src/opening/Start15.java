package opening;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Start15 extends JFrame {
    private int screenWidth, screenHeight; // 화면 크기 저장

    public Start15() {
        setTitle("Start15");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // 화면 크기를 디스플레이 크기로 설정
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        screenWidth = (int) screenSize.getWidth();
        screenHeight = (int) screenSize.getHeight();
        setSize(screenWidth, screenHeight);

        setContentPane(new MyPanel());
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
        public MyPanel() {
            setLayout(null);

            // 애니메이션 텍스트
            JLabel animatedText = new JLabel("", SwingConstants.CENTER);
            animatedText.setFont(new Font("Inter", Font.BOLD, (int) (screenHeight * 0.05))); // 화면 높이에 따라 폰트 크기 설정
            animatedText.setForeground(Color.WHITE);
            animatedText.setBounds(
                    (int) (screenWidth * 0.2),  // 가로 위치 비율
                    (int) (screenHeight * 0.2), // 세로 위치 비율
                    (int) (screenWidth * 0.65),  // 가로 폭 비율
                    (int) (screenHeight * 0.4)  // 세로 높이 비율
            );

            add(animatedText);

            String fullText = "3일전 , 대학교 휴게실";
            Timer textAnimation = new Timer(50, new ActionListener() {
                int charIndex = 0;

                @Override
                public void actionPerformed(ActionEvent e) {
                    if (charIndex < fullText.length()) {
                        animatedText.setText("<html>" + fullText.substring(0, ++charIndex).replace("\n", "<br>") + "</html>");
                    } else {
                        ((Timer) e.getSource()).stop();
                    }
                }
            });
            textAnimation.start();
        }
    }

    private void goToNextPage() {
        setVisible(false); // 현재 창 숨기기
        new Start16();
    }

    public static void main(String[] args) {
        new Start16();
    }
}