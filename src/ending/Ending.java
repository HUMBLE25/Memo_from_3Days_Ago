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

    // 선택에따른 장면 전환이 필요하다.
    // 공통된 것들은 특화된 리스너가 필요없다.
    // 예외처리를 하여 특정 장면으로 넘길 필요가 있다.
    // 스토리도 덩어리별로 나누어야 할것이다. 모두 하나로 처리하면 분리가 어려울 것이다.
    // 완료가 되면 전으로 돌아가게 하는 것도 필요하다.
    // 모두 똑같은 로직을 따를 수는 없다. 공통된것들을 이용할 뿐이다.
    // 작은 이야기 단위로 나누고 그 이야기 안에서 예외 사항을 처리하자.

    // 배열로 데이터를 순차적으로 받아오고 있다.
    // 리스너는 어디에 넣고 있엇지?
    // 리스너를 따로 등록할 수는 없을까?
    // 특화된 배열을 만들수는 없을까?
    // 순차적으로 진행되지만 특정 부분에 리스너를 달아 반응하면 다른 스토리에 다녀오는 형식으로 하면 어떨끼?
    // 그러면 독립적으로 움직일 수 있을것 같다.
    // 끝나는 것을 어떻게 여길까?
    // BaseStage의 updateScene()매서드에서 인덱스의 번호를 활용하여 끝남을 확인하고 있다.
    // 끝나면 원래의 시작점으로 돌아오게 하면 어떨까? 모두 공통되도록.
    // stage1 이 끝나면 stage2로 가야하는데 stage1은 opeing에서 시작된다. 그러면 다시 opening으로 돌아 가게 된다.
    // updateScene()를 오버라이딩해야 할까? flag를 만들어서 다음으로 가야할 지점을 정해둬야 할까?
    // 상태 관리를 어떻게 해야할까? 캐시를 만들수 있나? 다음으로 가야할 곳을 지정할 수는 없나.
    // 끝나면 시작한 곳으로 가야한다.
    // opeing의 마지막에서 stage1이 시작된다. stage1의 마지막에서 stage2가 시작된다.
    // 각 마지막에서 어떻게 stage1을 호출하지? 마지막이면 로그를 띄우지 않고 다음으로 가는 매서드를 호출하면 되지.
    // 그럼 이를 위해서는 updateScene()를 오버라이딩 해야한다. 마지막일 경우 원하는 곳으로 보낸면 된다.

    // 장면 전환 방식
    // updateScene()를 오버라이딩하여 스토리가 끝났을때 다른 Stage를 불러온다.
    // 즉, currentSceneIndex >= storyData.length 일때 다른 Stage를 불러온다.

//    protected void updateScene() {
//        if (currentSceneIndex < storyData.length) {
//            SceneData currentScene = storyData[currentSceneIndex];
//
//            // 프로필 이름 업데이트
//
//            // 프로필 이미지 업데이트
//
//            // 캐릭터 이미지 업데이트
//
//            // 대화 텍스트 업데이트

//            // 대화 내용 유무에따른 대화 상자, 버튼 유무 결정
//            // 배경 이미지 업데이트
//            // 다음 장면을 위한 인덱스 업데이트
//            currentSceneIndex++;
//        } else {
//            // 다음 Stage를 불러온다.
//              new Stage1(); // 예시
//            System.out.println("스토리가 끝났습니다!");
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

