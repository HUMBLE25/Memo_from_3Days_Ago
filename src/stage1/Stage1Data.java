package stage1;

import common.SceneData;
import javax.swing.ImageIcon;

public class Stage1Data {
    // 단계 별로 나눈다.
    public static SceneData[] getIntroScenes() {
        return new SceneData[]{
        // Stage1 intro
                // 첫 번째 장면
                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("먼저 사교관에서 성하의 흔적들을 찾아보자")
                        .build(),

                // 학교 배경
                new SceneData.Builder()
                        .setBackgroundImage(new ImageIcon("images/stage1/학교.png"))
                        .build(),

                // 사물함 배경 1
                new SceneData.Builder()
                        .setBackgroundImage(new ImageIcon("images/stage1/사물함_1.png"))
                        .build(),
        };
    }

    // 뮨성하 사물함 선택 스토리
    public static SceneData[] getMoonSeonHaStoryScene(){
        return new SceneData[]{

//        // 아이템 선택 패널
//                new SceneData.Builder()
//                        .setBackgroundImage(new ImageIcon("images/stage1/사물함_2.png"))
//                        .build(),


                // 문성하 사물함 탐색 시작
                new SceneData.Builder()
                        .setBackgroundImage(new ImageIcon("images/stage1/문성하_사물함/문성하_0.png"))
                        .build(),

                // 문성하 사물함에서의 대화
                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("전명호는 우리 대학 최초로 청림 신춘문예 대상에 이름을 올려 졸업 전에 등단을 준비하는 선배이다. 이 일로 우리 학교가 기사에 많이 오르내리고 교수가 매우 좋아했던 걸로 기억한다.")
                        .setBackgroundImage(new ImageIcon("images/stage1/문성하_사물함/문성하_1.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("평소 그렇게 두각을 보이는 선배라는 생각은 안 했어서 역시 창작은 평소 실력과는 관련이 없을 것이라고 생각했던 기억이 있다.")
                        .setBackgroundImage(new ImageIcon("images/stage1/문성하_사물함/문성하_1.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("하지만 왜 성하가 이 선배의 기사를 왜 이렇게 많이 스크랩 해둔 걸까? 그것도 이렇게 구기고 찢어진 상태로.")
                        .setBackgroundImage(new ImageIcon("images/stage1/문성하_사물함/문성하_1.png"))
                        .build(),



        };
    }
    public static SceneData[] getjeonMyeongHoStoryScene(){
        return new SceneData[]{
                        // 전명호 사물함 선택 스토리
                new SceneData.Builder()
                        .setBackgroundImage(new ImageIcon("images/stage1/사물함_2.png"))
                        .build(),

                new SceneData.Builder()
                        .setBackgroundImage(new ImageIcon("images/stage1/전명호_사물함/전명호_0.png"))
                        .build(),

                new SceneData.Builder()
                        .setBackgroundImage(new ImageIcon("images/stage1/전명호_사물함/전명호_1.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("이건 전명호 선배가 대회를 준비했던 당시 작성한 보고서들같다.")
                        .setBackgroundImage(new ImageIcon("images/stage1/문성하_사물함/문성하_1.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("2년이나 준비해서 그렇게 큰 상을 탈 수 있었겠지.")
                        .setBackgroundImage(new ImageIcon("images/stage1/문성하_사물함/문성하_1.png"))
                        .build()
        };
    }
    public static SceneData[] getOutroScene(){
        return new SceneData[]{
                        // Stage1 outro
                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("어, 저 사람은....")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("지호다. 성하가 죽기 전부터 꽤 오랫동안 성하와 붙어지낸 친구다.")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("친한 친구가 죽어서 그런지 모습이 많이 달라져 있었다. 원래 굉장히 깔끔하고 잘생긴 친구라서 학교 내에서 인기가 많았던 친구인데..")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("친한 친구가 죽어서 그런지 모습이 많이 달라져 있었다. 원래 굉장히 깔끔하고 잘생긴 친구라서 학교 내에서 인기가 많았던 친구인데..")
                        .setMainCharacterImage(new ImageIcon("images/characters/천지호_오른쪽.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("............")
                        .setMainCharacterImage(new ImageIcon("images/characters/폐인지호.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("..지호야.")
                        .setMainCharacterImage(new ImageIcon("images/characters/폐인지호.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(new ImageIcon("images/characters/프_지호.png"))
                        .setDialogue("아.. 지훈이구나.")
                        .setMainCharacterImage(new ImageIcon("images/characters/폐인지호.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("..소식 들었지?")
                        .setMainCharacterImage(new ImageIcon("images/characters/폐인지호.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(new ImageIcon("images/characters/프_지호.png"))
                        .setDialogue("......")
                        .setMainCharacterImage(new ImageIcon("images/characters/폐인지호.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("사실 너한테 물어보고 싶은게 있어. ")
                        .setMainCharacterImage(new ImageIcon("images/characters/폐인지호.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(new ImageIcon("images/characters/프_지호.png"))
                        .setDialogue("......")
                        .setMainCharacterImage(new ImageIcon("images/characters/폐인지호.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(new ImageIcon("images/characters/프_지호.png"))
                        .setDialogue(".....지훈아.")
                        .setMainCharacterImage(new ImageIcon("images/characters/폐인지호.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("응.")
                        .setMainCharacterImage(new ImageIcon("images/characters/폐인지호.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(new ImageIcon("images/characters/프_지호.png"))
                        .setDialogue("미안한데 나 그 얘기 하고 싶지 않아.")
                        .setMainCharacterImage(new ImageIcon("images/characters/폐인지호.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("아.....")
                        .setMainCharacterImage(new ImageIcon("images/characters/폐인지호.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(new ImageIcon("images/characters/프_지호.png"))
                        .setDialogue("...나중에 보자.")
                        .setMainCharacterImage(new ImageIcon("images/characters/폐인지호.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("역시 가장 친하던 친구가 갑자기 죽었다면 피폐해질만 하지....")
                        .build(),

                // 기타 장면 및 대화
                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("다음은 옥상을 가보자.")
                        .build(),

                new SceneData.Builder()
                        .setBackgroundImage(new ImageIcon("images/stage1/옥상.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("경비")
                        .setProfileImage(new ImageIcon("images/characters/프_경비.png"))
                        .setDialogue("허허.. 지금은 안 되지. 문창과 학생이라면 소식 들어서 알지 않나. 지금은 아무나 올라 갈수 없어요.")
                        .setMainCharacterImage(new ImageIcon("images/characters/경비.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("제가 꼭 확인하고 싶은 게 있어서 그래요.. 한 번만 눈 감아주시면 안 될까요?")
                        .setMainCharacterImage(new ImageIcon("images/characters/명지훈_오른쪽.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("경비")
                        .setProfileImage(new ImageIcon("images/characters/프_경비.png"))
                        .setDialogue("이건 학생을 위해서도 안 된다고 하는 걸세. 옥상에 출입할 수 있는 사람이 나밖에 없어서 나도 이번에 진술하느라 얼마나 힘들었는지 몰라. 지금 들어가면 학생 괜한 의심 살 수도 있어.")
                        .setMainCharacterImage(new ImageIcon("images/characters/경비.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("아...")
                        .setMainCharacterImage(new ImageIcon("images/characters/명지훈_오른쪽.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("경비")
                        .setProfileImage(new ImageIcon("images/characters/프_경비.png"))
                        .setDialogue("나도 참.. 하필 그 날에 열쇠를 잃어버려서.")
                        .setMainCharacterImage(new ImageIcon("images/characters/경비.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("네? 잃어버리셨다고요?")
                        .setMainCharacterImage(new ImageIcon("images/characters/명지훈_오른쪽.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("경비")
                        .setProfileImage(new ImageIcon("images/characters/프_경비.png"))
                        .setDialogue("잘 기억은 안 나지만 그날 옥상 열쇠만 사라졌지 뭔가. 원래 학생들 가져갈 수 있게 작게 열어두는 문을 잠구고 퇴근한 거 같은데 열려있었어. 재수도 참 없지.")
                        .setMainCharacterImage(new ImageIcon("images/characters/경비.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("..이게 우연일 리가 없다.")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("감사합니다, 아저씨.")
                        .setMainCharacterImage(new ImageIcon("images/characters/명지훈_오른쪽.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("다음으로 성하의 기숙사를 가 보자.")
                        .setMainCharacterImage(new ImageIcon("images/characters/명지훈_오른쪽.png"))
                        .build(),

                new SceneData.Builder()
                        .setBackgroundImage(new ImageIcon("images/stage1/지도.png"))
                        .build()

        };
    }
}
