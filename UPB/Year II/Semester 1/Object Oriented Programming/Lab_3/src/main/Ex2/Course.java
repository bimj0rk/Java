package main.Ex2;

public class Course{
    public enum Type{
        SPECIALISATION, FOUNDAMENTAL, DISCIPLINE;
    }

    public enum Stream{
        ENGLISH, GERMAN, FRENCH;
    }

    private String name;
    private Type type;
    private Stream stream;
    private int creditPoints;

    public Course(String n, Type t, Stream s, int cP){
        this.name = n;
        this.creditPoints = cP;
        setType(t);
        setStream(s);
    }

    public void setCreditPoints(int creditPoints) {
        this.creditPoints = creditPoints;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStream(Stream stream) {
        this.stream = stream;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getCreditPoints() {
        return creditPoints;
    }

    public String getName() {
        return name;
    }

    public Stream getStream() {
        return stream;
    }
    
    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Course name: " + this.name + ", " + this.stream  + " stream, type " + this.type + this.creditPoints + " credit points.";
    }
}
