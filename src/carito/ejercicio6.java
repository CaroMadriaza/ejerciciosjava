/*
sumar numeros del 1 al 100
 */
package carito;
import java.util.*;

/**
 *
 * @author PC
 */
public class ejercicio6 {
    public static void main (String []args){
    
     int num = 1;
     int suma = 0;
    while(num<=100){
       suma  = suma +num;
       num++;    
    } 
      System.out.println("la suma del 1 al 100 es "  +suma);
   }
    
}
