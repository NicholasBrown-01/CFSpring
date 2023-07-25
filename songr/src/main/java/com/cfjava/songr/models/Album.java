package com.cfjava.songr.models;

public class Album {
    String title;
    String artist;
    int songCount;
    int length;
        String imageURL;

    public Album(String title, String artist, int songCount, int length, String imageURL) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageURL = imageURL;
    }
}
