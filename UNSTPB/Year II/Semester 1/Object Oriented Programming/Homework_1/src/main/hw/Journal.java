package main.hw;
import java.util.*;

public class Journal extends Publication{
    private String journalName;
    private double impactFactor;

    public Journal(String jn, GregorianCalendar a, int nOA, double imf){
        super(jn, a, nOA);
        this.journalName = jn;
        this.impactFactor = imf;
    }

    @Override
    public double computeScore() {
        return (double)(this.impactFactor * 0.5)/super.getNoOfAuthors();
    }

    @Override
    public GregorianCalendar getApparition() {
        return super.getApparition();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getNoOfAuthors() {
        return super.getNoOfAuthors();
    }

    public double getImpactFactor() {
        return impactFactor;
    }

    public String getJournalName() {
        return journalName;
    }

    @Override
    public void setApparition(GregorianCalendar apparition) {
        super.setApparition(apparition);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setNoOfAuthors(int noOfAuthors) {
        super.setNoOfAuthors(noOfAuthors);
    }

    public void setImpactFactor(double impactFactor) {
        this.impactFactor = impactFactor;
    }

    public void setJournalName(String journalName) {
        this.journalName = journalName;
    }
}

