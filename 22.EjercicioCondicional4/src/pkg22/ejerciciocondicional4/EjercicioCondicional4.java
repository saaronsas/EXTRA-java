
package pkg22.ejerciciocondicional4;

import javax.swing.JOptionPane;


public class EjercicioCondicional4 {

    
    public static void main(String[] args) {
        int compra;
        
        compra = Integer.parseInt(JOptionPane.showInputDialog("Introduzca una cantidad de dinero"));
        
        if(compra>300){
            compra -=compra*0.2;
        }
        
        JOptionPane.showMessageDialog(null, "El valo de la compra sale por "+compra);
    }
    
}
