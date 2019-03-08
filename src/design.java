public class design {
    final static int DIM1 = 80;
    final static int DIM2 = 22;

    public static boolean[][] initWorld() {
        boolean[][] world = new boolean[DIM1][DIM2];

        for (int y = 0; y < DIM2; y++) {
            for (int x = 0; x < DIM1; x++) {
                if (y < 1 || y > DIM2 - 1 || x < 1 || x > DIM1 - 1) {
                    world[x][y] = false;
                } else {
                    world[x][y] = Math.random() > 0.4;
                }
            }
        }
        return world;
    }

    public static void showWorld(boolean[][] world) {
        for (int y = 1; y < DIM2 - 1; y++) {
            for (int x = 1; x < DIM1 - 1; x++) {
                if (world[x][y]) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

    }

    public static boolean[][] useRule(boolean[][] world) {
        boolean [][] worldNew = new boolean [DIM1][DIM2];
        int neighbor;

        for (int y = 1; y < DIM2-1; y++) {
            for (int x = 1; x < DIM1-1; x++) {
                neighbor = countNeighbor(world, x, y);
                if (world[x][y]) {
                    if ((neighbor < 2) || (neighbor > 3)) {
                        worldNew[x][y] = false;
                    }
                    if ((neighbor == 2) || (neighbor == 3)) {
                        worldNew[x][y] = true;
                    }
                    else {
                        if (neighbor == 3) {
                            worldNew[x][y] = true;
                        }
                    }
                }
            }
        }
        return worldNew;
    }

    public static int countNeighbor(boolean[][] world, int x, int y){
        int count = 0;
        for (int i = x-1; i <= x+1; ++i) {
            for (int j = y - 1; j <= y + 1; ++j) {
                if (world[i][j]) {
                    count += 1;
                }

            }
        }

        return count;
    }

}