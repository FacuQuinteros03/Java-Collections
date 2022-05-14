/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio04.entidades;

/**
 *
 * @author facuq
 */
public class Peliculas {
    
    public String title;
    
    public String director;
    
    public Double horas;

    public Peliculas() {
    }

    public Peliculas(String title, String director, Double horas) {
        this.title = title;
        this.director = director;
        this.horas = horas;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Double getHoras() {
        return horas;
    }

    public void setHoras(Double horas) {
        this.horas = horas;
    }
    
}
