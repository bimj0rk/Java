package Threads2.Ex2;

class EventData{
    private String eventID;
    private String eventName;
    private String eventDate;
    private String eventType;
    private String eventLocation;

    public String getEventID(){
        return eventID;
    }


    public void setEventID(String eventID){ 
        this.eventID = eventID;
    }

    public String getEventName(){
        return eventName;
    }

    public void setEventName(String eventName){ 
        this.eventName = eventName;
    }

    public String getEventDate(){
        return eventDate;
    }

    public void setEventDate(String eventDate){ 
        this.eventDate = eventDate;
    }

    public String getEventType(){
        return eventType;
    }

    public void setEventType(String eventType){ 
        this.eventType = eventType;
    }

    public String getEventLocation(){
        return eventLocation;
    }

    public void setEventLocation(String eventLocation){ 
        this.eventLocation = eventLocation;
    }
}
