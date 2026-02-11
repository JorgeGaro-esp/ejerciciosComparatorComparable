/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparatorcomparable.Ejercicio05;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public class PrincipalPelicula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Comparator<Pelicula> ordenarAnioEstreno = new Comparator<>() {
            @Override
            public int compare(Pelicula pelicula1, Pelicula pelicula2) {
                return Integer.compare(pelicula1.getAnioEstreno(), pelicula2.getAnioEstreno());
            }
        };

        Set<Pelicula> peliculas = new TreeSet<>(ordenarAnioEstreno);
        peliculas.add(new Pelicula("Ironam", 150, 2008));
        peliculas.add(new Pelicula("FNAF 2", 240, 2025));
        peliculas.add(new Pelicula("El diario de Noah", 200, 2014));
        peliculas.add(new Pelicula("Saw X", 220, 2024));

        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }
    }

}
