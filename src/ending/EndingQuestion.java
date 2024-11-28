package ending;

import common.BlinkingBtnRunnable;

import javax.swing.*;
import java.awt.*;

public class EndingQuestion extends JPanel {
    private CardLayout cardLayout;
    private JPanel mainPanel;
    protected ImageIcon nextBtnImg = new ImageIcon("images/characters/다음버튼.png");
    public EndingQuestion(JPanel mainPanel, CardLayout cardLayout) {
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

    }

    // 자살 VS 타살 선택
    protected String getNextStageName(){
        return "";
    }
}
