package com.headfirstjava.collections_in_java.set_collection.hash_set;

public class HashSetSongList {

    private String title;
    private String artist;
    private String rating;
    private String bpm;

    HashSetSongList(String title , String artist , String rating , String bpm) {
        this.title = title;
        this.artist = artist;
        this.rating = rating;
        this.bpm = bpm;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getRating() {
        return rating;
    }

    public String getBpm() {
        return bpm;
    }

    public String toString() {
        return title;
    }

    public boolean equals(Object aSong) {
        HashSetSongList s = (HashSetSongList) aSong;
        return getTitle().equals(s.getTitle());
    }

    public int hashCode() {
        System.out.println(title + ", " + title.hashCode());
        return title.hashCode();
    }
}
