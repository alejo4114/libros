/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libros;

/**
 *
 * @author Alejandro
 */
public class PruebaLibros {
    public static void main(String[] args) {
        Libros lib = new Libros("inferno", "DanBrown");
        lib.setCalif(9);
        lib.setNumPag(360);
        
        ConjuntoLibros cl = new ConjuntoLibros();
        cl.llenarConjunto(lib);
        
        
        
    }
    
}
