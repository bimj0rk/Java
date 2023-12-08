package main.Part1.Ex2;

public class Bus extends Vehicle{
    public Bus(double bp, String n, String c){
        super(bp, n, c);
    }

    @Override
    public double computeRoadTax() {
        return super.basePrice/5;
    }
}
