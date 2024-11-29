package stage4;

import common.BaseStage;
import javax.swing.*;
import java.awt.*;

public class Stage4 extends BaseStage {
 public Stage4(JPanel mainPanel, CardLayout cardLayout) {
     super(mainPanel, cardLayout);

     // 스토리 데이터 초기화
     initStoryData();

     // 대화 장면 생성
     JPanel dialogueScene = createDialogueScene();
     mainPanel.add(dialogueScene, "Stage4Scene");

     setVisible(true); // 윈도우 표시

     // 첫번째 장면 표시
     updateScene();
 }

    @Override
    protected void initStoryData() {
        // Stage?Data이 부분들만 내용을 삽입해주면 된다.
        storyData = Stage4Data.getAllScenes();
    }
    protected String getNextStageName(){
        return "EnginScene";
    }

    // Stage별 테스트를 위한 main 매서드 통합 이후 주석처리 혹은 삭제
    public static void main(String[] args) {
        // JFrame 생성
        JFrame frame = new JFrame("Stage4 Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1440, 1024);
        frame.setLocationRelativeTo(null); // 화면 중앙에 배치

        // CardLayout 및 mainPanel 생성
        CardLayout cardLayout = new CardLayout();
        JPanel mainPanel = new JPanel(cardLayout);

        // Stage4 인스턴스 생성
        new Stage4(mainPanel, cardLayout);

        // JFrame에 mainPanel 추가
        frame.add(mainPanel);

        // JFrame 표시
        frame.setVisible(true);

        // Stage4 Scene 표시
        cardLayout.show(mainPanel, "Stage4Scene");
    }
}
