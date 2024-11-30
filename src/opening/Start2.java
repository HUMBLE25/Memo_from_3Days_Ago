package opening;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Start2 extends JFrame {
    private int screenWidth, screenHeight; // 화면 크기 저장

    public Start2() {
        setTitle("Start2");
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

        // 키보드 리스너 추가
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER || e.getKeyCode() == KeyEvent.VK_SPACE) {
                    goToNextPage(); // 엔터 또는 스페이스바를 누르면 다음 페이지로 이동
                }
            }
        });

        setFocusable(true);
        requestFocusInWindow();
    }

    class MyPanel extends JPanel {
        private ImageIcon phoneIcon = new ImageIcon("images/opening/휴대폰.png");
        private Image phoneImage = phoneIcon.getImage();

        public MyPanel() {
            setLayout(null);

            // 텍스트 라벨 설정 (화면 비율 기반 위치와 크기)
            JLabel textLabel1 = new JLabel("야 너 어디야.");
            textLabel1.setFont(new Font("Inter", Font.PLAIN, (int) (screenHeight * 0.03)));
            textLabel1.setForeground(Color.WHITE);
            textLabel1.setBounds(
                    (int) (screenWidth * 0.1),
                    (int) (screenHeight * 0.2),
                    (int) (screenWidth * 0.3),
                    (int) (screenHeight * 0.05)
            );

            JLabel textLabel2 = new JLabel("학교 가는중이지.");
            textLabel2.setFont(new Font("Inter", Font.PLAIN, (int) (screenHeight * 0.03)));
            textLabel2.setForeground(Color.WHITE);
            textLabel2.setBounds(
                    (int) (screenWidth * 0.2),
                    (int) (screenHeight * 0.3),
                    (int) (screenWidth * 0.4),
                    (int) (screenHeight * 0.05)
            );

            JLabel textLabel3 = new JLabel("빨리와. 지금 학교 난리났어.");
            textLabel3.setFont(new Font("Inter", Font.PLAIN, (int) (screenHeight * 0.03)));
            textLabel3.setForeground(Color.WHITE);
            textLabel3.setBounds(
                    (int) (screenWidth * 0.1),
                    (int) (screenHeight * 0.4),
                    (int) (screenWidth * 0.5),
                    (int) (screenHeight * 0.05)
            );

            JLabel textLabel4 = new JLabel("왜?");
            textLabel4.setFont(new Font("Inter", Font.PLAIN, (int) (screenHeight * 0.03)));
            textLabel4.setForeground(Color.WHITE);
            textLabel4.setBounds(
                    (int) (screenWidth * 0.4),
                    (int) (screenHeight * 0.5),
                    (int) (screenWidth * 0.3),
                    (int) (screenHeight * 0.05)
            );

            // 휴대폰 이미지 크기 조정
            int originalWidth = phoneImage.getWidth(null);
            int originalHeight = phoneImage.getHeight(null);
            double aspectRatio = (double) originalWidth / originalHeight;

            int newHeight = (int) (screenHeight * 0.85); // 화면 높이의 30%
            int newWidth = (int) (newHeight * aspectRatio * 1.0); // 비율 유지

            Image resizedImage = phoneImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
            ImageIcon resizedIcon = new ImageIcon(resizedImage);

            // 휴대폰 라벨 설정 (화면 비율 기반 위치와 크기)
            JLabel phoneLabel = new JLabel(resizedIcon);
            phoneLabel.setBounds(
                    (int) (screenWidth * 0.6),
                    (int) (screenHeight * 0.05),
                    newWidth,
                    newHeight
            );

            // 컴포넌트 추가
            add(textLabel1);
            add(textLabel2);
            add(textLabel3);
            add(textLabel4);
            add(phoneLabel);
        }
    }

    private void goToNextPage() {
        setVisible(false); // 현재 창 숨기기
        new Start3(); // 다음 페이지로 이동
    }

    public static void main(String[] args) {
        new Start2();
    }
}