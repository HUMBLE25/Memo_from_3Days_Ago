package stage1;

import common.BaseStage;

import javax.swing.*;
import java.awt.*;

public class Stage1Intro extends BaseStage {
    public Stage1Intro(JPanel mainPanel, CardLayout cardLayout) {
        super(mainPanel, cardLayout);

        initStoryData(); // 스토리 데이터 초기화

        // 대화 장면 생성
        // Stage1 intro
        JPanel dialogueScene = createDialogueScene();
        mainPanel.add(dialogueScene, "Stage1Scene");

        // 아이템 선택 패널 생성
        mainPanel.add(new Stage1ItemSelectionPanel(mainPanel,cardLayout), "Stage1ItemSelectionPanel");

        // 문성하 사물한 선택 스토리 추가
        new Stage1MoonSeongHaStory(mainPanel,cardLayout);

        // 전명호 사물한 선택 스토리 추가
        new Stage1JeonMyeongHoStory(mainPanel,cardLayout);

        // Stage1 outro
        new Stage1Outro(mainPanel,cardLayout);

        setVisible(true); // Stage1 표시

        updateScene(); // 첫번째 장면 표시
    }

    @Override
    protected void initStoryData() {
        // Stage?Data이 부분들만 내용을 삽입해주면 된다.
        storyData = Stage1Data.getIntroScenes();
    }
    protected String getNextStageName(){
        return "Stage1ItemSelectionPanel";
    }
}
