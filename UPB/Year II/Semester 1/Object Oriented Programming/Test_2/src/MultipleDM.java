import java.util.*;

public class MultipleDM implements DownloadManager{
    private final int maxConcurrentDownloads;
    private LinkedList<String> waitingList = new LinkedList<>();
    private int currentDownloads;

    public MultipleDM(int aMaxConcurrentDownloads){
        this.maxConcurrentDownloads = aMaxConcurrentDownloads;
    }

    @Override
    public void addDownload(String URL){
        this.waitingList.add(URL);        
    }

    @Override
    public boolean startNextDownload() {
        if(this.currentDownloads < this.maxConcurrentDownloads && !this.waitingList.isEmpty()){
            String URL = this.waitingList.pop();
            System.out.println("Started downloading from: " + URL);
            this.currentDownloads++;
            return true;
        }
        return false;
    }
}
