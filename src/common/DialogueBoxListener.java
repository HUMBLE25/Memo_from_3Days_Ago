package common;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

// DialogueBoxListener: 대화 상자와 상호작용할 수 있는 리스너
// 마우스 클릭 또는 특정 키 입력(Space, Enter)에 반응하여 다음 장면으로 이동
public class DialogueBoxListener extends KeyAdapter implements MouseListener {
    private Runnable updateScene; // 다음 장면으로 이동하기 위한 동작을 정의한 Runnable 객체

    public DialogueBoxListener(Runnable updateScene) {
        this.updateScene = updateScene;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Spacebar 또는 Enter 키 입력 시 다음 장면으로 이동
        if (e.getKeyCode() == KeyEvent.VK_SPACE || e.getKeyCode() == KeyEvent.VK_ENTER) {
            moveToNextScene();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // 대화 상자 클릭 시 다음 장면으로 이동
        moveToNextScene();
    }

    // 다음 장면으로 이동하는 메서드
    private void moveToNextScene() {
        SwingUtilities.invokeLater(updateScene); // UI 업데이트를 안전하게 수행
    }

    // 필요하지 않은 MouseListener 메서드들 구현 (빈 상태)
    @Override public void mousePressed(MouseEvent e) {}
    @Override public void mouseReleased(MouseEvent e) {}
    @Override public void mouseEntered(MouseEvent e) {}
    @Override public void mouseExited(MouseEvent e) {}
}

