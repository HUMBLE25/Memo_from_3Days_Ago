package ending;

import common.BaseStage;
import common.SceneData;
import stage2.Stage2Data;

import javax.swing.*;

public class Ending extends BaseStage {
    public Ending() {
        super("Stage2");

        // 스토리 데이터 초기화
        initStoryData();

        // 대화 장면 생성
        JPanel dialogueScene = createDialogueScene();
        mainPanel.add(dialogueScene, "DialogueScene");

        setVisible(true); // 윈도우 표시

        // 첫번째 장면 표시
        updateScene();
    }

    // 장면 전환 방식
    // updateScene()를 오버라이딩하여 스토리가 끝났을때 다른 Stage를 불러온다.
    // 즉, currentSceneIndex >= storyData.length 일때 다른 Stage를 불러온다.
    // 각 스토리 별로 클래스를 나누는 것이 좋을 것 같다.
    // 수도 코드
//    protected void updateScene() {
//        if (currentSceneIndex < storyData.length) {
//            SceneData currentScene = storyData[currentSceneIndex];
//            // 프로필 이름 업데이트
//            // 프로필 이미지 업데이트
//            // 캐릭터 이미지 업데이트
//            // 대화 텍스트 업데이트
//            // 대화 내용 유무에따른 대화 상자, 버튼 유무 결정
//            // 배경 이미지 업데이트
//            // 다음 장면을 위한 인덱스 업데이트
//            currentSceneIndex++;
//        } else {
//            // 다음 Stage를 불러온다.
//              new Stage1(); // 예시
//        }
//    }
    @Override
    protected void initStoryData() {
        // Stage?Data이 부분들만 내용을 삽입해주면 된다.
        storyData = EndingData.getScenes();
    }

    public static void main(String[] args) {
        new Ending();
    }
}

