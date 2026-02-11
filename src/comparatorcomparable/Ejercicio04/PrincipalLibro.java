/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparatorcomparable.Ejercicio04;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public class PrincipalLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Comparator<Libro> ordenAlfabetico = new Comparator<>() {
            @Override
            public int compare(Libro libro1, Libro libro2) {
                return libro1.getTitulo().compareTo(libro2.getTitulo());
            }

        };

        Set<Libro> libros = new TreeSet<>(ordenAlfabetico);
        libros.add(new Libro("Harry Potter", 2001));
        libros.add(new Libro("Harry Potter rev", 2004));
        libros.add(new Libro("Marvel comics", 1997));
        libros.add(new Libro("El silencio de los turnos", 2025));

        for (Libro libro : libros) {
            System.out.println(libro.toString());
        }

    }

}
