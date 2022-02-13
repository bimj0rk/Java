class Patient{
    protected String name;
    protected String condition;
    protected boolean contagious;

    public Patient(String n, String cnd, boolean ctg){
        this.name = n;
        this.condition = cnd;
        this.contagious = ctg;
    }
}

public class Hospital {
    private Patient[] patients = new Patient[100];
    private int numberOfBeds;
    private int noOfOccupiedBeds;

    public Hospital(int nOB){
        this.numberOfBeds = nOB;
        this.noOfOccupiedBeds = 0;
    }

    public void addPatient(Patient p){
        this.numberOfBeds--;
        this.noOfOccupiedBeds++;
        this.patients[this.noOfOccupiedBeds] = p;
    }

    public Patient[] getContagiousPatients(){
        int noOfContagiousPatients = 0, j = 0;
        for(int i = 0; i < numberOfBeds; i++){
            if(patients[i].contagious) noOfContagiousPatients++;
        }

        Patient[] contagiusPatients = new Patient[noOfContagiousPatients];
        for(int i = 0; i < numberOfBeds; i++){
            if(patients[i].contagious){
                contagiusPatients[j] = patients[i];
                j++;
            }
        }
        return contagiusPatients;
    }

    public int getAvailableBeds(){
        return this.numberOfBeds;
    }

    public void removePatient(){
        for(int i = 0; i < noOfOccupiedBeds; i++){
            if(!patients[i].contagious){
                patients[i] = patients[noOfOccupiedBeds - 1];
                this.noOfOccupiedBeds--;
                this.numberOfBeds++;
            }
        }
    }
}