/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparatorcomparable.frutas;

import java.util.Set;
import java.util.TreeSet;
import comparatorcomparable.frutas.Fruta;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public class PrincipalFruta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Set<Fruta> frutas = new TreeSet<>();
        frutas.add(new Fruta("Fresa"));
        frutas.add(new Fruta("Banana"));
        
        for (Fruta fruta: frutas) {
            System.out.println(fruta);
        }
    }
}
    
