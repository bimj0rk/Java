import java.util.*;

public class VehicleTest{
    public static void main(String[] args){
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        Vehicle truck = new Truck(150000, "Sweden", "Volvo");
        Vehicle minibus = new Minibus(5000, "Romania", "Iveco");
        Vehicle bus = new Bus(80000, "Turkey", "Otokar");

        vehicles.add(truck);
        vehicles.add(minibus);
        vehicles.add(bus);

        System.out.println(truck.toString());
        System.out.println(minibus.toString());
        System.out.println(bus.toString());
        
        //2
        Collections.sort(vehicles);

        for(Vehicle v : vehicles) System.out.println(v.computeTotalTax());
    }

}
