/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio01y02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author facuq
 */
public class JavaCollections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        ArrayList<String> razasPerros = new ArrayList();
        String cont;
        boolean k = false;
        do {
            System.out.println("Ingresa la raza del perro");
            razasPerros.add(read.next());
            System.out.println("Si desea continuar ingrese una (s/S) = si");
            cont = read.next().toLowerCase();
        } while (cont.equals("s"));
        System.out.println(razasPerros);
        System.out.println("Ingrese un perro que quiera eliminar");
        String perro = read.next();
        Iterator<String> it = razasPerros.iterator();
        while (it.hasNext()) {
            String aux = it.next();
            if (aux.equals(perro)) {
                it.remove();
            }
        }
        for (int i = 0; i == razasPerros.size(); i++) {
            String m = razasPerros.get(i);
            if (m.equals(perro)) {
                k = true;
            }
        }
        if (k == false) {
            System.out.println("El perro ingresado no esta en la Lista");
        }
        System.out.println("La lista quedo de la siguiente manera");
        razasPerros.forEach((e -> System.out.println(e)));
    }
}
