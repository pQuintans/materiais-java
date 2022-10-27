package com.example.Pokemon.controller;

import com.example.Pokemon.model.Pokeball;
import com.example.Pokemon.repository.PokeballsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/pokeballs")
public class PokeballsController {
    @Autowired
    PokeballsRepository pokeballsRepository;

    @GetMapping(value = "")
    public List<Pokeball> getAll() {
        return pokeballsRepository.findAll();
    }

    @GetMapping(value="/{type}")
    public Optional<Pokeball> getById(@PathVariable (value="type") String type) {
        return pokeballsRepository.findById(type);
    }

    @PostMapping(value="")
    public void post(@RequestBody Pokeball pokeball) {
        pokeballsRepository.save(pokeball);
    }
}
