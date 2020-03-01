
package pkg85.ejerciciomatrices3;

import java.util.Scanner;


public class EjercicioMatrices3 {

    
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       
       int matriz[][]=new int[3][3];
       
        System.out.println("MATRIZ 1\n");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print("Matriz ["+(i+1)+"]["+(j+1)+"]: "); matriz[i][j]=in.nextInt();
            }
        }
        
        System.out.println("\nMatriz original");
        for(int i=0; i<3; i++){
            System.out.println("  ");
            for(int j=0; j<3; j++){
                System.out.print(matriz[i][j]+"  ");
            }
        }
        
        int aux;
        for(int i=0; i<3; i++){
            for(int j=0; j<i; j++){
                aux=matriz[i][j];
                matriz[i][j]=matriz[j][i];
                matriz[j][i]=aux;
            }
        }
        
        System.out.println("\nMatriz transpuesta");
        for(int i=0; i<3; i++){
            System.out.println("  ");
            for(int j=0; j<3; j++){
                System.out.print(matriz[i][j]+"  ");
            }
        }
    }
    
}
