import java.util.*;

public class Main{
    public static void main(String[] args){
        Random random = new Random();
        SharedRes sharedRes = new SharedRes(10);
        Candidate candidate;

        for(Integer i = 0; i < 100; i++){
            if(random.nextInt(2) == 1) candidate = new Candidate("Candidate 1", 25, 8);
            else candidate = new Candidate("Candidate 2", 20, 1);

            String threadName = i.toString();
            Producer producer = new Producer(threadName, sharedRes, candidate);
            Consumer consumer = new Consumer(threadName, sharedRes);
            producer.start();
            consumer.start();
        }
    }
}
