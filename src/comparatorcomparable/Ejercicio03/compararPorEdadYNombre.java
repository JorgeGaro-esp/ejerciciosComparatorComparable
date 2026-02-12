/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comparatorcomparable.Ejercicio03;

import java.util.Comparator;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public class compararPorEdadYNombre implements Comparator<Persona>{

    @Override
    public int compare(Persona persona1, Persona persona2) {
        int cmp = Integer.compare(persona2.getEdad(), persona1.getEdad());
        
        if (cmp==0) {
            return persona1.getNombre().compareTo(persona2.getNombre());
        } else return cmp;
    }
    
}
