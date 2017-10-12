/*
 leer dos numeros y que nos diga si son iguales o cual es mayor
 */
package carito;
import java.util.*;

/**
 *
 * @author PC
 */
public class ejercicio3B {
    public static void main(String []args){
        int n1;
        int n2;
        Scanner cap = new Scanner(System.in);
        System.out.println("ingresa el primer numero");
        n1 = cap.nextInt();
        System.out.println("ingresa segundo numero");
        n2 = cap.nextInt();
      if(n1==n2){
          System.out.println("ambos numeros son iguales");
      }else if (n1>n2){
          System.out.println(n1+ "es mayor que" +n2);
      }else{
          System.out.println(n1+ "es menor que" +n2);
      }  
    }
    
}
