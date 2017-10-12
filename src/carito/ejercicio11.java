/*
transformar °C a °F
 */
package carito;
import java.util.*;

/**
 *
 * @author PC
 */
public class ejercicio11 {
    public static void main (String []args){
       
        float c;
        float f;
        Scanner cap = new Scanner(System.in);
        
        System.out.println("Ingresa temperatura en grados c");
        c=cap.nextFloat();
        f=((9*c)/5)+32;
        System.out.println("los grados que ingreso equivalen a " +f+ " fahrenheit");
        
        
        
        
  }    
    
}
