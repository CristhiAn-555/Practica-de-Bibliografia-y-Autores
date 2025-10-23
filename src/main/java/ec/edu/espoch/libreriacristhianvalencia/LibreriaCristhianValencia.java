/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.libreriacristhianvalencia;

import java.util.Stack;

/**
 *
 * @author PERSONAL
 */
public class LibreriaCristhianValencia {

    public static void main(String[] args) {
        
         Stack<String> Libros = new Stack<>();
        Stack<String> autores = new Stack<>();
        
        Biblioteca li = new Biblioteca(autores, Libros);
    }
}
