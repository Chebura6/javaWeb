package org.pancakes.services;


import org.pancakes.entities.Pancake;
import org.pancakes.repositories.PancakeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class PancakeService {

    @Autowired
    PancakeRepository pancakeRepository;

    public Collection<Pancake> getAll() {
        return pancakeRepository.findAll();
    }

    public void save(Pancake pancake) { pancakeRepository.save(pancake); }

    public void delete(Integer id) { pancakeRepository.deleteById(id); }

    public void update(Integer id, Pancake pancake) {
        pancakeRepository.update(id, pancake.getName(), pancake.getDescription(), pancake.getPrice());
    }
}
