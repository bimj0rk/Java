import java.util.*;

public class SharedRes{
    private Queue<Candidate> queue = new LinkedList<>();
    private Integer limit;

    public SharedRes(Integer l){
        this.limit = l;
    }

    public void produce(Candidate c){
        while(queue.size() == this.limit){
            try{
                wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }

        notify();
        queue.add(c);
    }

    public Candidate remove(){
        while(queue.isEmpty()){
            try{
                wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }

        notify();
        return queue.remove();
    }
}
