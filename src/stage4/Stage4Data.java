package stage4;

import common.ImageRegistry;
import common.SceneData;

import javax.swing.*;

public class Stage4Data {
    // ImageRegistry에서 필요한 데이터 불러오기
    private static final ImageIcon stage4Map = ImageRegistry.getImage("stage4_지도");
    private static final ImageIcon professorRoomOutside = ImageRegistry.getImage("stage4_교수방_밖");
    private static final ImageIcon professorRoomInside = ImageRegistry.getImage("stage4_교수방_안");
    private static final ImageIcon professorDesk = ImageRegistry.getImage("stage4_교수책상");
    private static final ImageIcon lockerReport = ImageRegistry.getImage("stage4_사물함_보고서");
    private static final ImageIcon cheonglimReport = ImageRegistry.getImage("stage4_청림준비보고서");
    private static final ImageIcon lockerLetter = ImageRegistry.getImage("stage4_사물함_편지");
    private static final ImageIcon jiHoLetter = ImageRegistry.getImage("stage4_천지호_편지");

    private static final ImageIcon profileJiHoon = ImageRegistry.getImage("character_프_지훈");
    private static final ImageIcon profileProfessor = ImageRegistry.getImage("character_프_성민");
    private static final ImageIcon subJiHoonLeft = ImageRegistry.getImage("character_명지훈_왼쪽");
    private static final ImageIcon mainProfessor = ImageRegistry.getImage("character_성민");

