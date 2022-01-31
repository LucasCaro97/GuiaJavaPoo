/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author 54375
 */
public class CuentaBancaria {

    private int nroCuenta;
    private long dni;
    private double saldoActual;
    private double interes;

    public CuentaBancaria() {

    }

    public CuentaBancaria(long dni, double saldoActual, int nroCuenta) {
        this.dni = dni;
        this.saldoActual = saldoActual;
        this.nroCuenta = nroCuenta;

    }

    /**
     * @return the nroCuenta
     */
    public int getNroCuenta() {
        return nroCuenta;
    }

    /**
     * @param nroCuenta the nroCuenta to set
     */
    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    /**
     * @return the dni
     */
    public long getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(long dni) {
        this.dni = dni;
    }

    /**
     * @return the saldoActual
     */
    public double getSaldoActual() {
        return saldoActual;
    }

    /**
     * @param saldoActual the saldoActual to set
     */
    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    /**
     * @return the interes
     */
    public double getInteres() {
        return interes;
    }

    /**
     * @param interes the interes to set
     */
    public void setInteres(double interes) {
        this.interes = interes;
    }

    public void crearCuenta() {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese el DNI del usuario: ");
        dni = entrada.nextLong();
        System.out.println("Ingrese el Saldo de la cuenta: ");
        saldoActual = entrada.nextInt();
        System.out.println("Ingrese el Numero de Cuenta: ");
        nroCuenta = entrada.nextInt();

    }

    //modificar metodo - no pedir al usuario, sino que reciba por parametro
    public void ingresarDinero() {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        double dineroIngresado;
        System.out.println("INGRESAR - Ingrese el monto a ingresar: ");
        dineroIngresado = entrada.nextDouble();

        while (dineroIngresado < 0) {
            System.out.println("ERROR - Ingrese un numero positivo: ");
            dineroIngresado = entrada.nextDouble();
        }

        saldoActual = saldoActual + dineroIngresado;

    }
    
    //modificar metodo - no pedir al usuario, sino que reciba por parametro
    public void retirarDinero() {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("EXTRACCION - Ingrese el monto a retirar: ");
        double dineroRetirado = entrada.nextDouble();

        while (dineroRetirado < 0) {
            System.out.println("ERROR - Ingrese un numero positivo: ");
            dineroRetirado = entrada.nextDouble();
        }

        if ((saldoActual - dineroRetirado) <= 0) {
            saldoActual = 0;
        } else {

            saldoActual = saldoActual - dineroRetirado;

        }
    }

    public void extraccionRapida() {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("EXTRACCION RAPIDA - Ingrese el monto a retirar: ");
        double dineroRetirado = entrada.nextDouble();

        while (dineroRetirado < 0) {
            System.out.println("ERROR - Ingrese un numero positivo: ");
            dineroRetirado = entrada.nextDouble();
        }

        if (dineroRetirado <= saldoActual * 20 / 100) {

            saldoActual = saldoActual - dineroRetirado;

        } else {
            do {

                System.out.println("ERROR - solo puede retirar hasta un 20% del saldo ");
                System.out.println("Ingrese nuevo monto a retirar: MAX -  " + saldoActual * 20 / 100);
                dineroRetirado = entrada.nextDouble();

            } while (dineroRetirado > ( saldoActual * 20 / 100 ) + 1 );
            saldoActual = saldoActual - dineroRetirado;

        }
    }
    
    public void consultarSaldo(){
        System.out.println("Saldo Actual: " + saldoActual);
    }
    
    public void consultarDatos(){
        System.out.println("DNI Cliente: " + dni);
        System.out.println("Nro de Cuenta: " + nroCuenta);
        
    }

}
