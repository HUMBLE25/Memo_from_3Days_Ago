package common;

import javax.swing.*;
import java.awt.*;

public class GradientPanel extends JPanel {
    private final Color startColor;
    private final Color endColor;

    public GradientPanel(Color startColor, Color endColor) {
        this.startColor = startColor;
        this.endColor = endColor;
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        int width = getWidth();
        int height = getHeight();

        // 그라데이션 색상 설정
        GradientPaint gradientPaint = new GradientPaint(0, 0, startColor, 0, height, endColor);
        g2d.setPaint(gradientPaint);
        g2d.fillRect(0, 0, width, height);

        super.paintComponent(g);
    }
}