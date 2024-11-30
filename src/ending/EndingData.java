package ending;

import common.ImageRegistry;
import common.SceneData;

import javax.swing.*;

public class EndingData {
    // Images
    private static final ImageIcon profileJiHoon = ImageRegistry.getImage("character_프_지훈");
    private static final ImageIcon profileSungHa = ImageRegistry.getImage("character_프_성하");
    private static final ImageIcon profileJiHo = ImageRegistry.getImage("character_프_지호");
    private static final ImageIcon profileSungMin = ImageRegistry.getImage("character_프_성민");
    private static final ImageIcon profileMyungHo = ImageRegistry.getImage("character_프_명호");

    private static final ImageIcon characterJiHoonFront = ImageRegistry.getImage("character_천지호_앞");
    private static final ImageIcon characterDoJin = ImageRegistry.getImage("character_도진");
    private static final ImageIcon characterMyungHo = ImageRegistry.getImage("character_전명호_앞");
    private static final ImageIcon characterSungMin = ImageRegistry.getImage("character_성민");
    private static final ImageIcon characterSungHa = ImageRegistry.getImage("character_문성하_왼쪽");
    private static final ImageIcon characterSungHaRight = ImageRegistry.getImage("character_문성하_오른쪽");

    private static final ImageIcon wrongAnswer = ImageRegistry.getImage("Ending_오답");
    private static final ImageIcon failedRevenge = ImageRegistry.getImage("Ending_오답_복수");
    private static final ImageIcon roofTop = ImageRegistry.getImage("Ending_옥상");
    private static final ImageIcon computer = ImageRegistry.getImage("Ending_컴퓨터");
    private static final ImageIcon computerLetter = ImageRegistry.getImage("Ending_컴퓨터_글");
    private static final ImageIcon phone = ImageRegistry.getImage("Ending_휴대폰");
    private static final ImageIcon MyeongHoonSungHaFight = ImageRegistry.getImage("Ending_명훈_성하_폭행");
    private static final ImageIcon meatRestaurant = ImageRegistry.getImage("Ending_고기집");
    private static final ImageIcon SungHaJiHoFight = ImageRegistry.getImage("Ending_성하_지호_말싸움");
    private static final ImageIcon SungHaLetter = ImageRegistry.getImage("Ending_성하편지");
    private static final ImageIcon dayAfterMemo = ImageRegistry.getImage("Ending_3일뒤메모");
    private static final ImageIcon myeonHoJiHoFight = ImageRegistry.getImage("Ending_명훈_지호_몸싸움");
    private static final ImageIcon beforeFalling = ImageRegistry.getImage("Ending_추락전");
    private static final ImageIcon falling = ImageRegistry.getImage("Ending_추락");


