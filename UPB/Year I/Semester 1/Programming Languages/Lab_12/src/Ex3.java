//1
import java.util.*;
import java.io.*;

public class Ex3 {
    public static void main(String[] args){
        ArrayList <String> text = new ArrayList<String>();

        try{
            File file = new File("test.txt");
            FileWriter result = new FileWriter("testFinal.txt");
            Scanner scan = new Scanner(file);

            while(scan.hasNextLine()) text.add(scan.nextLine());

            Collections.reverse(text);

            for(int i = 0; i < text.size(); i++){
                result.write(text.get(i));
                result.write('\n');
            }

            result.close();
            scan.close();

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
