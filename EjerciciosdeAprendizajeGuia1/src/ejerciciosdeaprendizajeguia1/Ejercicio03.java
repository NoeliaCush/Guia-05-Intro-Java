/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda 
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package ejerciciosdeaprendizajeguia1;

import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
        
            Scanner leer = new Scanner(System.in);
           
            String cadena; 
            System.out.println("Ingrese una frase:");
            cadena = leer.nextLine();
            
            String mayus = cadena.toUpperCase();
            String minus = cadena.toLowerCase();
            
            System.out.println("La frase en minísculas quedaría: " + minus+ " y en mayúsculas como: "+ mayus);
            
            
        
         }
    
}
