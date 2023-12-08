package main.Part1.Ex2;

abstract public class Vehicle implements Taxable, Comparable<Vehicle>{
    protected double basePrice;
    protected String name;
    protected String country;

    public Vehicle(double p, String n, String c){
        this.basePrice = p;
        this.country = c;
        this.name = n;
    }

    @Override
    public int compareTo(Vehicle v){
        final int BEFORE = -1;
        final int EQUAL = 0;
        final int AFTER = 1;

        if(this == v) return EQUAL;
        if(computeTotalTax() < v.computeTotalTax()) return BEFORE;
        if(computeTotalTax() > v.computeTotalTax()) return AFTER;

        return 0;
    }

    @Override
    public double computeVAT() {
        return (19*this.basePrice)/100;
    }

    @Override
    abstract public double computeRoadTax();

    @Override
    public double computeCustomTax() {
        if(!this.country.equalsIgnoreCase("Romania")) return this.basePrice/10;
        else return 0;
    }

    @Override
    public double computeTotalTax() {
        return computeCustomTax() + computeRoadTax() + computeVAT();
    }

    public String toString(){
        return "Name: " + this.name + ", country of origin: " + this.country + ", base price: " + this.basePrice + ", taxes: " + computeTotalTax(); 
    }
}
