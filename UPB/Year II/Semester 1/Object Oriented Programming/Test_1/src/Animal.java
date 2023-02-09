import java.util.*;

public class Animal implements Comparable<Animal>{
    private String name;
    private Integer age;
    private String breed;
    protected enum Disease{
        CANCER, DIABETES, RABIES, POX, NONE
    }
    private Disease disease;
    private ArrayList<Integer> traits = new ArrayList<Integer>();

    public Animal(String vName, Integer vAge, String vBreed, Disease vDisease){
        this.name = vName;
        this.age = vAge;
        this.breed = vBreed;
        this.disease = vDisease;
    }

    public void addTraitRating(Integer ALR, Integer FAR, Integer SR, Integer KFR, Integer DFR, Integer GR, Integer TR, Integer ELR){
        this.traits.add(ALR);
        this.traits.add(FAR);
        this.traits.add(SR);
        this.traits.add(KFR);
        this.traits.add(DFR);
        this.traits.add(GR);
        this.traits.add(TR);
        this.traits.add(ELR);
    }

    public Integer getAverageRating(){
        Integer avgRating = 0;
        for(Integer i : traits){
            avgRating += i;
        }

        avgRating /= traits.size();
        
        return avgRating;
    }


    public ArrayList<Integer> getTraits() {
        return traits;
    }


    @Override
    public int compareTo(Animal aCompared){
        if(this.age < aCompared.getAge()) return -1;
        else if(this.age > aCompared.getAge()) return 1;
        else return 0;
    }

    public int compareBreeds(Animal aCompared){
        if(Integer.parseInt(this.breed) < Integer.parseInt(aCompared.getName())) return -1;
        else if(Integer.parseInt(this.breed) > Integer.parseInt(aCompared.getName())) return 1;
        else return 0;
    }

    public Integer getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public Disease getDisease() {
        return disease;
    }

    public String getName() {
        return name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }

    @Override
    public String toString() {
        return "Animal: " + this.name + ", age: " + this.age + ", breed: " + this.breed + ", disease: " + this.disease;
    }
}