/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comparatorcomparable.Ejercicio02;

import java.util.Comparator;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public class compararPorNombre implements Comparator<Producto>{

    @Override
    public int compare(Producto producto1, Producto producto2) {
        return producto1.getNombre().compareTo(producto2.getNombre());
    }
    
}