    // Ending intro
    public static SceneData[] getIntro(){
        return new SceneData[]{
                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("난 오늘 성하가 죽은 이유를 밝힐 것이다.\n" +
                                "성하가 죽은 이유를 밝힐 증거를 모두 모았다.")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("모은 증거로 미루어볼 때 용의자는 다음 네 명이다.")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("첫 번째 용의자는 천지호. 문성하와 프로젝트를 같이 준비한 사람이다.")
                        .setMainCharacterImage(characterJiHoonFront)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("천지호는 문성하가 힘든 시기 같은 이유로 힘들어했던 유일한 사람이고 성하와 \n" +
                                "가장 많은 시간을 보낸 사람이다.")
                        .setMainCharacterImage(characterJiHoonFront)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("천지호에게 의심이 가게 했던 증거들은 문성하가 죽은 날 그에게 찍힌 수많은 \n" +
                                "발신 전화, 문성하의 이야기를 격하게 피한다는 점,그리고 몸싸움의 흔적이다.")
                        .setMainCharacterImage(characterJiHoonFront)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("하지만 이것만으로는 확신할 수 없어. 문성하가 무슨 일이 생겨서 도와달라고\n" +
                                "급하게 전화를 한 걸 수도 있어. 그리고 천지호 또한 피폐한 정신 상태이기에 \n" +
                                "저 상처들이 남에 의해서 생긴 것들이라고 단정 지을 수 없으니까.")
                        .setMainCharacterImage(characterJiHoonFront)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("두 번째 용의자는 김도진. 문성하에게 실제로 위협을 가한 마혜진의 남자친구\n" +
                                "이다.")
                        .setMainCharacterImage(characterDoJin)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("김도진은 자신의 여자친구와 바람을 폈다는 이유를 문성하를 구타한 전적이 있다.")
                        .setMainCharacterImage(characterDoJin)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("김도진에게 의심이 가게 했던 증거들은 과거뿐 아니라 문성하의 휴대폰에 있는\n" +
                                "협박 흔적, 현재까지 가지고 있는 증오심이다. 그가 분노를 참지 못하는 성격\n" +
                                "이라는 점도 어쩌면 심적 증거가 될 수 있다.")
                        .setMainCharacterImage(characterDoJin)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("나와 일면식이 있진 않지만 그가 가끔 분을 못이겨 선배 후배 가리지 않고 폭행\n" +
                                "을 했다는 사실은 가끔 들려왔다. 사람이 죽었는데 잘 죽었다니 참 제정신이 아\n" +
                                "닌 인간이다.")
                        .setMainCharacterImage(characterDoJin)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("세 번째 용의자는 전명호. 문성하의 죽음이 잘 됐다고 신나게 떠들던 전화의 주인\n" +
                                "공이다.")
                        .setMainCharacterImage(new ImageIcon("images/characters/전명호_앞.png"))
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("전명호는 우리 대학원 최초로 청림신춘문예 대상에 이름을 올려 벌써 등단을 준비\n" +
                                "하는 과 최대 아웃풋이라고 할 수 있다.")
                        .setMainCharacterImage(characterMyungHo)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("이런 선배가 왜 문성하의 죽음이 잘 됐다고 했을까? 이 선배가 말한 불안한 일\n" +
                                "은 무엇일까? 인간적으로 라이벌이 줄었다는 이유로 사람이 죽은 것에 대해 잘\n" +
                                "됐다고 말할 비인간적인 사람은 많지 않아.")
                        .setMainCharacterImage(characterMyungHo)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("네 번째 용의자는 금성민 교수. 문성하가 자기 때문에 자살했을 것이라고 굴뚝같\n" +
                                "이 믿고 있는 사람이다.")
                        .setMainCharacterImage(characterSungMin)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("금성민 교수에 대한 이야기는 성하의 일기장과 마혜진의 진술로도 충분하다. 정\n" +
                                "확히 어떻게 혼냈는 지는 몰라도 죄책감이 그렇게 큰 걸로 보아 할 말 못 할 말 \n" +
                                "다 하면서 혼낸 것 같다.")
                        .setMainCharacterImage(characterSungMin)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("하지만 내가 아는 문성하는 누군가가 혼냈다고 해서 자살을 할 아이가 아니야.\n" +
                                "누군가 글을 쓰지 말라고 자신을 죽도록 때려도 글을 쓰고 싶다고 하던 아이니\n" +
                                "까.")
                        .setMainCharacterImage(characterSungMin)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("증거는 모두 찾았다. 이제 추리만 잘 하면 성하가 죽은 이유를 맞출 수 있어.")
                        .build(),
        };
    }

    // 오답
    public static SceneData[] getWrongAnswerScenes(){
        return new SceneData[]{
                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("모은 증거와 내 추리를 경찰에게 말했다가 인정 받지 못했다.\n")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("오히려 친구이던 내가 이상한 궤변을 늘어놓은 바람에 성하가 표절의 죄를 감당\n" +
                                "하지 못해 극단적 선택을 해버렸다는 것이 사실로 굳혀지고 있다.")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("내 추리는 틀렸다. 오히려 성하의 죽음을 단순 자살로 처리되게 만들 뿐이었다.")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("난 죽은 친구를 위해 아무것도 해줄 수 없었다..")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("명지훈")
                        .setProfileImage(profileJiHoon)
                        .setDialogue("난 죽은 친구를 위해 아무것도 해줄 수 없었다..")
                        .setBackgroundImage(wrongAnswer)
                        .build(),

                new SceneData.Builder()
                        .setBackgroundImage(failedRevenge)
                        .build(),


        };
    }

