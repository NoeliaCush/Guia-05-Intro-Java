/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los 
dos. El programa deberá después mostrar el resultado de la suma
 */
package ejerciciosdeaprendizajeguia1;

import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
       
            Scanner leer = new Scanner(System.in);
            int num1;
            int num2;
            
            System.out.print("Ingrese un valor para num1 y num2");
            num1 = leer.nextInt();
            num2 = leer.nextInt();
            
             int retorno = sumar(num1, num2);
          
            System.out.print("La suma entre los números " + num1 + " y " + num2+ " es: "+ retorno);
            
         }
    
    public static int sumar(int num1, int num2){
            
            int suma;
            suma = num1 + num2;
            return suma;
            
         }
}
