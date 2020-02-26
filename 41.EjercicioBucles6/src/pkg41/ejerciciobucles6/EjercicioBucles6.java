
package pkg41.ejerciciobucles6;

import javax.swing.JOptionPane;


public class EjercicioBucles6 {

    
    public static void main(String[] args) {
        
        float num, suma=0;
        
        num=Float.parseFloat(JOptionPane.showInputDialog("Introduzca su numero"));
        
        while(num!=0){
            suma+=num;
            
            num=Float.parseFloat(JOptionPane.showInputDialog("Introduzca otro numero"));
        }
        JOptionPane.showMessageDialog(null, "La suma de todos los nuemros es "+suma);
        
    }
    
}
