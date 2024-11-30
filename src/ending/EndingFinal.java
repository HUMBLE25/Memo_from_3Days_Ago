package ending;

import common.BaseStage;
import common.MusicController;

import javax.swing.*;
import java.awt.*;

public class EndingFinal extends BaseStage {
    public EndingFinal(JPanel mainPanel, CardLayout cardLayout) {
        super(mainPanel, cardLayout);

        // 음악 컨트롤러
        MusicController musicController = new MusicController();

        // 선택 구간 음악 중지
        musicController.playMusic("music/ending.mp3", false);

        // 선택 구간 음악 실행
        musicController.playMusic("music/answer.mp3", true);

        initStoryData(); // 스토리 데이터 초기화

        JPanel dialogueScene = createDialogueScene();
        mainPanel.add(dialogueScene, "EndingFinal");

        setVisible(true); // EndingFinal 표시

        updateScene(); // 첫번째 장면 표시
    }

    @Override
    protected void initStoryData() {
        // Stage?Data이 부분들만 내용을 삽입해주면 된다.
        storyData = EndingData.getFinalScenes();
    }

    protected String getNextStageName(){
        return "EndingGoodBye";
    }
}
