//5

public class NameAndBirthday {
    public static void main(String[] args) {
        String name = "Adrian Campean";
        String birthday = "11/06/2002";
        String birthyear = birthday.substring(birthday.indexOf("2002"));
        System.out.println("Hello " + name + "! You were born in " +  birthyear + ".");
    }
}
