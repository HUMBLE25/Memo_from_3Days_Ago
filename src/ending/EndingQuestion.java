package ending;

import common.BlinkingBtnRunnable;
import common.MusicController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EndingQuestion extends JPanel {
    private CardLayout cardLayout;
    private JPanel mainPanel;
    protected ImageIcon nextBtnImg = new ImageIcon("images/characters/다음버튼.png");
    public EndingQuestion(JPanel mainPanel, CardLayout cardLayout) {

        // 음악 컨트롤러
        MusicController musicController = new MusicController();

        // 전체 게임 배경음악 중지
        musicController.playMusic("music/all.mp3", false);

        // 선택 구간 음악 실행
        musicController.playMusic("music/ending.mp3", true);

        this.mainPanel = mainPanel;
        this.cardLayout = cardLayout;

        setLayout(null);
        setBackground(Color.BLACK);

        // 질문 상자 띄워야 함.
        // 깜빡이는 버튼도 만든다.

        JPanel questionBox = new JPanel(null);
        questionBox.setBackground(new Color(0x333C41));
        questionBox.setBounds(385, 381, 720, 230);

        JLabel question = new JLabel();
        question.setText("범인을 맞추러 가시겠습니까?");
        question.setFont(new Font("VT323", Font.PLAIN, 36));
        question.setForeground(Color.WHITE);
        question.setBackground(new Color(0x333C41)); // 배경색을 대화 상자와 일치
        question.setVisible(true);
        question.setBounds(112,89, 450, 56);


        JLabel nextBtn = new JLabel(nextBtnImg);
        nextBtn.setBounds(601, 95, 45, 45);
        BlinkingBtnRunnable btnRunnable = new BlinkingBtnRunnable(nextBtn);
        Thread nextBtnThread = new Thread(btnRunnable);
        nextBtnThread.start();

        questionBox.add(question);
        questionBox.add(nextBtn);
        add(questionBox);

        addListeners();

    }

    private void addListeners() {
        // 마우스 클릭 이벤트
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                moveToNextScene();
            }
        });

        // 키보드 이벤트
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_SPACE || e.getKeyCode() == KeyEvent.VK_ENTER) {
                    moveToNextScene();
                }
            }
        });

        // 포커스를 받아야 키보드 입력을 받을 수 있음
        setFocusable(true);
        requestFocusInWindow();
    }
    // 다음 장면으로 이동
    private void moveToNextScene() {
        String nextStageName = getNextStageName();
        cardLayout.show(mainPanel, nextStageName);
    }
    // 자살 VS 타살 선택
    protected String getNextStageName(){

        return "EndingIsSuicide";
    }
}
