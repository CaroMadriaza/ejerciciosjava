/*
pedir por teclado3 numeros y si el primero es negativo, arrojar la multiplicacion 
de los 3, sino, la suma
 */
package carito;
import java.util.*;

/**
 *
 * @author PC
 */
public class ejercico3 {
    public static void main (String[] args){
        float n1;
        float n2;
        float n3;
        float operacion;
        Scanner cap = new Scanner (System.in);
        
      System.out.println("ingresa el primer numero");
      n1=cap.nextFloat();
      System.out.println("ingresa el segundo numero");
      n2=cap.nextFloat();
      System.out.println("ingresa el tercero numero");
      n3=cap.nextFloat();
    if(n1<0){
        operacion = n1*n2*n3;
        System.out.println("el producto de los numeros es" +operacion);    
    }else{
        operacion = n1+n2+n3;
        System.out.println("la suma de los numeros es" +operacion);
         } 
    }
}   
