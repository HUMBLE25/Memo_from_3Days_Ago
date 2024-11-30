import common.GameFrame;
import common.MusicController;
import opening.Opening;

import javax.swing.*;

public class Main extends JFrame{
    public static void main(String[] args) {
        MusicController musicController = new MusicController();

        // 전체 게임 배경 음악
        musicController.playMusic("music/all.mp3",true);

        // Opening 실행
        new Opening();
//        new GameFrame();
    }
}
