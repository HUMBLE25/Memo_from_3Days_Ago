package ending;

import common.BaseStage;

import javax.swing.*;
import java.awt.*;

public class EndingIntro extends BaseStage {
    public EndingIntro(JPanel mainPanel, CardLayout cardLayout) {
        super(mainPanel, cardLayout);

        // 스토리 데이터 초기화
        initStoryData();

        // 대화 장면 생성
        // Ending intro
        JPanel dialogueScene = createDialogueScene();
        mainPanel.add(dialogueScene, "EndingScene");

        // 범인 맞추러 가겠습니까? EndingQuestion

        // 자살 VS 타살? EndingIsSuicide

        // 자살일 경우 EndingSuicide

        // 타살일 경우 범인 선택 EndingSelectMuerder

        // 정답 EndingAnswer

        // 오답 EndingWrongAnswer

        setVisible(true); // 윈도우 표시

        // 첫번째 장면 표시
        updateScene();
    }

    @Override
    protected void initStoryData() {
        // Stage?Data이 부분들만 내용을 삽입해주면 된다.
        storyData = EndingData.getIntro();
    }
    // "정답 맞추러 가겠습니까?"로 화면 전환
    protected String getNextStageName(){
        return "";
    }

}

