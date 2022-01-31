/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author 54375
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Operacion opracion1 = new Operacion();
        opracion1.CrearOperacion();
        System.out.println("Suma: " + opracion1.Sumar());
        System.out.println("Resta: " + opracion1.Restar());
        System.out.println("Producto: " + opracion1.Multiplicar());
        System.out.println("Division : " + opracion1.Dividir());
    
        
    }
    
}
