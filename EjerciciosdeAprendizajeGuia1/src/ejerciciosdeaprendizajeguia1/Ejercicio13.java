/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el 
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * * 
*       *
*       *
* * * *

 */
package ejerciciosdeaprendizajeguia1;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
       
            Scanner leer = new Scanner(System.in);
            int fila;
            int columna;
            System.out.println("Por favor, ingrese la cantidad de filas:");
            fila = leer.nextInt();
            System.out.println("Por favor, ingrese la cantidad de columnas:");
            columna = leer.nextInt();
            
          for (int i = 0; i < fila; i++) {
                      System.out.print(" * ");  
         }
             System.out.println("");
          
          for (int i = 0; i < fila -2 ; i++) {
                      System.out.print(" * ");
                      for (int j = 0; j < columna-2; j++) {
                          System.out.print("   ");
                      }
            System.out.println(" * ");   
         }
   
         for (int i = 0; i < fila; i++) {
             System.out.print(" * ");
        }

    }
    
}
    

    
        
