package ending;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

// 삼각형 버튼 클래스
class TriangleButton extends JButton {
    public TriangleButton() {
        setContentAreaFilled(false); // 기본 배경 제거
        setFocusPainted(false); // 포커스 효과 제거
        setBorderPainted(false); // 테두리 제거
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground()); // 버튼 배경 색상

        int[] xPoints = {10, getWidth() - 10, 10}; // 삼각형 x 좌표
        int[] yPoints = {10, getHeight() / 2, getHeight() - 10}; // 삼각형 y 좌표
        g2.fillPolygon(xPoints, yPoints, 3);
    }
}

public class Ending {
    public static void main(String[] args) {
        // JFrame 생성
        JFrame frame = new JFrame("Mystery Scene");
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int width = (int) screenSize.width;
        int height = (int) screenSize.height;

        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setLayout(null); // 자유 배치 사용

        // JLayeredPane 생성 (레이어 순서 관리)
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, width, height);

        frame.add(layeredPane);

        ImageIcon mjhIcon = new ImageIcon("C:/Users/user/Desktop/images/characters/프_지훈.png");
        Image mjhImage = mjhIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        JLabel mjhImageLabel = new JLabel(new ImageIcon(mjhImage));
        mjhImageLabel.setBounds(50, height - 500, 100, 100); // 이미지 위치
        layeredPane.add(mjhImageLabel, Integer.valueOf(2)); // 항상 상위 레이어에 배치

        JLabel mjhNameLabel = new JLabel("명지훈");
        mjhNameLabel.setFont(new Font("맑은 고딕", Font.BOLD, 30));
        mjhNameLabel.setForeground(Color.WHITE);
        mjhNameLabel.setBounds(160, height - 460, 200, 50); // 이름 위치
        layeredPane.add(mjhNameLabel, Integer.valueOf(2)); // 항상 상위 레이어에 배치

        // 기타 캐릭터 이미지 추가
        ImageIcon cjh_imageIcon = new ImageIcon("C:/Users/user/Desktop/images/characters/천지호_앞.png");
        Image cgh_image = cjh_imageIcon.getImage().getScaledInstance(300, 900, Image.SCALE_SMOOTH); // 크기와 위치 설정
        JLabel cgh_imageLabel = new JLabel(new ImageIcon(cgh_image));
        cgh_imageLabel.setBounds(1100, 70, 300, 900); // 위치 설정
        cgh_imageLabel.setVisible(false); // 초기에는 비활성화
        layeredPane.add(cgh_imageLabel, Integer.valueOf(0)); // 하위 레이어에 추가

        ImageIcon jmh_imageIcon = new ImageIcon("C:/Users/user/Desktop/images/characters/전명호_앞.png");
        Image jmh_image = jmh_imageIcon.getImage().getScaledInstance(300, 900, Image.SCALE_SMOOTH); // 크기와 위치 설정
        JLabel jmh_imageLabel = new JLabel(new ImageIcon(jmh_image));
        jmh_imageLabel.setBounds(1100, 70, 300, 900); // 위치 설정
        jmh_imageLabel.setVisible(false); // 초기에는 비활성화
        layeredPane.add(jmh_imageLabel, Integer.valueOf(0)); // 하위 레이어에 추가

        ImageIcon kdj_imageIcon = new ImageIcon("C:/Users/user/Desktop/images/characters/도진.png");
        Image kdj_image = kdj_imageIcon.getImage().getScaledInstance(300, 900, Image.SCALE_SMOOTH); // 크기와 위치 설정
        JLabel kdj_imageLabel = new JLabel(new ImageIcon(kdj_image));
        kdj_imageLabel.setBounds(1100, 70, 300, 900); // 위치 설정
        kdj_imageLabel.setVisible(false); // 초기에는 비활성화
        layeredPane.add(kdj_imageLabel, Integer.valueOf(0)); // 하위 레이어에 추가

