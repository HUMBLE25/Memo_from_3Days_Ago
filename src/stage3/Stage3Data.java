package stage3;

import common.ImageRegistry;
import common.SceneData;
import javax.swing.ImageIcon;
import java.awt.*;

public class Stage3Data {
    // Images
    private static final ImageIcon profileJiHoon = ImageRegistry.getImage("character_프_지훈");
    private static final ImageIcon profileDoJin = ImageRegistry.getImage("character_프_도진");
    private static final ImageIcon profileHyeJin = ImageRegistry.getImage("character_프_혜진");
    private static final ImageIcon mainDoJin = ImageRegistry.getImage("character_도진");
    private static final ImageIcon mainHyeJin = ImageRegistry.getImage("character_혜진");
    private static final ImageIcon subJiHoonLeft = ImageRegistry.getImage("character_명지훈_왼쪽");
    private static final ImageIcon stage3ArtCenter = ImageRegistry.getImage("stage3_예체능관");
    private static final ImageIcon stage3Map = ImageRegistry.getImage("stage3_지도");
    private static final ImageIcon stage3SmokingArea = ImageRegistry.getImage("stage3_흡연실");


    // Stage3Intro 김도진 만나러감
    public static SceneData[] getAllScenes() {
        return new SceneData[]{
                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("일단 김도진을 만나야 한다. 아마 체육관에 있지 않을까?")
                        .build(),

                new SceneData.Builder()
                        .setBackgroundImage(stage3ArtCenter)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("김도진..?")
                        .setMainCharacterImage(mainDoJin)
                        .setSubCharacterImage(subJiHoonLeft)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("김도진")
                        .setProfileImage(profileDoJin)
                        .setDialogue("뭐야, 누구야?")
                        .setMainCharacterImage(mainDoJin)
                        .setSubCharacterImage(subJiHoonLeft)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("..난 성하 친구 명지훈이라고 해.")
                        .setMainCharacterImage(mainDoJin)
                        .setSubCharacterImage(subJiHoonLeft)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("김도진")
                        .setProfileImage(profileDoJin)
                        .setDialogue("성하..? 문성하? 그 자식 친구가 왜 날 찾아와?")
                        .setMainCharacterImage(mainDoJin)
                        .setSubCharacterImage(subJiHoonLeft)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("성하에 대해 물어볼 게 있어.")
                        .setMainCharacterImage(mainDoJin)
                        .setSubCharacterImage(subJiHoonLeft)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("김도진")
                        .setProfileImage(profileDoJin)
                        .setDialogue("그 자식 얘기라면 듣고 싶지도 않으니까 가라.")
                        .setMainCharacterImage(mainDoJin)
                        .setSubCharacterImage(subJiHoonLeft)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("...........")
                        .setSubCharacterImage(subJiHoonLeft)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("솔직히 많이 무섭지만 물러나면 안 된다. 성하를 생각하자.")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("한 번만 도와주면 안 될까? 내가 지금 간절해서 그래.")
                        .setMainCharacterImage(mainDoJin)
                        .setSubCharacterImage(subJiHoonLeft)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("김도진")
                        .setProfileImage(profileDoJin)
                        .setDialogue("말하기 싫다고 하지 않았냐? 말귀를 못 알아듣네?")
                        .setMainCharacterImage(mainDoJin)
                        .setSubCharacterImage(subJiHoonLeft)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("진짜 조금만.. 부탁할게....")
                        .setMainCharacterImage(mainDoJin)
                        .setSubCharacterImage(subJiHoonLeft)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("김도진")
                        .setProfileImage(profileDoJin)
                        .setDialogue("하.. 뭔데.")
                        .setMainCharacterImage(mainDoJin)
                        .setSubCharacterImage(subJiHoonLeft)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("......(일단 마혜진이랑 문성하의 사이에 대해 물어보는게 좋으려나....)")
                        .setMainCharacterImage(mainDoJin)
                        .setSubCharacterImage(subJiHoonLeft)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("김도진")
                        .setProfileImage(profileDoJin)
                        .setDialogue("빨리 말 안하냐? 꾸물거릴거면 꺼져.")
                        .setMainCharacterImage(mainDoJin)
                        .setSubCharacterImage(subJiHoonLeft)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("혹시.. 마혜진이랑 성하 말이야... 둘이 뭐 ...있었어..?")
                        .setMainCharacterImage(mainDoJin)
                        .setSubCharacterImage(subJiHoonLeft)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("김도진")
                        .setProfileImage(profileDoJin)
                        .setDialogue("너 지금 뭐라고 했냐? 갑자기 굴러들어온 자식이 안그래도 짜증나는 부분을 건드네?")
                        .setMainCharacterImage(mainDoJin)
                        .setSubCharacterImage(subJiHoonLeft)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("김도진")
                        .setProfileImage(profileDoJin)
                        .setDialogue("기생오라비 같이 비실거리는 놈이 혜진이한테 접근해서 어떻게 해보려던 자식이잖아. 그 자식은! 또 갑자기 화나려고 하네")
                        .setMainCharacterImage(mainDoJin)
                        .setSubCharacterImage(subJiHoonLeft)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("(그.. 물러터진 문성하가....?)")
                        .setMainCharacterImage(mainDoJin)
                        .setSubCharacterImage(subJiHoonLeft)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("김도진")
                        .setProfileImage(profileDoJin)
                        .setDialogue("뒤졌다는 소식 듣고 속 시원했는데 왜 상기시키고 난리야. 떨어져 죽는거 말고 나한테 맞아 죽었어야 했어.")
                        .setMainCharacterImage(mainDoJin)
                        .setSubCharacterImage(subJiHoonLeft)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("말이 좀.. 심한 거 같지 않아?")
                        .setMainCharacterImage(mainDoJin)
                        .setSubCharacterImage(subJiHoonLeft)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("김도진")
                        .setProfileImage(profileDoJin)
                        .setDialogue("뭐라고 했냐? 지금 걔네가 바람핀 게 내 잘못이라는 거냐?")
                        .setMainCharacterImage(mainDoJin)
                        .setSubCharacterImage(subJiHoonLeft)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("아니 그게 아니라..")
                        .setMainCharacterImage(mainDoJin)
                        .setSubCharacterImage(subJiHoonLeft)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("(내 생각보다 더 욱하는 성격인 것 같다. 말이 안 통하네.. 화가 나 보이는데 더 이상 대화를 이어가긴 힘들 것 같다..)")
                        .setMainCharacterImage(mainDoJin)
                        .setSubCharacterImage(subJiHoonLeft)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("기분 나쁘게 했다면 미안해. 근데 내가 진짜 간절해서 말이야. 혜진이랑 내가 얘기좀 해봐도 될까?")
                        .setMainCharacterImage(mainDoJin)
                        .setSubCharacterImage(subJiHoonLeft)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("김도진")
                        .setProfileImage(profileDoJin)
                        .setDialogue("뭐? 그 자식 친구 아니랄까봐 지금 나한테서 마혜진이랑 문성하 얘길 하겠다는거냐? 장난까냐?")
                        .setMainCharacterImage(mainDoJin)
                        .setSubCharacterImage(subJiHoonLeft)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("아냐..! 그런 의미가 아니야. 그냥 성하가 죽기 전에..!")
                        .setMainCharacterImage(mainDoJin)
                        .setSubCharacterImage(subJiHoonLeft)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("김도진")
                        .setProfileImage(profileDoJin)
                        .setDialogue("짜증나게 하지 말고 마혜진 찾아서 데리고 꺼지던지 그냥 꺼지던지 눈 앞에서 당장 꺼져. 흡연실을 가보던 교실을 가보던 네가 알아서 해라. 그래도 뒤진놈 친구니까 떄리진 않을테니")
                        .setMainCharacterImage(mainDoJin)
                        .setSubCharacterImage(subJiHoonLeft)
                        .build(),


                // stage3Map and MJH_MHJ_Daehwa
                new SceneData.Builder()
                        .setBackgroundImage(stage3Map)
                        .build(),

                new SceneData.Builder()
                        .setBackgroundImage(stage3SmokingArea)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("저기 있다....")
                        .setSubCharacterImage(subJiHoonLeft)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("마혜진..?")
                        .setSubCharacterImage(subJiHoonLeft)
                        .setMainCharacterImage(mainHyeJin)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("마혜진")
                        .setProfileImage(profileHyeJin)
                        .setDialogue("...누구세요?")
                        .setSubCharacterImage(subJiHoonLeft)
                        .setMainCharacterImage(mainHyeJin)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("아, 나는 성하 친구")
                        .setSubCharacterImage(subJiHoonLeft)
                        .setMainCharacterImage(mainHyeJin)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("마혜진")
                        .setProfileImage(profileHyeJin)
                        .setDialogue("..!!!!")
                        .setSubCharacterImage(subJiHoonLeft)
                        .setMainCharacterImage(mainHyeJin)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("마혜진")
                        .setProfileImage(profileHyeJin)
                        .setDialogue("미안한데 난 할 얘기 없어. 먼저 가볼게.")
                        .setSubCharacterImage(subJiHoonLeft)
                        .setMainCharacterImage(mainHyeJin)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("아니, 잠깐만! 네 도움이 꼭 필요해! 성하가 자살을 했을 리가 없잖아. 네가 성하를 잘 알잖아!")
                        .setSubCharacterImage(subJiHoonLeft)
                        .setMainCharacterImage(mainHyeJin)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("마혜진")
                        .setProfileImage(profileHyeJin)
                        .setDialogue("알던 모르던 무슨 상관인데! 너 지금 나한테 이러는거 김도진이 알면 너도 죽는다고!")
                        .setSubCharacterImage(subJiHoonLeft)
                        .setMainCharacterImage(mainHyeJin)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("마혜진")
                        .setProfileImage(profileHyeJin)
                        .setDialogue("안 그래도 저 자식이 성하 개 패듯이 팬적 있어서 김도진이 죽인거 아니냐고 소문이 돌고 있는데 이렇게 대놓고 찾아오다니 제정신이야?")
                        .setSubCharacterImage(subJiHoonLeft)
                        .setMainCharacterImage(mainHyeJin)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("마혜진")
                        .setProfileImage(profileHyeJin)
                        .setDialogue("가! 난 할 말 없어.")
                        .setSubCharacterImage(subJiHoonLeft)
                        .setMainCharacterImage(mainHyeJin)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("아냐, 잠깐 기다려! 정말 몇 마디면 돼. 네가 있어야 성하가 왜 죽었는지 알 수가 있다고!")
                        .setSubCharacterImage(subJiHoonLeft)
                        .setMainCharacterImage(mainHyeJin)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("마혜진")
                        .setProfileImage(profileHyeJin)
                        .setDialogue("..........")
                        .setSubCharacterImage(subJiHoonLeft)
                        .setMainCharacterImage(mainHyeJin)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("너 성하 좋아했었잖아.")
                        .setSubCharacterImage(subJiHoonLeft)
                        .setMainCharacterImage(mainHyeJin)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("성하 이제 죽은 사람이잖아. 한 번만 도와줘. 부탁이야.")
                        .setSubCharacterImage(subJiHoonLeft)
                        .setMainCharacterImage(mainHyeJin)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("마혜진")
                        .setProfileImage(profileHyeJin)
                        .setDialogue("..어디서 들었는 지는 모르겠지만 걔 나랑 큰 관련 없어.")
                        .setSubCharacterImage(subJiHoonLeft)
                        .setMainCharacterImage(mainHyeJin)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("혜진아, 제발.")
                        .setSubCharacterImage(subJiHoonLeft)
                        .setMainCharacterImage(mainHyeJin)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("마혜진")
                        .setProfileImage(profileHyeJin)
                        .setDialogue("아니, 진짜라고! 내가 걔 좋아한 건 맞는데.. 성하가 죽....")
                        .setSubCharacterImage(subJiHoonLeft)
                        .setMainCharacterImage(mainHyeJin)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("(순간 마혜진의 목소리가 울먹여지는 것이 느껴졌다.)")
                        .setSubCharacterImage(subJiHoonLeft)
                        .setMainCharacterImage(mainHyeJin)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("마혜진")
                        .setProfileImage(profileHyeJin)
                        .setDialogue("..아무튼 걔 자살 맞을 거야. 많이 힘들어해서 나랑도 연락 안한지 오래됐다고.")
                        .setSubCharacterImage(subJiHoonLeft)
                        .setMainCharacterImage(mainHyeJin)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("자살이 맞을 거라고?")
                        .setSubCharacterImage(subJiHoonLeft)
                        .setMainCharacterImage(mainHyeJin)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("마혜진")
                        .setProfileImage(profileHyeJin)
                        .setDialogue("실제로 나한테 죽고 싶다는 말을 얼마나 많이 했는데, 금교수님 만나고 와서부터 인가 갑자기 심해져서 술 담배도 안 하던 애가 매일 술만 마시고 지냈어.")
                        .setSubCharacterImage(subJiHoonLeft)
                        .setMainCharacterImage(mainHyeJin)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("마혜진")
                        .setProfileImage(profileHyeJin)
                        .setDialogue("...아무튼 이제 가. 이제 걔 얘기 하고 싶지 않아.")
                        .setSubCharacterImage(subJiHoonLeft)
                        .setMainCharacterImage(mainHyeJin)
                        .build(),

        };
    }
}