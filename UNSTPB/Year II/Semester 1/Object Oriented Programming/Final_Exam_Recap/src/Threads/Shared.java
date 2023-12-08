package Threads;

import java.util.*;

public class Shared{
    private Queue<Integer> queue = new LinkedList<Integer>(); //queue for processes
    private Integer limit;

    public Shared(Integer aLimit){ //constructor
        this.limit = aLimit;
    }

    public synchronized void produce(Integer aInteger){ //produces processes. "synchronized" keyword is a must so that processes don't happen at the same time
        while(this.queue.size() == limit) //while the list is full don't do anything
            try{
                wait();
            } catch(InterruptedException e){
                e.printStackTrace();
            }

        notify(); //notify that the thread is availabe
        queue.add(aInteger); //adds process to the queue
    }

    public synchronized Integer remove(){ //removes process from queue
        while(this.queue.isEmpty()) //if there are no processes, wait
            try{
                wait();
            } catch(InterruptedException e){
                e.printStackTrace();
            }

        notify(); //same as above
        return queue.remove(); //returns the process
    }
}
