//3
import java.util.Scanner;

public class Ex3 {
    public static int match(String s1, String s2){
        int lastIndex = 0, count = 0;

        while(lastIndex != -1){
             lastIndex = s2.indexOf(s1, lastIndex);

             if(lastIndex != -1){
                 count++;
                 lastIndex += s1.length();
             }
        }

        return count;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s1, s2;

        System.out.println("Enter first string:");
        s1 = scan.nextLine();

        System.out.println("Enter second string:");
        s2 = scan.nextLine();

        System.out.println("The number of occurences of the first string in the second string is:");
        System.out.println(match(s1, s2));
    }
}
