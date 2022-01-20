import java.util.*;
import java.lang.*;
import java.io.*;


public class Divisors {
    public static void main(String[] args) {
        long number;
        boolean isPrime = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = scanner.nextLong();
        ArrayList<Numbers> divisors;
        divisors = new ArrayList<>();
        ArrayList<BoolCounter> Values = new ArrayList<>();
        for (long i = 2; i <= number/2; i++) {
            if (number % i > 0) {
                isPrime = true;
                BoolCounter here = new BoolCounter(isPrime);
                Values.add(here);


            } else  {
                isPrime = false;
                BoolCounter there = new BoolCounter(isPrime);
                Numbers it = new Numbers(i);
                divisors.add(it);
                Values.add(there);
            }

        }
        System.out.println("The divisors are");

        for (Numbers in : divisors) {

            System.out.println(in.getNum());
        }
        System.out.println("==============================================================");
        boolean now = true;
        for (BoolCounter BOOL : Values) {
            if (BOOL.getBool() == false) {
                System.out.println("And this number is a composite number.");
                break;
            }
  // JUST TO SEE HOE THE INDEX THING WORKS
//            if (Values.get(Values.size()-3)== BOOL){
//
//                System.out.println(BOOL.getBool());
//
//            }

            if (Values.get(Values.size()-1)== BOOL){

                System.out.println("This is a prime number and is divisible by 1 and itself only.");

            }
            }
        System.out.println("==============================================================");



    }
}
