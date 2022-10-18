/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una 
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de 
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se 
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package ejerciciosdeaprendizajeguia1;

import java.util.Scanner;

public class Ejercicio19{

    public static void main(String[] args) {
    
     Scanner leer = new Scanner(System.in);
    
    int matriz[][] = new int[3][3];
    int valoresMatriz;
    int matrizT[][] = new int[3][3];
    
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
            System.out.println("Por favor, ingrese los valores de su matriz.");
            valoresMatriz = leer.nextInt();
             System.out.print("[ " + matriz[i][j] + " ]");
            }
            System.out.println(" ");
        }
        
      
    
    
    
    
      
            
	
}
}

