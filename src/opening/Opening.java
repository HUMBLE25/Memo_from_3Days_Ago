package opening;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Opening extends JFrame {
    private boolean isTriangleVisible = true;  // 삼각형 깜빡임 상태
    private Timer blinkTimer; // Timer를 사용하여 주기적으로 상태 변경

    public Opening() {
        setTitle("Start");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // 화면 크기를 디스플레이 크기로 설정
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int width = (int) screenSize.getWidth();
        int height = (int) screenSize.getHeight();
        setSize(width, height);

        setContentPane(new MyPanel(width, height)); // 화면 크기를 전달
        getContentPane().setBackground(Color.BLACK);
        getContentPane().setLayout(null);

        setVisible(true);
        BlinkingButton();
    }

    // Timer를 사용하여 삼각형 깜빡임
    public void BlinkingButton() {
        blinkTimer = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isTriangleVisible = !isTriangleVisible; // 삼각형 상태 변경
                repaint();
            }
        });
        blinkTimer.start();
    }

    class MyPanel extends JPanel {
        private ImageIcon start = new ImageIcon("images/opening/게임시작.png");
        private Image img = start.getImage();
        private int screenWidth, screenHeight; // 화면 크기 저장

        public MyPanel(int width, int height) {
            this.screenWidth = width;
            this.screenHeight = height;
            setLayout(null);

            // 텍스트 라벨 추가
            JLabel titleLabel = new JLabel("3일 전 메모장, 예고된 추락사건");
            titleLabel.setFont(new Font("Inter", Font.BOLD, (int) (screenHeight * 0.05))); // 폰트 크기를 화면 비율에 따라 설정
            titleLabel.setForeground(Color.WHITE);
            titleLabel.setBounds(
                    (int) (screenWidth * 0.3),   // 화면 가로의 10% 지점
                    (int) (screenHeight * 0.25),  // 화면 세로의 10% 지점
                    (int) (screenWidth * 0.8),   // 화면 가로의 80% 폭
                    (int) (screenHeight * 0.1)   // 높이를 화면 세로의 10%로 설정
            );
            add(titleLabel);

            // 게임 시작 버튼 추가
            JButton startButton = new JButton("게임시작");
            startButton.setFont(new Font("Inter", Font.BOLD, 36)); // 폰트 크기를 화면 비율에 따라 설정
            startButton.setForeground(Color.GRAY);
            startButton.setBackground(new Color(0, 0, 0, 0));
            startButton.setFocusPainted(false);
            startButton.setBorder(null);
            startButton.setContentAreaFilled(false); // 버튼 배경 투명 처리
            startButton.setBounds(
                    (int) (screenWidth * 0.4),   // 화면 가로의 40% 지점
                    (int) (screenHeight * 0.5),  // 화면 세로의 50% 지점
                    (int) (screenWidth * 0.2),   // 버튼 폭을 화면 가로의 20%로 설정
                    (int) (screenHeight * 0.1)   // 버튼 높이를 화면 세로의 10%로 설정
            );

            startButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // 새 창 생성
                    Start1 newWindow = new Start1();

                    // 새 창이 완전히 초기화된 후 현재 창 닫기
                    SwingUtilities.invokeLater(() -> {
                        dispose(); // 현재 창 닫기
                    });
                }
            });

            startButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    startButton.setCursor(new Cursor(Cursor.HAND_CURSOR)); // 커서 변경
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    startButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); // 기본 커서로 변경
                }
            });

            add(startButton);
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);

            if (isTriangleVisible) {
                // 삼각형 위치를 화면 비율로 동적으로 설정
                int baseX = (int) (screenWidth * 0.41); // 화면 가로의 47.5% 지점
                int baseY = (int) (screenHeight * 0.52); // 화면 세로의 52% 지점

                int[] xPoints = {baseX, baseX, baseX + (int) (screenWidth * 0.02)};
                int[] yPoints = {baseY, baseY + (int) (screenHeight * 0.05), baseY + (int) (screenHeight * 0.025)};
                int nPoints = 3;

                g.setColor(Color.GRAY);
                g.fillPolygon(xPoints, yPoints, nPoints);
            }
        }
    }

    public static void main(String[] args) {
        new Opening();
    }
}