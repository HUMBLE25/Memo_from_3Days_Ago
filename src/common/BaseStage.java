package common;

//import stage2.Stage2;

import javax.swing.*;
import java.awt.*;

public abstract class BaseStage extends JPanel {
    protected CardLayout cardLayout;
    protected JPanel mainPanel;
 
    // UI 컴포넌트
    protected JPanel dialogueScene; // 대화 장면, 바탕이 되는 JPanel
    protected JLabel profileNameLabel;
    protected JLabel profileImageLabel;
    protected JLabel dialogueText;
    protected JLabel mainCharacterImageLabel;
    protected JLabel subCharacterImageLabel;
    protected JLabel backgroundImage;
    protected JPanel dialogueBox;
    protected SceneData[] storyData;
    protected int currentSceneIndex = 0;

    // 크기와 위치 상수
    protected static final int WINDOW_WIDTH = 1440;
    protected static final int WINDOW_HEIGHT = 1024;
    protected static final int PROFILE_X = 62, PROFILE_Y = 574, PROFILE_WIDTH = 130, PROFILE_HEIGHT = 134;
    protected static final int NAME_X = 242, NAME_Y = 628, NAME_WIDTH = 240, NAME_HEIGHT = 48;
    protected static final int DIALOGUE_BOX_X = 42, DIALOGUE_BOX_Y = 737, DIALOGUE_BOX_WIDTH = 1356, DIALOGUE_BOX_HEIGHT = 245;
    protected static final int DIALOGUE_TEXT_X = 20, DIALOGUE_TEXT_Y = 20, DIALOGUE_TEXT_WIDTH = 1300, DIALOGUE_TEXT_HEIGHT = 200;
    protected static final int CHARACTER_X = 916, CHARACTER_Y = 0, CHARACTER_WIDTH = 410, CHARACTER_HEIGHT = 1130, SUB_CHARACTER_X =274;
    protected static final int NEXTBTN_X = 1279, NEXTBTN_Y = 160, NEXTBTN_WIDTH = 45, NEXTBTN_HEIGHT = 45;

    protected JLabel nextBtn;
    protected ImageIcon nextBtnImg = new ImageIcon("images/characters/다음버튼.png");
    DialogueBoxListener listener = new DialogueBoxListener(this::updateScene);
    public BaseStage(JPanel mainPanel, CardLayout cardLayout) {
//        setTitle(title);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.mainPanel = mainPanel;
        this.cardLayout = cardLayout;
        setLayout(null); // 절대 배치
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT); // 윈도우 크기 설정

//        cardLayout = new CardLayout();
//        mainPanel = new JPanel(cardLayout);

//        add(mainPanel); // 메인 패널을 JFrame에 추가
        initializeComponents(); // 모든 컴포넌트 초기화
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

        // 메인 캐릭터 이미지 설정
        mainCharacterImageLabel = new JLabel();
        mainCharacterImageLabel.setBounds(CHARACTER_X, CHARACTER_Y, CHARACTER_WIDTH, CHARACTER_HEIGHT);

