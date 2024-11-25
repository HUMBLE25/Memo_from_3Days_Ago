package stage1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// SceneData: 각 장면에 필요한 데이터를 저장하는 클래스
class SceneData {
    private String profileName; // 프로필 이름 (장면에 표시되는 캐릭터 이름)
    private ImageIcon profileImage; // 프로필 이미지 (캐릭터 초상화)
    private String dialogue; // 대화 텍스트 (장면에 표시되는 대사)
    private ImageIcon characterImage; // 캐릭터 이미지 (장면에 등장하는 캐릭터의 전체 이미지)
    private ImageIcon backgroundImage; // 배경 이미지 (장면의 배경을 표현하는 이미지)

    // 생성자: SceneData 객체 초기화
    public SceneData(String profileName, ImageIcon profileImage, String dialogue,
                     ImageIcon characterImage, ImageIcon backgroundImage) {
        this.profileName = profileName;
        this.profileImage = profileImage;
        this.dialogue = dialogue;
        this.characterImage = characterImage;
        this.backgroundImage = backgroundImage;
    }

    // Getter 메서드: 각 필드 값 반환
    public String getProfileName() {
        return profileName;
    }

    public ImageIcon getProfileImage() {
        return profileImage;
    }

    public String getDialogue() {
        return dialogue;
    }

    public ImageIcon getCharacterImage() {
        return characterImage;
    }

    public ImageIcon getBackgroundImage() {
        return backgroundImage;
    }
}

// DialogueBoxListener: 대화 상자와 상호작용할 수 있는 리스너
// 마우스 클릭 또는 특정 키 입력(Space, Enter)에 반응하여 다음 장면으로 이동
class DialogueBoxListener extends KeyAdapter implements MouseListener {
    private Runnable updateScene; // 다음 장면으로 이동하기 위한 동작을 정의한 Runnable 객체

    public DialogueBoxListener(Runnable updateScene) {
        this.updateScene = updateScene;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Spacebar 또는 Enter 키 입력 시 다음 장면으로 이동
        if (e.getKeyCode() == KeyEvent.VK_SPACE || e.getKeyCode() == KeyEvent.VK_ENTER) {
            moveToNextScene();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // 대화 상자 클릭 시 다음 장면으로 이동
        moveToNextScene();
    }

    // 다음 장면으로 이동하는 메서드
    private void moveToNextScene() {
        SwingUtilities.invokeLater(updateScene); // UI 업데이트를 안전하게 수행
    }

    // 필요하지 않은 MouseListener 메서드들 구현 (빈 상태)
    @Override public void mousePressed(MouseEvent e) {}
    @Override public void mouseReleased(MouseEvent e) {}
    @Override public void mouseEntered(MouseEvent e) {}
    @Override public void mouseExited(MouseEvent e) {}
}

// BlinkingBtnRunnable: "다음" 버튼이 깜박이도록 하는 스레드
class BlinkingBtnRunnable implements Runnable {
    private JLabel nextBtn; // "다음" 버튼 컴포넌트
    private boolean visible = true; // 버튼 가시성 상태

    public BlinkingBtnRunnable(JLabel nextBtn) {
        this.nextBtn = nextBtn;
    }

    @Override
    public void run() {
        while (true) {
            // 버튼 가시성을 토글 (UI 스레드에서 실행)
            SwingUtilities.invokeLater(() -> nextBtn.setVisible(visible));
            visible = !visible;

            try {
                Thread.sleep(500); // 0.5초 간격으로 가시성 변경
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // 스레드가 중단되면 안전하게 종료
                return;
            }
        }
    }
}

// Stage1: 게임의 한 스테이지를 구성하는 메인 클래스
public class Stage1 extends JFrame {
    private CardLayout cardLayout; // 장면 전환을 위한 레이아웃 관리자
    private JPanel mainPanel; // 모든 장면을 포함하는 메인 패널

    // UI 컴포넌트 (대화 장면에서 사용하는 요소들)
    private JLabel profileNameLabel; // 캐릭터 이름
    private JLabel profileImageLabel; // 캐릭터 프로필 이미지
    private JLabel dialogueText; // 대화 텍스트
    private JLabel characterImageLabel; // 캐릭터 전체 이미지
    private JLabel backgroundImage; // 배경 이미지
    private JPanel dialogueBox;
    // 스토리 데이터와 현재 장면 인덱스
    private SceneData[] storyData; // 장면 데이터를 저장하는 배열
    private int currentSceneIndex = 0; // 현재 표시 중인 장면의 인덱스

