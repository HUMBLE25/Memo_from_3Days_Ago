package stage2;

import common.BaseStage;

import javax.swing.*;

public class Stage2 extends BaseStage {
    public Stage2() {
        super("Stage2");

        // 스토리 데이터 초기화
        initStoryData();

        // 대화 장면 생성
        JPanel dialogueScene = createDialogueScene();
        mainPanel.add(dialogueScene, "DialogueScene");
        setVisible(true);

        // 첫번째 장면 표시
        updateScene();
    }

    @Override
    protected void initStoryData() {
        // 배경 이미지가 보이지 않는다.
        // Stage?Data이 부분들만 내용을 삽입해주면 된다.
        storyData = Stage2Data.getScenes();
    }

    public static void main(String[] args) {
        new Stage2();
    }
}
