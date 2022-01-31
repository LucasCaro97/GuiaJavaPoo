/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para crear el
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo. Por último, tendremos un método que dibujará el
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.

 */
package Ejercicio4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author 54375
 */
public class Rectangulo {
    
    private int base;
    private int altura;
            
    
    public Rectangulo(){
    
        
    }
    
    public Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    /**
     * @return the base
     */
    public int getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(int base) {
        this.base = base;
    }

    /**
     * @return the altura
     */
    public int getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
   public void crearRectangulo(){
       Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
       System.out.println("Ingrese la altura el rectangulo: ");
       altura = entrada.nextInt();
       System.out.println("Ingrese la base del rectangulo: ");
       base = entrada.nextInt();
   
   } 
    
   public void calcularPerimetro(){
       System.out.println("El perimetro del rectangulo es: " +  (base + altura)  * 2);
   }
   
   public void calcularSuperficie(){
       System.out.println("El perimetro del rectangulo es: " +  base * altura );
   }
   
   public void mostrarRectangulo(){
       for (int i = 0; i < altura - 1 ; i++) {
           for (int j = 0; j < base - 1; j++) {
               System.out.print(" * ");
           }
           System.out.println("");
       }
       
   }

}
