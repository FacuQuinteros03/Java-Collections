/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio04.utilidades;

import Ejercicio04.entidades.Peliculas;
import java.util.Comparator;

/**
 *
 * @author facuq
 */
public class Comparadores {
    
    public static Comparator<Peliculas> ordenarPorDuracionDesc = new Comparator<Peliculas> () {
        @Override
        public int compare(Peliculas o1, Peliculas o2) {
            return o2.getHoras().compareTo(o1.getHoras());
        }     
    };
    
    public static Comparator<Peliculas> ordenarPorDuracionAsc = new Comparator<Peliculas> () {
        @Override
        public int compare(Peliculas o1, Peliculas o2) {
            return o1.getHoras().compareTo(o2.getHoras());
        }       
    };
    
    public static Comparator<Peliculas> ordenarAlfabeticamenteTitle = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas o1, Peliculas o2) {
            return o1.getTitle().compareTo(o2.getTitle());
        }        
    };

    public static Comparator<Peliculas> ordenarAlfabeticamenteDirector = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas o1, Peliculas o2) {
            return o1.getDirector().compareTo(o2.getDirector());
        }        
    };
}
