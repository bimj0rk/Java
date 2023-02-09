package main.hw;
import java.util.*;

public class University{
    private String name;
    private String location;
    private List<Author> authors = new ArrayList<Author>();

    public University(String n, String l){
        this.name = n;
        this.location = l;
    }

    public void addAuthor(Author a){
        authors.add(a);
    }

    public double computeScore(){
        double score = 0;
        for(Author a : authors){
            score += a.computeScore();
        }
        return score;
    }
    
    public List<Author> getAuthors() {
        return authors;
    }

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args){
        University u = new University("U1", "City");
        Author a1 = new Author("A1", u);
        Author a2 = new Author("A2", u);
        Journal j11 = new Journal("J11", new GregorianCalendar(2012, 9, 11), 1,35.8);
        Journal j12 = new Journal("J12", new GregorianCalendar(2012, 10, 6), 1, 39.8);
        Journal j21 = new Journal("J21", new GregorianCalendar(2012, 7, 13), 1,8.3);
        Journal j22 = new Journal("J22", new GregorianCalendar(2012, 6, 29), 1, 19.8);
        ConferenceProceeding cp11 = new ConferenceProceeding("CP11", new GregorianCalendar(2014, 5, 16), 1, true);
        ConferenceProceeding cp12 = new ConferenceProceeding("CP12", new GregorianCalendar(2014, 6, 21), 1, false);
        ConferenceProceeding cp21 = new ConferenceProceeding("CP21", new GregorianCalendar(2014, 7, 13), 1, false);
        ConferenceProceeding cp22 = new ConferenceProceeding("CP22", new GregorianCalendar(2014, 8, 8), 1, false);

        u.addAuthor(a1);
        u.addAuthor(a2);
        
        a1.addPublication(cp11);
        a1.addPublication(cp12);
        a1.addPublication(j11);
        a1.addPublication(j12);
        a2.addPublication(cp21);
        a2.addPublication(cp22);
        a2.addPublication(j21);
        a2.addPublication(j22);

        a1.computeScore();
        a2.computeScore();

        System.out.println(u.computeScore());
    }
}
