
package pkg20.ejerciciocondicionales2;

import javax.swing.JOptionPane;


public class EjercicioCondicionales2 {

    
    public static void main(String[] args) {
        int num1, num2;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Numero 1"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Numero 2"));
        
        if(num1<num2){
            JOptionPane.showMessageDialog(null, "El numero 1 es menor que el nuemro 2");
        } else if (num1>num2){
            JOptionPane.showMessageDialog(null, "El numero 1 es mayor que el nuemro 2");
        } else {
            JOptionPane.showMessageDialog(null, "Los numeros son iguales");
        }
        
    }
    
}
