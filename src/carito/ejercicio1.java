/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carito;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int edad = 0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("ingresa tu edad:");
        edad = entrada.nextInt();
        
        if (edad>=18){
         System.out.println("eres mayor de edad");
        }else{
         System.out.println("lo siento, no eres mayor de edad");
        }
        
        
                              
    }
    
}

