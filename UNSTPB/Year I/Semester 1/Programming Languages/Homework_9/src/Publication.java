import java.util.Calendar;

abstract class Publication{
    private String name;
    private Calendar apparition;
    private int numberOfAuthors;

    public Publication(String name, Calendar apparition, int noOfAuthors){
        this.name = name;
        this.apparition = apparition;
        this.numberOfAuthors = noOfAuthors;
    }

    public int getNumberOfAuthors() {
        return numberOfAuthors;
    }

    abstract double calculateScore();
}

class Journal extends Publication{
    private String journalName;
    private double impactFactor;

    public Journal(String journalName, String name, Calendar apparition, int noOfAuthors, double impactFactor){
        super(name, apparition, noOfAuthors);
        this.journalName = journalName;
        this.impactFactor = impactFactor;
    }

    @Override
    public double calculateScore() {
        return (this.impactFactor * 0.5)/super.getNumberOfAuthors();
    }
}

class ConferenceProceeding extends Publication{
    private String volumeName;
    private boolean indexed;

    public ConferenceProceeding(String volumeName, boolean indexed, String name, Calendar apparition, int noOfAuthors){
        super(name, apparition, noOfAuthors);
        this.volumeName = volumeName;
        this.indexed = indexed;
    }

    @Override
    public double calculateScore() {
        if(this.indexed){
            return 0.25/this.getNumberOfAuthors();
        } else {
            return 0.2/this.getNumberOfAuthors();
        }
    }
}

class Author {
    private String name;
    private University university;
    private Publication publications[] = new Publication[100];
    private int noPublications;

    public Author(String n, University u) {
        this.university = u;
        this.name = n;
        this.noPublications = 0;
    }

    public void addPublication(Publication p) {
        this.noPublications++;
        this.publications[noPublications] = p;
    }

    public double calculateScore() {
        double sum = 0;
        for (int i = 1; i <= noPublications; i++) {
            sum += this.publications[i].calculateScore();
        }
        return sum;
    }
}

class University{
    private String name;
    private String location;
    private Author authors[] = new Author[100];
    private int noAuthors;

    public University(String name, String location){
        this.name = name;
        this.location = location;
        this.noAuthors = 0;
    }

    public void addAuthor(Author a){
        this.noAuthors++;
        this.authors[noAuthors] = a;
    }

    public double calculateScore(){
        double sum = 0;
        for(int i = 1; i <= noAuthors; i++){
            sum += this.authors[i].calculateScore();
        }
        return sum;
    }
}
