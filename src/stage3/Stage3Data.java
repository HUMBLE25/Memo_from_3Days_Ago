package stage3;

import common.SceneData;
import javax.swing.ImageIcon;
import java.awt.*;

public class Stage3Data {
    // 단계 별로 나눈다.

    // Stage3Intro 김도진 만나러감
    public static SceneData[] getMJH_KDJ_daehwa() {
        return new SceneData[]{
                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("일단 김도진을 만나야 한다. 아마 체육관에 있지 않을까?")
                        .setMainCharacterImage(new ImageIcon("images/characters/명지훈_왼쪽.png"))
                        .build(),

                new SceneData.Builder()
                        .setBackgroundImage(new ImageIcon("images/stage3/예체능관.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("김도진..?")
                        .setMainCharacterImage(new ImageIcon("images/characters/명지훈_왼쪽.png"))
                        .setsubCharacterImage(new ImageIcon("images/characters/도진.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("김도진")
                        .setProfileImage(new ImageIcon("images/characters/프_도진.png"))
                        .setDialogue("뭐야, 누구야?")
                        .setMainCharacterImage(new ImageIcon("images/characters/명지훈_왼쪽.png"))
                        .setsubCharacterImage(new ImageIcon("images/characters/도진.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("..난 성하 친구 명지훈이라고 해.")
                        .setMainCharacterImage(new ImageIcon("images/characters/명지훈_왼쪽.png"))
                        .setsubCharacterImage(new ImageIcon("images/characters/도진.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("김도진")
                        .setProfileImage(new ImageIcon("images/characters/프_도진.png"))
                        .setDialogue("성하..? 문성하? 그 자식 친구가 왜 날 찾아와?")
                        .setMainCharacterImage(new ImageIcon("images/characters/명지훈_왼쪽.png"))
                        .setsubCharacterImage(new ImageIcon("images/characters/도진.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("성하에 대해 물어볼 게 있어.")
                        .setMainCharacterImage(new ImageIcon("images/characters/명지훈_왼쪽.png"))
                        .setsubCharacterImage(new ImageIcon("images/characters/도진.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("김도진")
                        .setProfileImage(new ImageIcon("images/characters/프_도진.png"))
                        .setDialogue("그 자식 얘기라면 듣고 싶지도 않으니까 가라.")
                        .setMainCharacterImage(new ImageIcon("images/characters/명지훈_왼쪽.png"))
                        .setsubCharacterImage(new ImageIcon("images/characters/도진.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("...........")
                        .setMainCharacterImage(new ImageIcon("images/characters/명지훈_왼쪽.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("솔직히 많이 무섭지만 물러나면 안 된다. 성하를 생각하자.")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("한 번만 도와주면 안 될까? 내가 지금 간절해서 그래.")
                        .setMainCharacterImage(new ImageIcon("images/characters/명지훈_왼쪽.png"))
                        .setsubCharacterImage(new ImageIcon("images/characters/도진.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("김도진")
                        .setProfileImage(new ImageIcon("images/characters/프_도진.png"))
                        .setDialogue("말하기 싫다고 하지 않았냐? 말귀를 못알아듣네?")
                        .setMainCharacterImage(new ImageIcon("images/characters/명지훈_왼쪽.png"))
                        .setsubCharacterImage(new ImageIcon("images/characters/도진.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("진짜 조금만.. 부탁할게....")
                        .setMainCharacterImage(new ImageIcon("images/characters/명지훈_왼쪽.png"))
                        .setsubCharacterImage(new ImageIcon("images/characters/도진.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("김도진")
                        .setProfileImage(new ImageIcon("images/characters/프_도진.png"))
                        .setDialogue("하.. 뭔데.")
                        .setMainCharacterImage(new ImageIcon("images/characters/명지훈_왼쪽.png"))
                        .setsubCharacterImage(new ImageIcon("images/characters/도진.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("......(일단 마혜진이랑 문성하의 사이에 대해 물어보는게 좋으려나....)")
                        .setMainCharacterImage(new ImageIcon("images/characters/명지훈_왼쪽.png"))
                        .setsubCharacterImage(new ImageIcon("images/characters/도진.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("김도진")
                        .setProfileImage(new ImageIcon("images/characters/프_도진.png"))
                        .setDialogue("빨리 말 안하냐? 꾸물거릴거면 꺼져.")
                        .setMainCharacterImage(new ImageIcon("images/characters/명지훈_왼쪽.png"))
                        .setsubCharacterImage(new ImageIcon("images/characters/도진.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("혹시.. 마혜진이랑 성하 말이야... 둘이 뭐 ...있었어..?")
                        .setMainCharacterImage(new ImageIcon("images/characters/명지훈_왼쪽.png"))
                        .setsubCharacterImage(new ImageIcon("images/characters/도진.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("김도진")
                        .setProfileImage(new ImageIcon("images/characters/프_도진.png"))
                        .setDialogue("너 지금 뭐라고 했냐? 갑자기 굴러들어온 자식이 안그래도 짜증나는 부분을 건드네?")
                        .setMainCharacterImage(new ImageIcon("images/characters/명지훈_왼쪽.png"))
                        .setsubCharacterImage(new ImageIcon("images/characters/도진.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("김도진")
                        .setProfileImage(new ImageIcon("images/characters/프_도진.png"))
                        .setDialogue("기생오라비 같이 비실거리는 놈이 혜진이한테 접근해서 어떻게 해보려던 자식이잖아. 그 자식은! 또 갑자기 화나려고 하네")
                        .setMainCharacterImage(new ImageIcon("images/characters/명지훈_왼쪽.png"))
                        .setsubCharacterImage(new ImageIcon("images/characters/도진.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("(그.. 물러터진 문성하가....?)")
                        .setMainCharacterImage(new ImageIcon("images/characters/명지훈_왼쪽.png"))
                        .setsubCharacterImage(new ImageIcon("images/characters/도진.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("김도진")
                        .setProfileImage(new ImageIcon("images/characters/프_도진.png"))
                        .setDialogue("뒤졌다는 소식 듣고 속 시원했는데 왜 상기시키고 난리야. 떨어져 죽는거 말고 나한테 맞아 죽었어야 했어.")
                        .setMainCharacterImage(new ImageIcon("images/characters/명지훈_왼쪽.png"))
                        .setsubCharacterImage(new ImageIcon("images/characters/도진.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("말이 좀.. 심한 거 같지 않아?")
                        .setMainCharacterImage(new ImageIcon("images/characters/명지훈_왼쪽.png"))
                        .setsubCharacterImage(new ImageIcon("images/characters/도진.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("김도진")
                        .setProfileImage(new ImageIcon("images/characters/프_도진.png"))
                        .setDialogue("뭐라고 했냐? 지금 걔네가 바람핀 게 내 잘못이라는 거냐?")
                        .setMainCharacterImage(new ImageIcon("images/characters/명지훈_왼쪽.png"))
                        .setsubCharacterImage(new ImageIcon("images/characters/도진.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("아니 그게 아니라..")
                        .setMainCharacterImage(new ImageIcon("images/characters/명지훈_왼쪽.png"))
                        .setsubCharacterImage(new ImageIcon("images/characters/도진.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("(내 생각보다 더 욱하는 성격인 것 같다. 말이 안 통하네.. 화가 나 보이는데 더 이상 대화를 이어가긴 힘들 것 같다..)")
                        .setMainCharacterImage(new ImageIcon("images/characters/명지훈_왼쪽.png"))
                        .setsubCharacterImage(new ImageIcon("images/characters/도진.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("기분 나쁘게 했다면 미안해. 근데 내가 진짜 간절해서 말이야. 혜진이랑 내가 얘기좀 해봐도 될까?")
                        .setMainCharacterImage(new ImageIcon("images/characters/명지훈_왼쪽.png"))
                        .setsubCharacterImage(new ImageIcon("images/characters/도진.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("김도진")
                        .setProfileImage(new ImageIcon("images/characters/프_도진.png"))
                        .setDialogue("뭐? 그 자식 친구 아니랄까봐 지금 나한테서 마혜진이랑 문성하 얘길 하겠다는거냐? 장난까냐?")
                        .setMainCharacterImage(new ImageIcon("images/characters/명지훈_왼쪽.png"))
                        .setsubCharacterImage(new ImageIcon("images/characters/도진.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("아냐..! 그런 의미가 아니야. 그냥 성하가 죽기 전에..!")
                        .setMainCharacterImage(new ImageIcon("images/characters/명지훈_왼쪽.png"))
                        .setsubCharacterImage(new ImageIcon("images/characters/도진.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("김도진")
                        .setProfileImage(new ImageIcon("images/characters/프_도진.png"))
                        .setDialogue("짜증나게 하지 말고 마혜진 찾아서 데리고 꺼지던지 그냥 꺼지던지 눈 앞에서 당장 꺼져. 흡연실을 가보던 교실을 가보던 네가 알아서 해라. 그래도 뒤진놈 친구니까 떄리진 않을테니")
                        .setMainCharacterImage(new ImageIcon("images/characters/명지훈_왼쪽.png"))
                        .setsubCharacterImage(new ImageIcon("images/characters/도진.png"))
                        .build(),
        };
    }

    public static SceneData[] getOutroScene(){
        return new SceneData[]{
                // stage3Map and MJH_MHJ_Daehwa
                new SceneData.Builder()
                        .setBackgroundImage(new ImageIcon("images/stage3/지도.png"))
                        .build(),

                new SceneData.Builder()
                        .setBackgroundImage(new ImageIcon("images/stage3/흡연실.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("저기 있다....")
                        .setMainCharacterImage(new ImageIcon("images/characters/명지훈_왼쪽.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("마혜진..?")
                        .setMainCharacterImage(new ImageIcon("images/characters/명지훈_왼쪽.png"))
                        .setsubCharacterImage(new ImageIcon("images/characters/혜진.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("마혜진")
                        .setProfileImage(new ImageIcon("images/characters/프_혜진.png"))
                        .setDialogue("...누구세요?")
                        .setMainCharacterImage(new ImageIcon("images/characters/명지훈_왼쪽.png"))
                        .setsubCharacterImage(new ImageIcon("images/characters/혜진.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("아, 나는 성하 친구")
                        .setMainCharacterImage(new ImageIcon("images/characters/명지훈_왼쪽.png"))
                        .setsubCharacterImage(new ImageIcon("images/characters/혜진.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("마혜진")
                        .setProfileImage(new ImageIcon("images/characters/프_혜진.png"))
                        .setDialogue("..!!!!")
                        .setMainCharacterImage(new ImageIcon("images/characters/명지훈_왼쪽.png"))
                        .setsubCharacterImage(new ImageIcon("images/characters/혜진.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("마혜진")
                        .setProfileImage(new ImageIcon("images/characters/프_혜진.png"))
                        .setDialogue("미안한데 난 할 얘기 없어. 먼저 가볼게.")
                        .setMainCharacterImage(new ImageIcon("images/characters/명지훈_왼쪽.png"))
                        .setsubCharacterImage(new ImageIcon("images/characters/혜진.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("아니, 잠깐만! 네 도움이 꼭 필요해! 성하가 자살을 했을 리가 없잔아. 네가 성하를 잘 알잖아!")
                        .setMainCharacterImage(new ImageIcon("images/characters/명지훈_왼쪽.png"))
                        .setsubCharacterImage(new ImageIcon("images/characters/혜진.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("마혜진")
                        .setProfileImage(new ImageIcon("images/characters/프_혜진.png"))
                        .setDialogue("알던 모르던 무슨 상관인데! 너 지금 나한테 이러는거 김도진이 알면 너도 죽는다고!")
                        .setMainCharacterImage(new ImageIcon("images/characters/명지훈_왼쪽.png"))
                        .setsubCharacterImage(new ImageIcon("images/characters/혜진.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("마혜진")
                        .setProfileImage(new ImageIcon("images/characters/프_혜진.png"))
                        .setDialogue("안 그래도 저 자식이 성하 개 패듯이 팬적 있어서 김도진이 죽인거 아니냐고 소문이 돌고 있는데 이렇게 대놓고 찾아오다니 제정신이야?")
                        .setMainCharacterImage(new ImageIcon("images/characters/명지훈_왼쪽.png"))
                        .setsubCharacterImage(new ImageIcon("images/characters/혜진.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("마혜진")
                        .setProfileImage(new ImageIcon("images/characters/프_혜진.png"))
                        .setDialogue("가! 난 할 말 없어.")
                        .setMainCharacterImage(new ImageIcon("images/characters/명지훈_왼쪽.png"))
                        .setsubCharacterImage(new ImageIcon("images/characters/혜진.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("아냐, 잠깐 기다려! 정말 몇 마디면 돼. 네가 있어야 성하가 왜 죽었는지 알 수가 있다고!")
                        .setMainCharacterImage(new ImageIcon("images/characters/명지훈_왼쪽.png"))
                        .setsubCharacterImage(new ImageIcon("images/characters/혜진.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("마혜진")
                        .setProfileImage(new ImageIcon("images/characters/프_혜진.png"))
                        .setDialogue("..........")
                        .setMainCharacterImage(new ImageIcon("images/characters/명지훈_왼쪽.png"))
                        .setsubCharacterImage(new ImageIcon("images/characters/혜진.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("너 성하 좋아했었잔아.")
                        .setMainCharacterImage(new ImageIcon("images/characters/명지훈_왼쪽.png"))
                        .setsubCharacterImage(new ImageIcon("images/characters/혜진.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("성하 이제 죽은 사람이잖아. 한 번만 도와줘. 부탁이야.")
                        .setMainCharacterImage(new ImageIcon("images/characters/명지훈_왼쪽.png"))
                        .setsubCharacterImage(new ImageIcon("images/characters/혜진.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("마혜진")
                        .setProfileImage(new ImageIcon("images/characters/프_혜진.png"))
                        .setDialogue("..어디서 들었는 지는 모르겠지만 걔 나랑 큰 관련 없어.")
                        .setMainCharacterImage(new ImageIcon("images/characters/명지훈_왼쪽.png"))
                        .setsubCharacterImage(new ImageIcon("images/characters/혜진.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("혜진아, 제발.")
                        .setMainCharacterImage(new ImageIcon("images/characters/명지훈_왼쪽.png"))
                        .setsubCharacterImage(new ImageIcon("images/characters/혜진.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("마혜진")
                        .setProfileImage(new ImageIcon("images/characters/프_혜진.png"))
                        .setDialogue("아니, 진짜라고! 내가 걔 좋아한 건 맞는데.. 성하가 죽....")
                        .setMainCharacterImage(new ImageIcon("images/characters/명지훈_왼쪽.png"))
                        .setsubCharacterImage(new ImageIcon("images/characters/혜진.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("(순간 마혜진의 목소리가 울먹여지는 것이 느껴졌다.)")
                        .setMainCharacterImage(new ImageIcon("images/characters/명지훈_왼쪽.png"))
                        .setsubCharacterImage(new ImageIcon("images/characters/혜진.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("마혜진")
                        .setProfileImage(new ImageIcon("images/characters/프_혜진.png"))
                        .setDialogue("..아무튼 걔 자살 맞을 거야. 많이 힘들어해서 나랑도 연락 안힌지 오래됐다고.")
                        .setMainCharacterImage(new ImageIcon("images/characters/명지훈_왼쪽.png"))
                        .setsubCharacterImage(new ImageIcon("images/characters/혜진.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(new ImageIcon("images/characters/프_지훈.png"))
                        .setDialogue("자살이 맞을 거라고?")
                        .setMainCharacterImage(new ImageIcon("images/characters/명지훈_왼쪽.png"))
                        .setsubCharacterImage(new ImageIcon("images/characters/혜진.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("마혜진")
                        .setProfileImage(new ImageIcon("images/characters/프_혜진.png"))
                        .setDialogue("실제로 나한테 죽고 싶다는 말을 얼마나 많이 했는데, 금교수님 만나고 와서부터 인가 갑자기 심해져서 술 담배도 안 하던 애가 매일 술만 마시고 지냈어.")
                        .setMainCharacterImage(new ImageIcon("images/characters/명지훈_왼쪽.png"))
                        .setsubCharacterImage(new ImageIcon("images/characters/혜진.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("마혜진")
                        .setProfileImage(new ImageIcon("images/characters/프_혜진.png"))
                        .setDialogue("...아무튼 이제 가. 이제 걔 얘기 하고 싶지 않아.")
                        .setMainCharacterImage(new ImageIcon("images/characters/명지훈_왼쪽.png"))
                        .setsubCharacterImage(new ImageIcon("images/characters/혜진.png"))
                        .build(),
        };
    }
}