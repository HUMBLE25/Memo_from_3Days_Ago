package stage1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ItemSelectionPanel extends JPanel {
    private CardLayout cardLayout;
    private JPanel mainPanel;

    private Rectangle moonSeongHaArea = new Rectangle(710, 560, 220, 400); // 문성하 사물함 영역
    private Rectangle jeonMyeongHoArea = new Rectangle(470, 560, 220, 400); // 전명호 사물함 영역

    public ItemSelectionPanel(JPanel mainPanel, CardLayout cardLayout) {
        this.mainPanel = mainPanel;
        this.cardLayout = cardLayout;

        setLayout(null);
        setBackground(Color.LIGHT_GRAY);

        // 배경 이미지 추가
        JLabel background = new JLabel(new ImageIcon("images/stage1/사물함_2.png"));
        background.setBounds(0, 0, 1440, 1024);
        add(background);

        // 디버그용 선택 영역 표시 (실제는 UI 요소로 표시할 수도 있음)
        JLabel debugLabel1 = createDebugLabel(moonSeongHaArea, Color.RED);
        JLabel debugLabel2 = createDebugLabel(jeonMyeongHoArea, Color.BLUE);
        add(debugLabel1);
        add(debugLabel2);

        // 마우스 클릭 리스너 추가
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Point clickPoint = e.getPoint();
                if (moonSeongHaArea.contains(clickPoint)) {
                    System.out.println("문성하 사물함 선택됨!");
                    startMoonSeongHaStory();
                } else if (jeonMyeongHoArea.contains(clickPoint)) {
                    System.out.println("전명호 사물함 선택됨!");
                    startJeonMyeongHoStory();
                } else {
                    System.out.println("선택된 아이템이 없습니다.");
                    System.out.println("선택 지점"+e.getPoint());
                }
            }
        });
        setFocusable(true);
        requestFocusInWindow();
        // 패널에 추가
//        mainPanel.add();
    }

    // 문성하 사물함 스토리 시작
    private void startMoonSeongHaStory() {
        System.out.println("문성하 사물함 스토리 시작!");
        cardLayout.show(mainPanel, "MoonSeongHaStory");
    }

    // 전명호 사물함 스토리 시작
    private void startJeonMyeongHoStory() {
        System.out.println("전명호 사물함 스토리 시작!");
        cardLayout.show(mainPanel, "JeonMyeongHoStory");
    }

    // 디버그용으로 선택 영역 표시
    private JLabel createDebugLabel(Rectangle area, Color color) {
        JLabel label = new JLabel();
        label.setBounds(area);
        label.setOpaque(false); // 투명하게 설정
        label.setOpaque(true);
        label.setBackground(color);
        label.setFocusable(false); // 이벤트 전달 가능
        return label;
    }
}
