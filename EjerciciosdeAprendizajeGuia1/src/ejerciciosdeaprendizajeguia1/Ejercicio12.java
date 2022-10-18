/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de 
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato 
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser 
X y el último tiene que ser una O. 
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia 
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta 
de FDE, que no respete el formato se considera incorrecta. 
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e 
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las 
siguientes funciones de Java Substring(), Length(), equals().
 */
package ejerciciosdeaprendizajeguia1;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
      
            String cadena; 
            int sum1;
            int sum2;
            sum1 = 0;
            sum2 = 0;
            
            
            System.out.println("Por favor, ingrese una cadena:");
            cadena = leer.nextLine();
            cadena = cadena.toUpperCase();
        
            while (cadena.length() > 5) {
                        System.out.println(" ERROR; la cadena supera los 5 caracteres.");
                        System.out.println("Por favor, ingrese una cadena nuevamente:");
                        cadena = leer.nextLine();
                        cadena = cadena.toUpperCase();
                   }

             while (cadena.length() == 5) {
                        if (cadena.equals("&&&&&") == true) {
                                System.out.println("Usted ha salido del programa.");
                                break;
                            }
                        
                            if (cadena.substring(0, 1).equalsIgnoreCase("X") && cadena.substring(cadena.length() - 1, cadena.length() ).equalsIgnoreCase("O")) {
                                        sum1 += 1;
                                      } else  {
                                            sum2 += 1;
                                                } 
            
                                       if (cadena.equals("&&&&&") == true) {
                                                    break;
                                                }
            
                                       System.out.println(" Ingrese la cadena ");
                                       cadena = leer.nextLine();
                                       cadena = cadena.toUpperCase();
                                       while (cadena.length() > 5) {
                                                System.out.println(" ERROR. La cadena supera los cinco caracteres");
                                                System.out.println("Por favor, ingrese una cadena nuevamente ");
                                                cadena = leer.nextLine();
                                                cadena= cadena.toUpperCase();
                                      }
                   }
        
                   if (sum1 == 0 && sum2 == 0) {
                            System.out.println(" No hay una lectura de las cadenas ingresadas ");
                   } else {
                                System.out.println("El total de lecturas de las cadenas ingresadas que son COORECTAS es de: " + sum1);
                                System.out.println("El total de lecturas de cadenas ingresadas que son INCORRECTAS es de:  " + sum2);
                   }
          }
}
