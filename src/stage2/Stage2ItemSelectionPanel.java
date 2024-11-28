package stage2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Stage2ItemSelectionPanel extends JPanel {
    private CardLayout cardLayout;
    private JPanel mainPanel;

    private Rectangle DiaryArea = new Rectangle(510, 650, 100, 100); // 일기장 영역
    private Rectangle PhoneArea = new Rectangle(1050, 880, 150, 100); // 휴대폰 영역
    private Rectangle PresentArea = new Rectangle(820, 800, 200, 100); // 선물 영역

    private boolean isDiarySelected = false; // 일기장 사물함 선택 여부
    private boolean isPhoneSelected = false; // 휴대폰 사물함 선택 여부
    private boolean isPresentSelected = false; // 선물 사물함 선택 여부

    public Stage2ItemSelectionPanel(JPanel mainPanel, CardLayout cardLayout) {
        this.mainPanel = mainPanel;
        this.cardLayout = cardLayout;

        setLayout(null);
        setBackground(Color.LIGHT_GRAY);

        // 배경 이미지 추가
        JLabel background = new JLabel(new ImageIcon("images/stage2/성하_방.png"));
        background.setBounds(0, 0, 1440, 1024);
        add(background);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Point clickPoint = e.getPoint();
                if (DiaryArea.contains(clickPoint)) {
                    if (!isDiarySelected) {
                        isDiarySelected = true; // 선택 상태 업데이트
                        System.out.println("일기장 선택됨!");
                        startDiaryStory();
                    } else {
                        checkSelectionCompletion();
                        System.out.println("일기장 이미 선택됨.");
                    }
                } else if (PhoneArea.contains(clickPoint)) {
                    if (!isPhoneSelected) {
                        isPhoneSelected = true; // 선택 상태 업데이트
                        System.out.println("휴대폰 선택됨!");
                        startPhoneStory();
                    } else {
                        checkSelectionCompletion();
                        System.out.println("휴대폰 이미 선택됨.");
                    }
                } else if (PresentArea.contains(clickPoint)) {
                    if (!isPresentSelected) {
                        isPresentSelected = true; // 선택 상태 업데이트
                        System.out.println("선물 선택됨!");
                        startPresentStory();
                    } else {
                        checkSelectionCompletion();
                        System.out.println("선물 이미 선택됨.");
                    }
                }else {
                    System.out.println("선택된 아이템이 없습니다.");
                    System.out.println("선택 지점"+e.getPoint());
                }
                // 선택 상태 확인 후 처리
//                checkSelectionCompletion();
            }
        });

        setFocusable(true);
        requestFocusInWindow();
    }

    // 일기장 스토리 시작
    private void startDiaryStory() {
        System.out.println("일기장 스토리 시작!");
        cardLayout.show(mainPanel, "Stage2DiaryStory");
    }

    // 휴대폰 스토리 시작
    private void startPhoneStory() {
        System.out.println("휴대폰 스토리 시작!");
        cardLayout.show(mainPanel, "Stage2PhoneStory");
    }

    // 선물 스토리 시작
    private void startPresentStory() {
        System.out.println("선물 스토리 시작!");
        cardLayout.show(mainPanel, "Stage2PresentStory");
    }

    // 선택 상태 확인
    private void checkSelectionCompletion() {
        if (isDiarySelected && isPhoneSelected && isPresentSelected) {
            System.out.println("모든 선택 완료!");
            showCompletionDialogue();
        } else {
            System.out.println("아직 선택하지 않은 사물함이 있습니다.");
            showReminderDialogue();
        }
    }
    // 완료 대화 표시
    private void showCompletionDialogue() {
        JOptionPane.showMessageDialog(this, "문성하 방 조사를 마쳤습니다. 다음 단계로 이동합니다.");
        cardLayout.show(mainPanel, "Stage2Outro");
    }

    // 미완료 대화 표시
    private void showReminderDialogue() {
        JOptionPane.showMessageDialog(this, "다른 물건도 조사해보세요.");
    }

}
