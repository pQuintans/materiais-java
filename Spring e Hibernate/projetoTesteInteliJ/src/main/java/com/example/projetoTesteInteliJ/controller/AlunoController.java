package com.example.projetoTesteInteliJ.controller;

import com.example.projetoTesteInteliJ.model.Aluno;
import com.example.projetoTesteInteliJ.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping (value = "/api-aluno")
public class AlunoController {
    @Autowired
    private AlunoRepository alunoRepository;

    @GetMapping(value = "/alunos")
    public List<Aluno> buscarTodos() {
        return alunoRepository.findAll();
    }

    @GetMapping(value = "/alunos/{id}")
    public Optional<Aluno> buscarPorId(@PathVariable(value="id") int id) {
        return alunoRepository.findById(id);
    }

    @PostMapping("/alunos")
    public void inserirRegistro(@RequestBody Aluno aluno) {
        alunoRepository.save(aluno);
    }

}
