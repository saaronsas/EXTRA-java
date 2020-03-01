
package pkg90.ejerciciomatrices8;

import javax.swing.JOptionPane;


public class EjercicioMatrices8 {

    
    public static void main(String[] args) {
        
        int matriz[][], fil;
        
        fil = Integer.parseInt(JOptionPane.showInputDialog("Numero de Filas y Columnas"));
        
        matriz = new int[fil][fil];
        
        for(int i=0; i<fil; i++){
            for(int j=0; j<fil; j++){
                if(i==0||i==fil-1||j==0||j==fil-1||i%2==0&&j%2==0){
                    matriz[i][j]=1;
                }
            }
        }
        
        System.out.println("Mostrando Matriz");
        for(int i=0; i<fil; i++){
            System.out.println("  ");
            for(int j=0; j<fil; j++){
                System.out.print("  "+matriz[i][j]);
            }
        }
    }
    
}
