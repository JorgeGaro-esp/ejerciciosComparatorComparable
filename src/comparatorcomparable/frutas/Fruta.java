/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comparatorcomparable.frutas;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public class Fruta {
    private String nombre;
    
    //Constructor

    public Fruta(String nombre) {
        this.nombre = nombre;
    }
        
    //Getter and Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Metodos

    @Override
    public String toString() {
        return "Fruta{" + "nombre=" + nombre + '}';
    }


    
}