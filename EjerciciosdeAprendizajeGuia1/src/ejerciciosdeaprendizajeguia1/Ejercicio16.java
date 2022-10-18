/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al 
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el 
numero y si se encuentra repetido
 */
package ejerciciosdeaprendizajeguia1;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
                Scanner leer = new Scanner(System.in);
                int tamanio;
                int num;
            
                System.out.println("Por favor, ingrese el tamaño N del vector");
                tamanio = leer.nextInt();
            
                int vector [] = new int[tamanio];
       
                for (int i = 0; i < tamanio; i++) {
                        vector[i] = (int)(Math.random()*100); //números aleatorios hasta valor 100
                        Arrays.sort(vector); //ordena los números
                        System.out.println("["+ vector[i]+"]");
                   }
         
                System.out.println("Por favor ingrese un número que desea buscar:");
                num = leer.nextInt();
                int posiciondenum = existevector(vector, tamanio, num);
                int vecesrepite = serepite(vector, tamanio, num);
               
                
                    if(posiciondenum == -1){
                            System.out.println("El número que desea buscar no existe en el arreglo.");
                   }else{
                            System.out.println("El número se encuentra en la posicion; "+ posiciondenum);
                    }
                    
                    if(vecesrepite ==-2){
                        System.out.println("El número no se ha repetido.");
                    }else{
                        System.out.println("El número se ha repetido "+ vecesrepite+ " veces");
                    }
         }
    
    public static int existevector(int [] vector, int tamanio, int num){
            for (int i = 0; i < tamanio; i++) {
                if(vector[i] == num){
                    return i;
                }
            }
        return -1;
         }

    public static int serepite(int[] vector, int tamanio, int num){
     int contador = 0;
     int aux=vector[0];
        for (int i = 0; i < tamanio; i++) {
            if (aux == vector[i]){
                contador++;
        }else{
                aux=vector[i];
                contador=contador + 1;
                return i;
                
            }
    
    }
         return -2;
    
    }
}








