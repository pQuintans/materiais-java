package com.example.projetoTesteInteliJ.repository;

import com.example.projetoTesteInteliJ.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
}
