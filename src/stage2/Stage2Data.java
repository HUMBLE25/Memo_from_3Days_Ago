package stage2;

import common.SceneData;
import javax.swing.ImageIcon;

public class Stage2Data {
    public static SceneData[] getScenes() {
        return new SceneData[]{
                new SceneData(null, null,
                        null, null, new ImageIcon("images/stage2/학교앞장면.png")),
                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
                        "성하 방에 들어가보자.", null, null),
                // 성하 방 입장
                new SceneData(null, null,
                        null, null, new ImageIcon("images/stage2/성하_방.png")),

                // 성하 일기장 선택
                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
                        "성하의 일기장을 발견했다.", null, new ImageIcon("images/stage2/성하_일기.png")),
                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
                        "표절이라.. 자세히 들은 건 없지만 아무래도 성하가 이번에 자살을 했다고 소문이 도는 이유가 이것 때문이 아닐까.", null, new ImageIcon("images/stage2/성하_일기.png")),
                // 성하 일기장 내려놓기, 성하 방 둘러보기
                // 성하 휴대폰 선택
                new SceneData(null, null,
                        null, null, new ImageIcon("images/stage2/성하_방.png")),
                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
                        "김도진이라면... 우리학교에서 유명한 인물이다.\n" +
                                "\n", null, new ImageIcon("images/stage2/휴대폰.png")),
                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
                        "폭력적인 걸로 유명한 사람이다... \n" +
                                "이 사람이 왜 성하에게 협박을 했을까?\n" +
                                "\n", null, new ImageIcon("images/stage2/휴대폰.png")),

                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
                        "마혜진이라면 아마 김도진의 여자친구일 것이다.\n" +
                                "이 여자랑 성하가 연락하는 사이였나?", null, new ImageIcon("images/stage2/휴대폰.png")),
                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
                        "... 김도진 ...마혜진 그리고 성하의 관계를 알아봐야겠다.", null, new ImageIcon("images/stage2/휴대폰.png")),

                // 성하 휴대폰 내려놓기, 성하 방 둘러보기
                // 선물 상자 선택
                new SceneData(null, null,
                        null, null, new ImageIcon("images/stage2/성하_방.png")),
                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
                        "..이건 웬 선물 박스지? 편지도 있다.", null,null),
                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
                        "편지를 한번 읽어 보자.", null,new ImageIcon("images/stage2/편지상자.png")),
                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
                        "...이 자식.. 이건 남자친구있는 여자애랑 바람을 피다니.. 그것도 김도진 여친이랑..", null,new ImageIcon("images/stage2/편지.png")),
                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
                        "김도진한테 맞았다고? 성하가? ", null,new ImageIcon("images/stage2/편지.png")),
                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
                        "좀 무섭긴 하지만 김도진을 찾아가봐야 할 것 같다.", null,null),

                // 지호 방 입장
                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
                        "성하 옆 방이 지호 방이었구나. 지금 지호 방에 있나?", null,null),
                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
                        "지호의 방엔 아무도 없고 문도 열려 있었다.", null,null),
                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
                        "찾는 김에 한번 들어가보자. 금방 나오면 되겠지.", null,new ImageIcon("images/stage2/지호_방.png")),
                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
                        "책상 위에 실핀이 있다. 하나가 아니라 잔뜩.", null,new ImageIcon("images/stage2/실핀.png")),
                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
                        "이제 김도진, 마혜진의 관계를 찾기 위해 예체능관에 가보자.", null,null),
                new SceneData(null,  null,
                        null, null,new ImageIcon("images/stage2/지도.png")),







        };
    }
}
