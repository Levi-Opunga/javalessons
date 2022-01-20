import java.util.Random;

public class VampireKing extends Vampire {
    public VampireKing(String name) {
        super(name);
        setHitPoints(140);
    }

    @Override
    public void takeDamage(int damage) {
        int damageDone = (damage / 4);
        super.takeDamage(damageDone);
//      (LONGER WAY)
//      int hitPoints=getHitPoints();
//       hitPoints= hitPoints-damageDone;
//        setHitPoints(hitPoints);
    }

    public boolean runaway() {
//        if(getLives()<2){
//            return true;
//        }else{
//            return false;
//        }
        return (getLives() < 2);
    }

    public boolean dodges() {
        Random rand = new Random();
        int chance = rand.nextInt(6);
        if (chance < 3) {
            System.out.println("Dracula dodges");
            return true;
        }
        return false;
    }
}
