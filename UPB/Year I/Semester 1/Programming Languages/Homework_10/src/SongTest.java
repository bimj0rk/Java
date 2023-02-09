public class SongTest {
    public static void main(String[] args){
        Song song1 = new Song("Heartless", "Kanye West", 4, "Rap");
        Song song2 = new Song("All too well", "Taylor Swift", 10, "Pop");
        Song song3 = new Song("All of me", "John Legend", 4, "Pop");
        Song song4 = new Song("Runaway", "Kanye West", 7, "Rap");
        Song song5 = new Song("Pursuit of Happiness (Nightmare)", "Kid Cudi", 5, "Rap");
        Song song6 = new Song("papercuts", "Machine Gun Kelly", 3, "Punk");

        Playlist playlist = new Playlist();

        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.addSong(song3);
        playlist.addSong(song4);
        playlist.addSong(song5);
        playlist.addSong(song6);

        playlist.displayPlaylist();
        System.out.println();

        playlist.removeSongFromName("papercuts");
        if (playlist.isSongFromNameRemoved("papercuts")) System.out.println("The song has been removed.");
        else System.out.println("The song could not be found.");

        playlist.displayPlaylist();
        System.out.println();

        if(playlist.removeSongsFromArtist("Kanye West")) System.out.println("All songs by Kanye West have been removed.");
        else System.out.println("The artist could not be found.");

        playlist.displayPlaylist();
        System.out.println();

        System.out.println("This playlist has a runtime of " + playlist.playlistDuration() + " minutes.");
        System.out.println();

        playlist.shufflePlaylist();
        playlist.displayPlaylist();
    }
}
