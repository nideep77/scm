package com.scm.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("home page handler");
        model.addAttribute("name", "Deep Technologies");
        model.addAttribute("youtubeChannel", "morphingdeep");
        model.addAttribute("git", "morphingdeep");
        return "home";
    }

    //about page route
    @RequestMapping("/about")
    public String about() {
        return "about";
    }

    //services page route
    @RequestMapping("/services")
    public String services() {
        return "services";
    }

}
