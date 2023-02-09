public class SimpleDM implements DownloadManager{
    private String currentDownload;

    @Override
    public void addDownload(String URL){
        this.currentDownload = URL;
    }

    @Override
    public boolean startNextDownload() {
        if(this.currentDownload != null){
            System.out.println("Started download from " + this.currentDownload);
            this.currentDownload = null;
            return true;
        }
        return false;
    }
}