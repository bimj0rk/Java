//2
import java.io.*;
import java.util.*;

public class Ex2 {
    public static void main(String[] args){
        ArrayList <Integer> numbers = new ArrayList<Integer>();

        try{
            File file = new File("numbers.txt");
            FileWriter result = new FileWriter("numbersFinal.txt");
            Scanner scan = new Scanner(file);

            while(scan.hasNextInt()) numbers.add(scan.nextInt());

            Collections.sort(numbers);

            for(int i = 0; i < numbers.size(); i++) result.write(numbers.get(i) + " ");

            result.close();
            scan.close();

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
