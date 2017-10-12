/*
 leer nombre de persona , mostrar por pantalla, luego leer radio de circunferencia
(double) y mostrar longitud, ademas leer entero y mostrar su cuadrado
 */
package carito;
import java.util.*;

/**
 *
 * @author PC
 */
public class ejercicio10 {
    public static void main (String []args){
     String nombre;
     double radio;
     double longitud;
     int numero;
     double cuadrado;
     
     Scanner cap = new Scanner(System.in);
     
     System.out.println("ingrese nombre");
     nombre=cap.nextLine();
     System.out.println("su nombre es " +nombre);
     
     
     System.out.println("ingrese radio de la circunferencia");
     radio=cap.nextDouble();
     longitud= 2*Math.PI*radio;
     System.out.println("La longitud de la circunferencia es " +longitud );
      
     System.out.println("ingrese numero entero");
     numero=cap.nextInt();
     cuadrado= Math.pow(numero,2);
     System.out.println("El cuadrado de " +numero+ " es:" +cuadrado);
        
    
    }
    
}
