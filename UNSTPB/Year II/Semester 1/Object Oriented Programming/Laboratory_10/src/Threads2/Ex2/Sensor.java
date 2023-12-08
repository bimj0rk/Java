package Threads2.Ex2;

public class Sensor{
    private int ID;
    private String name;
    private String type;
    private String time;

    public Sensor(int aID, String aName, String aType, String aTime){
        this.ID = aID;
        this.name = aName;
        this.type = aType;
        this.time = aTime;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }
    
    public String getType() {
        return type;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
    public void setType(String type) {
        this.type = type;
    }
}
