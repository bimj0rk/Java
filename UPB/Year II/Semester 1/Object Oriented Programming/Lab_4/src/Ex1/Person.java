package Ex1;

public class Person{
    private int CNP;
    private String name;
    private String address;

    public Person(int n, String name, String a){
        this.CNP = n;
        this.address = a;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person " + this.name + ", CNP: " + this.CNP + ", Address: " + this.address;
    }
}