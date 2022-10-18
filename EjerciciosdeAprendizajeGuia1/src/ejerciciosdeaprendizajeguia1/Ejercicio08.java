/*
Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el 
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por 
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. 
Nota: investigar la función Lenght() en Java.
 */
package ejerciciosdeaprendizajeguia1;

import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {
       
              Scanner leer = new Scanner(System.in);
              String frase;
              int lenght;
              
              System.out.println("Por favor, ingrese una frase o palabra que tenga 8 caracteres de largo:");
              frase = leer.nextLine();
              lenght = frase.length();
      
                    if (lenght==8){
                        System.out.println("CORRECTO");
                   }else {
                         System.out.println("INCORRECTO");
                   }     
         }
    
}
