import java.util.*;

public class Main{
    public static void main(String[] args){
        Shelter animalShelter = new Shelter();
        Animal a1 = new Animal("TBone", 2, "Golden Retriver", Animal.Disease.POX);
        Animal a2 = new Animal("Tobias", 1, "European", Animal.Disease.NONE);
        Animal a3 = new Animal("Rex", 5, "British Shorthair", Animal.Disease.DIABETES);

        animalShelter.addAnimal(a1);
        animalShelter.addAnimal(a2);
        animalShelter.addAnimal(a3);

        a1.addTraitRating(5, 3, 4, 3, 2, 3, 4, 5);
        a2.addTraitRating(4, 3, 2, 1, 2, 3, 3, 3);
        a3.addTraitRating(2, 4, 5, 4, 3, 5, 2, 1);

        Integer p1avgRating = a1.getAverageRating();
        Integer p2avgRating = a2.getAverageRating();
        Integer p3avgRating = a3.getAverageRating();

        HashMap<String, Integer> map = animalShelter.toMap();
        System.out.println(map);
    }
}
