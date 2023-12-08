package Ex1;

import java.util.*;

public class Student {
    private String id;
    private String firstName;
    private String lastName;
    private String groupNo;
    private String NPC;
    private GregorianCalendar birthdayDate;
    private int maxVendingMachinesPerStudent = 3;
    private List<VendingMachine> vendingMachines = new ArrayList<>();
    private Faculty faculty;

    public boolean addVendingMachine(VendingMachine vm){
        if(this.vendingMachines.size() < this.maxVendingMachinesPerStudent){
            this.vendingMachines.add(vm);
            return true;
        } else return false;
    }

    public VendingMachine removeVendingMachine(int id){
        VendingMachine vm = null;
        for(VendingMachine vmm : vendingMachines){
            if(vmm.getId() == id){
                vm = vmm;
                this.vendingMachines.remove(vmm);
                System.out.println("Vending machine removed succesfully");
            }
        }
        return vm;
    }


    public static void main(String[] args){
        Student s = new Student("12542", "A", "B", "1222B", "5381778512", new GregorianCalendar(2002,6,11));
        Faculty fac = new Faculty(12, "FILS");
        CoffeeVM cvm = new CoffeeVM(1, "coffeinc", 15);
        FoodVM fvm = new FoodVM(2, "foodvm", 25);
        s.setFaculty(fac);
        s.addVendingMachine(fvm);
        s.addVendingMachine(cvm);
        fvm.buyItem(3);
        s.removeVendingMachine(2);
    }

    public Student(String id, String fn, String ln, String grno, String npc, GregorianCalendar bd, Faculty fac){
        this.id = id;
        this.firstName = fn;
        this.lastName = ln;
        this.groupNo = grno;
        this.NPC = npc;
        this.birthdayDate = bd;
        this.faculty = fac;
    }

    public Student(String id, String fn, String ln, String grno, String npc, GregorianCalendar bd){
        this.id = id;
        this.firstName = fn;
        this.lastName = ln;
        this.groupNo = grno;
        this.NPC = npc;
        this.birthdayDate = bd; 
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public Faculty getFaculty() {
        return faculty;
    }
}
