package main.Ex2;
import java.util.*;
import java.io.*;
import main.Storable;

public class Contract implements Storable{

    ArrayList<Course> courses = new ArrayList<Course>();

    public void addCourse(Course c){
        courses.add(c);
    }

    public void removeCourse(String name){
        Course cTemp = null;
        for(Course c : courses){
            if(c.getName().equalsIgnoreCase(name)) cTemp = c;
            if(cTemp != null) courses.remove(cTemp);
        }
    }

    public void display(){
        for(Course c : courses) System.out.println(c);
    }

    public void sort(){
        Collections.sort(courses, new Comparator<Course>(){
            public int compare(Course c1, Course c2){
                return c1.getStream().compareTo(c2.getStream());
            }
        });

        Collections.sort(courses, new Comparator<Course>(){
            public int compare(Course c1, Course c2){
                return c1.getType().compareTo(c2.getType());
            }
        });

        Collections.sort(courses, new Comparator<Course>(){
            public int compare(Course c1, Course c2){
                if(c1.getStream() == c2.getStream() && c1.getType() == c2.getType() && c1.getName() == c2.getName()) throw new RuntimeException("The courses are identical!");
                return c1.getName().compareTo(c2.getName());
            }
        });
    }

    public void store(String file) throws FileNotFoundException{
        FileOutputStream outputFile = new FileOutputStream("myContract.txt");
        OutputStreamWriter outputStream = new OutputStreamWriter(outputFile);
        PrintWriter pw = new PrintWriter(outputStream);
        pw.println("Your contract: ");
        for(Course c : courses){
            pw.println(c);
        }
        pw.close();
    }
}
