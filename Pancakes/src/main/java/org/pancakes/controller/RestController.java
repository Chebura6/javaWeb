package org.pancakes.controller;


import org.pancakes.entities.Bakery;
import org.pancakes.entities.Cookie;
import org.pancakes.entities.Pancake;
import org.pancakes.services.BakeryService;
import org.pancakes.services.CookieService;
import org.pancakes.services.PancakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/pancakes/")
//@Api(value = "Pancakes",description = "CRUD operations")
public class RestController {

    @Autowired
    PancakeService pancakeService;
    @Autowired
    BakeryService bakeryService;
    @Autowired
    CookieService cookieService;

    @GetMapping("/pancake/getAll")
    Collection<Pancake> getAllPancakes() {
        return pancakeService.getAll();
    }

    @PostMapping("/pancake/save")
    void savePancake(Pancake pancake) {
        pancakeService.save(pancake);
    }

    @DeleteMapping("/pancake/{id}")
    void deletePancake(@PathVariable Integer id) {
        pancakeService.delete(id);
    }

    @PostMapping("/pancake/update/{id}")
    void updatePancake(@PathVariable Integer id, @PathVariable Pancake pancake) {
        pancakeService.update(id, pancake);
    }


    @GetMapping("/bakery/getAll")
    Collection<Bakery> getAllBakeries() {
        return bakeryService.getAll();
    }

    @PostMapping("/bakery/save")
    Bakery savePancake(Bakery bakery) {
        return bakeryService.save(bakery);
    }

    @DeleteMapping("/bakery/{id}")
    void deleteBakery(@PathVariable Integer id) {
        bakeryService.delete(id);
    }

    @PostMapping("/bakery/update/{id}")
    void updateBakery(@PathVariable Integer id, @PathVariable Bakery bakery) {
        bakeryService.update(id, bakery);
    }

    @GetMapping("/cookie/getAll")
    Collection<Cookie> getAllCookies() {
        return cookieService.getAll();
    }

    @PostMapping("/cookie/save")
    void savePancake(Cookie cookie) {
        cookieService.save(cookie);
    }

    @DeleteMapping("/cookie/{id}")
    void deleteCookie(@PathVariable Integer id) {
        cookieService.delete(id);
    }

    @PostMapping("/cookie/update/{id}")
    void updateCookie(@PathVariable Integer id, @PathVariable Cookie cookie) {
        cookieService.update(id, cookie);
    }
}
