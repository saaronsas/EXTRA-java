
package pkg43.ejerciciobucles8;

import javax.swing.JOptionPane;


public class EjercicioBucles8 {

    
    public static void main(String[] args) {
        
        int num;
        
        num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));
        
        for(int i=1; i<=num; i++){
            JOptionPane.showMessageDialog(null, i);
        }
        
    }
    
}
