package stage1;

import common.BaseStage;

import javax.swing.*;
import java.awt.*;

public class Stage1MoonSeongHaStory extends BaseStage {
    public Stage1MoonSeongHaStory(JPanel mainPanel, CardLayout cardLayout) {
        super(mainPanel, cardLayout);

        JPanel dialogueScene = createDialogueScene();
        mainPanel.add(dialogueScene, "Stage1MoonSeongHaStory");

        initStoryData(); // 스토리 데이터 초기화

        setVisible(true); // Stage1MoonSeongHaStory 표시

        updateScene(); // 첫번째 장면 표시
    }
    @Override
    protected void initStoryData() {
        // Stage?Data이 부분들만 내용을 삽입해주면 된다.
        storyData = Stage1Data.getMoonSeonHaStoryScene();
    }
    protected String getNextStageName(){
        return "Stage1ItemSelectionPanel";
    }
}
