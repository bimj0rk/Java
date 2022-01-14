//1
import java.util.Scanner;

public class Ex1 {
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

        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                System.out.println("Enter the number:");
                int number = scan.nextInt();

                System.out.println("Is it prime?");
                if(isPrime(number)) System.out.println("Yes");
                else System.out.println("No");
        }
}

