//1
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int num1 = 0, num2 = 1, sumOfPreviousTwo;
        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();

        int i1 = 0;

        while (i1 <= count) {
            System.out.print("1");
            System.out.println(num1 + " ");
            sumOfPreviousTwo = num1 + num2;
            num2 = sumOfPreviousTwo;
            i1++;
        }

        scan.close();

    }
}
