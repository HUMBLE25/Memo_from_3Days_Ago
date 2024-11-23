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

            String text = "3일전, 대학교 흡연실";

            JTextArea textArea = new JTextArea(text);
            textArea.setBounds(460, 312, 400, 400);
            textArea.setFont(new Font("Inter", Font.PLAIN, 40));
            textArea.setForeground(Color.WHITE);
            textArea.setBackground(Color.BLACK);
            textArea.setLineWrap(true); // 줄 바꿈 허용
            textArea.setWrapStyleWord(true); // 단어 단위로 줄 바꿈
            textArea.setEditable(false); // 텍스트 수정 불가능



            add(textArea);
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

