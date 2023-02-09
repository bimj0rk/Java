package main.java.Ex1;

import java.util.*;

public class Customer {
    
    private String username;
    private int maxSoftwareProd = 25;
    private List<SoftwareProduct> softwareProd = new ArrayList<SoftwareProduct>();
    private Computer computer;

    public Customer(String u){
        this.username = u;
    }

    public void addProduct(SoftwareProduct sp){
        if(softwareProd.size() < maxSoftwareProd){
            softwareProd.add(sp);
            System.out.println("Software added");
        } else System.out.println("Max product limit reached, please remove a product");
    }

    public void removeProduct(String spn){
        for(SoftwareProduct sm : softwareProd){
            if(sm.getName().equalsIgnoreCase(spn)){
                this.softwareProd.remove(sm);
                System.out.println("Product removed");
            }
        }
    }

    public static void main(String[] args) throws Exception{
        Computer pc = new Computer(8, "i5");
        Customer customer = new Customer("Adrian");
        GameProduct game = new GameProduct("Game 1", "Binbows");
        OfficeProduct office = new OfficeProduct("Word 1", "Binbows");
        customer.setComputer(pc);
        customer.addProduct(office);
        customer.addProduct(game);
        customer.removeProduct("Game 1");
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }
}
