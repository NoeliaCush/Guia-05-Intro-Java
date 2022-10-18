/*
Crear un programa que dado un numero determine si es par o impar.
 */
package ejerciciosdeaprendizajeguia1;

import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {
        
             Scanner leer = new Scanner(System.in);
             int num;
             System.out.println("Ingrese un número:");
             num = leer.nextInt();
             
             if (num%2 == 0){
                 System.out.println("El número es par.");
             }else {
                 System.out.println("El número es impar.");
              }
        
         }
    
}
