package com.example.Pokemon.repository;

import com.example.Pokemon.model.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonsRepository extends JpaRepository<Pokemon, Integer> {
}
