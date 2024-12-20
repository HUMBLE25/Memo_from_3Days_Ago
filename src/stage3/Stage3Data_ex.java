//package stage3;
//
//import common.SceneData;
//import javax.swing.ImageIcon;
//
//public class Stage3Data_ex {
//    public static SceneData[] getScenes() {
//        return new SceneData[]{
//                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
//                        "일단 김도진을 만나야 한다. 아마 체육관에 있지 않을까..", null, null),
//
//                // 체육관 입장
//                new SceneData(null, null,
//                        null, null, new ImageIcon("images/stage3/예체능관.png")),
//
//                // 김도진과의 대화
//                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"), //김도진사진을 넣어야하는데 그건 어떻게 해야할지요
//                        "일단 김도진을 만나야 한다. 아마 체육관에 있지 않을까..", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("김도진",  new ImageIcon("images/characters/프_도진.png"),
//                        "뭐야, 누구야?", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
//                        ".. 난 성하 친구 명지훈이라고 해.", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("김도진",  new ImageIcon("images/characters/프_도진.png"),
//                        "성하..? 문성하?? 그 자식 친구가 왜 날 찾아와?", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
//                        "성하에 대해 물어볼 게 있어.", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("김도진",  new ImageIcon("images/characters/프_도진.png"),
//                        "그 자식 얘기라면 듣고 싶지도 않으니까 가라.", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
//                        ".................", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
//                        "솔직히 많이 무섭지만 물러나면 안 된다.. 성하를 생각하자...", null, null),
//                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
//                        "한 번만 도와주면 안 될까..? 내가 지금 간절해서 그래", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("김도진",  new ImageIcon("images/characters/프_도진.png"),
//                        "말하기 싫다고 하지 않았나?? 말귀 못알아 듣냐?", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
//                        "진짜 조금만... 부탁할게...", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("김도진",  new ImageIcon("images/characters/프_도진.png"),
//                        "하... 뭔데.", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
//                        ".....(일단 마혜진이랑 문성하의 사이에 대해 물어보는 게 좋으려나....)", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("김도진",  new ImageIcon("images/characters/프_도진.png"),
//                        "빨리 말 안하냐? 꾸물거릴거면 꺼져.", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
//                        "혹시.... 마헤진이랑 성하 말이야.... 둘이 뭐.. 있었어?", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("김도진",  new ImageIcon("images/characters/프_도진.png"),
//                        "어? 하 참 이놈봐라. 너 지금 뭐라고 했냐? 갑자기 굴러들어온 자식이 안 그래도 짜증나는 부분을 건드네.", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("김도진",  new ImageIcon("images/characters/프_도진.png"),
//                        "기생오라비같이 비실거리는 놈이 혜진이한테 접근해서 어떻게 해보려던 자식이잔아. 갑자기 또 화나려고 하네.", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
//                        "(....그 물러터진 문성하가....?)", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("김도진",  new ImageIcon("images/characters/프_도진.png"),
//                        "뒤졌다는 소식 듣고 속 시원했는데 왜 상기시키고 난리야. 떨어져 죽는 거 말고 나한테 뒤졌어야 했어", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
//                        "말이 좀... 심한 거 같지 않아??", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("김도진",  new ImageIcon("images/characters/프_도진.png"),
//                        "뭐라고 했냐? 지금 걔네가 바람핀 게 내 잘못이라는거냐?", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
//                        "아냐, 그게 아니라..!", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
//                        "(내 생각보다 더 욱하는 성격인 것 같네.. 말도 안 통하고.. 화가 나보이는데 더이상 대화를 이어가긴 힘들것 같네..)", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
//                        "기분 나쁘게 했다면 미안해. 근데 내가 진짜 간절해서 말이야. 혜진이랑 내가 얘기좀 해봐도 될까?", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("김도진",  new ImageIcon("images/characters/프_도진.png"),
//                        "뭐? 그 자식 친구 아니랄까봐 지금 나한테서 마혜진이랑 문성하 얘기를 짓거리겠다는거야? 장난까냐, 너?", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
//                        "아냐..! 그런 의미가 아니야. 그냥 성하가 죽기 전에..!", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("김도진",  new ImageIcon("images/characters/프_도진.png"),
//                        "짜증나게 하지 말고 마혜진 찾아서 꺼지던지 그냥 꺼지던지 눈 앞에서 당장 꺼져. 흡연실을 가보던 교실을 가보던 네가 ", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//
//                //지도
//                new SceneData(null, null,
//                        null, null, new ImageIcon("images/stage3/지도.png")),
//
//                //흡연실
//                new SceneData(null, null,
//                        null, null, new ImageIcon("images/stage3/흡연실.png")),
//
//                //마혜진과의 대화
//                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
//                        "저기 있다..", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
//                        "마혜진...?", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("마혜진",  new ImageIcon("images/characters/프_혜진.png"),
//                        "...누구세요?", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
//                        "아.. 나는 성하 친구 지훈이라고해", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("마혜진",  new ImageIcon("images/characters/프_혜진.png"),
//                        "..!!!", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("마혜진",  new ImageIcon("images/characters/프_혜진.png"),
//                        "미안한데 난 할 얘기 없어. 먼저 가볼게.", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
//                        "아니, 잠깐만! 네 도움이 꼭 필요해! 성하가 자살을 했을 리가 없잖아. 너도 성하가 어떤 아이인지 알잖아", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("마혜진",  new ImageIcon("images/characters/프_혜진.png"),
//                        "알던 모르던 무슨 상관인데! 너 지금 나한테 이러는 거 김도진이 알면 너도 얻어 터진다고!", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("마혜진",  new ImageIcon("images/characters/프_혜진.png"),
//                        "안 그래도 저 자식이 성하 개패듯이 팬적 있어서 쟤가 죽인 거 아니냐고 소문 돌고 있는데 이렇게 대놓고 찾아오다니 제정신이야?", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("마혜진",  new ImageIcon("images/characters/프_혜진.png"),
//                        "가. 할 말 없어.", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
//                        "아냐. 잠깐 기다려! 정말 몇 마디면 돼. 네가 있어야 성하가 왜 죽었는지 알 수가 있다고!", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("마혜진",  new ImageIcon("images/characters/프_혜진.png"),
//                        "......", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
//                        "너 성하 좋아했잔아", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
//                        "성하.. 이제 죽은 사람이잖아. 한 번만 도와줘. 부탁이야", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("마혜진",  new ImageIcon("images/characters/프_혜진.png"),
//                        "...어디서 들었는 지는 모르겠지만 걔 나랑 큰 관련 없어.", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
//                        "혜진아.. 제발..", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("마혜진",  new ImageIcon("images/characters/프_혜진.png"),
//                        "아니, 진짜라고! 내가 걔 좋아한 건 맞는 데.. 성하가.. 죽...", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
//                        "(순간 마혜진의 목소리가 울먹여지는 것이 느껴졌다.)", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("마혜진",  new ImageIcon("images/characters/프_혜진.png"),
//                        "...아무튼 걔 자살 맞을 거야. 많이 힘들어해서 나랑도 연락 안한지 오래됐다고.", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("명지훈",  new ImageIcon("images/characters/프_지훈.png"),
//                        "자살이 맞을 거라고..?", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("마혜진",  new ImageIcon("images/characters/프_혜진.png"),
//                        "실제로 나한테 죽고 싶다는 말을 얼마나 했는데. 금교수님 만나고 와서부터인가 갑자기 우울증상이 심해져서 술, 담배도 안하던 애가 매일 술만 마시고 지냈어.", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//                new SceneData("마혜진",  new ImageIcon("images/characters/프_혜진.png"),
//                        "...아무튼 이제 가. 이제 걔 얘기 하고 싶지 않아.", new ImageIcon("images/characters/명지훈_왼쪽.png"), null),
//        };
//    }
//}