/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio04;

import Ejercicio04.Servicios.Services;
import Ejercicio04.entidades.Peliculas;
import Ejercicio04.utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author facuq
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Después de ese bucle realizaremos las siguientes acciones:
        • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
        en pantalla.
        • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
        en pantalla.
        • Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
        • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.*/
        Scanner read = new Scanner(System.in);
        String confirmation;

        Services servicioPeli = new Services();
        ArrayList<Peliculas> Peliculas = new ArrayList();
        do {
            Peliculas a = new Peliculas();
            servicioPeli.crearPeliculas(a);
            Peliculas.add(a);
            System.out.println("¿Desea crear otra pelicula? Si asi lo desea ingrese la letra s");
            confirmation = read.next().toUpperCase();
        } while (confirmation.equals("S"));
        System.out.println("Las peliculas son las siguientes:");
        servicioPeli.mostrarPeliculas(Peliculas);
        int cont = 0;
        for (int i = 0; i < Peliculas.size(); i++) {
            Peliculas m = (Peliculas) Peliculas.get(i);
            if (m.horas > 1) {
                cont++;
            }
        }
        System.out.println("Las peliculas con duracion mayor a una hora son: " + cont);

        Collections.sort(Peliculas, Comparadores.ordenarPorDuracionDesc);
        System.out.println("Las Peliculas ordenadas por duracion , de Mayor a Menor son:");
        for (Peliculas aux : Peliculas) {
            System.out.println(aux.getTitle());
        }

        Collections.sort(Peliculas, Comparadores.ordenarPorDuracionAsc);
        System.out.println("Las Peliculas ordenadas por duracion , de Menor a Mayor son:");
        for (Peliculas aux : Peliculas) {
            System.out.println(aux.getTitle());
        }

        Collections.sort(Peliculas, Comparadores.ordenarAlfabeticamenteTitle);
        System.out.println("Las peliculas ordenadas alfabeticamente son:");
        for (Peliculas Pelicula : Peliculas) {
            System.out.println(Pelicula.title);
        }

        Collections.sort(Peliculas, Comparadores.ordenarAlfabeticamenteDirector);
        System.out.println("Los directores ordenados alfabeticamente son:");
        for (Peliculas Pelicula : Peliculas) {
            System.out.println(Pelicula.director);
        }

    }

}
