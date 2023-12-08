//1

public class Student {

    private String name;
    private double examMark;
    private double total;
    private double meanMark;
    private int numberOfExams;


    public Student(String n, double e, double t, double m){
        name = n;
        examMark = e;
        total = t;
        meanMark = m;
    }

    public String getName(){
        return name;
    }

    public void addExam(int mark){
        examMark = mark;
        numberOfExams++;
        total += examMark;
    }

    public double getTotal(){
        return total;
    }

    public double getMeanMark(){
        meanMark = total / numberOfExams;
        return meanMark;
    }
}
