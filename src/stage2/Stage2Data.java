package stage2;

import common.SceneData;
import javax.swing.ImageIcon;

public class Stage2Data {
    public static SceneData[] getIntroScenes(){
        // Stage2Intro
        // 학교 앞 장면
        return new SceneData[]{
                new SceneData.Builder()
                        .setBackgroundImage(new ImageIcon("images/stage2/학교앞장면.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("성하 방에 들어가보자.")
                        .build()
        };
    }

    public static SceneData[] getDiaryStroyScenes(){
        return new SceneData[]{
                // 성하 일기장 선택 스토리
                // 성하 일기장 선택
                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("성하의 일기장을 발견했다.")
                        .setBackgroundImage(new ImageIcon("images/stage2/성하_일기.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("표절이라.. 자세히 들은 건 없지만 아무래도 성하가 이번에 자살을 했다고 소문이 도는 이유가 이것 때문이 아닐까.")
                        .setBackgroundImage(new ImageIcon("images/stage2/성하_일기.png"))
                        .build(),
        };
    }

    public static SceneData[] getPhoneStoryScenes(){
        return new SceneData[]{
                // 성하 휴대폰 선택 스토리
                // 성하 휴대폰 선택
                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("김도진이라면... 우리학교에서 유명한 인물이다.")
                        .setBackgroundImage(new ImageIcon("images/stage2/휴대폰.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("폭력적인 걸로 유명한 사람이다... 이 사람이 왜 성하에게 협박을 했을까?")
                        .setBackgroundImage(new ImageIcon("images/stage2/휴대폰.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("마혜진이라면 아마 김도진의 여자친구일 것이다. 이 여자랑 성하가 연락하는 사이였나?")
                        .setBackgroundImage(new ImageIcon("images/stage2/휴대폰.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("... 김도진 ...마혜진 그리고 성하의 관계를 알아봐야겠다.")
                        .setBackgroundImage(new ImageIcon("images/stage2/휴대폰.png"))
                        .build(),
        };
    }

    public static SceneData[] getPresentStoryScenes(){
        return new SceneData[]{
                // 선물 상자 선택 스토리
                // 선물 상자 선택
                new SceneData.Builder()
                        .setBackgroundImage(new ImageIcon("images/stage2/성하_방.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("..이건 웬 선물 박스지? 편지도 있다.")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("편지를 한번 읽어 보자.")
                        .setBackgroundImage(new ImageIcon("images/stage2/편지상자.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("...이 자식.. 이건 남자친구있는 여자애랑 바람을 피다니.. 그것도 김도진 여친이랑..")
                        .setBackgroundImage(new ImageIcon("images/stage2/편지.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("김도진한테 맞았다고? 성하가?")
                        .setBackgroundImage(new ImageIcon("images/stage2/편지.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("좀 무섭긴 하지만 김도진을 찾아가봐야 할 것 같다.")
                        .build(),
        };
    }

    public static SceneData[] getOutroScenes(){
        return new SceneData[]{
                // Stage2Outro
                // 지호 방 입장
                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("성하 옆 방이 지호 방이었구나. 지금 지호 방에 있나?")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("지호의 방엔 아무도 없고 문도 열려 있었다.")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("찾는 김에 한번 들어가보자. 금방 나오면 되겠지.")
                        .setBackgroundImage(new ImageIcon("images/stage2/지호_방.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("책상 위에 실핀이 있다. 하나가 아니라 잔뜩.")
                        .setBackgroundImage(new ImageIcon("images/stage2/실핀.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("이제 김도진, 마혜진의 관계를 찾기 위해 예체능관에 가보자.")
                        .build(),

                new SceneData.Builder()
                        .setBackgroundImage(new ImageIcon("images/stage2/지도.png"))
                        .build(),
        };
    }
}
