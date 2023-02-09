package Threads2.Ex1;

public class EventService{
    public static void main(String arg[]) {
        try {
            EventData event = null;
            for (int i= 0; i< 100; i++) {
                event = new EventData();
                event.setEventType("EventType" + i);
                event.setEventName("EventName:AirQuality" + i);
                QueueService.getInstance().putEventInQueue(event);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}