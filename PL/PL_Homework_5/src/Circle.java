//1
import java.util.Scanner;
import java.lang.Math;

public class Circle {

    private int xCoordinate;
    private int yCoordinate;
    private double radius;

    public Circle(int x, int y, double r){
        xCoordinate = x;
        yCoordinate = y;
        radius = r;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference(){
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int xCoord, yCoord;
        double radius;

        System.out.println("Enter the X and Y coordinates for the center of the circle:");
        xCoord = scan.nextInt();
        yCoord = scan.nextInt();

        System.out.println("Enter the radius of the circle:");
        radius = scan.nextDouble();

        Circle circle = new Circle(xCoord, yCoord, radius);

        System.out.println("The area of the circle is: " + circle.getArea());
        System.out.println("The circumference of the circle is: " + circle.getCircumference());

        scan.close();
    }
}
