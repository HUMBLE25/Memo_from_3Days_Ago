package opening;

import common.ImageRegistry;

import javax.swing.*;
import java.awt.*;

public class OpeningIntro  extends JPanel {
    private CardLayout cardLayout;
    private JPanel mainPanel;
    protected ImageIcon nextBtnImg = ImageRegistry.getImage("button");
    protected ImageIcon gameStart = ImageRegistry.getImage("Opening_게임시작");

    public OpeningIntro(JPanel mainPanel, CardLayout cardLayout) {
        this.mainPanel = mainPanel;
        this.cardLayout = cardLayout;

        // 배경색 설정
        setLayout(null);
        setBackground(Color.BLACK);

        // 시작 패널을 만든디.
        // 다음 패널들을 각각의 객체로 만들고 cradLayout으로 불러온다.

    }

}
