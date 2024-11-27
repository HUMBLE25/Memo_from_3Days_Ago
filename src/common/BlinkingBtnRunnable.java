package common;


import javax.swing.*;

// BlinkingBtnRunnable: "다음" 버튼이 깜박이도록 하는 스레드
public class BlinkingBtnRunnable implements Runnable {
    private JLabel nextBtn; // "다음" 버튼 컴포넌트
    private boolean visible = true; // 버튼 가시성 상태

    public BlinkingBtnRunnable(JLabel nextBtn) {
        this.nextBtn = nextBtn;
    }

    @Override
    public void run() {
        while (true) {
            // 버튼 가시성을 토글 (UI 스레드에서 실행)
            SwingUtilities.invokeLater(() -> nextBtn.setVisible(visible));
            visible = !visible;

            try {
                Thread.sleep(500); // 0.5초 간격으로 가시성 변경
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // 스레드가 중단되면 안전하게 종료
                return;
            }
        }
    }
}
