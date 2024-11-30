package ending;

import common.BaseStage;
import common.ImageRegistry;

import javax.swing.*;
import java.awt.*;

public class Ending3DayAfterMemo extends BaseStage {
    public Ending3DayAfterMemo(JPanel mainPanel, CardLayout cardLayout) {
        super(mainPanel, cardLayout);
        initStoryData(); // 스토리 데이터 초

        // 자동 줄바꿈으로 글이 작성되어야 한다.
        JTextArea text = new JTextArea(
                "계획은 변하지 않아.\n" +
                "전명호는 3일 뒤에 죽을 거야.\n"+
                "네가 아니더라도 내가 옥상에서 밀어버릴 거야.");
        text.setBounds(151,251,716,168);
        text.setFont(new Font("VT323", Font.PLAIN, 20));
        text.setForeground(Color.WHITE);
        text.setOpaque(false); // 배경 투명
        text.setEditable(false); // 수정 불가

        JPanel dialogueScene = createDialogueScene();

        dialogueScene.add(text);
        mainPanel.add(dialogueScene, "Ending3DayAfterMemo");

        setVisible(true); // Ending3DayAfterMemo 표시

        updateScene(); // 첫번째 장면 표시

    }
        @Override
        protected void initStoryData() {
            // Stage?Data이 부분들만 내용을 삽입해주면 된다.
            storyData = EndingData.get3DayAfterMemoScenes();
        }

        protected String getNextStageName(){
            // 명호,지호 싸움장면으로 넘어간다.
            return "";
        }
}
