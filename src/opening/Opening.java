package opening;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Opening extends JFrame {
    private boolean isTriangleVisible = true;  // 삼각형 깜빡임 상태

    // Timer를 사용하여 주기적으로 상태 변경
    private Timer blinkTimer;

    public void run() {
        System.out.println("Opening..");
    }

    public void BlinkingButton() {

        // 500ms마다 상태 변경하는 타이머 설정
        blinkTimer = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 삼각형 깜빡임
                isTriangleVisible = !isTriangleVisible;
                repaint();  // 화면 다시 그리기
            }
        });
        blinkTimer.start();  // 타이머 시작
    }

    // 프레임 설정
    public Opening() {
        setTitle("Start");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setContentPane(new MyPanel());
        getContentPane().setBackground(Color.BLACK);
        getContentPane().setLayout(null);

        setSize(1440,1024);
        setVisible(true);

        BlinkingButton();

    }


    class MyPanel extends JPanel {
        private ImageIcon start = new ImageIcon("images/opening/게임시작.png");
        private Image img = start.getImage();

        public MyPanel() {
            setLayout(null); // 레이아웃 설정

            // 3일전, 메모장
            JLabel titleLabel = new JLabel("3일 전 메모장, 예고된 추락사건");
            titleLabel.setBounds(300, 200, 900, 100);
            titleLabel.setFont(new Font("Inter", Font.BOLD, 55));
            titleLabel.setForeground(Color.WHITE);

            //게임 시작 버튼
            JButton startButton = new JButton("게임시작");
            startButton.setBounds(550, 520, 200, 50);
            startButton.setFont(new Font("Inter", Font.BOLD, 36));
            startButton.setForeground(Color.GRAY);
            startButton.setBackground(new Color(0, 0, 0, 0)); // 투명 배경
            startButton.setFocusPainted(false);
            startButton.setBorder(null);
            startButton.setContentAreaFilled(false); // 버튼 배경 투명 처리


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

                add(titleLabel);
                add(startButton);
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g); // 부모 클래스의 paintComponent 호출
            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);

            if (isTriangleVisible) {
                // 삼각형 그리기
                int[] xPoints = {540, 540, 565};
                int[] yPoints = {530, 560, 545};
                int nPoints = 3;

                g.setColor(Color.GRAY);
                g.fillPolygon(xPoints, yPoints, nPoints);

            }
        }
    }

    public static void main(String[] args) {
        Opening opening = new Opening();
    }

}
