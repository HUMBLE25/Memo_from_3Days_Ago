package stage3;

import common.BaseStage;
import stage2.Stage2Data;

import javax.swing.*;

public class Stage3 extends BaseStage {
    public Stage3() {
        super("Stage3");

        // 스토리 데이터 초기화
        initStoryData();

        // 대화 장면 생성
        JPanel dialogueScene = createDialogueScene();
        mainPanel.add(dialogueScene, "DialogueScene");

        setVisible(true); // 윈도우 표시

        // 첫번째 장면 표시
        updateScene();
    }

    @Override
    protected void initStoryData() {

        // Stage?Data이 부분들만 내용을 삽입해주면 된다.
        storyData = Stage3Data.getScenes();
    }

    public static void main(String[] args) {
        new stage3.Stage3();
    }
}
