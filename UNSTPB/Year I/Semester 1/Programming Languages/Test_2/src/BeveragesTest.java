import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class BeveragesTest {
    public static void main(String[] args){
        ArrayList <String> beverages = new ArrayList<String>();
        Shop shop = new Shop();

        try{
            File file = new File("beverages.txt");
            Scanner scan = new Scanner(file);

            while(scan.hasNextLine()){
                FileOutputStream fos = new FileOutputStream(file, true);
                ObjectOutputStream oos = new ObjectOutputStream(fos);

            }

        } catch (Exception e){
            e.printStackTrace();
        }
    }   
}
