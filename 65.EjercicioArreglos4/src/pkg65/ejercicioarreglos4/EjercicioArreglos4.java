
package pkg65.ejercicioarreglos4;

import javax.swing.JOptionPane;


public class EjercicioArreglos4 {

    
    public static void main(String[] args) {
        
        int[] num = new int[10];
        
        for(int i=0; i<10; i++){
            num[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero "+(i+1)));
        }
        
        for(int i=0; i<5; i++){
            System.out.println(num[i]);
            System.out.println(num[9-i]);
        }
        
    }
    
}
