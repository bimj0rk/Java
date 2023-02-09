//1

public class Ex1 {
    public static void mergeArrays(int[] array1, int[] array2, int length1, int length2, int[] array3) {
        int i = 0, j = 0, k = 0;

        while (i < length1 && j < length2){
            if (array1[i] < array2[j]){
                array3[k] = array1[i];
                k++;
                i++;
            } else {
                array3[k] = array2[j];
                k++;
                j++;
            }
        }

        while (i < length1){
            array3[k] = array1[i];
            k++;
            i++;
        }

        while (j < length2){
            array3[k] = array2[j];
            k++;
            j++;
        }
    }

    public static void main (String[] args) {
        int[] array1 = {1, 6, 8, 12, 15, 16};
        int[] array2 = {2, 5, 7, 11, 21};

        int length1 = array1.length;
        int length2 = array2.length;

        int[] array3 = new int[length1+length2];

        mergeArrays(array1, array2, length1, length2, array3);

        for (int i=0; i < length1+length2; i++)
            System.out.print(array3[i] + " ");
    }
}