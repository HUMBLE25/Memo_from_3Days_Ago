package common;

import stage1.Stage1Intro;
import stage2.Stage2Intro;
import stage3.Stage3;
import stage4.Stage4;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {
    private CardLayout cardLayout; // 스테이지 전환을 위한 CardLayout
    private JPanel mainPanel; // 모든 스테이지를 포함하는 메인 패널

    public GameFrame() {
        setTitle("3일전 메모장, 예고된 추락 사건");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1440, 1024);
        setLocationRelativeTo(null); // 화면 중앙에 배치

        // CardLayout 설정
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);
        add(mainPanel);

        // 스테이지 추가
        new Stage1Intro(mainPanel, cardLayout);
        new Stage2Intro(mainPanel, cardLayout);
        new Stage3(mainPanel, cardLayout);
        new Stage4(mainPanel, cardLayout);

        setVisible(true);
    }

    // 스테이지를 CardLayout에 추가
    private void addStage(BaseStage stage, String name) {
        mainPanel.add(stage, name);
    }



    public static void main(String[] args) {
        new GameFrame(); // 게임 실행
    }
}

