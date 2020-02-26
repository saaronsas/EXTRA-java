
package pkg47.ejerciciobucles12;

import javax.swing.JOptionPane;


public class EjercicioBucles12 {

    
    public static void main(String[] args) {
        
        int num;
        long pro=1;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca su numero"));
        
        for(int i=1; i<=num; i++){
            pro*=i;
        }
        JOptionPane.showMessageDialog(null, "El factorial de "+num+" es "+pro);
    }
    
}
