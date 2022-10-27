package com.example.Pokemon.repository;

import com.example.Pokemon.model.Pokeball;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokeballsRepository extends JpaRepository<Pokeball, String> {
}
