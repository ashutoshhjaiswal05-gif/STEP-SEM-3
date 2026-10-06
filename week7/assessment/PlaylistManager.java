import java.util.Arrays;

class Playlist {
    private String[] songs;
    private int count;

    public Playlist(int capacity) {
        songs = new String[capacity];
        count = 0;
    }

    public void addSong(String song) {
        if (count < songs.length) {
            songs[count++] = song;
        }
    }

    public String[] getSongs() {
        return Arrays.copyOf(songs, count);
    }
}

public class PlaylistManager {
    public static void main(String[] args) {
        Playlist p = new Playlist(10);
        p.addSong("Song A");
        p.addSong("Song B");
        String[] copy = p.getSongs();
        copy[0] = "Hacked Song";
        System.out.println("Original playlist intact: " + Arrays.toString(p.getSongs()));
    }
}
