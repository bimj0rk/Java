public class PersonTest {
    public static void main(String[] args){
        Person person1 = new Person("Adrian", "Campean", 19);
        Person person2 = new Person("Irina", "Cerghilan", 18);
        Person person3 = new Person("Popescu", "Ion", 35);
        Person person4 = new Person("Ioana", "Florescu", 40);
        Person person5 = new Person("Doru", "Dumitrescu", 54);

        PersonArray array = new PersonArray(5);

        array.insert(person1);
        array.insert(person2);
        array.insert(person3);
        array.insert(person4);
        array.insert(person5);

        array.displayArray();

        System.out.println();

        Person search = array.search("Ion");
        if(search != null){
            search.displayPerson();
            System.out.println("Person was found!");
        } else System.out.println("Person was not found!");


        System.out.println();

        if(array.delete("Ion")){
            System.out.println("The person was deleted!");
            array.displayArray();
        }
        else System.out.println("The person cannot be found");
    }
}
