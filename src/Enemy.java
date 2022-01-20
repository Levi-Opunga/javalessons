public class Enemy {
    private String name;
    private int hitPoints;
    private int lives;

    public Enemy(String name, int hitPoints, int lives) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.lives = lives;
    }

    public void takeDamage(int damage){
    int remainingHitPoints = hitPoints - damage;
    if (remainingHitPoints > 0){
        setHitPoints(remainingHitPoints);
        System.out.println(this.name +" took damage of " + damage +" points and is remaining with " +remainingHitPoints+" points.");
    }else {
        this.lives= this.lives - 1;
        System.out.println(this.name +" lost a life and has " + this.lives +" left");

        if(lives<=0){
            System.out.println(this.name +" is dead");
            this.lives = 0;
            this.hitPoints= 0;
        }}
//    } else{
//        System.out.println("You're dead");
//        this.lives = 0;
//        this.hitPoints= 0;
//
//    }



    }
    public void showDetails(){
        System.out.println("Name: "+ this.name +"\n"+ "Hit points: "+ this.hitPoints +"\n" + "Lives: "+ this.lives );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }
}
