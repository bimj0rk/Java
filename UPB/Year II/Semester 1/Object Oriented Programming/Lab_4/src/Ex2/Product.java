package Ex2;

import java.util.GregorianCalendar;

public class Product{
    private String productName;
    private String description;
    private String ingredients;
    private GregorianCalendar expiryDate;

    public Product(String pn, String d, String i, GregorianCalendar ed){
        this.description = d;
        this.expiryDate = ed;
        this.ingredients = i;
        this.productName = pn;
    }

    @Override
    public String toString() {
        return "Product " + this.productName + ", description: " + this.description + ", ingredients: " + this.ingredients + ", expiry date: " + this.expiryDate;
    }

    public boolean equals(Object obj){
        if(!(obj instanceof Product)) return false;
        else if(obj == this) return true;
        return this.productName.equals(((Product)obj).productName);
    }

    public int hashCode(){
        return (int) (productName.length() + Math.random()*10);
    }
}
