
package pkg36.ejerciciobucles1;

import javax.swing.JOptionPane;


public class EjercicioBucles1 {

    
    public static void main(String[] args) {
        
        int num, cua;
        
        num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un nuemro"));
        
        while(num>=0){
            cua = (int)Math.pow(num, 2);
            JOptionPane.showMessageDialog(null, "El cuadrado de "+num+" = "+cua);
            num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un nuemro"));
        }
        
    }
    
}
