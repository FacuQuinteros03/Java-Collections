/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio03;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author facuq
 */
public class Servicios {

    public Alumno LlenarDatos() {
        Scanner read = new Scanner(System.in);
        Alumno a = new Alumno();
        ArrayList notas = new ArrayList();
        System.out.println("Ingrese el nombre del alumno");
        a.setNombre(read.next());
        System.out.println("Ingrese sus 3 notas");
        for (int i = 0; i < 3; i++) {
            notas.add(read.nextInt());
        }
        a.setNotas(notas);
        return a;

    }

    /*Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su
nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método.
Dentro del método se usará la lista notas para calcular el promedio final de alumno.
Siendo este promedio final, devuelto por el método y mostrado en el main.*/
    public double notaFinal(Alumno a) {
        double resultado = 0;
        for (int i = 0; i < a.getNotas().size(); i++) {
            Integer m = a.getNotas().get(i);
            resultado =resultado + m;
        }
        double promedio = resultado/3;
        return promedio;
    }
}
