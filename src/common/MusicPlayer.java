package common;

import javazoom.jl.player.Player;

import java.io.FileInputStream;

public class MusicPlayer implements Runnable {
    private String filePath;
    private boolean loop;
    private volatile boolean isPlaying; // 재생 상태를 제어하기 위한 플래그
    private Player player;

    public MusicPlayer(String filePath, boolean loop) {
        this.filePath = filePath;
        this.loop = loop;
        this.isPlaying = true;
    }

    @Override
    public void run() {
        try {
            do {
                FileInputStream fileInputStream = new FileInputStream(filePath);
                player = new Player(fileInputStream);
                player.play();
            } while (loop && isPlaying);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            cleanup();
        }
    }

    public void stop() {
        isPlaying = false; // 재생 상태 변경
        if (player != null) {
            player.close(); // Player 리소스 해제
        }
    }

    private void cleanup() {
        if (player != null) {
            player.close(); // 자원 정리
        }
    }
}