        ImageIcon gsm_imageIcon = new ImageIcon("C:/Users/user/Desktop/images/characters/성민.png");
        Image gsm_image = gsm_imageIcon.getImage().getScaledInstance(300, 900, Image.SCALE_SMOOTH); // 크기와 위치 설정
        JLabel gsm_imageLabel = new JLabel(new ImageIcon(gsm_image));
        gsm_imageLabel.setBounds(1100, 70, 300, 900); // 위치 설정
        gsm_imageLabel.setVisible(false); // 초기에는 비활성화
        layeredPane.add(gsm_imageLabel, Integer.valueOf(0)); // 하위 레이어에 추가

        // 이미지 초기 설정 (비가시화)
        cgh_imageLabel.setVisible(false);
        jmh_imageLabel.setVisible(false);
        kdj_imageLabel.setVisible(false);
        gsm_imageLabel.setVisible(false);

        // 텍스트 영역 설정 (상위 레이어)
        JPanel textPanel = new JPanel();
        textPanel.setBounds(50, height - 350, width - 100, 250); // 박스 높이를 크게 설정
        textPanel.setBackground(new Color(45, 50, 60)); // 어두운 회색 배경
        textPanel.setLayout(new BorderLayout());
        textPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 5, 20)); // 상, 좌, 하, 우 여백 조정

        JTextArea mjh_dialogue = new JTextArea();
        String[] dialogues = {
                "난 오늘 성하가 죽은 이유를 밝힐 것이다. \n성하가 죽은 이유를 밝힐 증거를 모두 모았다.",
                "모든 증거로 미루어볼 때 용의자는 다음 네 명이다.",
                "첫 번째 용의자는 천지호. 문성하와 프로젝트를 같이 준비한 사람이다.", //인덱스 2, 천지호 이미지
                "천지호는 문성하가 힘든 시기 같은 이유로 힘들어했던 유일한 사람이고 성하와 \n가장 많은 시간을 보낸 사람이다.",
                "천지호에게 의심이 가게 했던 증거들은 문성하가 죽은 날 그에게 찍힌 수많은 \n 발신 전화, 문성하의 이야기를 격하게 피한다는 점,그리고 몸싸움의 흔적이다.",
                "하지만 이것만으로는 확신할 수 없어. 문성하가 무슨 일이 생겨서 도와달라고\n급하게 전화를 한 걸 수도 있어. 그리고 천지호 또한 피폐한 정신 상태이기에 \n저 상처들이 남에 의해서 생긴 것들이라고 단정 지을 수 없으니까.",
                "근데 그렇다고 도와달라는 전화를 56통이나 할까?",
                "두 번째 용의자는 김도진. 문성하에게 실제로 위협을 가한 마혜진의 남자친구\n이다.", //인덱스 7, 김도진 이미지
                "김도진은 자신의 여자친구와 바람을 폈다는 이유를 문성하를 구타한 전적이 있다.",
                "김도진에게 의심이 가게 했던 증거들은 과거뿐 아니라 문성하의 휴대폰에 있는\n협박 흔적, 현재까지 가지고 있는 증오심이다. 그가 분노를 참지 못하는 성격\n이라는 점도 어쩌면 심적 증거가 될 수 있다.",
                "나와 일면식이 있진 않지만 그가 가끔 분을 못이겨 선배 후배 가리지 않고 폭행\n을 했다는 사실은 가끔 들려왔다. 사람이 죽었는데 잘 죽었다니 참 제정신이 아\n닌 인간이다.",
                "세 번째 용의자는 전명호. 문성하의 죽음이 잘 됐다고 신나게 떠들던 전화의 주인\n공이다.", //인덱스 11, 전명호 이미지
                "전명호는 우리 대학원 최초로 청림신춘문예 대상에 이름을 올려 벌써 등단을 준비\n하는 과 최대 아웃풋이라고 할 수 있다. ",
                "이런 선배가 왜 문성하의 죽음이 잘 됐다고 했을까? 이 선배가 말한 불안한 일\n은 무엇일까? 인간적으로 라이벌이 줄었다는 이유로 사람이 죽은 것에 대해 잘\n됐다고 말할 비인간적인 사람은 많지 않아.",
                "네 번째 용의자는 금성민 교수. 문성하가 자기 때문에 자살했을 것이라고 굴뚝같\n이 믿고 있는 사람이다.",
                "금성민 교수에 대한 이야기는 성하의 일기장과 마혜진의 진술로도 충분하다. 정\n확히 어떻게 혼냈는 지는 몰라도 죄책감이 그렇게 큰 걸로 보아 할 말 못 할 말 \n다 하면서 혼낸 것 같다.", //인덱스 14, 금교수 이미지
                "하지만 내가 아는 문성하는 누군가가 혼냈다고 해서 자살을 할 아이가 아니야.\n",
                "누군가 글을 쓰지 말라고 자신을 죽도록 때려도 글을 쓰고 싶다고 하던 아이니\n까.",
                "증거는 모두 찾았다. 이제 추리만 잘 하면 성하가 죽은 이유를 맞출 수 있어.",
                ""
        };



        final int[] currentDialogueIndex = {0}; // 현재 텍스트 인덱스
        mjh_dialogue.setText(dialogues[currentDialogueIndex[0]]); // 첫 번째 텍스트 설정
        mjh_dialogue.setLineWrap(true); // 텍스트 줄바꿈 허용
        mjh_dialogue.setWrapStyleWord(true); // 단어 단위 줄바꿈
        mjh_dialogue.setBackground(new Color(45, 50, 60)); // 텍스트 영역 배경색
        mjh_dialogue.setForeground(Color.WHITE); // 텍스트 색상
        mjh_dialogue.setFont(new Font("맑은 고딕", Font.PLAIN, 36)); // 텍스트 폰트 크기 키움
        mjh_dialogue.setEditable(false); // 텍스트 수정 불가
        mjh_dialogue.setMargin(new Insets(10, 10, 10, 10)); // 상, 좌, 하, 우 여백 추가
        textPanel.add(mjh_dialogue, BorderLayout.CENTER);

        // 삼각형 버튼 추가
        TriangleButton triangleButton = new TriangleButton();
        triangleButton.setPreferredSize(new Dimension(50, 50)); // 버튼 크기
        triangleButton.setBackground(Color.LIGHT_GRAY); // 삼각형 색상을 라이트 그레이로 설정

        // 버튼 클릭 이벤트 설정
        triangleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 다음 대화로 이동
                currentDialogueIndex[0] = (currentDialogueIndex[0] + 1) % dialogues.length;
                mjh_dialogue.setText(dialogues[currentDialogueIndex[0]]); // 텍스트 업데이트

                // 이미지 표시/숨김 처리
                if (currentDialogueIndex[0] >= 2 && currentDialogueIndex[0] <= 6) {
                    cgh_imageLabel.setVisible(true); // 천지호 이미지 표시
                    kdj_imageLabel.setVisible(false);
                    jmh_imageLabel.setVisible(false);
                    gsm_imageLabel.setVisible(false);
                } else if (currentDialogueIndex[0] >= 7 && currentDialogueIndex[0] <= 10) {
                    cgh_imageLabel.setVisible(false);
                    kdj_imageLabel.setVisible(true); // 김도진 이미지 표시
                    jmh_imageLabel.setVisible(false);
                    gsm_imageLabel.setVisible(false);
                } else if (currentDialogueIndex[0] >= 11 && currentDialogueIndex[0] <= 13) {
                    cgh_imageLabel.setVisible(false);
                    kdj_imageLabel.setVisible(false);
                    jmh_imageLabel.setVisible(true); // 전명호 이미지 표시
                    gsm_imageLabel.setVisible(false);
                } else if (currentDialogueIndex[0] >= 14 && currentDialogueIndex[0] <= 16) {
                    cgh_imageLabel.setVisible(false);
                    kdj_imageLabel.setVisible(false);
                    jmh_imageLabel.setVisible(false);
                    gsm_imageLabel.setVisible(true); // 금성민 이미지 표시
                } else {
                    // 모든 이미지를 숨김 (그 외의 인덱스)
                    cgh_imageLabel.setVisible(false);
                    kdj_imageLabel.setVisible(false);
                    jmh_imageLabel.setVisible(false);
                    gsm_imageLabel.setVisible(false);
                }
                if (currentDialogueIndex[0] == 19) {
                    selectCriminal(frame); // 다음 장면 호출
                }
            }
        });


        // 버튼 위치 설정 (텍스트 박스 오른쪽 아래)
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(45, 50, 60)); // 버튼 배경과 동일하게 설정
        buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT)); // 오른쪽 정렬
        buttonPanel.add(triangleButton);

        textPanel.add(buttonPanel, BorderLayout.SOUTH);
        layeredPane.add(textPanel, Integer.valueOf(2)); // 상위 레이어에 텍스트 패널 추가

        // 화면 출력
        frame.setVisible(true);
    }

    // 이미지 라벨 생성 함수
    private static JLabel createImageLabel(String imagePath, int width, int height, int x, int y) {
        ImageIcon imageIcon = new ImageIcon(imagePath);
        Image image = imageIcon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        JLabel label = new JLabel(new ImageIcon(image));
        label.setBounds(x, y, width, height);
        return label;
    }

    private static void selectCriminal(JFrame selectCriminalFrame) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // 메인 프레임 생성
        JFrame criminalFrame = new JFrame();
        criminalFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        criminalFrame.setSize(screenSize.width, screenSize.height);
        criminalFrame.getContentPane().setBackground(Color.black);
        criminalFrame.setLayout(null);

        // 대화 상자 패널 생성
        JPanel dialogPanel = new JPanel();
        dialogPanel.setBackground(new Color(43, 51, 57)); // 진한 회색 배경

        // 패널 크기
        int panelWidth = 700;
        int panelHeight = 400;

        // 패널 위치 계산 (중앙 배치)
        int x = (screenSize.width - panelWidth) / 2; // 화면 중심 X 좌표
        int y = (screenSize.height - panelHeight) / 2; // 화면 중심 Y 좌표
        dialogPanel.setBounds(x, y, panelWidth, panelHeight); // 화면 중심에 패널 배치
        dialogPanel.setLayout(null);

        // 텍스트 라벨 생성
        JLabel textLabel = new JLabel("\n범인을 맞추러 가시겠습니까?");
        textLabel.setForeground(Color.LIGHT_GRAY); // 텍스트 색상 설정
        textLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 30)); // 폰트 크기 증가
        textLabel.setHorizontalAlignment(SwingConstants.CENTER); // 가운데 정렬

        // 텍스트 라벨 위치 설정
        int labelWidth = 500;
        int labelHeight = 50;
        int labelX = (panelWidth - labelWidth) / 2; // 패널 내부 중앙 X 좌표
        int labelY = 50; // 패널 내부 Y 좌표
        textLabel.setBounds(labelX, labelY, labelWidth, labelHeight);

        // TriangleButton 생성
        TriangleButton button = new TriangleButton();
        int buttonWidth = 30; // 버튼 너비
        int buttonHeight = 30; // 버튼 높이

        button.setBounds(screenSize.width /2 , screenSize.height /2, buttonWidth, buttonHeight); // 버튼 위치 설정
        button.setBackground(new Color(43, 51, 57)); // 버튼 배경색 설정
        button.setForeground(Color.LIGHT_GRAY); // 삼각형 색상 설정
        button.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "버튼 클릭됨!"); // 클릭 시 메시지 표시
        });

        // 버튼과 텍스트를 패널에 추가
        dialogPanel.add(textLabel); // 텍스트 추가
        dialogPanel.add(button);    // 버튼 추가
        criminalFrame.add(dialogPanel);

        // 프레임 표시
        criminalFrame.setExtendedState(JFrame.MAXIMIZED_BOTH); // 전체 화면 크기로 설정
        criminalFrame.setVisible(true);
    }
}