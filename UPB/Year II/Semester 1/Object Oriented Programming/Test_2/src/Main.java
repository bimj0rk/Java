public class Main{
    public static void main(String[] args){
        DownloadManager simpleDM = new SimpleDM();
        simpleDM.addDownload("url1.com");
        simpleDM.startNextDownload();

        DownloadManager multipleDM = new MultipleDM(3);
        multipleDM.addDownload("url2.com");
        multipleDM.addDownload("url3.com");
        multipleDM.addDownload("url4.com");
        multipleDM.addDownload("url5.com");
        for(int i = 0; i < 4; i++) multipleDM.startNextDownload();

        DownloadManager pooledDM = new PooledDM(2);
        pooledDM.addDownload("url6.com");
        pooledDM.addDownload("url7.com");
        pooledDM.addDownload("url8.com");
    }
}