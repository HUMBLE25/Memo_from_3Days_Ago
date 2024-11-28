package stage2;

import common.BaseStage;

import javax.swing.*;
import java.awt.*;

public class Stage2Intro extends BaseStage {
    public Stage2Intro(JPanel mainPanel, CardLayout cardLayout) {
        super(mainPanel, cardLayout);

        // 스토리 데이터 초기화
        initStoryData();

        // 대화 장면 생성
        // Stage1 intro
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

}
