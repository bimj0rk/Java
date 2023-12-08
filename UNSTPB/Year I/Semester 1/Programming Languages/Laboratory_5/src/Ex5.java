//5
import java.util.Scanner;

public class Ex5 {
    public static void modify(String s){
        int last = s.length() - 1;
        String sFinal = "";
        for (int i = 0; i < last; i++) {
            sFinal = sFinal + s.charAt(i) + s.charAt(last);
            last--;
        }

        System.out.println(sFinal);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String s = scan.nextLine();

        System.out.println("The result is:");
        modify(s);
    }
}
