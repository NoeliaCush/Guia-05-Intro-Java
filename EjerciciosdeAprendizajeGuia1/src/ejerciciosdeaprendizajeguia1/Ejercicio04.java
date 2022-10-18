/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados 
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package ejerciciosdeaprendizajeguia1;

import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {
        
             Scanner leer = new Scanner(System.in);
             
             double cent;
             System.out.println("Ingrese una cantidad de grados centígrados:");
             cent = leer.nextDouble();
             
             double resultado = equivalencia(cent);
             System.out.println("El equivalente en grados Fahrenheit es: " + resultado + " F" );
        
         }
    
    public static double equivalencia(double cent){
        
             double fahren;
        
             fahren  = 32 + (9* (cent/5));
        
             return fahren;
        
         }
    
}
