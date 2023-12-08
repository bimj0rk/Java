package Threads;

public class Producer extends Thread{
    private Shared shared;

    public Producer(String name, Shared aShared){ //constructor
        super(name); //sets the name of the thread
        this.shared = aShared;
    }

    @Override
    public void run(){ //runs the thread
        while(true){
            //code to be run
            try{
                sleep(1000);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
