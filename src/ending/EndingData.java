package ending;

import common.ImageRegistry;
import common.SceneData;

import javax.swing.*;

public class EndingData {
    // Images
    private static final ImageIcon profileJiHoon = ImageRegistry.getImage("character_프_지훈");
    private static final ImageIcon characterJiHoonFront = ImageRegistry.getImage("character_천지호_앞");
    private static final ImageIcon characterDoJin = ImageRegistry.getImage("character_도진");
    private static final ImageIcon characterMyungHo = ImageRegistry.getImage("character_전명호_앞");
    private static final ImageIcon characterSungMin = ImageRegistry.getImage("character_성민");

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
    // 범인 맞추러 가겠습니까?

    // 자살 VS 타살

    // 자살일 경우

    // 타살일 경우 범인 선택

    // 정답

    // 오답
}
