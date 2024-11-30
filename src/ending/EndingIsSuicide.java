package ending;

import common.BlinkingBtnRunnable;
import common.GradientPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EndingIsSuicide extends JPanel {
    private CardLayout cardLayout;
    private JPanel mainPanel;
    protected ImageIcon nextBtnImg = new ImageIcon("images/characters/다음버튼.png");

    private Color startColor = new Color(0x06213B); // start color for the gradation
    private Color endColor = new Color(0x020919);// end color for the gradation

    public EndingIsSuicide(JPanel mainPanel, CardLayout cardLayout) {
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
        question.setText("문성하는 자살인가요, 타살인가요?");
        question.setFont(new Font("Anonymous Pro", Font.PLAIN, 36));
        question.setForeground(Color.WHITE);
        question.setBackground(new Color(0x333C41)); // 배경색을 대화 상자와 일치
        question.setVisible(true);
        question.setBounds(373,194, 543, 56);

        questionBox.add(question);

        // 자살 라디오 버튼
        JRadioButton suicideOption = new JRadioButton("자살");
        suicideOption.setFont(new Font("Anonymous Pro", Font.PLAIN, 28));
        suicideOption.setForeground(Color.WHITE);
        suicideOption.setOpaque(false); // 배경 투명
        suicideOption.setBounds(500, 300, 100, 50);

        // 타살 라디오 버튼
        JRadioButton murderOption = new JRadioButton("타살");
        murderOption.setFont(new Font("Anonymous Pro", Font.PLAIN, 28));
        murderOption.setForeground(Color.WHITE);
        murderOption.setOpaque(false); // 배경 투명
        murderOption.setBounds(700, 300, 100, 50);

        // 다음 버튼
        JLabel nextBtn = new JLabel(nextBtnImg);
        nextBtn.setBounds(1170, 50, 45, 45);
        BlinkingBtnRunnable btnRunnable = new BlinkingBtnRunnable(nextBtn);
        Thread nextBtnThread = new Thread(btnRunnable);
        nextBtnThread.start();

        // 라디오 버튼 그룹화
        ButtonGroup group = new ButtonGroup();
        group.add(suicideOption);
        group.add(murderOption);

        // 라디오 버튼과 버튼 추가
        questionBox.add(suicideOption);
        questionBox.add(murderOption);
        questionBox.add(nextBtn);

        // 라디오 버튼에 리스너 추가
        suicideOption.addActionListener(new RadioBtnActionListener("EndingWrongAnswer")); // 자살 버튼 선택
        murderOption.addActionListener(new RadioBtnActionListener("EndingSelectMurder")); // 타살 버튼 선택
        // 질문 박스 추가
        add(questionBox);
    }

    class RadioBtnActionListener implements ActionListener{
        String nextStageName;
        public RadioBtnActionListener( String nextStageName){
            this.nextStageName = nextStageName;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            cardLayout.show(mainPanel,nextStageName);
        }

    }


}
