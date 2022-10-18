/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por 
pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla 
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5. 
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa 
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que 
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del 
programa, caso contrario se vuelve a mostrar el menú.
 */
package ejerciciosdeaprendizajeguia1;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
       
                Scanner leer = new Scanner(System.in);
                double num;
                double num2;
                int opcion;
                double suma;
                double resta;
                double multi;
                double divi;
                String rta;
                
        
                System.out.println("Por favor, ingrese los valores para los números 1 y 2:");
                num = leer.nextDouble();
                num2 = leer.nextDouble();
     
              
                do{
                        System.out.println("MENU");
                        System.out.println("1. Sumar");
                        System.out.println("2. Restar");
                        System.out.println("3. Multiplicar");
                        System.out.println("4. Dividir");
                        System.out.println("5. Salir");
                        System.out.println("Por favor, ingrese una de las opciones del menu");
                        opcion = leer.nextInt();
                        
                        switch (opcion){
                            case 1:
                                suma = num + num2;
                                System.out.println("La suma entre los números "+ num+ " y "+num2+" es: " + suma);
                                continue;
                                
                            case 2:
                                resta = num - num2;
                                System.out.println("La resta entre los números "+ num+ " y "+num2+" es: " + resta);
                                continue;
                             
                            case 3: 
                                multi = num * num2;
                                System.out.println("La multiplicación entre los números " + num+ " y "+num2+" es: " + multi);
                                continue;
                             
                            case 4:
                                divi = num / num2;
                                System.out.println("La divición entre los números " + num+ " y "+num2+" es: " + divi);
                                continue;
                            
                            case 5:
                                System.out.println("¿Está seguro que quiere salir del programa? (S/N)");
                                rta = leer.next();
                                rta = rta.toUpperCase();
                                if (rta.equals('S')) {
                                    break;
                                }else  {
                                    opcion = 0;
                                }
                         
                            }
            
                   }while (opcion!=5);
                
         }
    
}
