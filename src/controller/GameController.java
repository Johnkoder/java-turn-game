package controller;
import java.util.Scanner;
import game.Game;
import game.BattleStage;
import player.Player;

public class GameController {
    private final Game game = new Game();
    private final Scanner scanner = new Scanner(System.in);

    public void run() {
        while(true) {
            game.displayInitialMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            if(choice == 1) {
                // start battle
                Player[] players = game.createPlayers(scanner);
                BattleStage battleStage = new BattleStage();
                battleStage.startBattle(players, scanner);
            } else {
                break;
            }
        }
    }
}
