public class Candidate{
    private String name;
    private Integer age;
    private Integer educationLevel;

    public Candidate(String n, Integer a, Integer eL){
        this.name = n;
        this.age = a;
        this.educationLevel = eL;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getEducationLevel() {
        return educationLevel;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", age: " + this.age + ", education level: " + this.educationLevel;
    }
}
