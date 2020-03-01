
package pkg84.ejerciciomatrices2;

import java.util.Scanner;


public class EjercicioMatrices2 {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int matriz1[][]=new int[3][3], matriz2[][]=new int[3][3], suma[][]=new int[3][3];
        
        System.out.println("**MATRIZ 1**");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print("Matriz1 ["+i+"]["+j+"]: "); matriz1[i][j]=in.nextInt();
            }
        }
        System.out.println("**MATRIZ 2**");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print("Matriz2 ["+i+"]["+j+"]: "); matriz2[i][j]=in.nextInt();
            }
        }
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                suma[i][j]=matriz1[i][j]+matriz2[i][j];
            }
        }
    
        for(int i=0; i<3; i++){
            System.out.println("  ");
            for(int j=0; j<3; j++){
                System.out.print(suma[i][j]+"  ");
            }
        }
    }
    
}
