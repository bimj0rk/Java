//1

import java.util.Scanner;

public class StudentMain {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String name;
        double e = 0, t = 0, m = 0;
        int numberOfExams, examMark;


        System.out.println("Enter the name of the student: ");
        name = scan.nextLine();

        Student student = new Student(name, e, t, m);

        System.out.println("How many exam marks do you want to add?");
        numberOfExams = scan.nextInt();

        System.out.println("Enter the marks the student obtained:");
        for(int i = 1; i <= numberOfExams; i++) {
            examMark = scan.nextInt();
            student.addExam(examMark);
        }

        System.out.println(student.getName());
        System.out.println(student.getTotal());
        System.out.println(student.getMeanMark());

        scan.close();
    }
}
