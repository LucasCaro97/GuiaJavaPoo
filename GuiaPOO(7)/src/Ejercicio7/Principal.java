/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7;


public class Principal {

    
    
    public static void main(String[] args) {
        
          Persona persona1 = new Persona("Lucas", 25, "h", 180, 180);
//        persona1.crearPersona();
//        
          Persona persona2 = new Persona("Fabio", 15, "h", 70, 170);
//        persona2.crearPersona();
//  
          Persona persona3 = new Persona("Pedro", 25, "h", 50, 200);
//        persona3.crearPersona();
//        
          Persona persona4 = new Persona("Fabiana", 30, "m", 60, 150);
//        persona4.crearPersona();
    
        
        System.out.println("Indice de peso de: "+ persona1.getNombre() + ": " + persona1.calcularImc());
        System.out.println(persona1.getNombre() + " es mayor de edad: " + persona1.esMayorDeEdad());
        System.out.println("Indice de peso de: "+ persona2.getNombre() + ": " + persona2.calcularImc());
        System.out.println(persona2.getNombre() + " es mayor de edad: " + persona2.esMayorDeEdad());
        System.out.println("Indice de peso de: "+ persona3.getNombre() + ": " + persona3.calcularImc());
        System.out.println(persona3.getNombre() + " es mayor de edad: " + persona3.esMayorDeEdad());
        System.out.println("Indice de peso de: "+ persona4.getNombre() + ": " + persona4.calcularImc());
        System.out.println(persona4.getNombre() + " es mayor de edad: " + persona4.esMayorDeEdad());
       
        int menorPeso = 0;
        int idealPeso = 0;
        int mayorPeso = 0;
        int mayorEdad = 0;
        int menorEdad = 0;
        
        switch(persona1.getEstadoPeso()){
            case -1:
            menorPeso ++;
            break;
            case 0:
            idealPeso++;
            break;
            case 1:    
            mayorPeso++;
            break;
        }
        switch(persona2.getEstadoPeso()){
            case -1:
            menorPeso ++;
            break;
            case 0:
            idealPeso++; 
            break;
            case 1:    
            mayorPeso++;
            break;
        }
        switch(persona3.getEstadoPeso()){
            case -1:
            menorPeso ++; 
            break;
            case 0:
            idealPeso++; 
            break;
            case 1:    
            mayorPeso++;
            break;
        }
        switch(persona4.getEstadoPeso()){
            case -1:
            menorPeso ++; 
            break;
            case 0:
            idealPeso++;
            break;
            case 1:    
            mayorPeso++;
            break;
        }
        
        System.out.println("Sobrepeso: " + mayorPeso * 100 / 4 + "%");
        System.out.println("Peso ideal: " + idealPeso * 100  / 4 + "%");
        System.out.println("Por debajo: " + menorPeso * 100 / 4  + "%");
    
    }
}