
package pkg62.ejercicioarreglos2;

import javax.swing.JOptionPane;


public class EjercicioArreglos2 {

    
    public static void main(String[] args) {
        
        int[] numeros = new int[5];
        
        for(int i=0; i<5; i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero "+(i+1)));
        }
        for(int i=4; i>=0; i--){
            System.out.println(numeros[i]);
        }
    }
    
}
