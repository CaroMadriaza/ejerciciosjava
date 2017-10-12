/*
Leer 10  numeros enteros. Debemos mostrarlos en el siguiente orden:
el primero, el ultimo, el segundo, el penultimo, el tercero, etc.
*/
package carito;
  import java.util.*;


    public class arreglo4 {
           public static void main (String []args){
               
              int arreglo [] = new int [10];
              Scanner entrada = new Scanner (System.in);
                
                for (int i = 0; i < 10 ; i++){
                  System.out.println("introduzca un numero: ");
                   arreglo[i] = entrada.nextInt();        
                }
                 System.out.println("los numeros ingresados son:  ");
                 
                 
                   
                     
           }
    }
    

