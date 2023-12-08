package main.Ex2;
import java.io.FileNotFoundException;

public class Main{

    public static void main(String[] args) throws FileNotFoundException{
        Contract c = new Contract();

        //adding courses
        c.addCourse(new Course("Calculus II", Course.Type.FOUNDAMENTAL, Course.Stream.ENGLISH, 5));
        c.addCourse(new Course("Programming Languages", Course.Type.FOUNDAMENTAL, Course.Stream.ENGLISH, 5));
        c.addCourse(new Course("Object Oriented Programming", Course.Type.FOUNDAMENTAL, Course.Stream.ENGLISH, 4));
        c.addCourse(new Course("Special Mathematics", Course.Type.FOUNDAMENTAL, Course.Stream.ENGLISH, 5));
        c.addCourse(new Course("Databases", Course.Type.FOUNDAMENTAL, Course.Stream.ENGLISH, 4));

        //displaying current courses
        c.display();

        //removing course
        c.removeCourse("Calculus II");

        //sort
        c.sort();

        //display current courses after sort and remove
        c.display();

        //storing contract in a file
        c.store("myContract.txt");
    }
}
