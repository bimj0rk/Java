public class FlightTest {
    public static void main(String args[]){
        Flight flight1 = new Flight(1, 3, false);
        Flight flight2 = new Flight(2, 2, true);
        Flight flight3 = new Flight(3, 5, false);

        Airport airport = new Airport();

        airport.addFlight(flight1);
        airport.addFlight(flight2);
        airport.addFlight(flight3);

        airport.writeFlights();

        airport.removeFlight();

        airport.writeFlights();
    }
    
}
