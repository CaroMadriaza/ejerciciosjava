/*
pares entre el 0 y el 100
 */
package carito;
import java.util.*;

/**
 *
 * @author PC
 */
public class ejercicio7 {
    public static void main (String []args){
    
        int contador = 0;
        int resultado = 0;
        while(contador <=100){
           System.out.println(contador);
           resultado = resultado + contador;
           contador = contador + 2;
        }
    
    }
    
}
