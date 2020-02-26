
package pkg6.entradadatos2;

import javax.swing.JOptionPane;


public class EntradaDatos2 {

    
    public static void main(String[] args) {
    
        String cadena;
        int numero;
        double decimal;
        char letra;
        
        cadena = JOptionPane.showInputDialog("Digite una cadena");
        numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));
        letra = JOptionPane.showInputDialog("Digite una letra").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Introduzca su numero decimal"));
        
        JOptionPane.showMessageDialog(null, "La cadena es "+cadena);
        JOptionPane.showMessageDialog(null, "El numero es "+numero);
        JOptionPane.showMessageDialog(null, "El caracter es "+letra);
        JOptionPane.showMessageDialog(null, "El numero decimal es "+decimal);
    }
    
}
