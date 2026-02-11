/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comparatorcomparable.Ejercicio05;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public class Pelicula implements Comparable<Pelicula>{
    private String titulo;
    private int duracion;
    private int anioEstreno;
    
    //Constructor

    public Pelicula(String titulo, int duracion, int anioEstreno) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.anioEstreno = anioEstreno;
    }
    
    //Getter and Setter

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getAnioEstreno() {
        return anioEstreno;
    }

    public void setAnioEstreno(int anioEstreno) {
        this.anioEstreno = anioEstreno;
    }
    
    //Metodos

    @Override
    public String toString() {
        return "Titulo: " + titulo + ", Duracion: "+ duracion + ", Año de estreno: " + anioEstreno;
    }

    @Override
    public int compareTo(Pelicula otraPelicula) {
        return Integer.compare(otraPelicula.duracion, this.duracion);
    }
    
}
