import common.GameFrame;
import common.MusicController;
import opening.Opening;

import javax.swing.*;

public class Main extends JFrame{
    public static void main(String[] args) {
        // 배경 음악 실행
        MusicController.getInstance().playMusic("music/all.mp3", true);
        // Opening 실행
        new Opening();
    }
}
