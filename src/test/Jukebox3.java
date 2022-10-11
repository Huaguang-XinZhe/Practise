package test;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Jukebox3 {
    ArrayList<Song> songList = new ArrayList<>();

    public static void main(String[] args) {
        new Jukebox3().go();
    }

    public void go() {
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
        System.out.println(songList.get(5));
    }

    private void getSongs() {
        try {
            File file = new File("SongList.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                addSong(line);
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void addSong(String lineToParse) {
        String[] tokens = lineToParse.split("/");
        System.out.println(tokens[0]);
        Song song = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
        songList.add(song);
    }
}

