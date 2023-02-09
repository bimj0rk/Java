package Ex1;

import java.util.*;

public class Medicine implements Comparable<Medicine>{
    private String name;
    private String indications;
    private String contra_indications;
    private ArrayList<String> ingredients = new ArrayList<String>();
    private double price;
    private int stock;

    public Medicine(String dName, String dIndications, String dC_Indications, double dPrice, int dStock){
        this.name = dName;
        this.indications = dIndications;
        this.contra_indications = dC_Indications;
        this.price = dPrice;
        this.stock = dStock;
    }

    public void addIngredient(String dIngredient){
        this.ingredients.add(dIngredient);
    }

    public void removeDuplicates(){
        ArrayList<String> newIngredientsList = new ArrayList<String>();
        for(String searchedIngredient : this.ingredients)
            if(!newIngredientsList.contains(searchedIngredient)) newIngredientsList.add(searchedIngredient);

        this.ingredients.clear();
        this.ingredients.addAll(newIngredientsList);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getContra_indications() {
        return contra_indications;
    }

    public String getIndications() {
        return indications;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public int getStock() {
        return stock;
    }

    public void setContra_indications(String contra_indications) {
        this.contra_indications = contra_indications;
    }

    public void setIndications(String indications) {
        this.indications = indications;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public int compareTo(Medicine mCompared){
        if(this.price < mCompared.price) return -1;
        else if(this.price > mCompared.getPrice()) return 1;
        else return 0;
    }

    public int compareName(Medicine mCompared){
        if(Integer.parseInt(this.name) < Integer.parseInt(mCompared.getName())) return -1;
        else if(Integer.parseInt(this.name) < Integer.parseInt(mCompared.getName())) return 1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Medicine: " + this.name + ", indications: " + this.indications + ", contra indications: " + this.contra_indications
                + ", price: " + this.price + ", stock: " + this.stock + ", ingredients: " + this.ingredients;
    }
}
