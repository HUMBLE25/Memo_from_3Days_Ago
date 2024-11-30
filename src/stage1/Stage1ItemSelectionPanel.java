package stage1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Stage1ItemSelectionPanel extends JPanel {
    private CardLayout cardLayout;
    private JPanel mainPanel;

    private Rectangle moonSeongHaArea = new Rectangle(710, 560, 220, 400); // 문성하 사물함 영역
    private Rectangle jeonMyeongHoArea = new Rectangle(470, 560, 220, 400); // 전명호 사물함 영역

    private boolean isMoonSeongHaSelected = false; // 문성하 사물함 선택 여부
    private boolean isJeonMyeongHoSelected = false; // 전명호 사물함 선택 여부

    public Stage1ItemSelectionPanel(JPanel mainPanel, CardLayout cardLayout) {
        this.mainPanel = mainPanel;
        this.cardLayout = cardLayout;

        setLayout(null);
        setBackground(Color.LIGHT_GRAY);

        // 배경 이미지 추가
        JLabel background = new JLabel(new ImageIcon("images/stage1/사물함_2.png"));
        background.setBounds(0, 0, 1440, 1024);
        add(background);

        // 마우스 클릭 리스너 추가
        //상태 관리가 되어야 한다.
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Point clickPoint = e.getPoint();
                if (moonSeongHaArea.contains(clickPoint)) {
                    if (!isMoonSeongHaSelected) {
                        isMoonSeongHaSelected = true; // 선택 상태 업데이트
                        System.out.println("문성하 사물함 선택됨!");
                        startMoonSeongHaStory();
                    } else {
                        checkSelectionCompletion();
                        System.out.println("문성하 사물함 이미 선택됨.");
                    }
                } else if (jeonMyeongHoArea.contains(clickPoint)) {
                    if (!isJeonMyeongHoSelected) {
                        isJeonMyeongHoSelected = true; // 선택 상태 업데이트
                        System.out.println("전명호 사물함 선택됨!");
                        startJeonMyeongHoStory();
                    } else {
                        checkSelectionCompletion();
                        System.out.println("전명호 사물함 이미 선택됨.");
                    }
                } else {
                    System.out.println("선택된 아이템이 없습니다.");
//                    System.out.println("선택 지점"+e.getPoint());
                }

            }
        });

        setFocusable(true);
        requestFocusInWindow();
    }

    // 문성하 사물함 스토리 시작
    private void startMoonSeongHaStory() {
        System.out.println("문성하 사물함 스토리 시작!");
        cardLayout.show(mainPanel, "Stage1MoonSeongHaStory");
    }

    // 전명호 사물함 스토리 시작
    private void startJeonMyeongHoStory() {
        System.out.println("전명호 사물함 스토리 시작!");
        cardLayout.show(mainPanel, "Stage1JeonMyeongHoStory");
    }
    // 선택 상태 확인
    private void checkSelectionCompletion() {
        if (isMoonSeongHaSelected && isJeonMyeongHoSelected) {
            System.out.println("모든 선택 완료!");
            showCompletionDialogue();
        } else {
            System.out.println("아직 선택하지 않은 사물함이 있습니다.");
            showReminderDialogue();
        }
    }
    // 완료 대화 표시
    private void showCompletionDialogue() {
        JOptionPane.showMessageDialog(this, "모든 사물함을 조사했습니다. 다음 단계로 이동합니다.");
        cardLayout.show(mainPanel, "Stage1Outro");
    }

    // 미완료 대화 표시
    private void showReminderDialogue() {
        JOptionPane.showMessageDialog(this, "다른 사물함도 조사해보세요.");
    }
}
