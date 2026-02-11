/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparatorcomparable.Ejercicio01;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public class PrincipalEstudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Comparator<Estudiante> ordenarAlfabeticamente = new Comparator<Estudiante>() {
            @Override
            public int compare(Estudiante o1, Estudiante o2) {
                return o1.getNombre().compareTo(o2.getNombre());
            }
            
        };
        
        Set<Estudiante> estudiantes = new TreeSet<>(ordenarAlfabeticamente);
        estudiantes.add(new Estudiante("Jorge",10.0));
        estudiantes.add(new Estudiante("Fatma",8.0));
        estudiantes.add(new Estudiante("Luisa",2.0));
        estudiantes.add(new Estudiante("Luis",2.0));
        
        for (Estudiante estudiante:estudiantes) {
            System.out.println(estudiante);
        }
    }
    
}
