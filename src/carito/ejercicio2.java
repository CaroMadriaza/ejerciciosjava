/*
ingreso de notas
 */
package carito;
import java.util.*;

/**
 *
 * @author PC
 */
public class ejercicio2 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int calificacion;
          System.out.println("Ingrese su calificacion");
         calificacion = entrada.nextInt();
          if(calificacion<4){   
              System.out.println("reprobado");
         }else{
              System.out.println("aprobado");
  }
 }
}    
