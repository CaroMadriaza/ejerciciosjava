/*
leer 5 numeros y mostrarlos en el mismo orden introducido
 */
package carito;
import java.util.*;

/**
 *
 * @author PC
 */
public class arreglo2 {
    public static void main(String[]args){
    
      /*int arreglo[];
       arreglo = new int [5]; es lo mismo que: */
       int arreglo [] = new int [5];
        Scanner entrada = new Scanner (System.in);
    
         /*este bucle solo almacena los elementos del usuario en mi arreglo*/
    
         for (int i = 0; i < 5 ; i++){
             System.out.println("introduzca un numero: ");
             arreglo[i] = entrada.nextInt();        
            }
         
         System.out.println("los numeros ingresados son:  ");
         
         for(int i = 0; i < 5; i++){
             System.out.println(arreglo[i]);
            }
    
   }
    
}
