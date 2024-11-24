package stage1;

import java.awt.*;
import javax.swing.*;

class BlinkingBtnRunnable implements Runnable{
    private JLabel nextBtn;
    private boolean  visible = true;

    public BlinkingBtnRunnable(JLabel nextBtn){
        this.nextBtn = nextBtn;
    }
    @Override
    public void run() {
        while (true){
            SwingUtilities.invokeLater(() -> nextBtn.setVisible(visible));
            visible = !visible;
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();;
                return;
            }
        }

    }
}

public class Stage1 extends JFrame {
    private CardLayout cardLayout;
    private JPanel mainPanel;

    // 크기 및 위치 관련 상수
    private static final int WINDOW_WIDTH = 1440;
    private static final int WINDOW_HEIGHT = 1024;

    // 프로필 사진
    private static final int PROFILE_X = 62;
    private static final int PROFILE_Y = 574;
    private static final int PROFILE_WIDTH = 130;
    private static final int PROFILE_HEIGHT = 134;

    // 프로필 이름
    private static final int NAME_X = 242;
    private static final int NAME_Y = 628;
    private static final int NAME_WIDTH = 133;
    private static final int NAME_HEIGHT = 48;

    // 대화 상자
    private static final int DIALOGUE_BOX_X = 42;
    private static final int DIALOGUE_BOX_Y = 737;
    private static final int DIALOGUE_BOX_WIDTH = 1356;
    private static final int DIALOGUE_BOX_HEIGHT = 245;

    // 대화 텍스트
    private static final int DIALOGUE_TEXT_X = 20;
    private static final int DIALOGUE_TEXT_Y = 20;
    private static final int DIALOGUE_TEXT_WIDTH = 1300;
    private static final int DIALOGUE_TEXT_HEIGHT = 50;

    // 이미지 장면
    private static final int IMAGE_X = 0;
    private static final int IMAGE_Y = 0;
    private static final int IMAGE_WIDTH = 1440;
    private static final int IMAGE_HEIGHT = 1024;

    // 다음버튼
    private static final int NEXTBTN_X = 1279;
    private static final int NEXTBTN_Y = 160;
    private static final int NEXTBTN_WIDTH = 45;
    private static final int NEXTBTN_HEIGHT = 45;

    ImageIcon nextBtnImg = new ImageIcon("images/characters/다음버튼.png");
    JLabel nextBtn;

    public Stage1() {
        setTitle("Stage1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // CardLayout 설정
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        // 각 장면 패널 추가
        JPanel dialogueScene = createDialogueScene(); // 대화 장면 생성
        JPanel imageScene = createImageScene();       // 이미지 장면 생성

        mainPanel.add(dialogueScene, "DialogueScene");
        mainPanel.add(imageScene, "ImageScene");

        // 메인 패널 설정
        add(mainPanel);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setVisible(true);

        // 초기 장면 설정, 대화 장면을 초기 장면으로 설정.
        switchToScene("DialogueScene");
    }

    // 대화 장면 생성
    private JPanel createDialogueScene() {
        JPanel dialogueScene = new JPanel(null); // 절대 레이아웃
        dialogueScene.setBackground(Color.BLACK);

        // 프로필 사진
        JLabel profileJihoon = new JLabel(new ImageIcon("images/characters/프_지훈.png"));
        profileJihoon.setBounds(PROFILE_X, PROFILE_Y, PROFILE_WIDTH, PROFILE_HEIGHT);
        dialogueScene.add(profileJihoon);

        // 프로필 이름
        JLabel prfileName = new JLabel("명지훈");
        prfileName.setFont(new Font("VT323", Font.PLAIN, 48));
        prfileName.setForeground(Color.WHITE);
        prfileName.setBounds(NAME_X, NAME_Y, NAME_WIDTH, NAME_HEIGHT);
        dialogueScene.add(prfileName);

        // 대화 상자
        JPanel dialogueBox = new JPanel(null);
        dialogueBox.setBackground(new Color(0x333C41));
        dialogueBox.setBounds(DIALOGUE_BOX_X, DIALOGUE_BOX_Y, DIALOGUE_BOX_WIDTH, DIALOGUE_BOX_HEIGHT);

        // 대화 내용
        JLabel dialogueText = new JLabel("먼저 사교관에서 성하의 흔적들을 찾아보자.");
        dialogueText.setFont(new Font("VT323", Font.PLAIN, 36));
        dialogueText.setForeground(Color.WHITE);
        dialogueText.setBounds(DIALOGUE_TEXT_X, DIALOGUE_TEXT_Y, DIALOGUE_TEXT_WIDTH, DIALOGUE_TEXT_HEIGHT);
        dialogueBox.add(dialogueText);

        // 다음 버튼
        nextBtn = new JLabel(nextBtnImg);
        nextBtn.setBounds(NEXTBTN_X,NEXTBTN_Y,NEXTBTN_WIDTH, NEXTBTN_HEIGHT);
        // 깜밖거리는 버튼으로 만들기. 스레드를 이용할까?
        // 스레드를 이용한다면 상관없이 깜밖거릴 수 있지 않을까?
        BlinkingBtnRunnable btnRunnable = new BlinkingBtnRunnable(nextBtn);
        Thread nextBtnThread = new Thread(btnRunnable);
        nextBtnThread.start();
        dialogueBox.add(nextBtn);

        dialogueScene.add(dialogueBox);

        // 리스너 설정
        // 마우스 클릭 시 다음 장면으로 전환
        // space bar, enter 키 클릭시 다음 장면으로 전환
        return dialogueScene;
    }

    // 이미지 장면 생성
    private JPanel createImageScene() {
        JPanel imageScene = new JPanel(null); // 절대 레이아웃
        imageScene.setBackground(Color.BLACK);

        // 이미지 추가
        JLabel imageLabel = new JLabel(new ImageIcon("images/stage1/학교.png"));
        imageLabel.setBounds(IMAGE_X, IMAGE_Y, IMAGE_WIDTH, IMAGE_HEIGHT); // 이미지 크기와 위치 설정
        imageScene.add(imageLabel);

        return imageScene;
    }

    // 장면 전환 메서드
    public void switchToScene(String sceneName) {
        cardLayout.show(mainPanel, sceneName);
    }

    public static void main(String[] args) {
        Stage1 stage1 = new Stage1();

        // 3초 후 이미지 장면으로 전환 (테스트용)
        // 리스너를 통해 클릭시 변화도록 만들어야 할것.
//        new Timer(3000, e -> stage1.switchToScene("ImageScene")).start();
    }

}
