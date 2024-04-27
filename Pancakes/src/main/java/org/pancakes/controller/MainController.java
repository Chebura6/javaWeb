package org.pancakes.controller;


import org.pancakes.entities.Bakery;
import org.pancakes.entities.Cookie;
import org.pancakes.entities.Pancake;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class MainController {

    public long totalTime;

    @GetMapping("/pancake")
    public String index(Model model) {

        return "pancake";
    }

    @GetMapping("/")
    public String index_(Model model) {

        return "pancake";
    }


    @GetMapping("cookie")
    public String cookie() {
        return "cookie";
    }

    @GetMapping("bakery")
    public String bakery() {
        return "bakery";
    }

    @GetMapping("assortment")
    public String assortment() {
        return "assortment";
    }
    @GetMapping("createBakery")
    public String createBakery(@ModelAttribute("bakery") Bakery bakery) {
        return "createBakery";
    }
    @GetMapping("createPancake")
    public String createPancake(@ModelAttribute("pancake") Pancake pancake) { return "createPancake";}
    @GetMapping("createCookie")
    public String createCookie(@ModelAttribute("cookie") Cookie cookie) { return "createCookie";}
}
