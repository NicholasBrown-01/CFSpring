package com.cfjava.songr.models;


import jakarta.persistence.*;

import java.util.List;

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
    @OneToMany(mappedBy = "album", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    List<Song> songs;
    public Album() {
    }

    //STEP 3: ADD PROTECTED DEFAULT CONSTRUCTOR

    protected Album(long id) {
        this.id = id;
    }

    // CONSTRUCTOR WITHout id
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

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public String toString() {
        return "Album{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", songCount=" + songCount +
                ", length=" + length +
                ", imageURL='" + imageURL + '\'' +
                ", songs=" + songs +
                '}';
    }
}