    // 정답
    public static SceneData[] getAnswerScenes(){
        return new SceneData[]{
                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setDialogue("어제 내가 준거.. 읽어봤어?")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setDialogue("야, 이거..")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setDialogue("어때..?")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setMainCharacterImage(characterJiHoonFront)
                        .setDialogue("성하야. 입발린 소리가 아니라 진심으로 이거 잘 다듬으면 청림 대상감이야.")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setSubCharacterImage(characterSungHa)
                        .setMainCharacterImage(characterJiHoonFront)
                        .setDialogue("어..? 아냐, 그 정도까지는..")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setSubCharacterImage(characterSungHa)
                        .setMainCharacterImage(characterJiHoonFront)
                        .setDialogue("나 믿어. 이건 진짜 문학계에 줄 하나 그을 것 같은 작이야. 살면서 읽은 것 중에\n" +
                                "제일 재밌었어.")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setSubCharacterImage(characterSungHa)
                        .setMainCharacterImage(characterJiHoonFront)
                        .setDialogue("진짜..?")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setSubCharacterImage(characterSungHa)
                        .setMainCharacterImage(characterJiHoonFront)
                        .setDialogue("근데 여기서 이 설정을 고치면 어때? 차라리 여자애를 부자로 해서 남자가애가\n" +
                                "입원을 한 뒤에도 챙겨줄 여유가 되는 거야. 그게 아니면 현실성이 떨어져.")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setSubCharacterImage(characterSungHa)
                        .setMainCharacterImage(characterJiHoonFront)
                        .setDialogue("어! 그거 좋은데?")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setSubCharacterImage(characterSungHa)
                        .setMainCharacterImage(characterJiHoonFront)
                        .setDialogue("마지막에는 눈사람을 만들 때 남자애가 안아주고 하는 걸로 하자. 쓰러진 후에 발\n" +
                                "견하는 것도 좀 비현실적이게 느껴졌어. 그리고... 듣고 있어?")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setSubCharacterImage(characterSungHa)
                        .setMainCharacterImage(characterJiHoonFront)
                        .setDialogue("지호야.")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setSubCharacterImage(characterSungHa)
                        .setMainCharacterImage(characterJiHoonFront)
                        .setDialogue("어?")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setSubCharacterImage(characterSungHa)
                        .setMainCharacterImage(characterJiHoonFront)
                        .setDialogue("나랑 이거 합작할래?")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setSubCharacterImage(characterSungHa)
                        .setMainCharacterImage(characterJiHoonFront)
                        .setDialogue("..어? 그래도 돼?")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setSubCharacterImage(characterSungHa)
                        .setMainCharacterImage(characterJiHoonFront)
                        .setDialogue("응. 느낌이 와. 이거 우리 같이 하면 진짜 잘 될 거 같아.")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setSubCharacterImage(characterSungHa)
                        .setMainCharacterImage(characterJiHoonFront)
                        .setDialogue("전체적 시나리오는 네가 짠 거잖아. 나랑 합작하면 이거 저작권 나랑 나눠가지는\n" +
                                "데 괜찮아?")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setSubCharacterImage(characterSungHa)
                        .setMainCharacterImage(characterJiHoonFront)
                        .setDialogue("나 혼자서는 이 이야기 100퍼센트로 못 살려. 네가 있어야 완벽해질 것 같아. 나랑\n" +
                                "이걸로 같이 청림 나가보자. 시간이 얼마가 걸려도 상관 없으니까 졸업 전까지 꼭\n" +
                                "나가보자. 선배들 다 졸업까지 등단을 못해서 백수됐잖아. 우리 이걸로 해보자.")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setSubCharacterImage(characterSungHa)
                        .setMainCharacterImage(characterJiHoonFront)
                        .setDialogue("..그래. 좋아. 해 보자. 나도 할 수 있을 것 같은 마음이 들어.")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setBackgroundImage(roofTop)
                        .setDialogue("벌써 이걸 준비한지 3년이 다 됐네.")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setBackgroundImage(roofTop)
                        .setDialogue("그러게. 원고가 거의 1000장인데 이젠 안 보고도 줄줄 읽을 수 있을 거 같아. 인터\n" +
                                "넷도 안 한지 참 오래됐다. 전화 받는 거 말고는 정말 단절된 거 같아.")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setBackgroundImage(roofTop)
                        .setDialogue("그러게. 마지막으로 힘내서 마감 작업 하러 가자.")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setBackgroundImage(computer)
                        .setDialogue("어! 들어갔다!")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setBackgroundImage(computer)
                        .setDialogue("..........")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setBackgroundImage(computerLetter)
                        .setDialogue("..........")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setBackgroundImage(computerLetter)
                        .setDialogue("됐다!")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setBackgroundImage(computerLetter)
                        .setDialogue("드디어 됐다! 수고했어!")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setBackgroundImage(phone)
                        .setDialogue("..이거 청림에서 온 전화 아니야?")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setBackgroundImage(phone)
                        .setDialogue("맞네, 청림 번호야! 발표가 벌써 났나봐. 얼른 받아봐!")
                        .build(),

                new SceneData.Builder()
                        .setDialogue("...................")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setSubCharacterImage(characterSungHa)
                        .setMainCharacterImage(characterJiHoonFront)
                        .setDialogue("뭐래? 혹시 발표 벌써 난 거래? 우리 몇 위래?")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setSubCharacterImage(characterSungHa)
                        .setMainCharacterImage(characterJiHoonFront)
                        .setDialogue(".....")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setSubCharacterImage(characterSungHa)
                        .setMainCharacterImage(characterJiHoonFront)
                        .setDialogue("지호야.")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setSubCharacterImage(characterSungHa)
                        .setMainCharacterImage(characterJiHoonFront)
                        .setDialogue("응.")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setSubCharacterImage(characterSungHa)
                        .setMainCharacterImage(characterJiHoonFront)
                        .setDialogue("우리 실격이래..")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setSubCharacterImage(characterSungHa)
                        .setMainCharacterImage(characterJiHoonFront)
                        .setDialogue("...뭐?")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setSubCharacterImage(characterSungHa)
                        .setMainCharacterImage(characterJiHoonFront)
                        .setDialogue("완벽한 표절이래, 우리가.. 실격에 참가 제한 5년이래..")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setSubCharacterImage(characterSungHa)
                        .setMainCharacterImage(characterJiHoonFront)
                        .setDialogue("아니, 이게 뭔 소리야..! 우리가 무슨 표절-")
                        .build(),


                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setSubCharacterImage(characterSungHa)
                        .setMainCharacterImage(characterJiHoonFront)
                        .setDialogue(".. 전화 왔어.")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setSubCharacterImage(characterSungHa)
                        .setMainCharacterImage(characterJiHoonFront)
                        .setDialogue("..누구한테?")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setSubCharacterImage(characterSungHa)
                        .setMainCharacterImage(characterJiHoonFront)
                        .setDialogue("금성민 교수님.. 당장 오래.")
                        .build(),


                new SceneData.Builder()
                        .setProfileName("금성민 교수")
                        .setProfileImage(profileSungMin)
                        .setMainCharacterImage(characterSungMin)
                        .setDialogue("내가 살다살다 내 학생이 표절을 했다는 연락을 받네. 그것도 청림에서 말이야.")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setMainCharacterImage(characterJiHoonFront)
                        .setDialogue("교수님, 저희는 맹세코 표절하지 않았습니다.")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setMainCharacterImage(characterSungHaRight)
                        .setDialogue("아시잖습니까! 저희가 청림에만 거의 3년을-")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("금성민 교수")
                        .setProfileImage(profileSungMin)
                        .setMainCharacterImage(characterSungMin)
                        .setDialogue("그럼 표절한 놈이 나 표절했다고 할까! 너희는 우리 대학원의 수치야. 글에 재능\n" +
                                "이 없으면 포기하던가 왜 억지로 하겠다고 설쳐서 남의 걸 표절하고 말이야! 자\n" +
                                "네들 때문에 올해 처음으로 대상을 받은 전명호 학생이 그 명예를 잃었다고!")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setMainCharacterImage(characterSungHaRight)
                        .setDialogue("네? 전명호 선배요?")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("금성민 교수")
                        .setProfileImage(profileSungMin)
                        .setMainCharacterImage(characterSungMin)
                        .setDialogue("자네가 표절한 그 작품. 그 작가가 누군지도 보지 않은건가? 이렇게 무식하고 뻔\n" +
                                "뻔한 게 내 학생이라니. 자네들이 보고 베낀 그 글, 전명호 학생이 작년에 청림에\n" +
                                "서 대상을 탄 글이 아닌가!")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setMainCharacterImage(characterJiHoonFront)
                        .setDialogue("..교수님. 저희는 그 글을 봐야 겠습니다. 전명호 선배가 저희와 같은 글을 썼다는\n" +
                                "말씀이신가요?")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("금성민 교수")
                        .setProfileImage(profileSungMin)
                        .setMainCharacterImage(characterSungMin)
                        .setDialogue("어디서 자꾸 뻔뻔하게 나오는 건가. 자네들 처지를 아직도 모르겠나? 자네들은\n" +
                                "범죄자야!")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setMainCharacterImage(characterSungHaRight)
                        .setDialogue("아니요! 저희는 표절을 하지 않았습니다. 믿어주세요! 저희가 순수하게 그 1000장\n" +
                                "넘는 분량을 씹고 씹어서 쓴 글이라고요!")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("금성민 교수")
                        .setProfileImage(profileSungMin)
                        .setMainCharacterImage(characterSungMin)
                        .setDialogue("둘 다 입 다물지 못하겠나! 자네들이 무슨 말을 하든 표절범들이 하는 말에 놀아\n" +
                                "날 생각 없네! 꼴도 보기 싫으니까 나가게!")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setMainCharacterImage(characterSungHaRight)
                        .setDialogue("..............")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setMainCharacterImage(characterJiHoonFront)
                        .setDialogue("..............")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setSubCharacterImage(characterSungHa)
                        .setMainCharacterImage(characterJiHoonFront)
                        .setDialogue("무슨 날벼락이야. 전명호 선배 얘기는 뭐고?")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setSubCharacterImage(characterSungHa)
                        .setMainCharacterImage(characterJiHoonFront)
                        .setDialogue("우리 글이 작년에 대상을 탄 전명호 선배 글이랑 똑같다고? 우린 이 글에 아무런\n" +
                                "참고도 하고 싶지 않아서 3년간 SNS랑 인터넷도 거의 안 하고 살았다고!")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setSubCharacterImage(characterSungHa)
                        .setMainCharacterImage(characterJiHoonFront)
                        .setDialogue("이건 무조건 100퍼센트야. 전명호가 우리 글을 가져간 게 틀림 없어.")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setSubCharacterImage(characterSungHa)
                        .setMainCharacterImage(characterJiHoonFront)
                        .setDialogue("맞아. 그때 우리 도와준다고 글 잠깐 봐줬잖아.")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setSubCharacterImage(characterSungHa)
                        .setMainCharacterImage(characterJiHoonFront)
                        .setDialogue("당장 찾아가자. 그 자식 지금 어디있어. 감히 우리의 3년을 가로채?")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("전명호")
                        .setProfileImage(profileMyungHo)
                        .setMainCharacterImage(characterMyungHo)
                        .setDialogue("표절이라..")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setMainCharacterImage(characterJiHoonFront)
                        .setDialogue("솔직히 저희끼리 오리발 내밀 것도 없잖아요. 너무 확실하잖아요. 지금 뭐하자는 \n" +
                                "거죠?")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setMainCharacterImage(characterSungHaRight)
                        .setDialogue("저희가 그 글을 몇 년 준비했는지 모르시는 것도 아니잖아요. 어떻게 이런 짓을..")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("전명호")
                        .setProfileImage(profileMyungHo)
                        .setMainCharacterImage(characterMyungHo)
                        .setDialogue("야, 너희 웃긴다. 증거있어?")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setMainCharacterImage(characterSungHaRight)
                        .setDialogue("뭐라고요?")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("전명호")
                        .setProfileImage(profileMyungHo)
                        .setMainCharacterImage(characterMyungHo)
                        .setDialogue("증거 하나도 없잖아. 똑같은 글이 두개였다면 먼저 나간 사람 거지. 그러게 누가\n" +
                                "3년이나 글을 묻혀두래? 누가 인터넷 안 하고 살래?")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setMainCharacterImage(characterSungHaRight)
                        .setDialogue("..지금 그게 할 말인가요? 선배 이렇게 뻔뻔한 사람이었어요?")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("전명호")
                        .setProfileImage(profileMyungHo)
                        .setMainCharacterImage(characterMyungHo)
                        .setDialogue("뻔뻔? 선배한테 못하는 말이 없네.")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setMainCharacterImage(characterJiHoonFront)
                        .setDialogue("선배 취급을 해줄 수가 없잖아! 재능이 없어서 동생들거 가져가 상 받으니 좋아 \n" +
                                "죽겠냐? 그래서 등단하면 자랑스러울 거 같아?")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("전명호")
                        .setProfileImage(profileMyungHo)
                        .setMainCharacterImage(characterMyungHo)
                        .setDialogue("말 다 했냐?")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setMainCharacterImage(characterSungHaRight)
                        .setDialogue("다 안 했어요! 어떻게 문학인이라는 사람이 오로지 수상이랑 돈 때문에 표절을 할\n" +
                                " 수가 있어요! 이건 무조건- 윽!")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setMainCharacterImage(characterJiHoonFront)
                        .setDialogue("성하야!! 당신 지금 뭐하는 거야!")
                        .build(),

                new SceneData.Builder()
                        .setBackgroundImage(MyeongHoonSungHaFight)
                        .setDialogue(" ")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setBackgroundImage(meatRestaurant)
                        .setDialogue("성하야. 얼굴은 괜찮아?")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setBackgroundImage(meatRestaurant)
                        .setDialogue("네가 막아줘서 많이 안 다쳤어. 네가 더 맞았잖아.")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setBackgroundImage(meatRestaurant)
                        .setDialogue("...........")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setBackgroundImage(meatRestaurant)
                        .setDialogue("..야, 울지마.")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setBackgroundImage(meatRestaurant)
                        .setDialogue("지호야.")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setBackgroundImage(meatRestaurant)
                        .setDialogue("응.")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setBackgroundImage(meatRestaurant)
                        .setDialogue("나 죽고 싶어..")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setBackgroundImage(meatRestaurant)
                        .setDialogue("..............")
                        .build(),


                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setBackgroundImage(meatRestaurant)
                        .setDialogue("아니, 안 돼.")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setBackgroundImage(meatRestaurant)
                        .setDialogue("어..?")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setBackgroundImage(meatRestaurant)
                        .setDialogue("죽어도 우리 죽으면 더 억울하지.")
                        .build(),


                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setBackgroundImage(meatRestaurant)
                        .setDialogue("잘못을 한 사람이 죽어야지, 왜 우리가 죽어. 전명호 그 자식이 죽어야지.")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setBackgroundImage(meatRestaurant)
                        .setDialogue("너 많이 취했구나..")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setBackgroundImage(meatRestaurant)
                        .setDialogue("진짜로 죽이고 싶어. 넌 안 죽이고 싶어?")
                        .build(),


                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setBackgroundImage(meatRestaurant)
                        .setDialogue("나 지금 눈에 뵈는 게 없어. 미친 척하고 그냥 죽여버리고 싶어. 너만 있으면 다\n" +
                                "가능할 것 같아. 그냥 밀어버리고 싶어.")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setBackgroundImage(meatRestaurant)
                        .setDialogue("........")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setBackgroundImage(meatRestaurant)
                        .setDialogue("죄책감 하나 없이 사람의 3년을 가로챈 걸로 모자라 우릴 이렇게 팼는데 왜 걔가\n" +
                                "박수갈채를 받고 작가 칭호를 얻어? 그딴 인간이 왜?")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setBackgroundImage(meatRestaurant)
                        .setDialogue("지호야.")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setBackgroundImage(meatRestaurant)
                        .setDialogue("..응.")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setBackgroundImage(meatRestaurant)
                        .setDialogue("하지만.. 그래도. 죽이는 게 방법일까?")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setBackgroundImage(meatRestaurant)
                        .setDialogue("우리 이거 소문 퍼지는거 한순간이야. 그 큰 청림에서 표절로 실격인데 참가 제한\n" +
                                "5년이라는 건 앞으로 5년 동안 우릴 받아줄 곳이 없다는 뜻이야. 또 5년이 아니라\n" +
                                "평생일 수도 있어.")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setBackgroundImage(meatRestaurant)
                        .setDialogue("...어떻게 죽일 건데?")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setBackgroundImage(meatRestaurant)
                        .setDialogue("청림 발표가 12월 10일이지?")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setBackgroundImage(meatRestaurant)
                        .setDialogue("그 날에 그냥 옥상에서 밀어버리자. 나 정말 가능할 것 같아. 원래 그 날에 웃고 \n" +
                                "있어야 할 우리를 위해서라도.")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setBackgroundImage(meatRestaurant)
                        .setDialogue("그럼 넌 남은 삶을 문학인이 아니라 살인자로 살게 되는 거잖아..")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setBackgroundImage(meatRestaurant)
                        .setDialogue("아니. 옥상엔 CCTV가 없어. 내가 경비랑 친해서 잘 알아. 열쇠가 어디있는지도 알\n" +
                                "아. 전명호 말대로 증거가 없다면 끝인 거잖아. 알리바이만 있으면 발뺌할 수 있\n" +
                                "어.")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setBackgroundImage(meatRestaurant)
                        .setDialogue("..진심이구나, 너.")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setBackgroundImage(meatRestaurant)
                        .setDialogue("응. 난 진심이야. 솔직히 너도 당장 죽이고 싶잖아. 왜 우리처럼 진실했던 사람들\n" +
                                "이 피해를 받고 살아야 해?")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setBackgroundImage(meatRestaurant)
                        .setDialogue("..그래. 죽이자. 우리 전명호를 죽이자.")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setDialogue(".....")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setDialogue("아니야. 이건 아니잖아..")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setDialogue("지호를 말려야 해.")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setSubCharacterImage(characterSungHa)
                        .setMainCharacterImage(characterJiHoonFront)
                        .setDialogue("할 말이 있다고?")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setSubCharacterImage(characterSungHa)
                        .setMainCharacterImage(characterJiHoonFront)
                        .setDialogue("..그만하자.")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setSubCharacterImage(characterSungHa)
                        .setMainCharacterImage(characterJiHoonFront)
                        .setDialogue("무슨 소리야.")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setSubCharacterImage(characterSungHa)
                        .setMainCharacterImage(characterJiHoonFront)
                        .setDialogue("우리가 너무 흥분했어. 아무리 우리가 잡혀가지 않아서 혐의를 벗는다고 해도 사\n" +
                                "람을 죽였다는 마음으로 앞으로 어떻게 글을 쓰겠어. 지호야, 다 그만하다. 너랑\n" +
                                " 나 이런애 아니잖아.")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setSubCharacterImage(characterSungHa)
                        .setMainCharacterImage(characterJiHoonFront)
                        .setDialogue("이제 와서 무슨 소리야. 지금 여기까지 왔는데!")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setBackgroundImage(SungHaJiHoFight)
                        .setDialogue("내 생각은 안 바뀌어. 바꿀 수가 없어. 이미 교수한테 그렇게 혼난 날부터 난 제정\n" +
                                "신이 아니야.")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setBackgroundImage(SungHaJiHoFight)
                        .setDialogue("..난 네 계획 도와주지 않을 거야.")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setBackgroundImage(SungHaJiHoFight)
                        .setDialogue("네가 아니더라도 난 전명호를 죽일 거야.")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setBackgroundImage(SungHaJiHoFight)
                        .setDialogue("천지호!")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setBackgroundImage(SungHaJiHoFight)
                        .setDialogue("그런 말 할거면 나 이만 가볼게.")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setBackgroundImage(SungHaJiHoFight)
                        .setDialogue("지호야!")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setBackgroundImage(SungHaLetter)
                        .setDialogue("..이게 뭐지.")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setBackgroundImage(SungHaLetter)
                        .setDialogue("문성하 진짜..")
                        .build(),

                // 문성하 편지로 넘김
        };
    }

