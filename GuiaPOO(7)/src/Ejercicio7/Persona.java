/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7;

import java.util.Locale;
import java.util.Scanner;



public class Persona {
    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;
    private boolean mayorEdad;
    private int estadoPeso;

    public boolean getMayorEdad() {
        return mayorEdad;
    }

    public void setMayorEdad(boolean mayorEdad) {
        this.mayorEdad = mayorEdad;
    }

    public int getEstadoPeso() {
        return estadoPeso;
    }

    public void setEstadoPeso(int estadoPeso) {
        this.estadoPeso = estadoPeso;
    }
    
    
    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void crearPersona(){
        String sexo;
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese el nombre: ");
        nombre = entrada.next();
        System.out.println("Ingrese la edad: ");
        edad = entrada.nextInt();
        System.out.println("Ingrese el sexo: ");
        sexo = entrada.next().toUpperCase();
        if(sexo.equals("H") || sexo.equals("M") || sexo.equals("O")){
        this.sexo = sexo;
        }else{
            boolean bandera = false;
            
            do {
                System.out.println("ERROR - Sexo invalido, ingrese H (Hombre) - M (Mujer) - O(Otro) ");
                sexo = entrada.next().toUpperCase();
                this.sexo = sexo;
                if (sexo.equals("H") || sexo.equals("M") || sexo.equals("O")) {
                    bandera = true;
                }
            } while (bandera == false);
            
        }
        System.out.println("Ingrese el peso: ");
        peso = entrada.nextDouble();
        System.out.println("Ingrese la altura: ");
        altura = entrada.nextDouble();
    }
            //(peso en kg/(altura^2 en mt2)).
    public double calcularImc(){
        double pesoIdeal;
        pesoIdeal = peso / Math.pow((altura / 100), 2);
        if(pesoIdeal < 20){
            estadoPeso = -1;
            return estadoPeso;
        }else if (pesoIdeal > 25 ){
            estadoPeso = 1;
            return estadoPeso;
        }else{
            estadoPeso = 0;
            return estadoPeso;
        }
    }
    
    public boolean esMayorDeEdad(){
        if(edad > 18){
            mayorEdad = true;
            return mayorEdad;
        }else{
            mayorEdad = false;
            return mayorEdad;
        }
            
    }
}
