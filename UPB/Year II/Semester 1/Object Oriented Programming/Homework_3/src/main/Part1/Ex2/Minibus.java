package main.Part1.Ex2;

public class Minibus extends Vehicle{
    public Minibus(double bp, String c, String n){
        super(bp, n, c);
    }

    @Override
    public double computeRoadTax() {
        return (3*super.basePrice)/100;
    }
}
