/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

/**
 *
 * @author 54375
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cafetera cafetera1 = new Cafetera(1000, 0);
        cafetera1.llenarCafetera();
        System.out.println("Capacidad Maxima: " + cafetera1.getCapacidadMaxima());
        System.out.println("Capacidad Actual: " + cafetera1.getCantidadActual());
        
        cafetera1.servirTaza();
        System.out.println("Capacidad Actual: " + cafetera1.getCantidadActual());
        
        cafetera1.vaciarCafetera();
        System.out.println("Capacidad Actual: " + cafetera1.getCantidadActual());
        
        cafetera1.agregarCafe();
        System.out.println("Capacidad Actual: " + cafetera1.getCantidadActual());
        
        
        cafetera1.servirTaza();
        System.out.println("Capacidad Actual: " + cafetera1.getCantidadActual());
        
    }
    
}
