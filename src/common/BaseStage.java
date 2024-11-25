package common;

import javax.swing.*;
import java.awt.*;

public abstract class BaseStage extends JFrame {
    protected CardLayout cardLayout;
    protected JPanel mainPanel;

    // UI 컴포넌트
    protected JLabel profileNameLabel;
    protected JLabel profileImageLabel;
    protected JLabel dialogueText;
    protected JLabel characterImageLabel;
    protected JLabel backgroundImage;
    protected JPanel dialogueBox;
    protected SceneData[] storyData;
    protected int currentSceneIndex = 0;

    // 크기와 위치 상수
    protected static final int WINDOW_WIDTH = 1440;
    protected static final int WINDOW_HEIGHT = 1024;
    protected static final int PROFILE_X = 62, PROFILE_Y = 574, PROFILE_WIDTH = 130, PROFILE_HEIGHT = 134;
    protected static final int NAME_X = 242, NAME_Y = 628, NAME_WIDTH = 133, NAME_HEIGHT = 48;
    protected static final int DIALOGUE_BOX_X = 42, DIALOGUE_BOX_Y = 737, DIALOGUE_BOX_WIDTH = 1356, DIALOGUE_BOX_HEIGHT = 245;
    protected static final int DIALOGUE_TEXT_X = 20, DIALOGUE_TEXT_Y = 20, DIALOGUE_TEXT_WIDTH = 1300, DIALOGUE_TEXT_HEIGHT = 200;
    protected static final int CHARACTER_X = 916, CHARACTER_Y = 101, CHARACTER_WIDTH = 410, CHARACTER_HEIGHT = 1130;
    protected static final int NEXTBTN_X = 1279, NEXTBTN_Y = 160, NEXTBTN_WIDTH = 45, NEXTBTN_HEIGHT = 45;

    protected JLabel nextBtn;
    protected ImageIcon nextBtnImg = new ImageIcon("images/characters/다음버튼.png");

    public BaseStage(String title) {
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        add(mainPanel);
        initializeComponents();
    }

    private void initializeComponents() {
        // 프로필 이름 설정
        profileNameLabel = new JLabel();
        profileNameLabel.setFont(new Font("VT323", Font.PLAIN, 48));
        profileNameLabel.setForeground(Color.WHITE);
        profileNameLabel.setBounds(NAME_X, NAME_Y, NAME_WIDTH, NAME_HEIGHT);

        // 프로필 이미지 설정
        profileImageLabel = new JLabel();
        profileImageLabel.setBounds(PROFILE_X, PROFILE_Y, PROFILE_WIDTH, PROFILE_HEIGHT);

        // 캐릭터 이미지 설정
        characterImageLabel = new JLabel();
        characterImageLabel.setBounds(CHARACTER_X, CHARACTER_Y, CHARACTER_WIDTH, CHARACTER_HEIGHT);

        // 대화 상자 설정
        dialogueBox = new JPanel(null);
        dialogueBox.setBackground(new Color(0x333C41));
        dialogueBox.setBounds(DIALOGUE_BOX_X, DIALOGUE_BOX_Y, DIALOGUE_BOX_WIDTH, DIALOGUE_BOX_HEIGHT);

        // 대화 텍스트 설정
        dialogueText = new JLabel();
        dialogueText.setFont(new Font("VT323", Font.PLAIN, 36));
        dialogueText.setForeground(Color.WHITE);
        dialogueText.setBackground(new Color(0x333C41)); // 배경색을 대화 상자와 일치
        dialogueText.setBounds(DIALOGUE_TEXT_X, DIALOGUE_TEXT_Y, DIALOGUE_TEXT_WIDTH, DIALOGUE_TEXT_HEIGHT);
        dialogueText.setVerticalAlignment(SwingConstants.TOP);
        dialogueBox.add(dialogueText);

        // "다음" 버튼 설정
        nextBtn = new JLabel(nextBtnImg);
        nextBtn.setBounds(NEXTBTN_X, NEXTBTN_Y, NEXTBTN_WIDTH, NEXTBTN_HEIGHT);
        BlinkingBtnRunnable btnRunnable = new BlinkingBtnRunnable(nextBtn);
        Thread nextBtnThread = new Thread(btnRunnable);
        nextBtnThread.start();
        dialogueBox.add(nextBtn);

        // 배경 이미지 설정
        // 공간만 확보한다.
        backgroundImage = new JLabel();
    }

    protected JPanel createDialogueScene() {
        JPanel dialogueScene = new JPanel(null);
        dialogueScene.setBackground(Color.BLACK);
        dialogueScene.add(profileNameLabel);
        dialogueScene.add(profileImageLabel);
        dialogueScene.add(characterImageLabel);
        dialogueScene.add(dialogueBox);
        dialogueScene.add(backgroundImage);

        // 리스너 설정
        DialogueBoxListener listener = new DialogueBoxListener(this::updateScene);
        dialogueScene.addMouseListener(listener);
        dialogueScene.addKeyListener(listener);
        dialogueScene.setFocusable(true);
        dialogueScene.requestFocusInWindow();

        // Z-Index 조정
        SwingUtilities.invokeLater(() -> {
            dialogueBox.setComponentZOrder(nextBtn,0); // "다음" 버튼을 대화 상자 위에 표시
            dialogueScene.setComponentZOrder(dialogueBox, 1); // 대화 상자를 두 번째 표시
            dialogueScene.setComponentZOrder(characterImageLabel, 2); // 캐릭터 이미지를 세 번째 표시
        });
        return dialogueScene;
    }

    protected abstract void initStoryData();

    protected void updateScene() {
        if (currentSceneIndex < storyData.length) {
            SceneData currentScene = storyData[currentSceneIndex];

            profileNameLabel.setText(currentScene.getProfileName());
            profileNameLabel.setVisible(currentScene.getProfileName() != null);

            profileImageLabel.setIcon(currentScene.getProfileImage());
            profileImageLabel.setVisible(currentScene.getProfileImage() != null);

            ImageIcon scaledCharacterImage = scaleImageIcon(currentScene.getCharacterImage(), CHARACTER_WIDTH, CHARACTER_HEIGHT);
            characterImageLabel.setIcon(scaledCharacterImage);
            characterImageLabel.setVisible(currentScene.getCharacterImage() != null);

            // 예외 처리가 안되어 있다.
            // 대화 내용이 없을 경우 대화 상자가 없어야 한다.
            String dialogue = currentScene.getDialogue();
            if (dialogue != null && !dialogue.trim().isEmpty()) {
                dialogue = "<html>" + dialogue.replace("\n", "<br>") + "</html>";
                dialogueText.setText(dialogue);
                dialogueText.setVisible(true);
            } else {
                dialogueText.setVisible(false);
            }
            boolean hasDialogue = dialogue != null && !dialogue.trim().isEmpty();

            dialogueBox.setVisible(hasDialogue);
            nextBtn.setVisible(hasDialogue);

            backgroundImage.setIcon(currentScene.getBackgroundImage());

            currentSceneIndex++;
        } else {
            System.out.println("스토리가 끝났습니다!");
        }
    }

    private ImageIcon scaleImageIcon(ImageIcon icon, int width, int height) {
        if (icon == null) return null;
        Image scaledImage = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(scaledImage);
    }
}
