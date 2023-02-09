//2

public class Product {
    private String name;
    private double priceInROL;
    protected double priceInRON;

    public Product(String n, double pRL){
        name = n;
        priceInROL = pRL;
    }

    public void displayProduct(){
        System.out.println(name + ", " + priceInROL + "ROL");
    }

    public double getPrice(){
        return priceInROL;
    }

    public double setPrice(double newPriceInROL){
        priceInROL = newPriceInROL;
        return priceInROL;
    }

    public double getPriceInRON(){
        priceInRON = priceInROL / 10000;
        return priceInRON;
    }

    public double setPriceInRON(double newPriceInRON){
        priceInRON = newPriceInRON;
        return priceInRON;
    }

    public double raisePriceInRON(double raise){
        priceInRON += raise;
        return priceInRON;
    }

    public void displayProductInRON(){
        System.out.println(name + ", " + priceInRON + "RON");

    }

}
