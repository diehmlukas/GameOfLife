public class main {
    public static void main(String[] args) {
        boolean[][] world = design.initWorld();

        System.out.println("Startconstellation");
        design.showWorld(world);

        for (int i = 1; i <= 10; i++) {
            world = design.useRule(world);
            System.out.println("Generation " + i);
            design.showWorld(world);
        }

    }
}
