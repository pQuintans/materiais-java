package com.example.Pokemon.controller;

import com.example.Pokemon.model.Pokemon;
import com.example.Pokemon.repository.PokemonsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping (value = "/pokemons")
public class PokemonsController {

    @Autowired
    PokemonsRepository pokemonsRepository;

    @GetMapping(value = "")
    public List<Pokemon> getAll(){
        return pokemonsRepository.findAll();
    }

    @GetMapping(value = "/{number}")
    public Optional<Pokemon> getById(@PathVariable(value = "number") int number){
        return pokemonsRepository.findById(number);
    }

    @PostMapping(value = "")
    public void post(@RequestBody Pokemon pokemon){
        pokemonsRepository.save(pokemon);
    }
}
