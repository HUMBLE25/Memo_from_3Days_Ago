package ending;

import common.BlinkingBtnRunnable;
import common.GradientPanel;
import common.ImageRegistry;
import common.MusicController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EndingSelectMurder extends JPanel {
    private CardLayout cardLayout;
    private JPanel mainPanel;
    protected ImageIcon nextBtnImg = new ImageIcon("images/characters/다음버튼.png");

    private final ImageIcon profileJiHo = ImageRegistry.getImage("character_프_지호");
    private final ImageIcon profileDoJin = ImageRegistry.getImage("character_프_도진");
    private final ImageIcon profileSeongHa = ImageRegistry.getImage("character_프_명호");
    private final ImageIcon profileSeongMin = ImageRegistry.getImage("character_프_성민");

    private Color startColor = new Color(0x06213B); // start color for the gradation
    private Color endColor = new Color(0x020919);// end color for the gradation

    public EndingSelectMurder(JPanel mainPanel, CardLayout cardLayout) {
        this.mainPanel = mainPanel;
        this.cardLayout = cardLayout;

        // 배경색 설정
        setLayout(null);
        setBackground(Color.BLACK);

        // 질문 박스 그라데이션 배경색
        JPanel questionBox = new GradientPanel(startColor, endColor);
        questionBox.setLayout(null);
        questionBox.setBounds(86, 149, 1268, 727); // 적절한 위치와 크기 설정

        // 질문
        JLabel question = new JLabel();
        question.setText("그를 죽인 범인은 누구인가요?");
        question.setFont(new Font("Anonymous Pro", Font.PLAIN, 36));
        question.setForeground(Color.WHITE);
        question.setBackground(new Color(0x333C41)); // 배경색을 대화 상자와 일치
        question.setVisible(true);
        question.setBounds(373,194, 543, 56);

        questionBox.add(question);
        // 프로필 아이콘 추가
        JLabel jiHoIcon = createProfileIcon(profileJiHo, "EndingAnswer", 112, 343); // 천지호
        JLabel doJinIcon = createProfileIcon(profileDoJin, "EndingWrongAnswer", 397, 343); // 김도진
        JLabel seongHaIcon = createProfileIcon(profileSeongHa, "EndingWrongAnswer", 695, 343); // 전명호
        JLabel seongMinIcon = createProfileIcon(profileSeongMin, "EndingWrongAnswer", 979, 343); // 금성민

        questionBox.add(jiHoIcon);
        questionBox.add(doJinIcon);
        questionBox.add(seongHaIcon);
        questionBox.add(seongMinIcon);


        // 다음 버튼
        JLabel nextBtn = new JLabel(nextBtnImg);
        nextBtn.setBounds(1170, 50, 45, 45);
        BlinkingBtnRunnable btnRunnable = new BlinkingBtnRunnable(nextBtn);
        Thread nextBtnThread = new Thread(btnRunnable);
        nextBtnThread.start();

        add(nextBtn);
        add(questionBox);
    }

    // 프로필 생성
    private JLabel createProfileIcon(ImageIcon icon, String nextSceneName, int x, int y) {
        JLabel profileLabel = new JLabel(icon);
        profileLabel.setBounds(x, y, 216, 222); // 프로필 이미지 크기 및 위치
        profileLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        profileLabel.addMouseListener(new ProfileClickListener(nextSceneName));
        return profileLabel;
    }

    private class ProfileClickListener extends MouseAdapter {
        private final String nextSceneName;

        public ProfileClickListener(String nextSceneName) {

            this.nextSceneName = nextSceneName;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            if(nextSceneName.equals("EndingWrongAnswer")){
                // ending.mp3 중지
//                MusicController.getInstance().playMusic("music/ending.mp3",false);
                // 오답 음악 재생
                MusicController.getInstance().playMusic("music/not_answer.mp3",true);
            }else {
                // ending.mp3 중지
//                MusicController.getInstance().playMusic("music/ending.mp3",false);
                // 정답 음악 재생
                MusicController.getInstance().playMusic("music/answer.mp3",true);
            }
            cardLayout.show(mainPanel, nextSceneName);
        }
    }
}
