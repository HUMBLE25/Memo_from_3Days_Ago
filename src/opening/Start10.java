package opening;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Start10 extends JFrame {
    private boolean isTriangleVisible = true;  // 삼각형 깜빡임 상태
    private Timer blinkTimer;

    public Start10() {
        setTitle("Start10");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // 화면 크기를 디스플레이 크기로 설정
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int width = (int) screenSize.getWidth();
        int height = (int) screenSize.getHeight();
        setSize(width, height);

        setContentPane(new Start10.MyPanel());
        getContentPane().setBackground(Color.BLACK);
        getContentPane().setLayout(null);

        setVisible(true);

        BlinkingButton();// 삼각형 깜빡이기 시작


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
    public void BlinkingButton() {

        // 500ms마다 상태 변경하는 타이머 설정
        blinkTimer = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 삼각형 깜빡임
                isTriangleVisible = !isTriangleVisible;
                repaint();
            }
        });
        blinkTimer.start();
    }

    // 버튼에 대해 삼각형 그리기
    class MyPanel extends JPanel {
        private ImageIcon profileIcon = new ImageIcon("images/characters/프_지훈.png");
        private Image profileImage = profileIcon.getImage();

        private ImageIcon backgroud = new ImageIcon("images/opening/현타온지훈.png");
        private Image img = backgroud.getImage();

        public MyPanel() {
            setLayout(null);

            // 캐릭터 이름 라벨
            JLabel nameLabel = new JLabel("명지훈");
            nameLabel.setBounds(200, 400, 300, 50);
            nameLabel.setFont(new Font("Inter", Font.BOLD, 40));
            nameLabel.setForeground(Color.WHITE);

            // 캐릭터 프로필 아이콘
            JLabel profileLabel = new JLabel(profileIcon);
            profileLabel.setBounds(45, 345, 130, 134);

            // 대화 내용 텍스트
            JTextArea textArea = new JTextArea("성하가 글을 사랑하는 마음은 자신을 생각하는 마음보다 크기 때문에 그 아이는 자살을 할리가 없다.");
            textArea.setBounds(55, 525, 1100, 100);
            textArea.setFont(new Font("Inter", Font.PLAIN, 30));
            textArea.setForeground(Color.white);
            textArea.setEditable(false);
            textArea.setOpaque(false);
            textArea.setLineWrap(true);
            textArea.setWrapStyleWord(true);


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

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);

            g.setColor(Color.DARK_GRAY);
            g.fillRect(30, 500, 1205, 245);

            if (isTriangleVisible) {
                // 삼각형 그리기
                int[] xPoints = {1190, 1190, 1215};
                int[] yPoints = {680, 710, 695};
                int nPoints = 3;

                g.setColor(Color.GRAY);
                g.fillPolygon(xPoints, yPoints, nPoints);

            }
        }

        private boolean isTriangleClicked(int x, int y) {
            int[] xPoints = {1190, 1190, 1215};
            int[] yPoints = {680, 710, 695};

            Polygon triangle = new Polygon(xPoints, yPoints, 3);
            return triangle.contains(x, y);
        }
    }

    private void goToNextPage() {
        Start10.this.dispose(); // 현재 창 닫기
        new Start11();
    }

    public static void main(String[] args) {
        new Start10();
    }
}

