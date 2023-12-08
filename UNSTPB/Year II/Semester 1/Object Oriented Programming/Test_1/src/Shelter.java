import java.util.*;

public class Shelter{
    private ArrayList<Animal> animals = new ArrayList<Animal>();

    public void addAnimal(Animal vAnimal){
        animals.add(vAnimal);
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public HashMap<String, Integer> toMap(){
        HashMap<String, Integer> map = new HashMap<String,Integer>();
        ArrayList<String> breeds = new ArrayList<String>();
        for(Animal a : this.animals){
            breeds.add(a.getBreed());
        }

        for(Animal a : this.animals)
            for(String breed : breeds)
                map.put(breed, a.getAverageRating());

        return map;
    }
}
