//3

public class Ex3 {
    public static void main(String[] args) {
        int[] a = {4, 2, 1, 7, 0, 8, 3, 9, 6, 5};
        int min = 0, max = 0;

        for(int i = 0; i < a.length; i++) {
            if(a[i] <= min) min = a[i];
            if(a[i] >= max) max = a[i];
        }

        System.out.println("The minimum element is " + min + " and the maximum element is " + max);
    }
}
