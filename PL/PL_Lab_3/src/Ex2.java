//2
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        int gcd = 0;

        Scanner scan = new Scanner(System.in);

        int n1 = scan.nextInt();
        int n2 = scan.nextInt();

        for(int i = 1; i <= n1 && i <= n2; i++)
            if(n1 % i == 0 && n2 % i == 0)
                gcd = i;

        System.out.println(gcd);

        scan.close();

    }
}
