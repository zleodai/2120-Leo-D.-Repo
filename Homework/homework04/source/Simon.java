package source;

import java.util.Random;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Simon {
    private String[] seq;
    private int level;
    private Scanner scan = new Scanner(System.in);

    Random rand = new Random();
    int three = 3;

    public Simon() {
        seq = new String[100];
        level = 0;

        seq[level] = getColor(rand.nextInt(three));
    }

    private String getColor(int x) {
        if (x == 0)
            return "R";
        else if (x == 1)
            return "G";
        else if (x == 2)
            return "Y";
        else
            return "B";
    }

    public void nextLevel() {
        seq[level] = getColor(rand.nextInt(three));
        level++;
    }

    public int run() throws InterruptedException, IOException {
        System.out.println("Simon saysssss \n\n");
        for (int x = 0; x < level; x++) {
            Thread.sleep(1000);
            System.out.println("\n" + seq[x]);
        }
        Thread.sleep(3000);
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        System.out.println("\nList the colors in order and press enter after each color\n");
        for (int t = 0; t < level; t++) {
            String x = scan.nextLine();
            if (Objects.equals(x, seq[t]))
                System.out.println("\ncorrect\n");
            else {
                System.out.println("incorrect you loseee");
                level = 404;
                return 0;
            }

        }
        Thread.sleep(2000);
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        return 1;
    }

    public boolean lose() {
        return level == 404;
    }
}
