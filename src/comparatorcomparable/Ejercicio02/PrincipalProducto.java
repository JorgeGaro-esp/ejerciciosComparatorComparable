/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparatorcomparable.Ejercicio02;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public class PrincipalProducto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Comparator<Producto> ordenAlfabetico = new Comparator<Producto>() {
            @Override
            public int compare(Producto producto1, Producto producto2) {
                return producto1.getNombre().compareTo(producto2.getNombre());
            }
        };
        
        Set<Producto> productos = new TreeSet<>(new compararPorNombre());
        
        productos.add(new Producto("Tornillo",15.99));
        productos.add(new Producto("Clavo",9.99));
        productos.add(new Producto("Sedal",12.99));
        productos.add(new Producto("Seda",5.99));
        
        for (Producto producto:productos) {
            System.out.println(producto.toString());
        }
    }
    
}
