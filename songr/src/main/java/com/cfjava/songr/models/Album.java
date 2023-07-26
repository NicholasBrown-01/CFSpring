package com.cfjava.songr.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// STEP 1: ADD @ENTITY TO CLASS
@Entity
public class Album {
    // STEP 2: ADD @Id identifier property do class
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String title;
    String artist;
    Integer songCount;
    Integer length;
    String imageURL;

    public Album() {
    }

    //STEP 3: ADD PROTECTED DEFAULT CONSTRUCTOR

    protected Album(long id) {
        this.id = id;
    }

    // CONSTRUCTOR WITH id
    public Album(long id, String title, String artist, Integer songCount, Integer length, String imageURL) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageURL = imageURL;
    }

    // CONSTRUCTOR WITHOUT id

    public Album(String title, String artist, Integer songCount, Integer length, String imageURL) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageURL = imageURL;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Integer getSongCount() {
        return songCount;
    }

    public void setSongCount(Integer songCount) {
        this.songCount = songCount;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
