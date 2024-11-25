package stage3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Stage3MJH_KDJ extends JFrame {

    // 텍스트 배열 및 인덱스 관리
    String[] texts1_6 = {
            "..김도진?", "뭐야, 누구야?", "..난 성하 친구 명지훈이라고 해.", "성하..? 문성하? 그 자식 친구가 왜 날 찾아와?", "성하에 대해 물어볼 게 있어.","그 자식 얘기라면 듣고 싶지도 않으니까 가라"
    };
    String[] texts7 = {
            "........."
    };

    String[] texts8 = {
            "솔직히 좀 많이 무섭지만 물러나면 안 된다.. 성하를 생각하자."
    };

    String[] texts7 = {
            "........."
    };

    int currentIndex = 0;

    public Stage3MJH_KDJ() {
        setSize(1440, 1024);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);

        // 첫 번째 캐릭터 이미지 추가
        ImageIcon icon1 = new ImageIcon("images/characters/명지훈_왼쪽.png");
        Image characterImage1 = icon1.getImage().getScaledInstance(300, 900, Image.SCALE_SMOOTH);
        JLabel characterLabel1 = new JLabel(new ImageIcon(characterImage1));
        characterLabel1.setBounds(550, 200, 300, 900); // 첫 번째 캐릭터 위치 설정


        // 두 번째 캐릭터 이미지 추가
        ImageIcon icon2 = new ImageIcon("images/characters/도진.png");
        Image characterImage2 = icon2.getImage().getScaledInstance(300, 900, Image.SCALE_SMOOTH);
        JLabel characterLabel2 = new JLabel(new ImageIcon(characterImage2));
        characterLabel2.setBounds(1000, 200, 300, 900); // 두 번째 캐릭터 위치 설정


        // 텍스트 박스 패널 설정
        JPanel textBoxPanel = new JPanel();
        textBoxPanel.setBackground(new Color(55, 67, 79)); // 텍스트 박스 배경색 설정
        textBoxPanel.setBounds(42, 740, 1356, 220); // 텍스트 박스 위치와 크기 조정 (더 아래쪽으로)
        textBoxPanel.setLayout(null); // 패널 레이아웃을 null로 설정 (절대 위치)

        // 텍스트 라벨 설정 (초기 텍스트 표시)
        JLabel textLabel = new JLabel(texts[currentIndex]); // 배열의 첫 번째 텍스트를 표시
        textLabel.setForeground(Color.WHITE);
        textLabel.setFont(new Font("Serif", Font.PLAIN, 30)); // 폰트 크기 설정
        textLabel.setBounds(40, 32, 1200, 50); // 텍스트 위치 설정 (박스 내부 기준)

        // 오른쪽 하단 버튼 (▶ 모양)
        JButton nextButton = new JButton("▶");
        nextButton.setForeground(Color.LIGHT_GRAY);
        nextButton.setContentAreaFilled(false); // 버튼 배경 제거
        nextButton.setBorderPainted(false); // 버튼 테두리 제거
        nextButton.setBounds(1300, 160, 40, 30); // 버튼 위치 설정 (텍스트 박스 내부 기준)

        // 텍스트 박스에 텍스트와 버튼 추가
        textBoxPanel.add(textLabel);
        textBoxPanel.add(nextButton);

        // 이미지 불러오기 (작은 얼굴 사진)
        ImageIcon characterIcon = new ImageIcon("images/characters/프_지훈.png"); // 이미지 경로 변경
        JLabel characterLabel = new JLabel(characterIcon);
        characterLabel.setBounds(62, 574, characterIcon.getIconWidth(), characterIcon.getIconHeight()); // 이미지 위치 조정

        // 이름 불러오기
        JLabel nameLabel = new JLabel("명지훈");
        nameLabel.setForeground(Color.WHITE);
        nameLabel.setFont(new Font("Serif", Font.PLAIN, 35)); // 폰트 크기 설정
        nameLabel.setBounds(210, 630, 120, 40); // 이름 라벨의 위치 설정 (캐릭터 이미지 옆)

        // 프레임에 이미지와 이름 추가
        add(characterLabel);
        add(nameLabel);
        add(textBoxPanel);

        add(characterLabel1); // 프레임에 추가
        add(characterLabel2); // 프레임에 추가

        // 엔터 키 이벤트 설정
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    // 다음 텍스트로 업데이트
                    currentIndex = (currentIndex + 1) % texts.length;
                    textLabel.setText(texts[currentIndex]);
                }
            }
        });

        setFocusable(true); // 키 이벤트를 받기 위해 포커스를 설정
        setVisible(true);

    }

    public static void main(String[] args) {
        new Stage3MJH_KDJ();
    }
}
