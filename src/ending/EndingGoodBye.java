package ending;

import common.ImageRegistry;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EndingGoodBye extends JPanel {
    private CardLayout cardLayout;
    private JPanel mainPanel;

    private final ImageIcon profileJiHo = ImageRegistry.getImage("character_프_지호");
    private final ImageIcon goodBye = ImageRegistry.getImage("Ending_이젠안녕");

    private Color startColor = new Color(0x06213B); // start color for the gradation
    private Color endColor = new Color(0x020919);// end color for the gradation

    public EndingGoodBye(JPanel mainPanel, CardLayout cardLayout) {
        this.mainPanel = mainPanel;
        this.cardLayout = cardLayout;

        // 배경색 설정
        setLayout(null);
        setBackground(Color.BLACK);

        // 질문 박스 그라데이션 배경색
        JPanel questionBox = new GradientPanel(startColor, endColor);
        questionBox.setLayout(null);
        questionBox.setBounds(86, 149, 1268, 727); // 적절한 위치와 크기 설정

        // message
        JLabel message = new JLabel();
        message.setText("<html>당신의 추리는 성공했습니다.<br>문성하를 죽인 범인은 천지호입니다.</html>");
        message.setFont(new Font("Anonymous Pro", Font.PLAIN, 36));
        message.setForeground(Color.WHITE);
        message.setBackground(new Color(0x333C41)); // 배경색을 대화 상자와 일치
        message.setVisible(true);
        message.setBounds(373, 194, 576, 112);

        JLabel jiHoIcon = createProfileIcon(profileJiHo, 546, 316); // 천지호

        questionBox.add(message);
        questionBox.add(jiHoIcon);

        // 이벤트 리스너 추가
        addListeners();
    }

    // 프로필 생성
    private JLabel createProfileIcon(ImageIcon icon, int x, int y) {
        JLabel profileLabel = new JLabel(icon);
        profileLabel.setBounds(x, y, 216, 222); // 프로필 이미지 크기 및 위치
        return profileLabel;
    }

    private static class GradientPanel extends JPanel {
        private final Color startColor;
        private final Color endColor;

        public GradientPanel(Color startColor, Color endColor) {
            this.startColor = startColor;
            this.endColor = endColor;
            setOpaque(false);
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;
            int width = getWidth();
            int height = getHeight();

            // 그라데이션 색상 설정
            GradientPaint gradientPaint = new GradientPaint(0, 0, startColor, 0, height, endColor);
            g2d.setPaint(gradientPaint);
            g2d.fillRect(0, 0, width, height);

            super.paintComponent(g);
        }
    }
    // 리스너 추가
    private void addListeners() {
        // 마우스 클릭 리스너
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                moveToFinalScreen();
            }
        });

        // 키 입력 리스너
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_SPACE || e.getKeyCode() == KeyEvent.VK_ENTER) {
                    moveToFinalScreen();
                }
            }
        });

        // 포커스를 받아 키 입력을 처리할 수 있도록 설정
        setFocusable(true);
        requestFocusInWindow();
    }

    // 마지막 화면으로 이동
    private void moveToFinalScreen() {
        JPanel finalScreen = createFinalScreen();
        mainPanel.add(finalScreen, "FinalScreen");
        cardLayout.show(mainPanel, "FinalScreen");
    }

    // 마지막 화면 생성
    private JPanel createFinalScreen() {
        JPanel finalScreen = new JPanel();
        finalScreen.setLayout(null);
        finalScreen.setBackground(Color.BLACK);

        JLabel finalImage = new JLabel(goodBye); // 천지호 이미지
        // 이미지 크기
        int imageWidth = 1024;
        int imageHeight = 1024;

        // 화면 크기
        int screenWidth = 1440;
        int screenHeight = 1024;

        // 중앙 배치 계산
        int x = (screenWidth - imageWidth) / 2;
        int y = (screenHeight - imageHeight) / 2;

        // 이미지 위치 및 크기 설정
        finalImage.setBounds(x, y, imageWidth, imageHeight);
        finalScreen.add(finalImage);

        return finalScreen;
    }
}