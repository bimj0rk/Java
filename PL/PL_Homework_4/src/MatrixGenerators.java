//2
import java.util.Scanner;

public class MatrixGenerators {
    public static int[][] matrix1(int size){
        int m1[][] = new int[size][size];
        int index = 1;

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                m1[i][j] = index;
                index++;
            }
        }

        return m1;
    }

    public static int[][] matrix2(int size) {
        int m2[][] = new int[size][size];
        int index = 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                m2[j][i] = index;
                index++;
            }
        }

        return m2;
    }

    public static int[][] matrix3(int size) {
        int m3[][] = new int[size][size];
        int index = 1;
        int last = size - 1;

        for (int i = 0; i < size; i++) {
            if(i % 2 == 0) {
                for (int j = 0; j < size; j++) {
                    m3[i][j] = index;
                    index++;
                }
            } else {
                for (int j = last; j >= 0; j--) {
                    m3[i][j] = index;
                    index++;
                }
            }
        }

        return m3;
    }

    public static int[][] matrix4(int size){
        int m4[][] = new int[size][size];
        int index = 1;
        int right = size - 1, bot = right, top = 0, left = 0;

        while(true){
            if (left > right) break;

            for (int i = left; i <= right; i++) {
                m4[top][i] = index;
                index++;
            }
            top++;

            if (top > bot) break;

            for (int i = top; i <= bot; i++) {
                m4[i][right] = index;
                index++;
            }
            right--;

            for (int i = right; i >= left; i--) {
                m4[bot][i] = index;
                index++;
            }
            bot--;

            if (top > bot) break;

            for (int i = bot; i >= top; i--) {
                m4[i][left] = index;
                index++;
            }
            left++;
        }


        return m4;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of the matrixes: ");
        int size = scan.nextInt();

        int[][] matrix1 = matrix1(size);

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");

        int[][] matrix2 = matrix2(size);

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");

        int[][] matrix3 = matrix3(size);

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");

        int[][] matrix4 = matrix4(size);

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.print(matrix4[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}
