import java.util.*;

public class PrimeCheck
{

    public static void main(String[] args){
    long number;
        boolean isPrime = false;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number: ");
    number = scanner.nextLong();
    for (long i = 2; i < number; i++)
    {
        if (number % i > 0)
        {
            isPrime = true;

        }
        else
        {
            isPrime = false;
break;

        }

    }
        if (isPrime)
        {
            System.out.println("This is a prime number \n");
        }
        else
        {
            System.out.println("This is composite number \n");
        }

}
}
