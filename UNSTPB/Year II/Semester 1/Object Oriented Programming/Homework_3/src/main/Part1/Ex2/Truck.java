package main.Part1.Ex2;

public class Truck extends Vehicle{
    public Truck(double bp, String n, String c){
        super(bp, n, c);
    }

    @Override
    public double computeRoadTax() {
        return super.basePrice/20;
    }
}
