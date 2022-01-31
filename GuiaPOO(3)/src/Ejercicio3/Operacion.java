/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author 54375
 */
public class Operacion {
    
    private int numero1, numero2;
    
    
    public Operacion(){
        
        
    }
    
    public Operacion(int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
        
    }

    /**
     * @return the numero1
     */
    public int getNumero1() {
        return numero1;
    }

    /**
     * @param numero1 the numero1 to set
     */
    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    /**
     * @return the numero2
     */
    public int getNumero2() {
        return numero2;
    }

    /**
     * @param numero2 the numero2 to set
     */
    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public void CrearOperacion(){
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese el primer numero: ");
        numero1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        numero2 = entrada.nextInt();
     }
     
    public int Sumar(){
       return numero1 + numero2;
    } 
    public int Restar(){
       return numero1 - numero2;
    }
     
    public int Multiplicar(){
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("No es posible multiplicar por 0");
            return 0;
        }else{
            return numero1 * numero2;
        }

    }
     
    public int Dividir(){
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("No es posible dividir por 0");
            return 0;
        }else{
            return numero1 / numero2;
        }

    }
    
}