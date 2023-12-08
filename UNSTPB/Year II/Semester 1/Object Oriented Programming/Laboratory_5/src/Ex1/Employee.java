package Ex1;

import java.util.HashMap;
import java.util.*;

public class Employee{
    private String name;
    private int id;
    private String emailAddress;
    private String phoneNo;
    
    public Employee(String n, int id, String e, String p){
        this.name = n;
        this.id = id;
        this.emailAddress = e;
        this.phoneNo = p;
    }

    @Override
    public String toString() {
        return "Employee " + this.name + ": ID " + this.id + ", email address " + this.emailAddress + ", phone no. " + this.phoneNo + ".";
    }

    public String getName() {
        return name;
    }
}

class Main{
    public static void main(String[] args){
        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        Map<String, Employee> employees = new HashMap<String, Employee>();

        employeeList.add(new Employee("Marcus", 101, "marcus@email.com", "+1100000001"));
        employeeList.add(new Employee("Dan", 101, "dan@email.com", "+1100000002"));
        employeeList.add(new Employee("Sorin", 101, "sorin@email.com", "+1100000003"));
        employeeList.add(new Employee("Pablo", 101, "pablo@email.com", "+1100000004"));
        employeeList.add(new Employee("Escobar", 101, "escobar@email.com", "+1100000005"));
        employeeList.add(new Employee("Tiberiu", 101, "tiberiu@email.com", "+1100000006"));
        employeeList.add(new Employee("Xenobia", 101, "xenobia@email.com", "+1100000007"));
        employeeList.add(new Employee("Lavinia", 101, "lavinia@email.com", "+1100000008"));
        employeeList.add(new Employee("Sanziana", 101, "sanziana@email.com", "+1100000009"));
        employeeList.add(new Employee("Mihail", 101, "mihail@email.com", "+1100000010"));

        for(Employee e : employeeList){
            employees.put(e.getName(), e);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String searchedName = sc.nextLine();

        for(Map.Entry<String, Employee> e : employees.entrySet()){
            if(employees.get(e).equals(searchedName)) System.out.println(e);
        }
    }
}