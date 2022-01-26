//1
interface Taxable{
    public double computeVAT();
    public double computeRoadTax();
    public double computeCustomTax();
    public double computeTotalTax();
}


public abstract class Vehicle implements Taxable, Comparable{
    protected double basePrice;
    protected String name;
    protected String country;

    public Vehicle(){
        this.basePrice = 5000.0;
        this.name = " ";
        this.country = " ";
    }

    public Vehicle(String n, String c, double bP){
        this.basePrice = bP;
        this.name = n;
        this.country = c;
    }

    public abstract double computeVAT();

    public abstract double computeRoadTax();

    public abstract double computeCustomTax();

    public abstract double computeTotalTax();

    public abstract String toString();
}

class Truck extends Vehicle{
    private double price;
    private String country;
    private String name;

    public Truck(double p, String c, String n){
        this.price = p;
        this.country = c;
        this.name = n;
    }

    @Override
    public double computeRoadTax() {
        return (5.0 * this.price) / 100;
    }

    @Override
    public double computeVAT() {
        return (19.0 * this.price) / 100;
    }

    @Override
    public double computeCustomTax() {
        if(!"Romania".equals(this.country)) return (10.0 * this.price) / 100;
        return 1.0;
    }

    @Override
    public double computeTotalTax() {
        return this.computeVAT() + this.computeRoadTax() + this.computeCustomTax() + this.price;
    }

    @Override
    public String toString() {
        return "Vehiculul " + this.name + " costa " + this.computeTotalTax();
    }

    @Override
    public int compareTo(Object o) {
        Vehicle obj = (Vehicle) o;
        if(obj.computeTotalTax() == this.computeTotalTax()) return (int)(this.computeTotalTax() - obj.computeTotalTax());
        return (int)(obj.computeTotalTax() - this.computeTotalTax());
    }
}

class Minibus extends Vehicle{
    private double price;
    private String country;
    private String name;

    public Minibus(double p, String c, String n){
        this.price = p;
        this.country = c;
        this.name = n;
    }

    @Override
    public double computeRoadTax() {
        return (3.0 * this.price) / 100;
    }

    @Override
    public double computeVAT() {
        return (19.0 * this.price) / 100;
    }

    @Override
    public double computeCustomTax() {
        if(!"Romania".equals(this.country)) return (10.0 * this.price) / 100;
        return 1.0;
    }

    @Override
    public double computeTotalTax() {
        return this.computeVAT() + this.computeRoadTax() + this.computeCustomTax() + this.price;
    }

    @Override
    public String toString() {
        return "Vehiculul " + this.name + " costa " + this.computeTotalTax();
    }

    @Override
    public int compareTo(Object o) {
        Vehicle obj = (Vehicle) o;
        if(obj.computeTotalTax() == this.computeTotalTax()) return (int)(this.computeTotalTax() - obj.computeTotalTax());
        return (int)(int)(obj.computeTotalTax() - this.computeTotalTax());
    }
}

class Bus extends Vehicle {
    private double price;
    private String country;
    private String name;

    public Bus(double p, String c, String n) {
        this.price = p;
        this.country = c;
        this.name = n;
    }

    @Override
    public double computeRoadTax() {
        return (4.0 * this.price) / 100;
    }

    @Override
    public double computeVAT() {
        return (19.0 * this.price) / 100;
    }

    @Override
    public double computeCustomTax() {
        if (!"Romania".equals(this.country)) return (10.0 * this.price) / 100;
        return 1.0;
    }

    @Override
    public double computeTotalTax() {
        return this.computeVAT() + this.computeRoadTax() + this.computeCustomTax() + this.price;
    }

    @Override
    public String toString() {
        return "Vehiculul " + this.name + " costa " + this.computeTotalTax();
    }

    @Override
    public int compareTo(Object o) {
        Vehicle obj = (Vehicle) o;
        if (obj.computeTotalTax() == this.computeTotalTax())
            return (int) (this.computeTotalTax() - obj.computeTotalTax());
        return (int) (obj.computeTotalTax() - this.computeTotalTax());
    }
}