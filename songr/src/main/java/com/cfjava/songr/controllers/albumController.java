package com.cfjava.songr.controllers;

import com.cfjava.songr.models.Album;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class albumController {

@GetMapping("/albums")
    public String getAlbumsPage(Model m) {
    //Hardcoded albums
    Album woods = new Album("Woods", "DarkLight", 5, 3200, "images/WoodDoor.jpg");
    Album rocker = new Album("Rocker", "LongHair", 8, 4200, "images/Rocker.jpg");
    Album ripple = new Album("Ripple", "WatersCold", 10, 4800, "images/Ripple.jpg");

    //Make list
    List<Album> albums = Arrays.asList(woods, rocker, ripple);

    //Adding the Album List to the Model
    m.addAttribute("albums", albums);

    return "albums.html";
}

}
