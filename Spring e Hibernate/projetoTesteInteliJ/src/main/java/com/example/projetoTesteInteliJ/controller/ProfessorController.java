package com.example.projetoTesteInteliJ.controller;

import com.example.projetoTesteInteliJ.model.Professor;
import com.example.projetoTesteInteliJ.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping (value="/api-professor")
public class ProfessorController {
    @Autowired
    private ProfessorRepository professorRepository;

    @GetMapping(value = "/professores")
    public List<Professor> buscarTodos() {
        return professorRepository.findAll();
    }

    @GetMapping("/professores/{id}")
    public Optional<Professor> buscarPorId(@PathVariable("id") int id) {
        return professorRepository.findById(id);
    }

    @PostMapping("professores")
    public void inserirRegistro(@RequestBody Professor professor) {
        professorRepository.save(professor);
    }
}
