package com.headfirstjava.collections_in_java.song;


public class Song implements Comparable {
    private String title;
    private String artist;
    private String rating;
    private String bpm;

    public int compareTo(Song s) {
        return title.compareTo(s.getTitle());
    }

    Song(String title , String artist , String rating , String bpm) {
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

    @Override
    public String toString() {
        return title + ":" + artist;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
