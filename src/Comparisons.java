public class Comparisons {
    public static void main(String[] args) {
        int value = 4;
        for (int i = 0; i < 8; i++) {
            if (i == value){
                System.out.println(i + " is equal to "+value);
            }  if (i <= value){
                System.out.println(i + " is less than or equal to "+value);
            }  if (i >= value){
                System.out.println(i + " is greater than or equal to "+value);
            }
        }
    }
}
