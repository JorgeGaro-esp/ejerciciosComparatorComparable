/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comparatorcomparable.Ejercicio04;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public class Libro implements Comparable<Libro>{
    private String titulo;
    private int fechaPublicacion;
    
    //constructor

    public Libro(String titulo, int fechaPublicacion) {
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
    }
    
    //Getter and Setter

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(int fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
    
    //Metodos

    @Override
    public String toString() {
        return "Titulo: " + titulo + ", Fecha de publicacion: " + fechaPublicacion;
    }

    @Override
    public int compareTo(Libro otroLibro) {
        return Integer.compare(this.fechaPublicacion, otroLibro.fechaPublicacion);
    }
    
}
