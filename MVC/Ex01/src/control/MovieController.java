/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import model.Movie;

/**
 *
 * @author aluno
 */
public class MovieController {

    private ArrayList<Movie> list;

    public MovieController() {
        list = new ArrayList();
    }

    public void register(String name, int year) {
        Movie m = new Movie(name, year);
        list.add(m);
    }

    public ArrayList<Movie> getList() {
        return list;
    }

    public void setList(ArrayList<Movie> list) {
        this.list = list;
    }
}
