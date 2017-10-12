/*
leer numero y decir si es par o impar
 */
package carito;
import java.util.*;

/**
 *
 * @author PC
 */
public class ejercicio5B {
     public static void main (String []args){
     int num;
     Scanner cap = new Scanner(System.in);
     System.out.println("ingresa un numero");
     num = cap.nextInt();
       if (num %2 == 0){
          System.out.println("el numero " +num+  " es par");
        }else{
          System.out.println("el numero " +num+  " es impar");
          
       }
     
     }
    
}
