package main.java.Ex1;

public class OfficeProduct extends SoftwareProduct{

    public OfficeProduct(String n, String p){
        super(n, p);
    }

    public boolean checkCompatibility(){
        if(this.getPlatform().equalsIgnoreCase("Bimbows")){
            System.out.println("Compatible");
            return true;
        } else {
            System.out.println("Not compatible");
            return false;
        }
    } 
}
