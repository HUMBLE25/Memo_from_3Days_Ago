package stage1;

import common.BaseStage;

import javax.swing.*;
import java.awt.*;

public class Stage1JeonMyeongHoStory extends BaseStage {
    public Stage1JeonMyeongHoStory(JPanel mainPanel, CardLayout cardLayout) {
        super(mainPanel, cardLayout);
        initStoryData(); // 스토리 데이터 초기화

        JPanel dialogueScene = createDialogueScene();
        mainPanel.add(dialogueScene, "Stage1JeonMyeongHoStory");

        setVisible(true); // Stage1JeonMyeongHoStory 표시

        updateScene(); // 첫번째 장면 표시
    }
    @Override
    protected void initStoryData() {
        // Stage?Data이 부분들만 내용을 삽입해주면 된다.
        storyData = Stage1Data.getjeonMyeongHoStoryScene();
    }
    protected String getNextStageName(){
        return "Stage1ItemSelectionPanel";
    }
}
