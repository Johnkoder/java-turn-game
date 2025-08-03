package game;
import java.util.Scanner;
import player.Player;

public class BattleStage {
    public void startBattle(Player[] players, Scanner scanner) {
        Player p1 = players[0];
        Player p2 = players[1];
        int turn = 1;
        Player winner = null;

        while(true) {
            displayMenu(p1, p2);
            Player attacker = (turn == 1) ? p1 : p2;
            Player defender = (turn == 1) ? p2 : p1;
            displayBattleChoices(attacker);
            int attackerChoice = scanner.nextInt();
            scanner.nextLine();
            if(attackerChoice == 1) { attacker.attack(defender); }
            else if(attackerChoice == 2) { attacker.heal(); }

            winner = checkWinner(p1, p2);
            if(winner != null) {
                displayWinner(winner);
                break;
            }

            turn = (turn == 1) ? 2 : 1;
        }
    }

    Player checkWinner(Player p1, Player p2) {
        if(p1.getHp() <= 0) { return p2; }
        else if(p2.getHp() <= 0) { return p1; }
        else { return null; }
    }

    void displayWinner(Player winner) {
        System.out.println(winner.getName() + " wins!");
    }

    void displayMenu(Player p1, Player p2) {
        System.out.printf("%30s\n", "== BATTLE STAGE ==");

        System.out.printf("%-15s%30s\n", p1.getName(), p2.getName());

        System.out.printf("HP: %-3d ATK: %-3d%20sHP: %-3d ATK: %-3d\n",
                p1.getHp(), p1.getAtk(), "", p2.getHp(), p2.getAtk());
    }

    void displayBattleChoices(Player attacker) {
        System.out.println(attacker.getName() + "'s turn");
        System.out.println("[1] - Attack [2] - Heal");
    }
}
