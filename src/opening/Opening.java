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

        setContentPane(new MyPanel());
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

        public MyPanel() {
            setLayout(null);

            // 화면 크기 가져오기
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            Dimension screenSize = toolkit.getScreenSize();
            int width = (int) screenSize.getWidth();
            int height = (int) screenSize.getHeight();

            // 텍스트 라벨 추가
            JLabel titleLabel = new JLabel("3일 전 메모장, 예고된 추락사건");
            titleLabel.setFont(new Font("Inter", Font.BOLD, 55));
            titleLabel.setForeground(Color.WHITE);
            titleLabel.setBounds(300, 200, 900, 100);
            add(titleLabel);

            // 게임 시작 버튼 추가
            JButton startButton = new JButton("게임시작");
            startButton.setFont(new Font("Inter", Font.BOLD, 36));
            startButton.setForeground(Color.GRAY);
            startButton.setBackground(new Color(0, 0, 0, 0));
            startButton.setFocusPainted(false);
            startButton.setBorder(null);
            startButton.setContentAreaFilled(false); // 버튼 배경 투명 처리
            startButton.setBounds(550, 500, 200, 50);


            startButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    dispose();
                    new Start1();
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
                // 삼각형 그리기
                int[] xPoints = {540, 540, 565};
                int[] yPoints = {510, 540, 525};
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