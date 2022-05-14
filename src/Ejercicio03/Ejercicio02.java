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
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
        //información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
        //pregunta al usuario si quiere crear otro Alumno o no.
        Scanner read = new Scanner(System.in);
        Servicios service = new Servicios();
        String confirmation;
        ArrayList AlumnoList = new ArrayList();
        do {
            Alumno a = service.LlenarDatos();
            System.out.println("¿Desea ingresar otro alumno? s/S=Si");
            confirmation = read.next().toLowerCase();
            AlumnoList.add(a);
        } while (confirmation.equals("s"));
        System.out.println(AlumnoList);

        System.out.println("Ingrese el nombre del alumno que quiera saber el promedio de las notas");
        String nombreAlumno = read.next();
        
        for (int i = 0; i < AlumnoList.size(); i++) {
            Object m = AlumnoList.get(i);
            System.out.println(m);
            if (m.equals(nombreAlumno)) {
                service.notaFinal((Alumno) m);
            }
            System.out.println("El promedio es: "+service.notaFinal((Alumno) m));
        }
            
           
                
            }
        }
    

