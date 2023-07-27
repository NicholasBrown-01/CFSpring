package com.cfjava.songr.controllers;

//import ch.qos.logback.core.model.Model;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Locale;

@Controller
public class mainController {
    @GetMapping("/")
    public String getSplashPage() {
        return "songrsplash";
    }

}
