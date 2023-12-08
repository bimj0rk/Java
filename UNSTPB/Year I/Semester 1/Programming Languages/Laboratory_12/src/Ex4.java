//4
import java.io.*;
import java.util.*;

public class Ex4 {
    public static void main(String[] args){
        ArrayList <String> towns = new ArrayList<String>();

        try{
            File file = new File("zip.txt");
            FileWriter result = new FileWriter("zipText.txt");
            Scanner scan = new Scanner(file);
            Scanner userInput = new Scanner(System.in);
            String townInput, town, currentTown;
            boolean doesTownExist = false;
            int noOfTowns = 0;

            while(scan.hasNextLine()){
                towns.add(scan.nextLine());
                currentTown = towns.get(noOfTowns);
                currentTown = currentTown.replaceAll("\\s+", "");
                currentTown = currentTown.replace(",", ", ");
                towns.set(noOfTowns, currentTown);
                noOfTowns++;
            }

            System.out.println(noOfTowns + " towns");

            townInput = userInput.nextLine();
            for(int i = 0; i < towns.size(); i++){
                townInput = townInput.toLowerCase();
                town = towns.get(i).toLowerCase();
                if(town.contains(townInput)){
                    currentTown = towns.get(i);
                    result.write(currentTown);
                    doesTownExist = true;
                    break;
                }
            }

            if(!doesTownExist) System.out.println("The town does not exist");

            result.close();
            scan.close();
            userInput.close();

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
