package opening;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Start2 extends JFrame {
    public Start2() {
        setTitle("Start2");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setContentPane(new Start2.MyPanel());
        getContentPane().setBackground(Color.BLACK);
        getContentPane().setLayout(null);

        setSize(1440, 1024);
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

        setFocusable(true); // 키보드 입력을 받을 수 있도록 설정
        requestFocusInWindow(); // 윈도우가 포커스를 가지도록 설정
    }

    class MyPanel extends JPanel {
        private ImageIcon PhoneIcon = new ImageIcon("images/opening/휴대폰.png");
        private Image PhoneImage = PhoneIcon.getImage();

        public MyPanel() {
            setLayout(null);

            //텍스트
            JLabel TextLabel1 = new JLabel("야 너 어디야.");
            TextLabel1.setBounds(100, 200, 300, 50);
            TextLabel1.setFont(new Font("Inter", Font.PLAIN, 36));
            TextLabel1.setForeground(Color.WHITE);

            JLabel TextLabel2 = new JLabel("학교 가는중이지.");
            TextLabel2.setBounds(300, 300, 400, 50);
            TextLabel2.setFont(new Font("Inter", Font.PLAIN, 36));
            TextLabel2.setForeground(Color.WHITE);

            JLabel TextLabel3 = new JLabel("빨리와. 지금 학교 난리났어.");
            TextLabel3.setBounds(100, 400, 500, 50);
            TextLabel3.setFont(new Font("Inter", Font.PLAIN, 36));
            TextLabel3.setForeground(Color.WHITE);

            JLabel TextLabel4 = new JLabel("왜?");
            TextLabel4.setBounds(480, 500, 300, 50);
            TextLabel4.setFont(new Font("Inter", Font.PLAIN, 36));
            TextLabel4.setForeground(Color.WHITE);

            int PhoneWidth = PhoneImage.getWidth(null);
            int PhoneHeight = PhoneImage.getHeight(null);
            double ratio = (double) PhoneWidth / (double) PhoneHeight;

            int newWidth = (int) (PhoneWidth * 0.8); //원본 크기의 50%
            int newHeight = (int) (PhoneHeight * ratio * 1.2); // 비율 유지

            Image resizedImage = PhoneImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
            ImageIcon resizedIcon = new ImageIcon(resizedImage);

            //휴대폰
            JLabel PhoneLabel = new JLabel(resizedIcon);
            PhoneLabel.setBounds(700, 20, newWidth, newHeight);

            add(TextLabel1);
            add(TextLabel2);
            add(TextLabel3);
            add(TextLabel4);
            add(PhoneLabel);
        }
    }


    private void goToNextPage() {
        Start2.this.dispose();
        new Start3();
    }

    public static void main(String[] args) {
        new Start2();
    }
}
