package opening;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Start6 extends JFrame {
    public Start6() {
        setTitle("Start6");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // 화면 크기를 디스플레이 크기로 설정
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int width = (int) screenSize.getWidth();
        int height = (int) screenSize.getHeight();
        setSize(width, height);

        setContentPane(new Start6.MyPanel());
        getContentPane().setBackground(Color.BLACK);
        getContentPane().setLayout(null);

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

            String fullText = "사회교육관 건물 아래 싸늘하게 죽어있는 건 같은 과 내 죽마고우 문성하였다.";
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
        Start6.this.dispose();
        new Start7();
    }

    public static void main(String[] args) {
        new Start6();
    }
}

