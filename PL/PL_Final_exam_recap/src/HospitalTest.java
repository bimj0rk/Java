public class HospitalTest {
    public static void main(String[] args){
        Patient patient1 = new Patient("Marcel", "light", true);
        Patient patient2 = new Patient("Dark", "light", false);
        Patient patient3 = new Patient("Viorel", "severe", true);
        
        Hospital hospital = new Hospital(10);

        hospital.addPatient(patient1);
        hospital.addPatient(patient2);
        hospital.addPatient(patient3);

        Patient[] ctgPatients = hospital.getContagiousPatients();

        System.out.println(hospital.getAvailableBeds());

        hospital.removePatient();

        System.out.println(hospital.getAvailableBeds());
    } 
}
