/*
leer 3 numeros distintos y nos diga cual es el mayor
 */
package carito;
import java.util.*;
/**
 *
 * @author PC
 */
public class ejercicio4 {
    public static void main (String []args){
        int n1;
        int n2;
        int n3;
        Scanner cap = new Scanner (System.in);
        
      System.out.println("ingresa un numero");
      n1 = cap.nextInt();
      System.out.println("ingrese un segundo numero");
      n2 = cap.nextInt();
      if (n1!=n2){
           System.out.println("ingrese un tercer numero");
           n3 = cap.nextInt();
        if (n3!= n1 && n3!=n2){
            if(n1>n2 && n1>n3){
            System.out.println("el primer numero " +n1+ " es mayor");
            }else if(n2>n1 && n2>n3){
            System.out.println("el segundo numero " +n2+ " es mayor");
            }else if (n3>n1 && n3>n2){
            System.out.println("el tercer numero " +n3+ " es mayor");
            }
        }else{
         System.out.println("los numeros deben ser distintos");
        }  
      }else{
         System.out.println("los numeros deben ser distintos");
      }      
                  
    }
}
