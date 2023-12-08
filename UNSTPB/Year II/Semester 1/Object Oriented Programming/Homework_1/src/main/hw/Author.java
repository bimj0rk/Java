package main.hw;
import java.util.*;

public class Author{
    private String name;
    private University university;
    private List<Publication> publications = new ArrayList<Publication>();

    public Author(String n, University u){
        this.name = n;
        this.university = u;
    }

    public void addPublication(Publication p){
        publications.add(p);
    }

    public double computeScore(){
        double score = 0;
        for(Publication pb : publications){
            score += pb.computeScore();
        }
        return score;
    }

    public String getName() {
        return name;
    }

    public List<Publication> getPublications() {
        return publications;
    }

    public University getUniversity() {
        return university;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPublications(List<Publication> publications) {
        this.publications = publications;
    }

    public void setUniversity(University university) {
        this.university = university;
    }
}
