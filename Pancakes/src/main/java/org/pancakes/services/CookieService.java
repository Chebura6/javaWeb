package org.pancakes.services;

import org.pancakes.entities.Cookie;
import org.pancakes.entities.Pancake;
import org.pancakes.repositories.CookieRepository;
import org.pancakes.repositories.PancakeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CookieService {
    @Autowired
    CookieRepository cookieRepository;

    public Collection<Cookie> getAll() {
        return cookieRepository.findAll();
    }

    public void save(Cookie cookie) { cookieRepository.save(cookie); }

    public void delete(Integer id) { cookieRepository.deleteById(id); }

    public void update(Integer id, Cookie cookie) {
        cookieRepository.update(id, cookie.getName(), cookie.getDescription(), cookie.getPrice());
    }

}
