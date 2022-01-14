//3

import java.util.Scanner;

public class Ex3 {

    public static void findTriplets(int arr[], int n, int sum){
        for (int i = 0; i < n - 2; i++)
            for (int j = i + 1; j < n - 1; j++)
                for (int k = j + 1; k < n; k++)
                    if (arr[i] + arr[j] + arr[k] == sum) System.out.println("(" + arr[i] + " " + arr[j] + " " + arr[k] + ")");
    }

    public static void main(String[] args){

        int arr[] = {1, 6, 3, 0, 8, 4, 1, 7};
        int n = arr.length;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the sum: ");
        int sum = scan.nextInt();

        findTriplets(arr, n, sum);
    }
}