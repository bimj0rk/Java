//5

public class Ex5 {
    public static void main(String[] args) {
        int matrix1[][] = {{1, 1, 2}, {2, 1, 0}, {0, 0, 1}};
        int matrix2[][] = {{1, 3, 2}, {1, 1, 0}, {1, 0, 1}};

        int sumMatrix[][] = new int[3][3];
        int productMatrix [][] = new int [3][3];

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                productMatrix[i][j] = 0;
                for(int k = 0; k< 3; k++) {
                    productMatrix[i][j] = matrix1[i][k] * matrix2[k][j];
                }
                System.out.print(productMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
