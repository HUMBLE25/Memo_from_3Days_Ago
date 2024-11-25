package opening;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Start28 extends JFrame {
    private boolean isTriangleVisible = true; // 삼각형 깜빡임 상태
    private Timer blinkTimer;

    public Start28() {
        setTitle("Start28");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // 화면 크기를 디스플레이 크기로 설정
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int width = (int) screenSize.getWidth();
        int height = (int) screenSize.getHeight();
        setSize(width, height);
        getContentPane().setBackground(Color.BLACK);
        getContentPane().setLayout(null);

        setVisible(true);


        showCustomDialog();
    }

    public void showCustomDialog() {

        JDialog dialog = new JDialog(this, "Custom Dialog", true);
        dialog.setSize(820, 300);
        dialog.setLayout(null);
        dialog.setUndecorated(true);
        dialog.setShape(new java.awt.geom.RoundRectangle2D.Double(0, 0, 820, 300, 50, 50));
        dialog.getContentPane().setLayout(new BorderLayout()); // 배경에 그라데이션 추가

        JPanel backgroundPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                GradientPaint gp = new GradientPaint(0, 0, Color.DARK_GRAY, 0, getHeight(), Color.BLACK);
                g2d.setPaint(gp);
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        backgroundPanel.setLayout(null);
        dialog.setContentPane(backgroundPanel);

        // 애니메이션 텍스트
        JLabel animatedText = new JLabel("", SwingConstants.CENTER);
        animatedText.setFont(new Font("Inter", Font.BOLD, 26));
        animatedText.setForeground(Color.WHITE);
        animatedText.setBounds(40, 50, 750, 150); // 위치와 크기
        backgroundPanel.add(animatedText);

        String fullText = "지금부터 당신은 문성하의 사인을 추적할 것입니다.\n숨겨진 단서를 찾아 그의 죽음 뒤에 숨겨진 진실을 밝혀내십시오.\n당신의 선택이 사건의 결말을 결정짓습니다.";
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

        // 커스텀 삼각형 버튼 패널 생성
        JPanel triangleButtonPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                Graphics2D g2 = (Graphics2D) g;
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); // 안티앨리어싱
                if (isTriangleVisible) {
                    int[] xPoints = {75, 100, 75};
                    int[] yPoints = {20, 35, 50};
                    g2.setColor(Color.GRAY);
                    g2.fillPolygon(xPoints, yPoints, 3);

                    g2.setColor(Color.DARK_GRAY);
                    g2.drawPolygon(xPoints, yPoints, 3); // 테두리
                }
            }
        };
        triangleButtonPanel.setBounds(360, 220, 100, 100); // 버튼 위치 및 크기 설정
        triangleButtonPanel.setOpaque(false);

        // 클릭 이벤트 추가
        triangleButtonPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("삼각형 버튼 클릭!");
                dialog.dispose(); // 다이얼로그 닫기
                new Start29();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                triangleButtonPanel.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }
        });

        backgroundPanel.add(triangleButtonPanel);

        // 깜빡임 타이머 설정
        blinkTimer = new Timer(500, e -> {
            isTriangleVisible = !isTriangleVisible; // 깜빡임 상태 전환
            triangleButtonPanel.repaint(); // 패널 다시 그리기
        });
        blinkTimer.start();

        // 다이얼로그를 화면에 표시
        dialog.setLocationRelativeTo(this); // 창 중앙에 표시
        dialog.setVisible(true); // 다이얼로그 표시
    }


    public static void main(String[] args) {
        new Start28();
    }
}
