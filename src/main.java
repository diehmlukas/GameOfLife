import javax.swing.*;

import java.io.IOException;

import static java.lang.Thread.sleep;

public class main extends JFrame {
    public static void main(String[] args) throws InterruptedException, IOException {

        boolean[][] world = design.initWorld();

        System.out.println();
        System.out.println("Startconstellation");
        design.showWorld(world);

        for (int i = 1; i <= 20; i++) {
            world = design.useRule(world);
            System.out.println("Generation " + i);
            design.showWorld(world);
            Thread.sleep(250 );
        }

    }
}
