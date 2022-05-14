/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio06;

import Ejercicio06.entidades.Tienda;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author facuq
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*Se necesita una aplicación para una tienda en la cual queremos almacenar los
        distintos productos que venderemos y el precio que tendrán. Además, se necesita
        que la aplicación cuente con las funciones básicas.Estas las realizaremos en el main. Como, introducir un elemento, modificar su precio,
        eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
        Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
        Realizar un menú para lograr todas las acciones previamente mencionadas.*/
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        String option;
        String v;
        HashMap<Tienda, String> map = new HashMap();
        do {
            System.out.println("Seleccione que opcion quiere realizar:");
            System.out.println("A:Introducir un elemento a la tienda");
            System.out.println("B:Modificar el precio de un producto");
            System.out.println("C:Eliminar un producto");
            System.out.println("D:Mostrar productos ingresados con su precio");
            System.out.println("E:Salir");
            option = read.next().toUpperCase();
            switch (option) {
                case "A":
                    Tienda t = new Tienda();
                    System.out.println("Ingrese el producto");
                    t.Objeto = read.next();
                    System.out.println("Ingrese su precio");
                    v = read.next();
                    map.put(t, v);
                    break;
                case "B":
                    System.out.println("Ingrese el producto al cual quiere modificarle el precio: ");
                    String modificate = read.next();
                    for (Map.Entry<Tienda, String> entry : map.entrySet()) {
                        Tienda key = entry.getKey();
                        String value = entry.getValue();
                        if(key.getObjeto().equals(modificate)) {
                            System.out.println("ingrese el nuevo precio");
                            String newvalue = read.next();
                            map.put(key,newvalue);
                        }
                        }
                   
                    break;
                case "C":
                    System.out.println("Ingrese que producto quiere eliminar:");
                    String remove = read.next();
                    for (Map.Entry<Tienda, String> entry : map.entrySet()) {
                        Tienda key = entry.getKey();
                        Object value = entry.getValue();
                        if (key.getObjeto().equals(remove)) {
                            map.remove(key);
                        }
                    }
                    break;
                case "D":
                    for (Map.Entry<Tienda, String> aux : map.entrySet()) {
                        Tienda key = aux.getKey();
                        Object value = aux.getValue();
                        System.out.println("Poducto: " + key.getObjeto() + " Precio: " + value);
                    }
                    break;
                case "E":
                    option = "e";
                    System.out.println("Usted abandonó el menú");
            }
            
        } while (!option.equals("e"));
    }
}
