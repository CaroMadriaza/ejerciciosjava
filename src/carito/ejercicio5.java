/*
mostrar impares del 1 al 100 y mostrar cuantos impares son.
 */
package carito;
import java.util.*;

/**
 *
 * @author PC
 */
public class ejercicio5 {
public static void main (String []args){
 
 int num = 1;
 int contador = 0;
 
 for(int x=1; num<=100; x++){
     System.out.println(num);
     num=num+2;
     contador=contador+1;
 }
    System.out.println("el total de impares son: " +contador);
 
 
 }
    
}
