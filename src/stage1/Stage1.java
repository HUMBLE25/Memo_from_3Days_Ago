package stage1;

import common.BaseStage;

import javax.swing.*;

public class Stage1 extends BaseStage {
    public Stage1() {
        super("Stage1");

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
        // Stage1Data에 데이터를 삽입하면 된다.
        // Stage1Data에 데이터를 참조하여 자동으로 불러온다.
        storyData = Stage1Data.getScenes();
    }

    public static void main(String[] args) {
        new Stage1();
    }
}
