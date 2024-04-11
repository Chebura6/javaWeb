package org.pancakes.controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class MainController {

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("name", "Vasya");
        return "index";
    }

    @GetMapping("pancakes")
    public String pancakes() {
        return "pancakes";
    }

    @GetMapping("bakery")
    public String bakery() {
        return "bakery";
    }

    @GetMapping("birthday")
    public String birthday() {
        return "birthday";
    }

    @GetMapping("assortment")
    public String assortment() {
        return "assortment";
    }
}
