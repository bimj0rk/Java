package main.hw;

public class Share{
    private double value;
    private Company company;

    public Share(double v, Company c){
        this.value = v;
        this.company = c;
    }

    public Company getCompany() {
        return company;
    }

    public double getValue() {
        return value;
    }
}
