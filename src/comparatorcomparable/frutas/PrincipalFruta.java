/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparatorcomparable.frutas;

import java.util.Set;
import java.util.TreeSet;
import comparatorcomparable.frutas.Fruta;
import java.util.Comparator;

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
        
            Comparator<Fruta> compararPorLongitud = new Comparator<Fruta>(){
                @Override
                public int compare(Fruta f1, Fruta f2) {
                    return Integer.compare(f1.getNombre().length(), f2.getNombre().length());
                }
            
            };
        
        Set<Fruta> frutas = new TreeSet<>();
        frutas.add(new Fruta("Fresa"));
        frutas.add(new Fruta("Banana"));
        
        for (Fruta fruta: frutas) {
            System.out.println(fruta);
        }
    }
}
    
