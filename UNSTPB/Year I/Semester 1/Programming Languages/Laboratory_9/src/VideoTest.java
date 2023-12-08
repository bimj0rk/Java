class VideoTest{
    public static void main (String[] args){
        Video video1 = new Video("James Bond");
        Video video2 = new Video("Avengers: Endgame", 190);

        video1.show();
        System.out.println();
        video2.show();
    }
}
