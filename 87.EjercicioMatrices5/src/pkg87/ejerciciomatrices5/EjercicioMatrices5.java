
package pkg87.ejerciciomatrices5;

import java.util.Scanner;


public class EjercicioMatrices5 {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int matriz[][]=new int[3][3], filas[]=new int[3], columnas[]=new int[3];
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print("Matriz["+(i+1)+"]["+(j+1)+"]: "); matriz[i][j]=in.nextInt();
            }
        }
        
        System.out.println("La matriz...");
        for(int i=0; i<3; i++){
            System.out.println("  ");
            for(int j=0; j<3; j++){
                System.out.print("  "+matriz[i][j]);
            }
        }
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                filas[i]+=matriz[i][j];
            }
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                columnas[i]+=matriz[j][i];
            }
        }
        System.out.println("\n");
        for(int i=0; i<3; i++){
            System.out.println("Suma Fila "+(i+1)+" = "+filas[i]);
        }
        System.out.println("\n");
        for(int i=0; i<3; i++){
            System.out.println("Suma Columna "+(i+1)+" = "+columnas[i]);
        }
    }
    
}
