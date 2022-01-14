//2
import java.util.Random;

class Song {
    private String name;
    private String artist;
    private double duration;
    private String genre;

    public Song(String n, String a, int d, String g){
        this.name = n;
        this.artist = a;
        this.duration = d;
        this.genre = g;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public double getDuration() {
        return duration;
    }

    public void displaySong() {
        System.out.println(name + " by " + this.artist + ", " + this.duration + " minutes, " + this.genre);
    }
}

class Playlist {
    private Song[] song = new Song[100];
    private int noOfSongs;

    public Playlist() {
        this.noOfSongs = 0;
    }

    public void addSong(Song s) {
        this.song[noOfSongs] = s;
        this.noOfSongs++;
    }

    public void removeSongFromName(String songName) {
        for (int i = 0; i < noOfSongs; i++) {
            if (song[i].getName().equals(songName)) {
                song[i] = song[noOfSongs - 1];
                noOfSongs--;
            }
        }
    }

    public boolean isSongFromNameRemoved(String songName) {
        boolean deletion = false;
        for(int i = 0; i < noOfSongs; i++) {
            if(!song[i].getArtist().equals(songName)){
                deletion = true;
            }
        }
        return deletion;
    }

    public boolean removeSongsFromArtist(String artistName){
        boolean deletion = false;
        for(int i = 0; i < noOfSongs; i++){
            if(song[i].getArtist().equals(artistName)) {
                for (int j = i; j < noOfSongs - 1; j++) {
                    song[j] = song[j + 1];
                    deletion = true;
                }
                noOfSongs--;
                i--;
            }
        }
        return deletion;
    }

    public double playlistDuration(){
        double duration = 0;
        for(int i = 0; i < noOfSongs; i++){
            duration += song[i].getDuration();
        }
        return duration;
    }

    public void displayPlaylist(){
        for(int i = 0; i < noOfSongs; i++){
            song[i].displaySong();
        }
        System.out.println(this.noOfSongs + " songs.");
        System.out.println();
    }

    public void shufflePlaylist(){
        Random r = new Random();
        for(int i = noOfSongs - 1; i > 0; i--){
            int index = r.nextInt(i + 1);
            Song a = song[index];
            song[index] = song[i];
            song[i] = a;
        }
    }
}
