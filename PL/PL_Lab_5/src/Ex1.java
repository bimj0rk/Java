//1
import java.util.Scanner;

public class Ex1 {
    //a
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    //b
    public static void genPrimes(int n){
        int i = 0, num = 0;

        for (i = 1; i <= n; i++){
            int counter = 0;

            for(num = i; num >= 1; num--){
                if(i % num == 0) counter++;
            }

            if(counter == 2) System.out.print(i + " ");
        }
    }

    //c
    public static boolean allPrimeDivisors(int n) {
        for (int d = 2; d <= n/2; d++)
            if (n % d == 0)
                if (isPrime(d) == false)
                    return false;
        return true;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Please write the number n: ");
        int n = scan.nextInt();

        System.out.println("Is n prime?");
        if(isPrime(n)) System.out.println("Yes");
        else System.out.println("No");

        System.out.println("All prime numbers less than n are: ");
        genPrimes(n);

        System.out.println(" ");

        System.out.println("Are all divisors of n prime?");
        if(allPrimeDivisors(n)) System.out.println("Yes");
        else System.out.println("No");
    }
}
