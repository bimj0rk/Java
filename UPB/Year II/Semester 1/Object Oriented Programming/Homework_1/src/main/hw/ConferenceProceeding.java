package main.hw;
import java.util.*;

public class ConferenceProceeding extends Publication{
    private String volumeName;
    private boolean indexed;

    public ConferenceProceeding(String vn, GregorianCalendar a, int nOA, boolean i){
        super(vn, a, nOA);
        this.volumeName = vn;
        this.indexed = i;
    }

    @Override
    public double computeScore() {
        if(indexed) return 0.25/super.getNoOfAuthors();
        else return 0.2/super.getNoOfAuthors();
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

    public String getVolumeName() {
        return volumeName;
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

    public void setIndexed(boolean indexed) {
        this.indexed = indexed;
    }

    public void setVolumeName(String volumeName) {
        this.volumeName = volumeName;
    }
}
