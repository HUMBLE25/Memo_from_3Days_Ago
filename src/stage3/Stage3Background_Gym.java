package stage3;

import javax.swing.*;
import java.awt.*;

public class Stage3Background_Gym extends JFrame {
    public Stage3Background_Gym(){
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = getContentPane();
    setContentPane(new Mypanel());

    setSize(1440,1024);
    setVisible(true);
}
class Mypanel extends JPanel{
    private ImageIcon icon = new ImageIcon("images/stage3/예체능관.png");
    private Image img = icon.getImage();

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(img,0,0,this);
    }
}

public static void main(String[] args) {
    new Stage3Background_Gym();
}

        }
