package com.headfirstjava.collections_in_java.song;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class JukeBox1 {

    ArrayList<Song> songList = new ArrayList<Song>();

    class ArtistCompare implements Comparator<Song> {
        public int compare(Song one , Song two) {
            return one.getArtist().compareTo(two.getArtist());
        }
    }

    public static void main(String[] args) {
        new JukeBox1().go();
    }

    void go() {
        getSongs();
        ArtistCompare at = new ArtistCompare();
        Collections.sort(songList , at);
        System.out.println(songList.toString());

    }

    void getSongs() {
        try {
            File file = new File("C:\\sagar\\sagar\\songs.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null) {
                addSong(line);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    void addSong(String lineToParse) {

        String[] tokens = lineToParse.split("/");
        Song nextSong = new Song(tokens[0] , tokens[1] , tokens[2] , tokens[3]);
        songList.add((nextSong));
    }
}
