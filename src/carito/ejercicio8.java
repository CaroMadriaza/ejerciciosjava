/*
leer numero y decir si es multiplo de 10
 */
package carito;
import java.util.*;
/**
 *
 * @author PC
 */
public class ejercicio8 {
   public static void main (String[] args){
   
       int numero;
       Scanner cap = new Scanner (System.in);
        System.out.println ("ingrese un numero");
        numero = cap.nextInt();
        if (numero %10==0){
        System.out.println("el numero " + numero + " es multiplo de 10");
        }else{
         System.out.println("el numero " + numero + " no es multiplo de 10");
        }
    }
   } 

