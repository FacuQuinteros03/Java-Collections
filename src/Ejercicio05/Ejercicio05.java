/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio05;

import Ejercicio05.entidades.Pais;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author facuq
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator,
        se buscará el país en el conjunto y si está en el conjunto se eliminará el país que
        ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto
        se le informará al usuario.*/
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        String confirmation;
        TreeSet<Pais> Paises = new TreeSet();
        do {
            Pais p = new Pais();
            System.out.println("Ingrese un país");
            p.nombre = read.next();
            Paises.add(p);
            System.out.println("¿Desea continuar ingresando paises?");
            confirmation = read.next().toLowerCase();
        } while (confirmation.equals("si"));
        System.out.println("Paises ordenados alfabeticamente ");
        Paises.forEach((p) -> {
            System.out.println(p.nombre);
        });
        System.out.println("Ingrese un pais que desee eliminar");
        String paisDelete = read.next();
        Iterator<Pais> it = Paises.iterator();
        Integer firstSize = Paises.size();
        while (it.hasNext()) {
            Pais aux = it.next();
            if (aux.nombre.equals(paisDelete)) {
                it.remove();
            }
        }
        if (!firstSize.equals(Paises.size())) {
        System.out.println("Lista Actualizada:");
        Paises.forEach((aux) -> {
            System.out.println(aux.nombre);
        });
        } else {
            System.out.println("No se encontro el pais que intento eliminar");
        }
    }
}
