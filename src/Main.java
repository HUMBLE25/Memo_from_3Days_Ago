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
        setTitle("Can cal images...??");
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

        // Opening Scene
        Opening opening = new Opening();
        opening.run();

        // Stage 1
        Stage1 stage1 = new Stage1();
        stage1.run();

        // Stage 2
        Stage2 stage2 = new Stage2();
        stage2.run();

        // Stage 3
        Stage3 stage3 = new Stage3();
        stage3.run();

        // Stage 4
        Stage4 stage4 = new Stage4();
        stage4.run();

        // Ending Scene
        Ending ending = new Ending();
        ending.run();
    }
}
