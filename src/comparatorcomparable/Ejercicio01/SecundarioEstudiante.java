/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparatorcomparable.Ejercicio01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public class SecundarioEstudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Ana",9.5));
        estudiantes.add(new Estudiante("Ana",9.2));
        estudiantes.add(new Estudiante("Juan",9.7));
        estudiantes.add(new Estudiante("Juan",8.7));
        estudiantes.add(new Estudiante("Carlos",9.8));
        estudiantes.add(new Estudiante("Beatriz",9.5));
        System.out.println("Lista sin ordenar");
        for (Estudiante estudiante:estudiantes) {
            System.out.println(estudiante.toString());
        }
        System.out.println("\nLista ordenada por promedio de mayor a menor");
        Collections.sort(estudiantes);
        for (Estudiante estudiante:estudiantes) {
            System.out.println(estudiante.toString());
        }
        System.out.println("\nLista ordenada por nombre");
        Collections.sort(estudiantes, new ComparadorPorNombre());
        for (Estudiante estudiante:estudiantes) {
            System.out.println(estudiante.toString());
        }
        System.out.println("\nLista ordenada por promedio y nombre");
        estudiantes.sort(Comparator.comparing(Estudiante::getNombre).thenComparing(Estudiante::getPromedio));
        for (Estudiante estudiante:estudiantes) {
            System.out.println(estudiante.toString());
        }
    }
    
}
