package com.cfjava.songr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.text.AttributedString;
import java.util.Locale;

@Controller
public class capitalizeController {
    @GetMapping("/capitalize/{userInput}")
    public String getCapitalizedPage(Model m, @PathVariable String userInput) {
        m.addAttribute("userInput", userInput.toUpperCase(Locale.ROOT));
        return "capitalize.html";
    }
}
