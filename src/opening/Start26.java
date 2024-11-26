package opening;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Start26 extends JFrame {
    private boolean isTriangleVisible = true;  // 삼각형 깜빡임 상태
    private Timer blinkTimer;

    public Start26() {
        setTitle("Start26");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setContentPane(new Start26.MyPanel());
        getContentPane().setBackground(Color.BLACK);
        getContentPane().setLayout(null);

        setSize(1440, 1024);
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

        setFocusable(true); // 키보드 입력을 받을 수 있도록 설정
        requestFocusInWindow(); // 윈도우가 포커스를 가지도록 설정
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

    // 버튼에 대해 삼각형 그리기
    class MyPanel extends JPanel {
        private ImageIcon profileIcon = new ImageIcon("images/characters/프_명호.png");
        private Image profileImage = profileIcon.getImage();

        public MyPanel() {
            setLayout(null); // 레이아웃 설정

            // 캐릭터 이름 라벨
            JLabel nameLabel = new JLabel("전명호");
            nameLabel.setBounds(200, 390, 300, 50);
            nameLabel.setFont(new Font("Inter", Font.BOLD, 40));
            nameLabel.setForeground(Color.WHITE);

            // 캐릭터 프로필 아이콘

            int PhoneWidth = profileImage.getWidth(null);
            int PhoneHeight = profileImage.getHeight(null);
            double ratio = (double) PhoneWidth / (double) PhoneHeight;

            int newWidth = (int) (PhoneWidth * 0.62); //원본 크기의 50%
            int newHeight = (int) (PhoneHeight * ratio *0.62); // 비율 유지

            Image resizedImage = profileImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
            ImageIcon resizedIcon = new ImageIcon(resizedImage);


            JLabel profileLabel = new JLabel(resizedIcon);
            profileLabel.setBounds(45, 345, newWidth, newHeight);

            // 대화 내용 텍스트
            JTextArea textArea = new JTextArea("문성하가 죽은 덕분에 불안할 일이 사라졌어. 오히려 죽어줘서 고맙다는 생각이 드네.");
            textArea.setBounds(50, 530, 1180, 150);
            textArea.setFont(new Font("Inter", Font.PLAIN, 30));
            textArea.setForeground(Color.white);
            textArea.setEditable(false); // 편집 불가능
            textArea.setOpaque(false); // 배경을 투명하게 설정
            textArea.setLineWrap(true); // 줄 바꿈 허용
            textArea.setWrapStyleWord(true); // 단어 단위로 줄 바꿈


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

            // 컴포넌트 추가
            add(nameLabel);
            add(profileLabel);
            add(textArea);

        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
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
        Start26.this.dispose(); // 현재 창 닫기
        new Start27();
    }

    public static void main(String[] args) {
        new Start26();
    }
}

