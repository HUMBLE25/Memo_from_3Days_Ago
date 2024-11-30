package ending;

import common.BlinkingBtnRunnable;
import common.ImageRegistry;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EndingSungHaLetter extends JPanel {
    private CardLayout cardLayout;
    private JPanel mainPanel;

    protected ImageIcon nextBtnImg = new ImageIcon("images/characters/다음버튼.png");
    private static final ImageIcon sungHaLetter = ImageRegistry.getImage("Ending_성하편지");

    public EndingSungHaLetter(JPanel mainPanel, CardLayout cardLayout) {
        this.mainPanel = mainPanel;
        this.cardLayout = cardLayout;

        // 배경색 설정
        setLayout(null);
        setBackground(Color.BLACK);

        // 자동 줄바꿈으로 글이 작성되어야 한다.
        JTextArea text = new JTextArea("네가 얼마나 힘들고 억울한지 누구보다 잘 알아. \n" +
                "나 역시 전명호가 우리에게 했던 일을 절대 용서할 수 없어. \n" +
                "하지만 지호야, 우리가 지금 하려는 일이 과연 옳을까?\n" +
                "우리 둘 다 글을 쓰는 사람이잖아.\n" +
                "나는 우리가 단순히 모든 걸 포기해버리는 건, 오히려 전명호의 승리라고 생각해.\n" +
                "지호야, 다시 한번 부탁할게. 이 모든 걸 그만두고, 우리 다시 \n" +
                "글을 쓰는 우리 본연의 자리로 돌아가자. 내가 항상 함께할게.\n" +
                "\n" +
                "성하가");
        text.setBounds(72,81,1233,504);
        text.setFont(new Font("VT323", Font.PLAIN, 20));
        text.setForeground(Color.WHITE);
        text.setOpaque(false); // 배경 투명
        text.setEditable(false); // 수정 불가

        // 오른쪽 하단에 이미지가 부탁된다.
        JLabel letter = new JLabel(sungHaLetter);
        letter.setBounds(928,512,468,497);

        // 다음 버튼
        JLabel nextBtn = new JLabel(nextBtnImg);
        nextBtn.setBounds(1170, 50, 45, 45);
        BlinkingBtnRunnable btnRunnable = new BlinkingBtnRunnable(nextBtn);
        Thread nextBtnThread = new Thread(btnRunnable);
        nextBtnThread.start();

        add(text);
        add(letter);
        add(nextBtn);

        // 이벤트 리스너 추가
        addListeners();
    }
    // 리스너 추가
    private void addListeners() {
        // 마우스 클릭 이벤트
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                goToNextScene();
            }
        });

        // 키보드 입력 이벤트
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_SPACE || e.getKeyCode() == KeyEvent.VK_ENTER) {
                    goToNextScene();
                }
            }
        });

        // 포커스 요청 (키 이벤트를 받기 위해 필요)
        setFocusable(true);
        requestFocusInWindow();
    }
    // 다음 장면으로 전환
    private void goToNextScene() {
        // 지호의 메모로 넘어감
        cardLayout.show(mainPanel, "Ending3DayAfterMemo"); // "NextSceneName"을 실제 다음 장면 이름으로 변경
    }

}
