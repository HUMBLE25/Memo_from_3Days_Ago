package stage1;

import common.BaseStage;

import javax.swing.*;
import java.awt.*;

public class Stage1 extends BaseStage {
    public Stage1(JPanel mainPanel, CardLayout cardLayout) {
        super(mainPanel, cardLayout);

        initStoryData(); // 스토리 데이터 초기화

        // 대화 장면 생성
        // Stage1 intro
        JPanel dialogueScene = createDialogueScene();
        mainPanel.add(dialogueScene, "Stage1Scene");

        // 아이템 선택 패널 생성
        mainPanel.add(new ItemSelectionPanel(mainPanel,cardLayout), "Stage1ItemSelectionPanel");

        // 문성하 사물한 선택 스토리 추가

        // 전명호 사물한 선택 스토리 추가

        // Stage1 outro

        setVisible(true); // Stage1 표시

        updateScene(); // 첫번째 장면 표시
    }

    @Override
    protected void initStoryData() {
        // Stage?Data이 부분들만 내용을 삽입해주면 된다.
        // Stage1Data에 데이터를 삽입하면 된다.
        // Stage1Data에 데이터를 참조하여 자동으로 불러온다.
        storyData = Stage1Data.getScenes();
    }
    protected String getNextStageName(){
        return "Stage1ItemSelectionPanel";
        //        return "Stage2Scene";
    }
}
