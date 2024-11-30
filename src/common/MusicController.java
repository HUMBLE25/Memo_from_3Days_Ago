package common;

public class MusicController {
    private MusicPlayer currentPlayer;

    public void playMusic(String filePath, boolean loop) {
        stopMusic(); // 기존 음악 중지
        currentPlayer = new MusicPlayer(filePath, loop);
        new Thread(currentPlayer).start();
    }

    public void stopMusic() {
        if (currentPlayer != null) {
            currentPlayer.stop();
        }
    }
}
