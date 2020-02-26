
package pkg51.ejerciciobucles16;

import javax.swing.JOptionPane;


public class EjercicioBucles16 {

    
    public static void main(String[] args) {
        
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un nuemro entre (0-10)"));
        
        for(int i=1; i<11; i++){
            System.out.println(numero*i);
        }
        
    }
    
}
