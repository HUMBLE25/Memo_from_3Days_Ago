package stage3;

import javax.swing.*;
import java.awt.*;

public class Stage3 extends JFrame{
    public String[] texts = {
                "일단 김도진을 만나야 한다.",
                "아마 체육관에 있지 않을까.."
    };
    public Stage3(){
        setSize(1440, 1024);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);

        // 이미지 불러오기 (작은 얼굴 사진)
        ImageIcon characterIcon = new ImageIcon("images/characters/프_지훈.png"); // 이미지 경로 변경
        JLabel characterLabel = new JLabel(characterIcon);
        characterLabel.setBounds(62, 574, characterIcon.getIconWidth(), characterIcon.getIconHeight()); // 이미지 위치 조정

        //이름 불러오기\
        JLabel nameLabel = new JLabel("명지훈");
        nameLabel.setForeground(Color.WHITE);
        nameLabel.setFont(new Font("Serif", Font.PLAIN, 25)); // 폰트 크기 설정
        nameLabel.setBounds(200, 510, 100, 30); // 이름 라벨의 위치 설정 (캐릭터 이미지 옆)

        // 텍스트 박스 패널 설정
        JPanel textBoxPanel = new JPanel();
        textBoxPanel.setBackground(new Color(55, 67, 79)); // 텍스트 박스 배경색 설정
        textBoxPanel.setBounds(42, 734, 1356, 162); // 텍스트 박스 위치와 크기 설정
        textBoxPanel.setLayout(null); // 패널 레이아웃도 null로 설정 (절대 위치)

        // 텍스트 라벨 설정 (배열의 텍스트를 결합하여 표시)
        String fullText = String.join(" ", texts); // 배열의 문자열을 하나로 결합
        JLabel textLabel = new JLabel(fullText); // 텍스트 설정
        textLabel.setForeground(Color.WHITE);
        textLabel.setFont(new Font("Serif", Font.PLAIN, 24)); // 폰트 크기 설정
        textLabel.setBounds(127, 32, 1200, 30); // 텍스트 위치 설정 (박스 내부 기준)

        // 오른쪽 하단 버튼 (▶ 모양)
        JButton nextButton = new JButton("▶");
        nextButton.setForeground(Color.LIGHT_GRAY);
        nextButton.setContentAreaFilled(false); // 버튼 배경 제거
        nextButton.setBorderPainted(false); // 버튼 테두리 제거
        nextButton.setBounds(1300, 120, 40, 30); // 버튼 위치 설정 (텍스트 박스 내부 기준)

        // 텍스트 박스에 텍스트와 버튼 추가
        textBoxPanel.add(textLabel);
        textBoxPanel.add(nextButton);

        // 프레임에 이미지와 텍스트 박스 추가
        add(characterLabel);
        add(textBoxPanel);
        add(nameLabel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Stage3();
    }

    public void run() {
        System.out.println("Stage 3 Running...");
    }

}
