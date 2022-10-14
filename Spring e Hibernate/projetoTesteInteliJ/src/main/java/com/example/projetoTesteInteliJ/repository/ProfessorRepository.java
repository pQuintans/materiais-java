package com.example.projetoTesteInteliJ.repository;

import com.example.projetoTesteInteliJ.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Integer> {
}
