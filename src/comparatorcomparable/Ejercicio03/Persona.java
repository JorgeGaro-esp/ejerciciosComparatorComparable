/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comparatorcomparable.Ejercicio03;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public class Persona implements Comparable<Persona>{
    private String nombre;
    private int edad;
    
    //Constructor

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //Getter and Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //Metodos

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad;
    }

    @Override
    public int compareTo(Persona persona) {
        return Integer.compare(this.edad, persona.edad);
    }
}
