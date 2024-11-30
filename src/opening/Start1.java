package opening;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Start1 extends JFrame {
    private boolean isTriangleVisible = true;  // 삼각형 깜빡임 상태
    private Timer blinkTimer;
    private int screenWidth, screenHeight;  // 화면 크기 저장

    public Start1() {
        setTitle("Start1");
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

        BlinkingButton();

        // 키보드 이벤트 추가
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

    public void BlinkingButton() {
        // 500ms마다 상태 변경하는 타이머 설정
        blinkTimer = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isTriangleVisible = !isTriangleVisible;
                repaint();  // 화면 다시 그리기
            }
        });
        blinkTimer.start();
    }

    // 버튼에 대해 삼각형 그리기
    class MyPanel extends JPanel {
        private ImageIcon profileIcon = new ImageIcon("images/characters/프_지훈.png");
        private Image profileImage = profileIcon.getImage();

        public MyPanel() {
            setLayout(null);

            // 캐릭터 이름 라벨
            JLabel nameLabel = new JLabel("명지훈");
            nameLabel.setFont(new Font("Inter", Font.BOLD, (int) (screenHeight * 0.04))); // 폰트 크기 비율 설정
            nameLabel.setForeground(Color.WHITE);
            nameLabel.setBounds(
                    (int) (screenWidth * 0.18),  // 가로 위치 비율
                    (int) (screenHeight * 0.45), // 세로 위치 비율
                    (int) (screenWidth * 0.3),  // 가로 폭 비율
                    (int) (screenHeight * 0.05) // 세로 높이 비율
            );

            // 프로필 이미지의 원본 크기
            int originalWidth = profileImage.getWidth(null);
            int originalHeight = profileImage.getHeight(null);
            double aspectRatio = (double) originalWidth / originalHeight;

            // 새 크기를 화면 비율에 맞춰 조정
            int newHeight = (int) (screenHeight * 0.15); // 화면 높이의 15%
            int newWidth = (int) (newHeight * aspectRatio); // 비율 유지

            // 이미지 리사이즈
            Image resizedImage = profileImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
            ImageIcon resizedIcon = new ImageIcon(resizedImage);

            // 프로필 라벨
            JLabel profileLabel = new JLabel(resizedIcon);
            profileLabel.setBounds(
                    (int) (screenWidth * 0.05),  // 가로 위치 비율
                    (int) (screenHeight * 0.4), // 세로 위치 비율
                    newWidth,                    // 조정된 너비
                    newHeight                    // 조정된 높이
            );

            // 대화 내용 텍스트
            JTextArea textArea = new JTextArea("너무 평범해서 무료했던 날이었다. 이 문자를 받기 전까지는.");
            textArea.setFont(new Font("Inter", Font.PLAIN, (int) (screenHeight * 0.03))); // 폰트 크기 비율 설정
            textArea.setForeground(Color.WHITE);
            textArea.setOpaque(false);
            textArea.setLineWrap(true);
            textArea.setWrapStyleWord(true);
            textArea.setEditable(false);
            textArea.setBounds(
                    (int) (screenWidth * 0.05),
                    (int) (screenHeight * 0.62),
                    (int) (screenWidth * 0.9),
                    (int) (screenHeight * 0.1)
            );

            // 삼각형 클릭 이벤트 추가
            addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    int mouseX = e.getX();
                    int mouseY = e.getY();

                    // 삼각형 영역 확인
                    if (isTriangleClicked(mouseX, mouseY)) {
                        goToNextPage();
                    }
                }
            });

            add(nameLabel);
            add(profileLabel);
            add(textArea);
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.setColor(Color.DARK_GRAY);
            g.fillRect(
                    (int) (screenWidth * 0.03),  // 가로 위치 비율
                    (int) (screenHeight * 0.58), // 세로 위치 비율
                    (int) (screenWidth * 0.94), // 가로 폭 비율
                    (int) (screenHeight * 0.29) // 세로 높이 비율
            );

            if (isTriangleVisible) {
                // 삼각형 위치를 화면 비율로 동적으로 설정
                int baseX = (int) (screenWidth * 0.93); // 화면 가로의 47.5% 지점
                int baseY = (int) (screenHeight * 0.77); // 화면 세로의 52% 지점

                int[] xPoints = {
                        baseX,
                        baseX,
                        baseX + (int) (screenWidth * 0.02) // 삼각형 너비 비율
                };
                int[] yPoints = {
                        baseY,
                        baseY + (int) (screenHeight * 0.05), // 삼각형 높이 비율
                        baseY + (int) (screenHeight * 0.025) // 삼각형 중간 높이
                };
                int nPoints = 3;

                g.setColor(Color.GRAY);
                g.fillPolygon(xPoints, yPoints, nPoints);
            }
        }

        private boolean isTriangleClicked(int x, int y) {
            int baseX = (int) (screenWidth * 0.93);
            int baseY = (int) (screenHeight * 0.77);

            int[] xPoints = {
                    baseX,
                    baseX,
                    baseX + (int) (screenWidth * 0.02)
            };
            int[] yPoints = {
                    baseY,
                    baseY + (int) (screenHeight * 0.05),
                    baseY + (int) (screenHeight * 0.025)
            };

            Polygon triangle = new Polygon(xPoints, yPoints, 3);
            return triangle.contains(x, y);
        }
    }

    private void goToNextPage() {
        setVisible(false); // 현재 창 숨기기
        new Start2(); // 다음 페이지로 이동
    }

    public static void main(String[] args) {
        new Start1();
    }
}
