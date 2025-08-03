package player;

// Player class
public class Player {
    private int id;
    private String name;
    private int hp = 10, atk = 5;

    // Constructors
    public Player(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Player() {
        this.name = "Player";
    }

    // get methods
    public String getName() { return name; }
    public int    getHp()   { return hp;   }
    public int    getAtk()  { return atk;  }
    public int    getId()   { return id;   }

    // Methods
    public void loseHp(int dmg) {
        hp -= dmg;
    }

    public void attack(Player defender) {
        defender.loseHp(getAtk());
    }

    public void heal() {
        hp += 5;
    }
}
