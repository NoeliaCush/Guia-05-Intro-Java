/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos 
de 2 dígitos, etcétera (hasta 5 dígitos)
 */
package ejerciciosdeaprendizajeguia1;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        
           Scanner leer = new Scanner(System.in);
                int tamanio;
                int num;
            
                System.out.println("Por favor, ingrese el tamaño N del vector");
                tamanio = leer.nextInt();
            
                int vector [] = new int[tamanio];
                int contador1 = 0;
                int contador2 = 0;
                int contador3 = 0;
                int contador4 = 0;
                int contador5 = 0;
       
                for (int i = 0; i < tamanio; i++) {
                        vector[i] = (int)(Math.random()*10000); //números aleatorios hasta valor 10000, 5 dígitos
                        Arrays.sort(vector); //ordena los números
                        System.out.println("["+ vector[i]+"]");
                        String cadena = Integer.toString(vector[i]);
                        System.out.println(vector[i]+ " tiene "+ cadena.length() +" dígitos");
      
               switch (cadena.length()) {
                   case 1:
                       contador1 = contador1+1;
                       System.out.println("La cantidad de números de un digito es: "+ contador1);
                       break;
                   case 2:
                       contador2 = contador2+1;
                       System.out.println("La cantidad de números de dos dígitos es: "+ contador2);
                       break;
                   case 3:
                       contador3= contador3+1;
                       System.out.println("La cantidad de números de tres dígitos es: "+ contador3);
                       break;
                   case 4:
                       contador4=contador4+1;
                       System.out.println("La cantidad de números de cuatro dígitos es: "+ contador4);
                       break;
                   case 5:
                       contador5=contador5+1;
                       System.out.println("La cantidad de números de cinco dígitos es: "+ contador5);
                       break;
                   default:
                       break;
               }
                            
                   }

    }
    
}
