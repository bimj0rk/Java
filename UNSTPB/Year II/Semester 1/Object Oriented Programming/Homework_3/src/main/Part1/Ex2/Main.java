package main.Part1.Ex2;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

        vehicles.add(new Truck(50000, "Truck", "Germany"));
        vehicles.add(new Bus(40000, "Bus", "Romania"));
        vehicles.add(new Minibus(25000, "Minibus", "Scotland"));
        vehicles.add(new Truck(30000,"toyota", "croatia"));

        for(Vehicle v : vehicles) System.out.println(v);
    }
}
