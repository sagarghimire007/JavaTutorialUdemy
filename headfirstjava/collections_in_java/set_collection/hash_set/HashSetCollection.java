package com.headfirstjava.collections_in_java.set_collection.hash_set;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;

public class HashSetCollection {

    ArrayList<HashSetSongList> songList = new ArrayList<HashSetSongList>();

    public static void main(String[] args) {


        new HashSetCollection().go();
    }

    void go() {
        getSongs();
        System.out.println(songList.toString());

        HashSet<HashSetSongList> songLists = new HashSet<HashSetSongList>();
        songLists.addAll(songList);
        System.out.println(songLists);

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
        HashSetSongList nextSong = new HashSetSongList(tokens[0] , tokens[1] , tokens[2] , tokens[3]);
        songList.add((nextSong));
    }
}
