//1
import java.lang.Math;
import java.util.Scanner;

public class Distance {
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
    }

    public static void main(String[] args) {
        double a1, a2, b1, b2;
        Scanner scan = new Scanner(System.in);

        System.out.println("Insert x1: ");
        a1 = scan.nextDouble();

        System.out.println("Insert x2: ");
        a2 = scan.nextDouble();

        System.out.println("Insert y1: ");
        b1 = scan.nextDouble();

        System.out.println("Insert y2: ");
        b2 = scan.nextDouble();

        System.out.println("Distance between X(x1; x2) and Y(y1; y2) is: " + distance(a1, a2, b1, b2));

        scan.close();
    }

}
