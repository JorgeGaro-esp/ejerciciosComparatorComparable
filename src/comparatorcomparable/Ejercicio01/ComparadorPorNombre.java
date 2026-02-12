/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comparatorcomparable.Ejercicio01;

import java.util.Comparator;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public class ComparadorPorNombre implements Comparator<Estudiante>{

    @Override
    public int compare(Estudiante estudiante1, Estudiante estudiante2) {
        return estudiante1.getNombre().compareTo(estudiante2.getNombre());
    }
    
}
