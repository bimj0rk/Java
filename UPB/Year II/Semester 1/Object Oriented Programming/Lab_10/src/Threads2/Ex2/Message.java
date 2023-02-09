package Threads2.Ex2;

public class Message{
    private int ID;
    private String time;
    private String type;

    public Message(int aID, String aTime, String aType){
        this.ID = aID;
        this.time = aTime;
        this.type = aType;
    }

    public int getID() {
        return ID;
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

    public void setTime(String time) {
        this.time = time;
    }

    public void setType(String type) {
        this.type = type;
    }
}
