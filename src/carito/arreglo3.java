/*
Leer 5 numeros por teclado y a continuacion realizar la media de los numeros positivos,
la media de los negativos y contar el numero de ceros.
 */
package carito;
import java.util.*;

/**
 *
 * @author PC
 */
   public class arreglo3 {
      public static void main (String []args){
          int arreglo [] = new int [5];
          float sump = 0;
          int conp=0;
          float prp=0;
          float sumn=0;
          int conn=0;
          float prn=0;
          int con=0;
          
                    
          Scanner entrada = new Scanner (System.in);
          
          for (int i = 0; i < 5 ; i++){
             System.out.println("introduzca un numero: ");
             arreglo[i] = entrada.nextInt(); 
                                       
             }
            
          for(int i = 0; i < 5 ; i++){
              if(arreglo[i]>0){
                  sump = arreglo[i]+sump;
                  conp=conp+1; // conp++
              }
            }
              prp=sump/conp;
            
          for(int i = 0; i < 5 ; i++){
              if(arreglo[i]<0){
                  sumn = arreglo[i]+sumn;
                  conn=conn+1; // conp++
              }
          }
            prn=sumn/conn;
            
          for(int i = 0; i < 5 ; i++){
              if(arreglo[i]==0){
                  con=con+1; // conp++
              }  
          }
          
          
           System.out.println("la media de los numeros positivos es: " +prp);
            System.out.println("la media de los numeros negativos es: " +prn);
             System.out.println("la cantidad de numeros cero que ingreso es: " +con);
           
         
    
    
          
    }
    
}
