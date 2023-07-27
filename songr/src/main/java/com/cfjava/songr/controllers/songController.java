package com.cfjava.songr.controllers;

import com.cfjava.songr.models.Album;
import com.cfjava.songr.models.Song;
import com.cfjava.songr.repositories.AlbumsRepository;
import com.cfjava.songr.repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class songController {

    @Autowired
    AlbumsRepository albumsRepository;

    @Autowired
    SongRepository songRepository;

    @GetMapping("/{id}")
    public String getAlbumSongs(Model model, @PathVariable Long id) {
        List<Song> songsArray = songRepository.findAll();
        model.addAttribute("songs", songsArray);


        return "songs.html";
    }

    @PostMapping("/songs")
    public RedirectView addSong(String title, Integer length, Integer trackNumber, long id) {
    Album album = albumsRepository.findById(id).get();

    Song newSong = new Song(title, length, trackNumber, album);

    songRepository.save(newSong);

    return new RedirectView("/viewAlbum");
    }
}