    // 크기 및 위치 관련 상수 (화면 배치 조정을 위한 값)
    private static final int WINDOW_WIDTH = 1440;
    private static final int WINDOW_HEIGHT = 1024;

    // UI 배치 좌표 및 크기 상수
    private static final int PROFILE_X = 62;
    private static final int PROFILE_Y = 574;
    private static final int PROFILE_WIDTH = 130;
    private static final int PROFILE_HEIGHT = 134;

    private static final int NAME_X = 242;
    private static final int NAME_Y = 628;
    private static final int NAME_WIDTH = 133;
    private static final int NAME_HEIGHT = 48;

    private static final int DIALOGUE_BOX_X = 42;
    private static final int DIALOGUE_BOX_Y = 737;
    private static final int DIALOGUE_BOX_WIDTH = 1356;
    private static final int DIALOGUE_BOX_HEIGHT = 245;

    private static final int DIALOGUE_TEXT_X = 20;
    private static final int DIALOGUE_TEXT_Y = 20;
    private static final int DIALOGUE_TEXT_WIDTH = 1300;
    private static final int DIALOGUE_TEXT_HEIGHT = 50;

    private static final int IMAGE_X = 0;
    private static final int IMAGE_Y = 0;
    private static final int IMAGE_WIDTH = 1440;
    private static final int IMAGE_HEIGHT = 1024;

    private static final int NEXTBTN_X = 1279;
    private static final int NEXTBTN_Y = 160;
    private static final int NEXTBTN_WIDTH = 45;
    private static final int NEXTBTN_HEIGHT = 45;

    // Stage1 클래스 내 UI 배치 좌표 및 크기 상수
    private static final int CHARACTER_X = 916; // 캐릭터 이미지 X 좌표
    private static final int CHARACTER_Y = 101; // 캐릭터 이미지 Y 좌표
    private static final int CHARACTER_WIDTH = 410; // 캐릭터 이미지 너비
    private static final int CHARACTER_HEIGHT = 1130; // 캐릭터 이미지 높이

    // "다음" 버튼 이미지 및 컴포넌트
    ImageIcon nextBtnImg = new ImageIcon("images/characters/다음버튼.png");
    JLabel nextBtn;

    public Stage1() {
        setTitle("Stage1"); // 윈도우 제목 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기 버튼 동작 설정

        cardLayout = new CardLayout(); // CardLayout 초기화
        mainPanel = new JPanel(cardLayout); // 메인 패널 생성 및 레이아웃 설정

        // 스토리 데이터 초기화
        initStoryData();

        // 대화 장면 생성
        JPanel dialogueScene = createDialogueScene();
        mainPanel.add(dialogueScene, "DialogueScene");

        add(mainPanel); // 메인 패널을 JFrame에 추가
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT); // 윈도우 크기 설정
        setVisible(true); // 윈도우 표시

        // 첫 번째 장면 표시
        updateScene();
    }

    // 스토리 데이터를 초기화하는 메서드
    private void initStoryData() {
        storyData = new SceneData[]{
                new SceneData("명지훈", new ImageIcon("images/characters/프_지훈.png"),
                        "먼저 사교관에서 성하의 흔적들을 찾아보자.", null, null),
                new SceneData(null, null, null,
                        null, new ImageIcon("images/stage1/학교.png")),
                new SceneData("명지훈", new ImageIcon("images/characters/프_지훈.png"),
                        "이제 복도에서 단서를 찾아야 해.", new ImageIcon("images/characters/명지훈_오른쪽.png"), null)
        };
    }
    // 헬퍼 메서드: ImageIcon을 지정된 크기로 조정
    private ImageIcon scaleImageIcon(ImageIcon icon, int width, int height) {
        if (icon == null) return null; // 이미지가 없을 경우 null 반환
        Image scaledImage = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(scaledImage); // 조정된 Image를 새로운 ImageIcon으로 반환
    }

