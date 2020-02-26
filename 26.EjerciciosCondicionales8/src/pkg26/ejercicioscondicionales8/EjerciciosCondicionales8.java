
package pkg26.ejercicioscondicionales8;

import javax.swing.JOptionPane;


public class EjerciciosCondicionales8 {

    
    public static void main(String[] args) {
        int num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));
        
        if(num/10<10 && num/10>0){
            JOptionPane.showMessageDialog(null, "El numero tiene 2 cifras");
        }else if(num/100<10 && num/100>0){
            JOptionPane.showMessageDialog(null, "El numero tiene 3 cifras");
        }else if(num/1000<10 && num/1000>0){
            JOptionPane.showMessageDialog(null, "El numero tiene 4 cifras");
        }else if(num/10000<10 && num/10000>0){
            JOptionPane.showMessageDialog(null, "El numero tiene 5 cifras");
        }else{
            JOptionPane.showMessageDialog(null, "El numero tiene 1 cifra");
        }
    }
    
}
