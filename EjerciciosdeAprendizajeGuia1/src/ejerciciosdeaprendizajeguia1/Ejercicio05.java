/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el 
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
package ejerciciosdeaprendizajeguia1;

import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {
  
            Scanner leer = new Scanner(System.in);
            int num;
            
            System.out.println("Ingrese un número:");
            num = leer.nextInt();
        
            System.out.println("El doble del num "+ num+ " es: " + (num*2));
            System.out.println("El triple del num " + num+ " es: " + (num*3));
            System.out.println("La raíz cuadrada del num "+ num+ " es: " + Math.sqrt(num));
                   
         }
   
}
