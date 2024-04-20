package org.pancakes.controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class MainController {

    public long totalTime;

    @GetMapping("/index")
    public String index(Model model) {
//        model.addAttribute("name", "Vasya");
//        document.addEventListener("DOMContentLoaded", function() {    var serverTime = parseFloat(document.querySelector("meta[name='server-time']").content);
//            var domReadyTime = performance.now();    var totalLoadTime = serverTime + domReadyTime;
//            var processTime = document.getElementById("processTime");    processTime.textContent = ` ${totalLoadTime.toFixed(2)} ms`;
//        });

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
