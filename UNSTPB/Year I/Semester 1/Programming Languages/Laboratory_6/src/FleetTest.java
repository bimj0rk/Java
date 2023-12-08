//2

class FleetTest{

    public static void main(String[] args){

        double startKM1 = 100;
        double endKM1 = 300;
        double liters1 = 15;

        double startKM2 = 200;
        double endKM2 = 800;
        double liters2 = 50;

        Fleet fleet = new Fleet(startKM1, endKM1, liters1, startKM2, endKM2, liters2);

        System.out.println("Average fuel consumption for fleet is: " + fleet.averageConsumption() + "L/100 KM");
    }
}
