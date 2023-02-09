import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test {
    public static void main (String[] args){
        University university = new University("University", "Location");

        Author author1 = new Author("Author 1", university);
        Author author2 = new Author("Author 2", university);

        Calendar calendar = GregorianCalendar.getInstance();
        calendar.set(2019, Calendar.JANUARY, 13);

        Publication publication1 = new ConferenceProceeding("Conference Proceeding 1", true,
                "Publication 1", calendar, 1);
        Publication publication2 = new ConferenceProceeding("Conference Proceeding 2", false,
                "Publication 2", calendar, 1);
        Publication publication3 = new Journal("Journal 1", "Publication 1", calendar, 1,
                4);
        Publication publication4 = new Journal("Journal 2", "Publication 2", calendar, 1,
                5);

        Publication publication5 = new ConferenceProceeding("Conference Proceeding 1", false,
                "Publication 1", calendar, 1);
        Publication publication6 = new ConferenceProceeding("Conference Proceeding 2", false,
                "Publication 2", calendar, 1);
        Publication publication7 = new Journal("Journal 1", "Publication 1", calendar, 1,
                6);
        Publication publication8 = new Journal("Journal 2", "Publication 2", calendar, 1,
                8);

        university.addAuthor(author1);
        university.addAuthor(author2);

        author1.addPublication(publication1);
        author1.addPublication(publication2);
        author1.addPublication(publication3);
        author1.addPublication(publication4);

        author2.addPublication(publication5);
        author2.addPublication(publication6);
        author2.addPublication(publication7);
        author2.addPublication(publication8);

        System.out.println(author1.calculateScore());
        System.out.println(author2.calculateScore());

        System.out.println();

        System.out.println(university.calculateScore());
    }
}
