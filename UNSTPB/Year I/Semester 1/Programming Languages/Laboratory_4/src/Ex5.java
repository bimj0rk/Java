//5

import java.util.Random;

public class Ex5 {

    public static void maximumElement(int m[][], int rows, int columns){
        int max = 0;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if(m[i][j] > max) max = m[i][j];
            }
        }
        System.out.println("The maximum element is: " + max);
    }

    public static void maximumElementRow(int m[][], int rows, int columns){
        int maxRow = 0, result = 0, i = 0;
        System.out.println("The maximum element on each row(in ascending order) is: ");
        while(i < rows) {
            for (int j = 0; j < columns; j++) {
                if (m[i][j] > maxRow) maxRow = m[i][j];
            }
            result = maxRow;
            maxRow = 0;
            System.out.println(result);
            i++;
        }
    }

    public static void main(String[] args){

        Random r = new Random();
        int[][] a = new int[5][7];
        System.out.println("The matrix is: ");
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 7; j++) {
                a[i][j] = r.nextInt(100);
                System.out.print(a[i][j] + " ");
            }

            System.out.println(" ");
        }

        maximumElement(a, 5, 7);

        maximumElementRow(a, 5, 7);
    }
}
