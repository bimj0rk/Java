package Threads2.Ex2;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class QueueService{
    private static QueueService instance = null;
    private static BlockingQueue < EventData > eventQueue = null; 
    private QueueService(){}

    public static QueueService getInstance(){
        if (instance == null){
            instance = new QueueService();
        }
        return instance;
    }

    private void initialize() {
        if (eventQueue == null){
            eventQueue = new LinkedBlockingQueue <EventData> (); 
            EventProcessor eventProcessor = new EventProcessor(); 
            eventProcessor.start();
        }
    }

    public void putEventInQueue(EventData eventData){ 
        try{
            initialize();
            eventQueue.put(eventData);
        }catch (InterruptedException ex){ 
            ex.printStackTrace();
        }
    }

    class EventProcessor extends Thread{ 
        @Override
        public void run(){
            for (;;){
                EventData eventData = null;
                try{
                    eventData = eventQueue.take(); System.out.println("Process Event Data : Type : " + eventData.getEventType() + " / Name : "
                                + eventData.getEventName());
                }catch (InterruptedException ex){ 
                    ex.printStackTrace();
                }
            } 
        }
    } 
}
