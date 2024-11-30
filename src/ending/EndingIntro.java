package ending;

import common.BaseStage;
import stage4.Stage4;

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
        mainPanel.add(dialogueScene, "EndingIntroScene");

        // 범인 맞추러 가겠습니까? EndingQuestion
        mainPanel.add(new EndingQuestion(mainPanel,cardLayout),"EndingQuestion");

        // 자살 VS 타살? EndingIsSuicide
        mainPanel.add(new EndingIsSuicide(mainPanel,cardLayout), "EndingIsSuicide");

        // 타살일 경우 범인 선택 EndingSelectMurder
        mainPanel.add(new EndingSelectMurder(mainPanel,cardLayout), "EndingSelectMurder");

        // 정답 EndingAnswer, 천지호 선택시
        new EndingAnswer(mainPanel,cardLayout);

        // EndingSungHaLetter, 성하 편지
        mainPanel.add(new EndingSungHaLetter(mainPanel,cardLayout), "EndingSungHaLetter");

        // EndingJiHoMemo,지호 메모
        new Ending3DayAfterMemo(mainPanel,cardLayout);

        // EndingFinal, 명호,지호 싸움 + 마무리
        new EndingFinal(mainPanel,cardLayout);

        // EndingGoodBye, 범인은 지호. 이젠 안녕
        mainPanel.add(new EndingGoodBye(mainPanel,cardLayout), "EndingGoodBye");

        // 오답 EndingWrongAnswer, 자살 선택시, 다른 범인 선택시
        new EndingWrongAnswer(mainPanel,cardLayout);

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
        return "EndingQuestion";
    }

    // Stage별 테스트를 위한 main 매서드 통합 이후 주석처리 혹은 삭제
    public static void main(String[] args) {
        // JFrame 생성
        JFrame frame = new JFrame("EndingIntro Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1440, 1024);
        frame.setLocationRelativeTo(null); // 화면 중앙에 배치

        // CardLayout 및 mainPanel 생성
        CardLayout cardLayout = new CardLayout();
        JPanel mainPanel = new JPanel(cardLayout);

        // Stage4 인스턴스 생성
        new EndingIntro(mainPanel, cardLayout);

        // JFrame에 mainPanel 추가
        frame.add(mainPanel);

        // JFrame 표시
        frame.setVisible(true);

        // Stage4 Scene 표시
        cardLayout.show(mainPanel, "EndingIntroScene");
    }

}

