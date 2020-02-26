
package pkg66.ejercicioarreglos5;

import javax.swing.JOptionPane;


public class EjercicioArreglos5 {

    
    public static void main(String[] args) {
        
        int[] F = new int[10];
        int[] A = new int[5];
        int[] B = new int[5];
        
        for(int i=0; i<5; i++){
            A[i]=Integer.parseInt(JOptionPane.showInputDialog("Numero "+(i+1)+" A"));
        }
        for(int i=0; i<5; i++){
            B[i]=Integer.parseInt(JOptionPane.showInputDialog("Numero "+(i+1)+" B"));
        }
        
        int j=0;
        for(int i=0; i<10; i+=2){
            
            F[i]=A[j];
            F[i+1]=B[j];
            j++;
        }
        for(int i: F){
            System.out.print(i+" ");
        }
        
    }
    
}
