package Threads;

public class Consumer extends Thread{
    public Shared shared;

    public Consumer(String name, Shared aShared){ //constructor
        super(name); //names the thread
        this.shared = aShared;
    }

    @Override
    public void run(){ //runs the thread
        while(true){ //never ending loop
            //code to be run
            try{ //put the thread to sleep
                sleep(1000);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
