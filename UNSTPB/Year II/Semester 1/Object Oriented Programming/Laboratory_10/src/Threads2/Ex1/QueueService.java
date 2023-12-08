package Threads2.Ex1;

import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import javax.crypto.Mac;
public class QueueService{
    private static QueueService instance = null;
    private static BlockingQueue<Message> eventQueue = null;

    private Map<Message, Computer> map = new Map<Message, Computer>();
    private Map<Message, Computer> map2 = new Map<Message, Computer>();

    private QueueService(){}
    public static QueueService getInstance() {
        if (instance == null) {
            instance = new QueueService();
        }
        return instance;
    }
    private void initialize() {
        if (eventQueue == null) {
            eventQueue = new LinkedBlockingQueue<Message> ();
            EventProcessor eventProcessor= new EventProcessor();
            eventProcessor.start();
        }
    }
    public void putEventInQueue(Message eventData) {
        try {
            initialize();
            eventQueue.put(eventData);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
    class EventProcessor extends Thread {
        @Override
        public void run() {
            for (;;) {
                Message eventData = null;
                try {
                    eventData = eventQueue.take();

                    if(map.containsKey(eventData)){
                        System.out.println("Message Data : Content : " +
                                eventData.getContent() + " / Source : "
                                + eventData.getSourceC().getIP() +
                                " / Destination : "
                                + eventData.getDestinationC().getIP());
                    }
                    else{
                        // store the MACs inside a map collection
                        //send the message from source to all the computers which exist inside the map collection
                    }
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}