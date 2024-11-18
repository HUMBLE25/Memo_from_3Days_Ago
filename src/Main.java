import stage1.Stage1;
import stage2.Stage2;
import stage3.Stage3;
import stage4.Stage4;
import ending.Ending;
import opening.Opening;

public class Main {
    public static void main(String[] args) {
        System.out.println("Game Start!");

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