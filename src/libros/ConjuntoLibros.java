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
public class ConjuntoLibros {

    private Libros[] conjunto;

    public ConjuntoLibros() {
        this.conjunto = new Libros[10];
    }

    public Libros[] llenarConjunto(Libros libro) {
        int i = 0;
        while (i < 10) {
            if (conjunto[i] == null) {
                conjunto[i] = libro;
                break;
            } else {
                i++;
            }
        }
      
        return null;

    }
}
