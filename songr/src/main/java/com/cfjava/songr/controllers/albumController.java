package com.cfjava.songr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class albumController {

@GetMapping("/albums")
    public String getAlbumsPage(Model m) {



    return "albums.html";
}

}
