package ending;

import common.BaseStage;
import common.MusicController;

import javax.swing.*;
import java.awt.*;

public class EndingAnswer extends BaseStage {
    public EndingAnswer(JPanel mainPanel, CardLayout cardLayout) {
        super(mainPanel, cardLayout);

        // 배경 음악 실행
        MusicController.getInstance().playMusic("music/ending.mp3", false);
        MusicController.getInstance().playMusic("music/answer.mp3", true);

        initStoryData(); // 스토리 데이터 초기화

        JPanel dialogueScene = createDialogueScene();
        mainPanel.add(dialogueScene, "EndingAnswer");

        setVisible(true); // EndingWrongAnswer 표시

        updateScene(); // 첫번째 장면 표시
    }
    @Override
    protected void initStoryData() {
        // Stage?Data이 부분들만 내용을 삽입해주면 된다.
        storyData = EndingData.getAnswerScenes();
    }

    protected String getNextStageName(){
        return "EndingSungHaLetter";
    }
}
