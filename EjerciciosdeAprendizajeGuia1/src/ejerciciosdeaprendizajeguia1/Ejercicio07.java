/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa 
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar 
la función equals() en Java.
 */
package ejerciciosdeaprendizajeguia1;

import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {

            Scanner leer = new Scanner(System.in);
            
            String frase;
            System.out.println("Por favor ingrese una frase:");
            
            frase = leer.nextLine();
            frase = frase.toUpperCase();
            
            if (frase.equals("EUREKA")){
                System.out.println("CORRECTO");
            }else {
                System.out.println("INCORRECTO");
         }        
        
    }
    
}
