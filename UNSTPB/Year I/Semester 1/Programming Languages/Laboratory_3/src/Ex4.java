//4
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        int[] a = {10, 17, 22, 31, 40, 48, 53, 59, 66, 75};

        Scanner scan = new Scanner(System.in);
        int searchedNumber = scan.nextInt();

        int first = a[0];
        int last = a[9];

        while(first <= last) {
            int mid = (first + last)/2;
            if(a[first] == searchedNumber) System.out.println("The element " + searchedNumber + " was found at position"
                    + first);
            if(a[last] == searchedNumber) System.out.println("The element " + searchedNumber + " was found at position"
                    + last);
            if(a[mid] == searchedNumber) System.out.println("The element " + searchedNumber + " was found at position"
                    + mid);
            if(a[mid] > searchedNumber) last = mid;
            else first = mid;

        }

        scan.close();

    }
}
