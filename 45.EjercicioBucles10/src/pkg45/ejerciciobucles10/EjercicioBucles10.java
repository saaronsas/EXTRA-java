
package pkg45.ejerciciobucles10;

import javax.swing.JOptionPane;


public class EjercicioBucles10 {

    
    public static void main(String[] args) {
        
        float suma=0, num;
        
        for(int i=0; i<10; i++){
            num=Float.parseFloat(JOptionPane.showInputDialog("Introduzca el numero -> "+(i+1)));
            suma+=num;
        }
        JOptionPane.showMessageDialog(null, "La suma de los 10 numeros da "+suma);
        
    }
    
}
