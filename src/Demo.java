import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        Player levi = new Player("levi",7);
        System.out.println("player name: "+levi.getHandleName()
        );

//        Enemy enemy = new Enemy("test enemy", 15, 2);
//
//
//        VampireKing Dracula = new VampireKing("Dracula");
//        Dracula.showDetails();
//        Dracula.setLives(0);
////           do {
////                if (Dracula.dodges()) {
//                    Dracula.setLives(Dracula.getLives()+1);
//                    continue;
//                }
//                if (Dracula.runaway()) {
//                    System.out.println("Dracula ran away");
//                    break;
//                } else {
//                    Dracula.takeDamage(80);
//                    Dracula.showDetails();
//                    }
//            }while (Dracula.getLives() > 0);


//        Player conan = new Player("Conan", 5);
//        conan.pickNewLoot(new Loot("ARMOUR", LootType.ARMOUR, 56));
//        conan.pickNewLoot(new Loot("SWORD", LootType.ARMOUR, 86));
//        conan.pickNewLoot(new Loot("RED ONE", LootType.RING, -57));
//        conan.pickNewLoot(new Loot("ELIXIR", LootType.POTION, 16));
//        conan.pickNewLoot(new Loot("WHITE NIGHT", LootType.ARMOUR, 93));
//        conan.pickNewLoot(new Loot("Healing potion", LootType.POTION, 6));
//        conan.pickNewLoot(new Loot("BLUE PILL", LootType.POTION, 76));
//        conan.pickNewLoot(new Loot("WOODEN ARMOUR", LootType.ARMOUR, 34));
//        conan.pickNewLoot(new Loot("RING OF POWER", LootType.RING, 23));
//        conan.pickNewLoot(new Loot("Copper armour", LootType.ARMOUR, 47));
//        conan.inventoryDetails();
//        conan.dropLoot("RED ONE");
//
//        conan.inventoryDetails();
    }
}
//        while (Dracula.getLives() > 0) {
//            if(Dracula.dodges()){
//                continue;
//            }
//            if (Dracula.runaway()) {
//                System.out.println("Dracula ran away");
//                break;
//            } else {
//                Dracula.takeDamage(12);
//            }

//   }

//Troll uglyTroll = new Troll("Ugly troll");
//uglyTroll.showDetails();
//uglyTroll.takeDamage(30);
//uglyTroll.showDetails();
//Vampire vlad = new Vampire("Vlad");
//vlad.showDetails();
//vlad.takeDamage(8);
//vlad.showDetails();
//        Player tim = new Player();
//        tim.setNameAndLevel("timothy",6);
//        System.out.println(tim.getHandleName());
//        Loot redPotion = new Loot("red potion",LootType.POTION,7);
//        tim.pickNewLoot(redPotion);
//        tim.pickNewLoot(new Loot("chest armour",LootType.ARMOUR,80));
//        tim.pickNewLoot(new Loot("Ring of protection", LootType.RING, 40));
//        tim.pickNewLoot(new Loot("Invisibility potion", LootType.POTION, 40));
//
//
//        tim.displayInventory();
//        Loot bluePotion = new Loot("blue potion",LootType.POTION,45);
//        boolean wasDeleted = tim.dropLoot(redPotion);
//        System.out.println(wasDeleted);
//        tim.displayInventory();

//        System.out.println(tim.getWeapon().getName());
//        Weapon axe = new Weapon("battle axe",12,47);
//        tim.setWeapon(axe);
//  System.out.println(tim.getWeapon().getName());


//        System.out.println(Tim.getHandleName());
//        Tim.setHandleName("levi");
//        System.out.println(Tim.getHandleName());
//        Player Player_louise= new Player("louise");
//        Player_louise.setLives(5);
//        System.out.println("Lives : " +Player_louise.getLives());
//
//        System.out.println("Name : " +Player_louise.getHandleName());
//    Player gr8 = new Player("gr8", 9);
//    gr8.setLives(9);
//        System.out.println("Lives : "+gr8.getLives());
//        System.out.println("Name : "+gr8.getHandleName());
//        Player joe= new Player("joe");
//        joe.setScore(15);
//        System.out.println("JOE'S score :" +joe.getScore());
//        for (int i=0;i<=10;++i){
//            System.out.println("======");
//            System.out.println(i);
//            System.out.println("======");
//            VampireKing Dracula = new VampireKing("Dracula");
//            Dracula.showDetails();
//            while (Dracula.getLives() > 0) {
//                if (Dracula.dodges()) {
//                    continue;
//                }
//                if (Dracula.runaway()) {
//                    System.out.println("Dracula ran away");
//                    break;
//                } else {
//                    Dracula.takeDamage(80);
//                    Dracula.showDetails();
//                }
//            }
//            System.out.println("==================================================================");
//        }