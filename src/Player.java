import java.util.ArrayList;

public class Player {
    private String handleName;
    private Weapon weapon;
    private int lives;
    private int level;
    private int score;
    private ArrayList<Loot> inventory;

    public void inventoryDetails() {
        int Sum = 0;
//        for (int i = 0; i < inventory.size(); i++) {
//            System.out.println("Loot name: " + inventory.get(i).getName() + "\t" + "Loot value: " + inventory.get(i).getValue());
//
//            Sum = Sum + inventory.get(i).getValue();
//
//        }
        for (Loot loot : inventory) {
            Loot current = loot;
            System.out.println("Loot name: " + current.getName() + "\t" + "Loot value: " + current.getValue());

            Sum = Sum + current.getValue();

        }
        System.out.println("TOTAL INVENTORY VALUE:" + Sum);
    }

    public Player() {
        this("Unknown player");
    }

    public Player(String handle) {
        this(handle, 1);
//        handleName = handle;
//        lives = 3;
//        level = 1;
//        score = 0;
    }

    public Player(String handle, int startingLevel) {
        // this.handleName= handle
        // this.lives = 3
        // this.level= startingLevel
        //this.score= 0
        // instead use setters and getters
        setHandleName(handle);
        setLives(3);
        setLevel(startingLevel);
        setScore(0);
//        setDefaultWeapon();
        inventory = new ArrayList<>();
    }

    public String getHandleName() {
        return handleName;
    }

    public void setHandleName(String handle) {
        if (handle.length() < 3) {
            System.out.println("This name ' " + handle + " ' is too short and must be 3 characters or more");
            return;
        }

        handleName = handle;

    }

    private void setDefaultWeapon() {
        this.weapon = new Weapon("Katana", 10, 20);
    }

    public void setNameAndLevel(String handle, int level) {
        // calling setters and getters
        setHandleName(handle);
        setLevel(level);
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public ArrayList<Loot> getInventory() {
        return inventory;
    }

    /*public void setInventory(ArrayList<Loot> inventory) {
        this.inventory = inventory;
    }*/
    public void pickNewLoot(Loot newLoot) {
        inventory.add(newLoot);
    }

    public boolean dropLoot(Loot loot) {
        if (this.inventory.contains(loot)) {
            inventory.remove(loot);
            return true
                    ;
        }
        return false;
    }

    public boolean dropLoot(String lootName) {
        for (Loot loot : inventory) {
            if (lootName.equals(loot.getName())) {
                dropLoot(loot);
                return true;
            }
        }
        return false;
    }

    public void displayInventory() {

        for (Loot item : inventory) {
            System.out.println(item.getName());

        }
        System.out.println("=============================================");
    }

    public void score() {
        int tally = 0;
        for (Loot item : inventory) {

            tally = tally + item.getValue();

        }
        System.out.println(tally);
    }


}

