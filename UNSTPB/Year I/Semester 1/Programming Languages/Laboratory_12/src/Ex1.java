//1
import java.io.*;
import java.util.*;

public class Ex1 {
    public static void main(String[] args){
        int biggest = 0, smallest, average = 0, index, scanInt, noOfNumbers = 0;
        try {
            File file = new File("numbers.txt");
            Scanner scan = new Scanner(file);
            scanInt = scan.nextInt();
            smallest = scanInt;

            while(scan.hasNextInt()){
                index = scan.nextInt();
                if(smallest > index) smallest = index;

                if(biggest < index) biggest = index;

                average += index;
                noOfNumbers++;
            }

            System.out.println("Biggest: " + biggest + ", smallest " + smallest + ", average " + (average/noOfNumbers));

            scan.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
