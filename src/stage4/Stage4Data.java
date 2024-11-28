//package stage4;
//
//import common.SceneData;
//import javax.swing.ImageIcon;
//
//public class Stage4Data {
//    public static SceneData[] getScenes() {
//        return new SceneData[]{
//                // 지도
//                new SceneData(null, null,
//                        null, null, new ImageIcon("images/stage4/지도.png")),
//
//                //교수방 밖
//                new SceneData(null, null,
//                        null, null, new ImageIcon("images/stage4/교수방_밖.png")),
//
//                // 금교수와의 대화
//                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"), //김도진사진을 넣어야하는데 그건 어떻게 해야할지요
//                        "교수님, 안녕하세요. 문창과 2학년 명지훈이라고 합니다. 잠시 드리고 싶은 말씀이 있어서요.", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("금성민",  new ImageIcon("images/characters/프_성민.png"),
//                        "..들어오게.", new ImageIcon("images/characters/성민.png"), null),
//
//                //교수방안
//                new SceneData(null, null,
//                        null, null, new ImageIcon("images/stage4/교수방_안.png")),
//
//                //금교수와의 대화2
//                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"), //김도진사진을 넣어야하는데 그건 어떻게 해야할지요
//                        "교수님 안녕하세요. 오랜만에 뵙습니다.", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("금성민",  new ImageIcon("images/characters/프_성민.png"),
//                        "그래, 지훈 학생. 오랜만이네. 무슨일인가?", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
//                        "갑자기 죄송합니다. 성하..얘기 때문에 왔습니다.", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("금성민",  new ImageIcon("images/characters/프_성민.png"),
//                        "..........", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("금성민",  new ImageIcon("images/characters/프_성민.png"),
//                        "미안하지만.. 그 부분에 대해서는 누군가에게 말할 부분이 아닌 것 같네.", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("금성민",  new ImageIcon("images/characters/프_성민.png"),
//                        "...아니지  (잘못을 피하려고 들면 그 학생에게 더 못할 짓이겠지..)", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
//                        "..죄송하지만 자세한 이야기를 들을 수 있을까요?", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("금성민",  new ImageIcon("images/characters/프_성민.png"),
//                        "자네도 어차피 알고 찾아온 것 아닌가.. 나 때문에 그 아이가 극단적인 선택을....", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
//                        "..........", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("금성민",  new ImageIcon("images/characters/프_성민.png"),
//                        "그래.. 날 존경하던 학생들이었는데 그렇게 심한 말을 하다니.. 후회하던 참이었네...", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("금성민",  new ImageIcon("images/characters/프_성민.png"),
//                        "하지만 그렇다고 그 말 때문에 그런 선택을 할 줄은 몰랐네...", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
//                        "..교수님은 성하가 죽은 유가 자살이라고 확신하시나요?", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("금성민",  new ImageIcon("images/characters/프_성민.png"),
//                        "...지훈 학생에게만 말하는 사실이지만 난 내년부터 이 학교를 떠나네..", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("금성민",  new ImageIcon("images/characters/프_성민.png"),
//                        "내가 유일하게 할 수 있는 사죄는 더이상 이 바닥에 있지 않는 것이겠지..", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("금성민",  new ImageIcon("images/characters/프_성민.png"),
//                        "잘못이 있긴 했지만 아직 어리고 글을 그렇게 사랑하던 학생이었는데...", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("금성민",  new ImageIcon("images/characters/프_성민.png"),
//                        "...지훈학생.. 미안한데.. 잠시 먼저 나가보겠네. 나중에 다시 얘기합세..", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
//                        "교수님이 갑자기 연구실을 나가셨다. 감정이 올라오신 듯 하다. 교수님께선 성하가 죽은 이유가 자신 때문이라고 의심의 여지 없이 믿고 있는듯하다.", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//
//                //교수책상
//                new SceneData(null, null,
//                        null, null, new ImageIcon("images/stage4/교수책상.png")),
//                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
//                        "교수님의 책상 위에 무언가 있는 듯 하다.", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//
//                //사물함_보고서  (클릭할수 있게 만들어야하나봐요)  보고서를 클릭
//                new SceneData(null, null,
//                        null, null, new ImageIcon("images/stage4/사물함_보고서.png")),
//                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
//                        "..문성하?? 저게 뭐지..?",null, null),
//                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
//                        "천지호와 문성하의 대회 보고서이다. 천지호와 문성하가 청림을 함께 준비해서 최근 그렇게 친했던 것 같다.", null, new ImageIcon("images/stage4/청림준비보고서.png")),
//                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
//                        "...이건 또 뭐지?", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
//                        "보고서 뒤에 편지 하나가 있다.", null, null),
//
//                //사물함_편지
//                new SceneData(null, null,
//                        null, null, new ImageIcon("images/stage4/사물함_편지.png")),
//                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
//                        "이건 천지호가 교수님께 드린 편지이다.", null, new ImageIcon("images/stage4/천지호_편지.png")),
//                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
//                        "글씨체가 익숙한데......", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
//                        "일단 가지고 있어보자.", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//
//        };
//    }
//}