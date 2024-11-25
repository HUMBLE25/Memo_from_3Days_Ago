package stage2;

import common.BaseStage;

public class Stage2 extends BaseStage {
    public Stage2() {
        super("Stage2");
        initStoryData();
        mainPanel.add(createDialogueScene(), "DialogueScene");
        setVisible(true);
    }

    @Override
    protected void initStoryData() {
        // 배경 이미지가 보이지 않는다.
        // 이 부분만 다르다.
        // Stage?Data이 부분들만 내용을 삽입해주면 된다.
        storyData = Stage2Data.getScenes();
    }

    public static void main(String[] args) {
        new Stage2();
    }
}
