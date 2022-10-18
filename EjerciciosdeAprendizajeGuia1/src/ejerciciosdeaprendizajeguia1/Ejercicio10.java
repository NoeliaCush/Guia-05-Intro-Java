/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite 
números al usuario hasta que la suma de los números introducidos supere el límite inicial. 
 */
package ejerciciosdeaprendizajeguia1;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        
            Scanner leer = new Scanner(System.in);
            int limite;
            int num;
            int suma;
            suma = 0;
        
            System.out.println("Ingrese un valor límite positivo:");
            limite = leer.nextInt();
        
            do{
                        System.out.println("Ingrese un número:");
                        num = leer.nextInt();
                        suma = suma + num;
                   }while (suma<limite);
        
         }
    
}