    public static SceneData[] getAllScenes(){
        return new SceneData[]{
                new SceneData.Builder()
                        .setBackgroundImage(stage4Map)
                        .build(),

                new SceneData.Builder()
                        .setBackgroundImage(professorRoomOutside)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("교수님, 안녕하세요. 문창과 2학년 명지훈이라고 합니다. 잠시 드리고 싶은 말씀\n" +
                                "이 있어서요.")
                        .setSubCharacterImage(subJiHoonLeft)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("금성민 교수")
                        .setProfileImage(profileProfessor)
                        .setDialogue("..들어오게.")
                        .setMainCharacterImage(mainProfessor)
                        .build(),

                new SceneData.Builder()
                        .setBackgroundImage(professorRoomInside)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("교수님 안녕하세요, 오랜만에 뵙습니다.")
                        .setSubCharacterImage(subJiHoonLeft)
                        .setMainCharacterImage(mainProfessor)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("금성민 교수")
                        .setProfileImage(profileProfessor)
                        .setDialogue("그래, 지훈 학생. 오랜만이네.")
                        .setSubCharacterImage(subJiHoonLeft)
                        .setMainCharacterImage(mainProfessor)
                        .build(),

                new SceneData.Builder()
                        .setBackgroundImage(professorDesk)
                        .build(),

                new SceneData.Builder()
                        .setSubCharacterImage(subJiHoonLeft)
                        .setMainCharacterImage(mainProfessor)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("금성민 교수")
                        .setProfileImage(profileProfessor)
                        .setDialogue(".............")
                        .setSubCharacterImage(subJiHoonLeft)
                        .setMainCharacterImage(mainProfessor)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("금성민 교수")
                        .setProfileImage(profileProfessor)
                        .setDialogue(".............")
                        .setSubCharacterImage(subJiHoonLeft)
                        .setMainCharacterImage(mainProfessor)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("금성민 교수")
                        .setProfileImage(profileProfessor)
                        .setDialogue("미안하지만... 그 부분에 대해서는 누군가에게 말할 부분이 아닌 것 같네.")
                        .setSubCharacterImage(subJiHoonLeft)
                        .setMainCharacterImage(mainProfessor)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("금성민 교수")
                        .setProfileImage(profileProfessor)
                        .setDialogue("..아니지. 잘못을 피하려고 들면 그 학생에게 더 못할 짓이겠지..")
                        .setSubCharacterImage(subJiHoonLeft)
                        .setMainCharacterImage(mainProfessor)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("..죄송하지만 자세한 이야기를 들을 수 있을까요?")
                        .setSubCharacterImage(subJiHoonLeft)
                        .setMainCharacterImage(mainProfessor)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("금성민 교수")
                        .setProfileImage(profileProfessor)
                        .setDialogue("자네도 어차피 알고 찾아온 것 아닌가.. 나 때문에 그 아이가 극단적인 선택을..")
                        .setSubCharacterImage(subJiHoonLeft)
                        .setMainCharacterImage(mainProfessor)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("..............")
                        .setSubCharacterImage(subJiHoonLeft)
                        .setMainCharacterImage(mainProfessor)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("금성민 교수")
                        .setProfileImage(profileProfessor)
                        .setDialogue("그래.. 날 존경하던 학생들이었는데 그렇게 심한 말을 하다니.. 후회하던 참이었\n" +
                                "네.")
                        .setSubCharacterImage(subJiHoonLeft)
                        .setMainCharacterImage(mainProfessor)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("금성민 교수")
                        .setProfileImage(profileProfessor)
                        .setDialogue("하지만 그렇다고 그 말 때문에 그런 선택을 할 줄은 몰랐네...")
                        .setSubCharacterImage(subJiHoonLeft)
                        .setMainCharacterImage(mainProfessor)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("..교수님은 성하가 죽은 이유가 자살이라고 확신하시나요?")
                        .setSubCharacterImage(subJiHoonLeft)
                        .setMainCharacterImage(mainProfessor)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("금성민 교수")
                        .setProfileImage(profileProfessor)
                        .setDialogue("..지훈 학생에게만 말하는 사실이지만 난 내년부터 이 학교를 떠나네.")
                        .setSubCharacterImage(subJiHoonLeft)
                        .setMainCharacterImage(mainProfessor)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("금성민 교수")
                        .setProfileImage(profileProfessor)
                        .setDialogue("내가 유일하게 할 수 있는 사죄는 더이상 이 바닥에 있지 않는 것이겠지.")
                        .setSubCharacterImage(subJiHoonLeft)
                        .setMainCharacterImage(mainProfessor)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("금성민 교수")
                        .setProfileImage(profileProfessor)
                        .setDialogue("잘못이 있긴 했지만 아직 어리고 글을 그렇게 사랑하던 학생이었는데...")
                        .setSubCharacterImage(subJiHoonLeft)
                        .setMainCharacterImage(mainProfessor)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("금성민 교수")
                        .setProfileImage(profileProfessor)
                        .setDialogue("..학생. 미안한데 잠시 먼저 나가보겠네. 나중에 다시 얘기합세... ")
                        .setSubCharacterImage(subJiHoonLeft)
                        .setMainCharacterImage(mainProfessor)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("교수님이 갑자기 연구실을 나가셨다. 감정이 올라오신 듯 하다. 교수님은 자신이 \n" +
                                "성하가 죽은 이유가 자신이라고 의심의 여지 없이 믿고 있는듯하다.")
                        .setSubCharacterImage(subJiHoonLeft)
                        .setMainCharacterImage(mainProfessor)
                        .build(),

                new SceneData.Builder()
                        .setBackgroundImage(professorDesk)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("교수님의 책상 위에 무언가 있는 듯하다.")
                        .setSubCharacterImage(subJiHoonLeft)
                        .build(),

                new SceneData.Builder()
                        .setBackgroundImage(lockerReport)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("..문성하? 저게 뭐지?")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("천지호와 문성하의 대회 보고서이다. 천지호와 문성하가 청림을 함께 준비해서\n" +
                                "최근 그렇게 친했던 것 같다.")
                        .setBackgroundImage(cheonglimReport)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("..이건 또 뭐지?")
                        .setSubCharacterImage(subJiHoonLeft)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("보고서 뒤에 편지 하나가 있다.")
                        .build(),

                new SceneData.Builder()
                        .setBackgroundImage(lockerLetter)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("이건 천지호가 교수님께 드린 편지이다.")
                        .setBackgroundImage(jiHoLetter)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("글씨체가 익숙한데......")
                        .setSubCharacterImage(subJiHoonLeft)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("일단 가지고 있어보자.")
                        .setSubCharacterImage(subJiHoonLeft)
                        .build()

        };

    }
}