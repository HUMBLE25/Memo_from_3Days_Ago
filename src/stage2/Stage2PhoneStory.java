package stage2;

import common.BaseStage;

import javax.swing.*;
import java.awt.*;

public class Stage2PhoneStory extends BaseStage {
    public Stage2PhoneStory(JPanel mainPanel, CardLayout cardLayout) {
        super(mainPanel, cardLayout);
        initStoryData(); // 스토리 데이터 초기화

        JPanel dialogueScene = createDialogueScene();
        mainPanel.add(dialogueScene, "Stage2PhoneStory");

        setVisible(true); // Stage2PhoneStory 표시

        updateScene(); // 첫번째 장면 표시
    }
    @Override
    protected void initStoryData() {
        // Stage?Data이 부분들만 내용을 삽입해주면 된다.
        storyData = Stage2Data.getPhoneStoryScenes();
    }
    protected String getNextStageName(){
        return "Stage2ItemSelectionPanel";
    }

}