/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la 
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene 
cambiando sus filas por columnas (o viceversa).
 */
package ejerciciosdeaprendizajeguia1;

public class Ejercicio18 {

    public static void main(String[] args) {
                    int matriz[][] = new int [4][4]; //Dimensión 4x4 de matriz
                    int matrizT[][] = new int [4][4]; //Dimensión 4x4 matriz Transpuesta

                    //Rellenar matriz principal con valores aleatorios
                    for (int i = 0; i < 4; i++) {
                            for (int j = 0; j < 4; j++) {
                                matriz[i][j] = (int) (Math.random()*10);
                            }
                   }
            
                    //Mostramos la matriz principal
                    System.out.println("La matriz principal queda de la siguiente manera: ");
                    for (int i = 0; i < 4; i++) {
                            for (int j = 0; j < 4; j++) {
                                System.out.print("[" + matriz[i][j] + "]");
                            }
                                System.out.println(" ");
                    }
    
                    //Matriz transpuesta: invierte las columnas y filas de la matriz principal
                    for (int i = 0; i < 4; i++) {
                             for (int j = 0; j < 4; j++) {
                             matrizT[i][j] = matriz[j][i];
                            }
                   }
                    
                   System.out.println("La matríz transpuesta queda de la siguiente manera: ");
                   for (int i = 0; i < 4; i++) {
                             for (int j = 0; j < 4; j++) {
                                 System.out.print("[" + matrizT[i][j] + "]");
                            }
                             System.out.println(" ");
                   }

         }
        
}
            
        

    
    
    
   
    

