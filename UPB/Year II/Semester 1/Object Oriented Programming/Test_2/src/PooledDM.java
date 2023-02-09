import java.util.*;

public class PooledDM implements DownloadManager{
    private final int maxThreads;
    private LinkedList<String> waitingList = new LinkedList<>();
    private int currentThreads;
    private Thread[] threads;

    public PooledDM(int aMaxThreads){
        this.maxThreads = aMaxThreads;
        threads = new Thread[this.maxThreads];
        for(int i = 0; i < this.maxThreads; i++){
            this.threads[i] = new Thread(() -> {
                while(true){
                    String URL;
                    synchronized(this.waitingList){
                        while(this.waitingList.isEmpty()){
                            try{
                                this.waitingList.wait();
                            } catch(InterruptedException e){
                                e.printStackTrace();
                            }
                        }
                        URL = this.waitingList.pop();
                    }

                    System.out.println("Starting download from: " + URL);
                    synchronized(this.waitingList){
                        this.currentThreads--;
                        this.waitingList.notify();
                    }
                }
            });
            this.threads[i].start();
        }
    }

    @Override
    public void addDownload(String URL) {
        synchronized(this.waitingList){
            this.waitingList.add(URL);
            this.waitingList.notify();
        }        
    }

    @Override
    public boolean startNextDownload() {
            synchronized(this.waitingList){
                if(this.currentThreads < this.maxThreads && !this.waitingList.isEmpty()){
                    this.currentThreads++;
                    return true;
                }
            }
        return false;
    }
}