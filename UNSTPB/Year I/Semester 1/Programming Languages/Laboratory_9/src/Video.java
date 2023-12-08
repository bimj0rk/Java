//1

class Video{

    private String title;
    private int length;
    private boolean available;

    public Video(String t){
        this.title = t;
        this.length = 90;
        this.available = true;
    }

    public Video(String t, int l){
        this.length = l;
        this.title = t;
        this.available = true;
    }

    public void show(){
        System.out.println("Title: " + this.title + ", length: " + this.length + ". Is it available? " + this.available);
    }
}
