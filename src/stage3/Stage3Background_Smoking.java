package stage3;

import java.awt.*;
import javax.swing.*;

public class Stage3Background_Smoking extends JFrame{
    public Stage3Background_Smoking(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new Mypanel());
        setSize(1440,1024);
        setVisible(true);
    }
    class Mypanel extends JPanel{
        private ImageIcon icon = new ImageIcon("images/stage3/흡연실.png");
        private Image img = icon.getImage();

        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(img,0,0,this);
        }
    }

    public static void main(String[] args) {
        new Stage3Background_Smoking();
    }
}
