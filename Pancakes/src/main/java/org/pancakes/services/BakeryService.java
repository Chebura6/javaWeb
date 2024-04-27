package org.pancakes.services;


import org.pancakes.entities.Bakery;
import org.pancakes.entities.BakerySeller;
import org.pancakes.entities.Pancake;
import org.pancakes.repositories.BakeryRepository;
import org.pancakes.repositories.PancakeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Console;
import java.util.Collection;

@Service
public class BakeryService {

    @Autowired
    BakeryRepository bakeryRepository;

    public Collection<Bakery> getAll() {
        return bakeryRepository.findAll();
    }

    public Bakery save(Bakery bakery) {
        return bakeryRepository.save(bakery);
    }

    public void delete(Integer id) { bakeryRepository.deleteById(id); }

    public void update(Integer id, Bakery bakery) {
        bakeryRepository.update(id, bakery.getName(), bakery.getDescription(), bakery.getPrice());
    }
}
