
package pkg83.ejerciciomatrices1;

import java.util.Scanner;


public class EjercicioMatrices1 {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int matriz[][], nf, nc;
        boolean simetrica=true;
        
        System.out.print("Introduzca el numero de Filas: "); nf=in.nextInt();
        System.out.print("Introduzca el numero de Columnas: "); nc=in.nextInt();
        
        matriz = new int[nf][nc];
        
        for(int i=0; i<nf; i++){
            for(int j=0; j<nc; j++){
                System.out.print("Matriz ["+i+"]["+j+"]: "); matriz[i][j]=in.nextInt();
            }
        }
        if(nf==nc){
            for(int i=0; i<nf; i++){
                for(int j=0; j<nc; j++){
                    if(matriz[i][j]!=matriz[j][i]){
                        simetrica=false;
                    }
                }
            }
        }else{
            simetrica=false;
        }
        
        
        System.out.println("\n");
        if(simetrica==false){
            System.out.println("La matriz no es siemtrica...");
        }else{
            for(int i=0; i<nf; i++){
                System.out.println("  ");
                for(int j=0; j<nc; j++){
                    System.out.print(matriz[i][j]+"  ");
                }
            }
            System.out.println("La matriz es simetrica...");
        }
    }
    
}
