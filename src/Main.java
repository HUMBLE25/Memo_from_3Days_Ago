import stage1.Stage1;
import stage2.Stage2;
import stage3.Stage3;
import stage4.Stage4;
import ending.Ending;
import opening.Opening;

import java.awt.*;
import javax.swing.*;

public class Main extends JFrame{
    private ImageIcon imageIcon =new ImageIcon("images/opening/3일뒤메모.png");
    JLabel imgLabel = new JLabel(imageIcon);
    public Main(){
        setTitle("Can call images...??");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        setSize(1440,1024);
        c.add(imgLabel);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Main();
        System.out.println("Game Start!");
        System.out.println("test git, GO!GO!");
        System.out.println("keep going");

        // 통합을 어덯게 해야 할까?
        // 마지막으로 반환값을 이용해야 할까?
        // 순차적으로 실행이 될 수 있도록 해야 한다.
        // Opening Scene
        Opening opening = new Opening();

        // Stage 1
        Stage1 stage1 = new Stage1();
        // Stage 2
        Stage2 stage2 = new Stage2();

        // Stage 3
        Stage3 stage3 = new Stage3();

        // Stage 4
        Stage4 stage4 = new Stage4();

        // Ending Scene
        Ending ending = new Ending();
    }
}
