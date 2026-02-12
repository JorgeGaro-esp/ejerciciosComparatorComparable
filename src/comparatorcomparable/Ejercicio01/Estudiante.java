/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comparatorcomparable.Ejercicio01;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public class Estudiante implements Comparable<Estudiante>  {
    private String nombre;
    private double promedio;
    
    //Constructor

    public Estudiante(String nombre, double promedio) {
        this.nombre = nombre;
        this.promedio = promedio;
    }
    
    //Getter and Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    //Metodo

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Promedio: " + promedio;
    }

    @Override
    public int compareTo(Estudiante estudiante) {
        return Double.compare(estudiante.promedio, this.promedio);
    }
    
}
