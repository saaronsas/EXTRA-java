
package pkg19.ejerciciocondicionales1;

import javax.swing.JOptionPane;

public class EjercicioCondicionales1 {

    
    public static void main(String[] args) {
        int num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un nuemro"));
        
        if(num%10==0){
            JOptionPane.showMessageDialog(null, "El numero es multiplo de 10");
        } else {
            JOptionPane.showMessageDialog(null, "El numero no es multiplo de 10");
        }
    }
    
}
