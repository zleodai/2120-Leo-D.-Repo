import source.Simon;
import java.io.IOException;

public class SimonGame {
    public static void main(String[] args) throws InterruptedException, IOException {
        Simon game = new Simon();

        while (!game.lose()) {
            game.nextLevel();
            game.run();
        }

        System.out.println("\n You lose haha loser\n\n\n");
    }
}
