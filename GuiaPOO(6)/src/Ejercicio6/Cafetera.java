package Ejercicio6;

import java.util.Locale;
import java.util.Scanner;

public class Cafetera {

    private int capacidadMaxima;
    private int cantidadActual;

    public Cafetera() {

    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;

    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public void llenarCafetera() {
        cantidadActual = capacidadMaxima;
    }

    public void servirTaza() {
        int capacidadTaza;
        int cantActualTaza;
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese capacidad de la taza : ");
        capacidadTaza = entrada.nextInt();

        if (cantidadActual  >= capacidadTaza) {
            cantActualTaza = capacidadTaza;
            System.out.println("Se ha llenado la taza.");
            cantidadActual = cantidadActual - capacidadTaza;
        } else {
            cantActualTaza = cantidadActual;
            System.out.println("Se sirvio la taza con: " + cantActualTaza + " cc.");
            cantidadActual = 0;
        }

    }

    public void vaciarCafetera() {
        cantidadActual = 0;
    }

    public void agregarCafe() {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese la cantidad de cafe a agregar: ");
        cantidadActual = cantidadActual + entrada.nextInt();
    }
}
