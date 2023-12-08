//4
import java.util.Scanner;

public class Ex4 {
    //a
    public static int countCharsIterative(String s, char c){
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }

        return count;
    }

    //b
    public static int countCharsRecursive(String s, char c, int index){
        if (index >= s.length())
            return 0;
        int count = 0;
        if (s.charAt(index) == c)
            count++;
        return count + countCharsRecursive(s, c, index + 1);
    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the string:");
        String s = scan.nextLine();

        System.out.println("Enter the character:");
        char c = scan.next().charAt(0);

        System.out.println("The number of occurences of c in s is: (iterative) " + countCharsIterative(s, c));
        System.out.println("The number of occurences of c in s is: (recurvise) " + countCharsRecursive(s, c, 0));
    }
}
