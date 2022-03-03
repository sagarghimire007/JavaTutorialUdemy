package com.headfirstjava.collections_in_java.collections_method;

import java.util.ArrayList;
import java.util.Collections;

class Song implements Comparable<Song> {
    String title;

    Song(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int compareTo(Song s) {
        return title.compareTo(s.getTitle());
    }

    public String toString() {
        return title;
    }
}

public class CollectionMethod {
    public static void main(String[] args) {

        Song song1 = new Song("Love the way you lie");
        Song song2 = new Song("Senorita");
        Song song3 = new Song("You are beautiful");
        Song song4 = new Song("Awaz");

        ArrayList<Song> songList = new ArrayList<Song>();

        songList.add(song1);
        songList.add(song2);
        songList.add(song3);
        songList.add(song4);

        Collections.sort(songList);
        System.out.println(songList.toString());
    }
}
