/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author 54375
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Circunferencia circ1 = new Circunferencia(10);
        
        circ1.perimetro();
        circ1.area();
        
        circ1.crearCircunferencia();
        
        circ1.perimetro();
        circ1.area();
        
    }
    
}
