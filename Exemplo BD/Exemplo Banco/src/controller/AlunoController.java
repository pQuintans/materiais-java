/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Aluno;
import model.dao.AlunoDAO;

/**
 *
 * @author aluno
 */
public class AlunoController {
    AlunoDAO alDao;

    public AlunoController() {
        alDao = new AlunoDAO();
    }
    
    public void cadastrar(int ra, String nome) throws SQLException {
        Aluno a = new Aluno(ra, nome);
        alDao.inserirAluno(a);
    }
}
