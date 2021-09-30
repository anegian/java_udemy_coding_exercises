package playlistSongs_CodingExercise;

import java.util.*;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> playlist;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.playlist = new ArrayList<>();
    }

    public boolean addSong(String title, double duration) {

        if (findSong(title) == null) {
            Song song = new Song(title, duration);
            this.playlist.add(song);
            System.out.println("title: <<" + title + ">> duration " + duration + " added in album *" + this.name +"*");
            return true;
        } else {
            System.out.println("Is already in the album");
            return false;
        }
    }

    private Song findSong(String title) {

        for (int i = 0; i < this.playlist.size(); i++) {
            Song song = this.playlist.get(i);
            if (song.getTitle().equals(title)) {
                System.out.println("No.[" + (i + 1) + "] " + song  );
                return song;
            }
        }
        return null;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {

        Song song = findSong(title);

        if (song != null) {
            playlist.add(song);
            System.out.println("<<" + title + ">> in playlist");
            return true;
        }
            return false;
    }

    public boolean addToPlayList(int numberOfSong, LinkedList<Song> playlist) {

        int index = numberOfSong-1;

        if (index >=0 & index <= this.playlist.size() ) {
            String title=this.playlist.get(index).getTitle();
                playlist.add(this.playlist.get(index));
                System.out.println("<<" + title + ">> in playlist");
                return true;
            }
                System.out.println("# Not existing Track Number #");
                return false;
        }
}
