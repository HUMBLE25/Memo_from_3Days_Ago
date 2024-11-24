package opening;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Start15 extends JFrame {
    public Start15() {
        setTitle("Start15");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setContentPane(new Start15.MyPanel());
        getContentPane().setBackground(Color.BLACK);
        getContentPane().setLayout(null);

        setSize(1440, 1024);
        setVisible(true);


        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER || e.getKeyCode() == KeyEvent.VK_SPACE) {
                    goToNextPage();
                }
            }
        });

        setFocusable(true);
        requestFocusInWindow();
    }

    class MyPanel extends JPanel {
        public MyPanel(){
            setLayout(null);

            // 애니메이션 텍스트
            JLabel animatedText = new JLabel("", SwingConstants.CENTER);
            animatedText.setFont(new Font("Inter", Font.BOLD, 40));
            animatedText.setForeground(Color.WHITE);
            animatedText.setBounds(240, 150, 800, 400); // 위치와 크기

            add(animatedText);

            String fullText = "3일전 , 대학교 휴게실";
            Timer textAnimation = new Timer(50, new ActionListener() {
                int charIndex = 0;

                @Override
                public void actionPerformed(ActionEvent e) {
                    if (charIndex < fullText.length()) {
                        animatedText.setText("<html>" + fullText.substring(0, ++charIndex).replace("\n", "<br>") + "</html>");
                    } else {
                        ((Timer) e.getSource()).stop();
                    }
                }
            });
            textAnimation.start();




        }
    }



    private void goToNextPage() {
        Start15.this.dispose();
        new Start16();
    }

    public static void main(String[] args) {
        new Start15();
    }
}