    public static SceneData[] get3DayAfterMemoScenes(){
        return new SceneData[]{
                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setBackgroundImage(dayAfterMemo)
                        .setDialogue("....................")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setBackgroundImage(dayAfterMemo)
                        .setDialogue("정말 어쩌면 좋을까..")
                        .build(),
        };

    }

    public static SceneData[] getFinalScenes(){
        return new SceneData[]{
                new SceneData.Builder()
                        .setProfileName("전명호")
                        .setProfileImage(profileMyungHo)
                        .setMainCharacterImage(characterMyungHo)
                        .setDialogue("뭐야. 왜 네가 있냐?")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setMainCharacterImage(characterJiHoonFront)
                        .setDialogue(".....")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("전명호")
                        .setProfileImage(profileMyungHo)
                        .setMainCharacterImage(characterMyungHo)
                        .setDialogue("금교수님이 불렀다며. 설마 네가 교수인척 한 거냐?")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setMainCharacterImage(characterJiHoonFront)
                        .setDialogue("네. 할 말이 있어서요.")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("전명호")
                        .setProfileImage(profileMyungHo)
                        .setMainCharacterImage(characterMyungHo)
                        .setDialogue("또 그 일 때문이냐?")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("전명호")
                        .setProfileImage(profileMyungHo)
                        .setMainCharacterImage(characterMyungHo)
                        .setDialogue("그래. 나도 생각해보니까 내가 심한 것 같더라. 때리기도 하고.")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("전명호")
                        .setProfileImage(profileMyungHo)
                        .setMainCharacterImage(characterMyungHo)
                        .setDialogue("혹시 상금을 좀 나눠줄까 생각해봤어. 나도 뭐 너희 아이디어 보고 영감을 받은\n" +
                                "건 맞아. 상금이 6천이니까 천이라도-")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("전명호")
                        .setProfileImage(profileMyungHo)
                        .setMainCharacterImage(characterMyungHo)
                        .setDialogue("...!!!!!")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("전명호")
                        .setProfileImage(profileMyungHo)
                        .setMainCharacterImage(characterMyungHo)
                        .setDialogue("야, 너 뭐하는 거야!!")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setBackgroundImage(myeonHoJiHoFight)
                        .setDialogue("영감을 받아? 원고 수에 주인공 설정에 그냥 가져간 거잖아!")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("전명호")
                        .setProfileImage(profileMyungHo)
                        .setBackgroundImage(myeonHoJiHoFight)
                        .setDialogue("너 제정신이야? 야, 위험해!! 떨어진다고!! ")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setBackgroundImage(myeonHoJiHoFight)
                        .setDialogue("너 같은 놈은 살 자격이 없어. 네가 감히 글에 대해서-!")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setDialogue("..!!!!")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setBackgroundImage(beforeFalling)
                        .setDialogue("지호야, 멈춰!!")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setBackgroundImage(beforeFalling)
                        .setDialogue("너가 왜 여길..!!")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("전명호")
                        .setProfileImage(profileMyungHo)
                        .setBackgroundImage(beforeFalling)
                        .setDialogue("야, 빨리 이 자식 빨리 떼어내봐!! 얘 제정신 아니야!")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setBackgroundImage(beforeFalling)
                        .setDialogue("천지호 제발 정신 차려!!")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setBackgroundImage(beforeFalling)
                        .setDialogue("이거 놓으라고!!")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("문성하")
                        .setProfileImage(profileSungHa)
                        .setBackgroundImage(beforeFalling)
                        .setDialogue("일단 놔, 놓고 얘기해!")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setBackgroundImage(beforeFalling)
                        .setDialogue("꺼지라고! ")
                        .build(),

                new SceneData.Builder()
                        .setBackgroundImage(beforeFalling)
                        .setDialogue("탁-")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setBackgroundImage(beforeFalling)
                        .setDialogue("!!!!!!!!!!")
                        .build(),


                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setBackgroundImage(beforeFalling)
                        .setDialogue("성하야!!!")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("전명호")
                        .setProfileImage(profileMyungHo)
                        .setBackgroundImage(beforeFalling)
                        .setDialogue("....!!!!")
                        .build(),

                new SceneData.Builder()
                        .setBackgroundImage(falling)
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setBackgroundImage(falling)
                        .setDialogue("문성하야!!!!!")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setDialogue("안돼... 아니야.... 이러려던 게 아니야...!!")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("전명호")
                        .setProfileImage(profileMyungHo)
                        .setDialogue("이건.. 이건 너 때문이야...")
                        .build(),


                new SceneData.Builder()
                        .setProfileName("전명호")
                        .setProfileImage(profileMyungHo)
                        .setDialogue("난 상관 없는 일이야!! 난 피해자라고!!!!!")
                        .build(),

                new SceneData.Builder()
                        .setProfileName("천지호")
                        .setProfileImage(profileJiHo)
                        .setDialogue("...........")
                        .build(),

        };
    }

}