        // 서브 캐릭터 이미지 설정
        subCharacterImageLabel = new JLabel();
        subCharacterImageLabel.setBounds(274, CHARACTER_Y, CHARACTER_WIDTH, CHARACTER_HEIGHT);

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
        backgroundImage = new JLabel();
    }

    protected JPanel createDialogueScene() {
        // 대화 장면 설정
        dialogueScene = new JPanel(null);
        dialogueScene.setBackground(Color.BLACK);

        // 프로필 이름 붙이기
        dialogueScene.add(profileNameLabel);

        // 프로필 이미지 붙이기
        dialogueScene.add(profileImageLabel);

        // 메인 캐릭터 이미지 붙이기
        dialogueScene.add(mainCharacterImageLabel);

        // 서브 캐릭터 이미지 붙이기
        dialogueScene.add(subCharacterImageLabel);

        // 대화 상자 붙이기
        dialogueScene.add(dialogueBox);

        // 배경 이미지 붙이기
        dialogueScene.add(backgroundImage);

        // 리스너 설정
        dialogueScene.addMouseListener(listener);
        dialogueScene.addKeyListener(listener);
        dialogueScene.setFocusable(true);
        dialogueScene.requestFocusInWindow();

        // Z-Index 조정
        SwingUtilities.invokeLater(() -> {
            dialogueBox.setComponentZOrder(nextBtn,0); // "다음" 버튼을 대화 상자 위에 표시
            dialogueScene.setComponentZOrder(dialogueBox, 1); // 대화 상자를 두 번째 표시
            dialogueScene.setComponentZOrder(mainCharacterImageLabel, 2); // 캐릭터 이미지를 세 번째 표시
            dialogueScene.setComponentZOrder(subCharacterImageLabel, 2); // 캐릭터 이미지를 세 번째 표시
        });
        return dialogueScene;
    }

    protected void updateScene() {
        if (currentSceneIndex < storyData.length) {
            SceneData currentScene = storyData[currentSceneIndex];

            // 프로필 이름 업데이트
            profileNameLabel.setText(currentScene.getProfileName());
            profileNameLabel.setVisible(currentScene.getProfileName() != null);

            // 프로필 이미지 업데이트
            ImageIcon scaledProfileImage = scaleImageIcon(currentScene.getProfileImage(), PROFILE_WIDTH,PROFILE_HEIGHT);
            profileImageLabel.setIcon(scaledProfileImage);
            profileImageLabel.setVisible(currentScene.getProfileImage() != null);

            // 캐릭터 이미지 업데이트
            // mainCharacterImage만 받았을 경우와 subCharacterImage를 받았을 경우를 나누자.
            // 서브 캐릭터 초기화가 안됨.
            ImageIcon SubCharacterImage = currentScene.getSubCharacterImage();
            if (SubCharacterImage == null){ // SubCharacterImage가 null 일 경우
//                ImageIcon scaledCharacterImage = scaleImageIcon(currentScene.getMainCharacterImage(), CHARACTER_WIDTH, CHARACTER_HEIGHT);
                ImageIcon scaledCharacterImage = currentScene.getMainCharacterImage(); // 이미지 리사이징 미적용
                mainCharacterImageLabel.setIcon(scaledCharacterImage); // 크기 조정된 이미지 설정
                mainCharacterImageLabel.setVisible(currentScene.getMainCharacterImage() != null); // null이면 false로 보이지 않는다.
                subCharacterImageLabel.setVisible(currentScene.getSubCharacterImage() != null);
            } else {
                // 이때 둘의 간격을 정해두자.
                // CHARACTER_X만 바꾸면 된다.
                // MAIN_CHARACTER_X = 832
                // SUB_CHARACTER_X = 274
//                ImageIcon scaledMainCharacterImage = scaleImageIcon(currentScene.getMainCharacterImage(), CHARACTER_WIDTH, CHARACTER_HEIGHT);
                ImageIcon scaledMainCharacterImage = currentScene.getMainCharacterImage();
                mainCharacterImageLabel.setIcon(scaledMainCharacterImage); // 크기 조정된 이미지 설정
                mainCharacterImageLabel.setVisible(currentScene.getMainCharacterImage() != null);
                mainCharacterImageLabel.setLocation(832,CHARACTER_Y);

//                ImageIcon scaledSubCharacterImage = scaleImageIcon(SubCharacterImage, CHARACTER_WIDTH, CHARACTER_HEIGHT);
                ImageIcon scaledSubCharacterImage = SubCharacterImage;
                subCharacterImageLabel.setIcon(scaledSubCharacterImage); // 크기 조정된 이미지 설정
                subCharacterImageLabel.setVisible(currentScene.getSubCharacterImage() != null);
            }

            // 대화 텍스트 업데이트
            String dialogue = currentScene.getDialogue();
            if (dialogue != null && !dialogue.trim().isEmpty()) {
                // HTML 태그를 추가하여 줄바꿈 지원
                dialogue = "<html>" + dialogue.replace("\n", "<br>") + "</html>";
                dialogueText.setText(dialogue);
                dialogueText.setVisible(true);
            } else {
                dialogueText.setVisible(false);
            }

            // 대화 내용 유무에따른 대화 상자, 버튼 유무 결정
            boolean hasDialogue = dialogue != null && !dialogue.trim().isEmpty(); // 대화 내용이 있다면 대화 상자, 다음 버튼 표시
            dialogueBox.setVisible(hasDialogue); // 대화 상자를 숨기거나 표시
            nextBtn.setVisible(hasDialogue); // "다음" 버튼을 숨기거나 표시

            centerBackgroundImage(currentScene.getBackgroundImage());

            currentSceneIndex++;
        } else {
            System.out.println("스토리가 끝났습니다!");
            // 가능하다. 오버라이딩을 할 수 있나..
            // 문제는 프레임을 여러개 띄우개 된다. 프레임은 고정하고 데이터만 교체하는 방법을 생각해보자.
            // dispose(); 지금의 화면을 제거하고 새로운 화면을 띄운다.
            moveToNextStage(); // 스토리가 끝났을 때 다음 스테이지로 전환
            musicPlayer(); // 스토리가 끝났을때 다음 노래 재생
        }

    }

    // 헬퍼 메서드: ImageIcon을 지정된 크기로 조정
    // 크기 보다는 Y좌표의 값만 수정하면 된다.
//    private ImageIcon scaleImageIcon(ImageIcon icon, int width, int height) {
//        if (icon == null) return null; // 이미지가 없을 경우 null 반환
//        Image scaledImage = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
//        return new ImageIcon(scaledImage); // 조정된 Image를 새로운 ImageIcon으로 반환
//    }

    // 헬퍼 메서드: ImageIcon을 지정된 크기로 조정
    private ImageIcon scaleImageIcon(ImageIcon icon, int width, int height) {
        if (icon == null) return null; // 이미지가 없을 경우 null 반환
        Image scaledImage = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(scaledImage); // 조정된 Image를 새로운 ImageIcon으로 반환
    }


    // 헬퍼 메서드: 배경 이미지를 원본 크기로 중앙에 배치
    private void centerBackgroundImage(ImageIcon icon) {
        if (icon == null) {
            backgroundImage.setIcon(null); // 이미지가 없으면 비우기
            return;
        }

        // 원본 이미지 크기를 가져옴
        int imageWidth = icon.getIconWidth();
        int imageHeight = icon.getIconHeight();

        // 중앙 좌표 계산
        int x = (WINDOW_WIDTH - imageWidth) / 2;
        int y = (WINDOW_HEIGHT - imageHeight) / 2;

        // 이미지 설정 및 위치 지정
        backgroundImage.setIcon(icon);
        backgroundImage.setBounds(x, y, imageWidth, imageHeight);
    }

    private void moveToNextStage() {
        String nextStageName = getNextStageName();
        cardLayout.show(mainPanel, nextStageName);
    }

    protected abstract void initStoryData(); // Stage 스토리 초기화
    protected abstract String getNextStageName(); // 각 Stage의 다름 Stage이름 반환
    protected void musicPlayer(){}; // 각 Stage의 다름 Stage이름 반환


}
