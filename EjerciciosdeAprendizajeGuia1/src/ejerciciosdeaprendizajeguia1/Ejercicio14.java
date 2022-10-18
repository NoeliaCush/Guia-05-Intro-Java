/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros 
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La 
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será 
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio 
(void).
El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €
 */
package ejerciciosdeaprendizajeguia1;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
                Scanner leer = new Scanner(System.in);
                double euro;
                int opcion;
                
                System.out.println("Por favor, ingrese una cantidad de euros:");
                euro = leer.nextDouble();
                System.out.println("Usted ha ingresado " + euro + "€");
         
                System.out.println("Por favor, seleccione el tipo de divisa a la que desea convertir");
                System.out.println("1. Libra esterlina £ ");
                System.out.println("2. Pesos $");
                System.out.println("3. Yenes ¥");
                opcion = leer.nextInt();
                
                
                switch (opcion){
                    case 1:
                            double divi1 = conversion1(euro);
                            System.out.println("La conversión de euro a libra esterlina es " +divi1 + " £");
                        
                    case 2:
                            double divi2 = conversion2(euro);
                            System.out.println("La conversión de euro a peso es " +divi2+ " $" );
                        
                    case 3:
                            double divi3 = conversion3(euro);
                            System.out.println("La conversión de euro a yenes es " +divi3+ " ¥" );
                }
         }
    
    public static double conversion1 (double euro){
        double conver1;
        conver1 = (euro *0.86);
        return conver1;
    }
    
    public static double conversion2 (double euro){
        double conver2;
        conver2 = (euro* 1.28611);
        return conver2;
    }
    
    public static double conversion3 (double euro){
        double conver3;
        conver3 = (euro *129.852);
        return conver3;
    }
    
}
