public class Flight {
    protected int id;
    protected int priority;
    protected boolean isReady;

    public Flight(int id, int p, boolean r){
        this.id = id;
        this.priority = p;
        this.isReady = r;
    }

    @Override
    public String toString() {
        return "ID: " + this.id + ", priority: " + this.priority + ", is it ready? " + this.isReady;
    }
}

class Airport{
    private Flight[] flights = new Flight[100];
    private int noOfFlights;

    public Airport(){
        this.noOfFlights = 0;
    }

    public void addFlight(Flight f){
        this.flights[noOfFlights] = f;
        this.noOfFlights++;

        int aux = 0;

        for(int i = 0; i < this.noOfFlights; i++){
            if(this.flights[i].priority > this.flights[i+1].priority){
                aux = this.flights[i].priority;
                this.flights[i+1].priority = this.flights[i].priority;
                this.flights[i].priority = aux;
            }
        }
    }

    public void removeFlight(){
        for(int i = 0; i < this.noOfFlights; i++){
            if(this.flights[i].isReady){
                this.flights[i] = this.flights[noOfFlights - 1];
                this.noOfFlights--;
            }
        }
    }

    public void writeFlights() {
        for(int i = 0; i < this.noOfFlights; i++){
            System.out.println(this.flights[i].toString());
        }
    }
}
