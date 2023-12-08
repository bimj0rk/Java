package Ex1;
import java.util.*;

public class Main{
    public static void main(String[] args){
        ArrayList<Person> personList = new ArrayList<Person>();

        personList.add(new Person(53253426, "Person A", "Address A"));
        personList.add(new Person(53253426, "Person A", "Address A"));
        personList.add(new Person(64723894, "Person B", "Address B"));
        personList.add(new Person(87123511, "Person C", "Address C"));
        personList.add(new Person(71249164, "Person D", "Address D"));

        Iterator<Person> itr = personList.iterator();
        while(itr.hasNext()) System.out.println(itr.next());

        ListIterator<Person> listItr = personList.listIterator();
        while(listItr.hasNext()) listItr.next();
        while(listItr.hasPrevious()) System.out.println(listItr.previous());

        listItr.next();
        listItr.next();
        listItr.add(new Person(21468711, "Person E", "Address E"));
        listItr.previous();
        listItr.previous();

        while(listItr.hasNext()) System.out.println(listItr.next());
    }
}
