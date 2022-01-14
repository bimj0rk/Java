//2
import java.util.Scanner;
public class MatrixOperations{

    public static void fillingMatrix(Scanner scan, double m[][], int rows, int columns){

        for(int a = 0; a < rows; a++){
            for(int b = 0; b < columns; b++){
                m[a][b] = scan.nextInt();
            }
        }
    }

    public static void printingMatrix(double m[][], int rows, int columns){

        for(int a = 0; a < rows; a++){
            for(int b = 0; b < columns; b++){
                System.out.print(m[a][b] + " ");
            }
            System.out.println();
        }
    }

    public static double[][] matrixAdd(double m1[][], double m2[][], int rows, int columns){

        double[][] s = new double[rows][columns];
        for(int a = 0; a < rows; a++){
            for(int b = 0; b < columns; b++){
                s[a][b] = m1[a][b] + m2[a][b];
            }
        }
        return s;
    }

    public static double matrixDiagSum(double m[][],int rows, int columns) {

        double d=0;
        for(int a = 0; a < rows; a++){
            for(int b = 0; b < columns; b++){
                if (a==b) d=d + m[a][b];
            }
        }
        return d;
    }

    public static void main (String[] args){

        int r, c;
        double ds;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter number of matrix rows : ");
        r = sc.nextInt();
        System.out.println("Please enter number of matrix columns : ");
        c = sc.nextInt();

        double[][] m1 = new double[r][c];
        double[][] m2 = new double[r][c];
        double[][] sum = new double[r][c];

        System.out.println("Please enter the elements of matrix m1 : ");
        fillingMatrix(sc, m1, r, c);
        System.out.println("Please enter the elements of matrix m2 : ");
        fillingMatrix(sc, m2, r, c);

        sum = matrixAdd(m1, m2, r, c);
        System.out.println("The sum matrix is: ");
        printingMatrix(sum, r, c);

        ds=matrixDiagSum(m1, r, c);
        System.out.println("The sum of the elem on the 1st diagonal is: "+ds);


    }
}