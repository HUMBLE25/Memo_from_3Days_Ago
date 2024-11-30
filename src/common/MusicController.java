package common;

public class MusicController {
    private static MusicController instance;
    private MusicPlayer currentPlayer;

    // private 생성자로 외부 인스턴스 생성 차단
    private MusicController() {}

    // 싱글턴 인스턴스 반환
    public static synchronized MusicController getInstance() {
        if (instance == null) {
            instance = new MusicController();
        }
        return instance;
    }

    public synchronized void playMusic(String filePath, boolean loop) {
        stopMusic(); // 기존 음악 중지
        currentPlayer = new MusicPlayer(filePath, loop);
        Thread musicThread = new Thread(currentPlayer);
        musicThread.setDaemon(true); // 프로그램 종료 시 음악 스레드도 종료
        musicThread.start();
    }

    public synchronized void stopMusic() {
        if (currentPlayer != null) {
            currentPlayer.stop(); // 기존 음악 중지
            currentPlayer = null;
        }
    }
}
