/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio04.Servicios;

import Ejercicio04.entidades.Peliculas;

import java.util.Scanner;

/**
 *
 * @author facuq
 */
public class Services {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Peliculas crearPeliculas(Peliculas a) {
        System.out.println("Ingrese el nombre de la pelicula");
        a.title = read.next();
        System.out.println("Ingrese la duracion en HS de la pelicula");
        a.horas = read.nextDouble();
        System.out.println("Ingrese el Director de la pelicula");
        a.director = read.next();
        return a;
    }
    public void mostrarPeliculas(Iterable<Peliculas> Peliculas) {
        for (Peliculas aux : Peliculas) {
            System.out.println(aux.title);
        }
    }
    
}


