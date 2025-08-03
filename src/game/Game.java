package game;
import player.Player;
import java.util.Scanner;

// game.Game Class
public class Game {
    // Display initial menu
    public void displayInitialMenu() {
        System.out.println("----Welcome to the Game----");
        System.out.println("[1] - Play Game");
        System.out.println("[2] - Exit");
        System.out.print("-> ");
    }

    public Player[] createPlayers(Scanner scanner) {
        System.out.print("Enter Player 1 name: ");
        String p1Name = scanner.nextLine();
        System.out.print("Enter Player 2 name: ");
        String p2Name = scanner.nextLine();
        Player p1 = new Player(p1Name, 1);
        Player p2 = new Player(p2Name, 2);


        return new Player[]{p1, p2};
    }
}
