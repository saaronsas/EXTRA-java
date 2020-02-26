
package pkg38.ejercicobucles3;

import javax.swing.JOptionPane;


public class EjercicoBucles3 {

    
    public static void main(String[] args) {
        
        int num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));
        
        while(num!=0){
            if(num%2==0){
                JOptionPane.showMessageDialog(null, "El numero "+num+" es par");
            } else {
                JOptionPane.showMessageDialog(null, "El nuemro "+num+" es impar");
            }
            num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca otro numero"));
        }
        
    }
    
}