    // 대화 장면을 생성하는 메서드
    private JPanel createDialogueScene() {
        JPanel dialogueScene = new JPanel(null); // 절대 레이아웃 설정
        dialogueScene.setBackground(Color.BLACK); // 배경색 설정

        // 프로필 이름 설정
        profileNameLabel = new JLabel();
        profileNameLabel.setFont(new Font("VT323", Font.PLAIN, 48));
        profileNameLabel.setForeground(Color.WHITE);
        profileNameLabel.setBounds(NAME_X, NAME_Y, NAME_WIDTH, NAME_HEIGHT);
        dialogueScene.add(profileNameLabel);

        // 프로필 이미지 설정
        profileImageLabel = new JLabel();
        profileImageLabel.setBounds(PROFILE_X, PROFILE_Y, PROFILE_WIDTH, PROFILE_HEIGHT);
        dialogueScene.add(profileImageLabel);

        // 캐릭터 이미지 설정
        characterImageLabel = new JLabel();
        characterImageLabel.setBounds(CHARACTER_X,CHARACTER_Y, CHARACTER_WIDTH, CHARACTER_HEIGHT);
        dialogueScene.add(characterImageLabel);

        // 대화 상자 설정
        dialogueBox = new JPanel(null);
        dialogueBox.setBackground(new Color(0x333C41));
        dialogueBox.setBounds(DIALOGUE_BOX_X,DIALOGUE_BOX_Y,DIALOGUE_BOX_WIDTH,DIALOGUE_BOX_HEIGHT);

        // 대화 텍스트 설정
        dialogueText = new JLabel();
        dialogueText.setFont(new Font("VT323", Font.PLAIN, 36));
        dialogueText.setForeground(Color.WHITE);
        dialogueText.setBounds(DIALOGUE_TEXT_X, DIALOGUE_TEXT_Y, DIALOGUE_TEXT_WIDTH, DIALOGUE_TEXT_HEIGHT);
        dialogueBox.add(dialogueText);

        // "다음" 버튼 설정
        nextBtn = new JLabel(nextBtnImg);
        nextBtn.setBounds(NEXTBTN_X, NEXTBTN_Y, NEXTBTN_WIDTH, NEXTBTN_HEIGHT);
        BlinkingBtnRunnable btnRunnable = new BlinkingBtnRunnable(nextBtn);
        Thread nextBtnThread = new Thread(btnRunnable);
        nextBtnThread.start();
        dialogueBox.add(nextBtn);

        // 대화 상자, 장면에 삽입
        dialogueScene.add(dialogueBox);

        // 배경 이미지 설정
        backgroundImage = new JLabel();
        backgroundImage.setBounds(IMAGE_X, IMAGE_Y, IMAGE_WIDTH, IMAGE_HEIGHT);
        dialogueScene.add(backgroundImage);

        // 리스너 설정
        DialogueBoxListener listener = new DialogueBoxListener(this::updateScene);
        dialogueScene.addMouseListener(listener);
        dialogueScene.addKeyListener(listener);
        dialogueScene.setFocusable(true);
        dialogueScene.requestFocusInWindow();

        // Z-Index 조정
        SwingUtilities.invokeLater(() -> {
            dialogueScene.setComponentZOrder(dialogueBox, 0); // 대화 상자를 가장 앞에 표시
            dialogueScene.setComponentZOrder(characterImageLabel, 1); // 캐릭터 이미지를 뒤에 표시
        });
        return dialogueScene;
    }

    // 현재 장면 데이터를 기반으로 UI를 업데이트하는 메서드
    private void updateScene() {
        if (currentSceneIndex < storyData.length) {
            SceneData currentScene = storyData[currentSceneIndex];

            // 프로필 이름 및 이미지 업데이트
            profileNameLabel.setText(currentScene.getProfileName());
            profileNameLabel.setVisible(currentScene.getProfileName() != null);

            profileImageLabel.setIcon(currentScene.getProfileImage());
            profileImageLabel.setVisible(currentScene.getProfileImage() != null);

            // 캐릭터 이미지 업데이트
            ImageIcon scaledCharacterImage = scaleImageIcon(currentScene.getCharacterImage(), CHARACTER_WIDTH, CHARACTER_HEIGHT);
            characterImageLabel.setIcon(scaledCharacterImage); // 크기 조정된 이미지 설정
            characterImageLabel.setVisible(currentScene.getCharacterImage() != null);

            // 대화 텍스트 업데이트
            dialogueText.setText(currentScene.getDialogue());
            boolean hasDialogue = currentScene.getDialogue() != null;
            dialogueBox.setVisible(hasDialogue); // 대화 상자를 숨기거나 표시
            nextBtn.setVisible(hasDialogue); // "다음" 버튼을 숨기거나 표시

            // 배경 이미지 업데이트
            backgroundImage.setIcon(currentScene.getBackgroundImage());

            // 다음 장면으로 이동하기 위해 인덱스 증가
            currentSceneIndex++;
        } else {
            // 모든 장면이 끝났을 때
            System.out.println("스토리가 끝났습니다!");
        }
    }

    public static void main(String[] args) {
        new Stage1(); // Stage1 실행
    }
}
