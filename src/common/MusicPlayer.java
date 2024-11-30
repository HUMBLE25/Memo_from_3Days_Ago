package common;

import javazoom.jl.player.Player;
import java.io.FileInputStream;

public class MusicPlayer implements Runnable {
    private String filePath;
    private boolean loop;
    private Player player;

    public MusicPlayer(String filePath, boolean loop) {
        this.filePath = filePath;
        this.loop = loop;
    }

    @Override
    public void run() {
        try {
            do {
                FileInputStream fileInputStream = new FileInputStream(filePath);
                player = new Player(fileInputStream);
                player.play();
            } while (loop);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void stop() {
        if (player != null) {
            player.close();
        }
    }
}
