//2
import java.util.Scanner;
public class SecondLab2{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        String s=scan.nextLine();
        System.out.println(s);

        String password;

        int indexLastNameEnd = s.indexOf(" ", s.indexOf(" ") + 1);
        int indexLastName = s.indexOf(" ", s.indexOf(" ") + 1) - 2;

        String firstName = s.substring(0, 2);
        String lastName = s.substring(indexLastName, indexLastNameEnd);


        password = firstName.toLowerCase() + lastName.toUpperCase();

        System.out.println(password);

        scan.close();
    }
}