
package pkg21.ejercicioscondicionales3;

import javax.swing.JOptionPane;


public class EjerciciosCondicionales3 {

    
    public static void main(String[] args) {
        char letra;
        
        letra = JOptionPane.showInputDialog("Introduzca una letra").charAt(0);
        
        if(Character.isUpperCase(letra)){
            JOptionPane.showMessageDialog(null, "Es una letra Mayuscula");
        } else {
            JOptionPane.showMessageDialog(null, "Es una letra minuscula");
        }
    }
    
}
