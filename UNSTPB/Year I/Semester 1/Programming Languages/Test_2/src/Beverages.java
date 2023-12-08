import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;

class Beverages {
    private String brand;
    private String ingredients;
    private String codebarNumber;
    private double price;
    private Calendar productionDate;
    private Calendar expirationDate;
    private int noOfUnits;

    public Beverages(String b, String i, String cN, double p, Calendar pD, Calendar eD, int nOU){
        this.brand = b;
        this.ingredients = i;
        this.codebarNumber = cN;
        this.price = p;
        this.productionDate = pD;
        this.expirationDate = eD;
        this.noOfUnits = nOU;
    }

    public String getBrand() {
        return brand;
    }

    public boolean checkStock(){
        boolean stock = false;
        if(this.noOfUnits > 0) stock = true;
        else stock = false;
        return stock;
    }

    public void addExpirationDate(int y, int m, int d){
        this.expirationDate.add(Calendar.DATE, d);
        this.expirationDate.add(Calendar.MONTH, m);
        this.expirationDate.add(Calendar.YEAR, y);
    }

    public void addProductionDate(int y, int m, int d){
        this.productionDate.add(Calendar.DATE, d);
        this.productionDate.add(Calendar.MONTH, m);
        this.productionDate.add(Calendar.YEAR, y);
    }

    public boolean checkExpirationDate(){
        Calendar currentDate = Calendar.getInstance();
        boolean expiration = false;
        if(expirationDate.compareTo(currentDate) > 0) expiration = true;
        else expiration = false;
        return expiration;
    }

    public String getIngredients() {
        return ingredients;
    }
}

class Company {
    private String name;
    private String address;
    private String phoneNumber;
    private String email;
    private Beverages[] beverages = new Beverages[100];
    private int noOfBeverages;

    public Company(String n, String a, String pN, String e){
        this.name = n;
        this.address = a;
        this.phoneNumber = pN;
        this.email = e;
        this.noOfBeverages = 0;
    }
}

class Shop {
    private Beverages[] beverages = new Beverages[100];
    private int noOfBeverages;

    public Shop(){
        this.noOfBeverages = 0;
    }

    public void addBeverage(Beverages b){
        this.noOfBeverages++;
        this.beverages[noOfBeverages] = b;
    }

    public void removeBeverages(){
        for(int i = 0; i < noOfBeverages; i++){
            if(!beverages[i].checkStock() || beverages[i].checkExpirationDate()){
                for(int j = 0; j < noOfBeverages; j++){
                    beverages[j] = beverages[j + 1];
                }
                noOfBeverages--;
                i--;
            }
        }
        System.out.println("Expired or out of stock items have been removed");
    }

    public void checkNumberOfIngredients(){
        ArrayList<String> ingredientsFinal = new ArrayList<String>();
        for(int i = 0; i < noOfBeverages; i++){
            String[] ingredients = beverages[i].getIngredients().split(" ");
            for(int j = 0; j < ingredients.length; j++)
                ingredientsFinal.add(ingredients[j]);
        }
        ArrayList<String> ingredientsList = new ArrayList<String>();
        for(String a : ingredientsFinal)
            if(!ingredientsList.contains(a)) ingredientsList.add(a);
        
        for(String s : ingredientsFinal) System.out.println("The ingredient " + s + " appears " + Collections.frequency(ingredientsFinal, ingredientsList) + " times.");
    }
}