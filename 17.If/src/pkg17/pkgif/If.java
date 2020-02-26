
package pkg17.pkgif;

import javax.swing.JOptionPane;


public class If {

    
    public static void main(String[] args) {
        
        int numero, dato=5;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca su nuemro"));
        
        if(numero==dato){
            JOptionPane.showMessageDialog(null, "El numero es 5");  
        } 
        else {
            JOptionPane.showMessageDialog(null, "El numero es distinto de 5");
        }
    }
}
