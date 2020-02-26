
package pkg24.ejerciciocondicionales6;

import javax.swing.JOptionPane;


public class EjercicioCondicionales6 {

    
    public static void main(String[] args) {
        int num1, num2;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Numero 1"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Numero 2"));
        
        if(num1%2==0 && num2%2==0){
            JOptionPane.showMessageDialog(null, "Ambos numeros son pares");
        } else {
            JOptionPane.showMessageDialog(null, "Los numeros no son pares");
        }
    }
    
}
