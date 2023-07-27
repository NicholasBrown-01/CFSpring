package com.cfjava.songr.controllers;

import com.cfjava.songr.models.Album;
import com.cfjava.songr.repositories.AlbumsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class albumController {
    //STEP 6:ADD AN AUTOWIRE INSTANCE OF REPO TO THE CONTROLLER
    @Autowired
    AlbumsRepository albumsRepository;

@GetMapping ("/albums")
public String getAlbumsPage(Model m) {
    List<Album>albums = albumsRepository.findAll();
    m.addAttribute("albums", albums);

    return "albums.html";
}


    @GetMapping("/albums/{id}")
    public String getSingleAlbumPage(Model m, @PathVariable long id) {
    //Hardcoded albums
    Album album = albumsRepository.getReferenceById(id);
    m.addAttribute("album", album);


    List<Album>albums = albumsRepository.findAll();

    m.addAttribute("albums", albums);

    return "viewAlbum.html";
}

    @PostMapping("/albums/")
    public RedirectView addAlbumFromForm(String title, String artist, Integer songCount, Integer length) {
        String imageURL = "https://images.unsplash.com/photo-1492560704044-e15259ca1c61?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTl8fHJlY29yZCUyMHNtYWxsJTIwaW1hZ2V8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60";
        Album newAlbum = new Album(title, artist, songCount, length, imageURL);
        albumsRepository.save(newAlbum);

        return new RedirectView("/albums");
    }

}
