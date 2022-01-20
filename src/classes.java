public class classes {
    public static void main(String[] args) {
        int lives = 4;
        boolean gameOver = (lives<1);
        if (gameOver)
        {
            System.out.println("Game over!");
        } else {
            System.out.println("YOU ARE STILL ALIVE");
        }
    }
}
