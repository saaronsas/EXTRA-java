
package pkg49.ejerciciobucles14;

import javax.swing.JOptionPane;


public class EjercicioBucles14 {

    
    public static void main(String[] args) {
        
        float sueldo, suma=0, num=0;
        
        for(int i=0; i<10; i++){
            sueldo = Float.parseFloat(JOptionPane.showInputDialog("Introduzca el sueldo "+(i+1)));
            
            if(sueldo>1000){
                num++;
            }
            suma+=sueldo;
        }
        
        JOptionPane.showMessageDialog(null, "La suma de los sueldos es de "+suma);
        JOptionPane.showMessageDialog(null, "Los sueldos de mas de 1000$ son "+(int)num);
        
    }
    
}
