package stage2;

import common.BaseStage;

import javax.swing.*;
import java.awt.*;

public class Stage2 extends BaseStage {
    public Stage2(JPanel mainPanel, CardLayout cardLayout) {
        super(mainPanel, cardLayout);

        // 스토리 데이터 초기화
        initStoryData();

        // 대화 장면 생성
        JPanel dialogueScene = createDialogueScene();
        mainPanel.add(dialogueScene, "Stage2Scene");

        setVisible(true); // Stage2 표시

        // 첫번째 장면 표시
        updateScene();
    }

    @Override
    protected void initStoryData() {
        // Stage?Data이 부분들만 내용을 삽입해주면 된다.
        storyData = Stage2Data.getScenes();
    }

    protected String getNextStageName(){
        return "Stage3";
    }
}
