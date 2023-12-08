package main.hw;
import java.util.*;

public abstract class Publication{
    private String name;
    private GregorianCalendar apparition;
    private int noOfAuthors;

    public Publication(String n, GregorianCalendar a, int nOA){
        this.name = n;
        this.apparition = a;
        this.noOfAuthors = nOA;
    }

    public abstract double computeScore();

    public GregorianCalendar getApparition() {
        return apparition;
    }
    
    public String getName() {
        return name;
    }

    public int getNoOfAuthors() {
        return noOfAuthors;
    }

    public void setApparition(GregorianCalendar apparition) {
        this.apparition = apparition;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNoOfAuthors(int noOfAuthors) {
        this.noOfAuthors = noOfAuthors;
    }
}
