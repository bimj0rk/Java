/*Ratatouille, a big mouse chef, wants to impress his restaurant clients, but there is a shortage of food in shops. He checks a txt file for possible recipes, 
where for each recipe are named the needed ingredients and their quantities. Based on what exists already in the restaurant, as ingredients, 
along with their existent quantities, display which are the possible options for the menu of the day. What other dishes can he serve today? 
Store all your answers inside a txt file.*/

import java.io.*;
import java.util.*;

public class Recipe{
    private String recipeName;
    private String ingredientName1;
    private String ingredientName2;
    private String ingredientName3;
    private int quantity;

    public Recipe(String rN, String iN1, String iN2, String iN3, int qty){
        this.recipeName = rN;
        this.ingredientName1 = iN1;
        this.ingredientName2 = iN2;
        this.ingredientName3 = iN3;
        this.quantity = qty;
    }

    public int getQuantity() {
        return this.quantity;
    }

    @Override
    public String toString() {
        return "Name of the recipe: " + this.recipeName + ", ingredients: " + this.ingredientName1 + ", " + this.ingredientName2 + ", " + this.ingredientName3 + 
        ", quantity that can be produced: " + this.quantity;
    }
}

class RestaurantTest{
    public static void main(String[] args){
        ArrayList<String> recipes = new ArrayList<String>();

        try{
            File file = new File("recipes.txt");
            Scanner scanFile = new Scanner(file);
            FileWriter result = new FileWriter("restaurant.txt");
            int noOfLines = 0;

            while(scanFile.hasNextLine()){
                recipes.add(scanFile.nextLine());
                noOfLines++;
            }

            Recipe[] restaurant = new Recipe[noOfLines];

            for(int i = 0; i < noOfLines; i++){
                String currentLine = recipes.get(i);
                String[] parts = currentLine.split(", ");
                restaurant[i] = new Recipe(parts[0], parts[1], parts[2], parts[3], Integer.parseInt(parts[4]));
            }

            for(int i = 0; i < noOfLines; i++){
                if(restaurant[i].getQuantity() == 0){
                    restaurant[i] = restaurant[noOfLines - 1];
                    noOfLines--;
                }
            }

            result.write("Recipes that can be created: ");
            for(int i = 0; i < noOfLines; i++){
                String s = restaurant[i].toString();
                result.write(s + ", ");
            }

            result.close();
            scanFile.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}