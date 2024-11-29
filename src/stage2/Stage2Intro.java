package stage2;

import common.BaseStage;
import stage4.Stage4;

import javax.swing.*;
import java.awt.*;

public class Stage2Intro extends BaseStage {
    public Stage2Intro(JPanel mainPanel, CardLayout cardLayout) {
        super(mainPanel, cardLayout);

        // 스토리 데이터 초기화
        initStoryData();

        // 대화 장면 생성
        // Stage2 intro
        JPanel dialogueScene = createDialogueScene();
        mainPanel.add(dialogueScene, "Stage2Scene");

        // 아이템 선택 패널 생성
        mainPanel.add(new Stage2ItemSelectionPanel(mainPanel,cardLayout),"Stage2ItemSelectionPanel");

        // 일기장 선택 스토리 추가
        new Stage2DiaryStory(mainPanel,cardLayout);

        // 휴대폰 선택 스토리 추가
        new Stage2PhoneStory(mainPanel,cardLayout);

        // 선물 선택 스토리 추가
        new Stage2PresentStory(mainPanel,cardLayout);

        // Stage2 outro
        new Stage2Outro(mainPanel,cardLayout);
        setVisible(true); // Stage2 표시

        // 첫번째 장면 표시
        updateScene();
    }

    @Override
    protected void initStoryData() {
        // Stage?Data이 부분들만 내용을 삽입해주면 된다.
        storyData = Stage2Data.getIntroScenes();
    }

    protected String getNextStageName(){
        return "Stage2ItemSelectionPanel";
    }

    // Stage별 테스트를 위한 main 매서드 통합 이후 주석처리 혹은 삭제
    public static void main(String[] args) {
        // JFrame 생성
        JFrame frame = new JFrame("Stage2 Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1440, 1024);
        frame.setLocationRelativeTo(null); // 화면 중앙에 배치

        // CardLayout 및 mainPanel 생성
        CardLayout cardLayout = new CardLayout();
        JPanel mainPanel = new JPanel(cardLayout);

        // Stage4 인스턴스 생성
        new Stage2Intro(mainPanel, cardLayout);

        // JFrame에 mainPanel 추가
        frame.add(mainPanel);

        // JFrame 표시
        frame.setVisible(true);

        // Stage4 Scene 표시
        cardLayout.show(mainPanel, "Stage2Scene");
    }

}
