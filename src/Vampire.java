public class Vampire extends Enemy{
    public Vampire(String name) {
        super(name, 26, 3);
    }

    @Override
        public void takeDamage(int damage) {
        int damageDone = damage;
        super.takeDamage(damageDone);
    }

//    @Override
//    public void takeDamage(int damage){
//        int hitPoints= getHitPoints();
//        hitPoints= hitPoints- (damage/2);
//        setHitPoints(hitPoints);
//    }
}
