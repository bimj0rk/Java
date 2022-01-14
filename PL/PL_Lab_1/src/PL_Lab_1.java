public class PL_Lab_1 {

    public static void main(String[] args) {

        //1
        int days = 365, hours = 24, minutes = 60, seconds = 60, secondsInYear = 0;

        secondsInYear = days * hours * minutes * seconds;

        System.out.println("1. There are " + secondsInYear + " seconds in a year");

        //2
        int number = 2;

        int square = number * number;
        int cube = square * number;

        System.out.println("2a. The square is " + square);
        System.out.println("2b. The cube is " + cube);

        //3
        int age = 19;

        int ageInDays = age * 365;

        System.out.println("3. Your age in days is: " + ageInDays);
    }

}

