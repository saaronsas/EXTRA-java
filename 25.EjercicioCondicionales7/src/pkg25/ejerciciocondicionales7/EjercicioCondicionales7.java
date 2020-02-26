
package pkg25.ejerciciocondicionales7;

import javax.swing.JOptionPane;


public class EjercicioCondicionales7 {

    
    public static void main(String[] args) {
        int num1, num2, num3;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Numero 1"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Numero 2"));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Numero 3"));
        
        if(num1>num2 && num2>num3){
            JOptionPane.showMessageDialog(null, "Orden: "+num1+">"+num2+">"+num3);
        } else if (num1>num2 && num2<num3){
            JOptionPane.showMessageDialog(null, "Orden: "+num1+">"+num3+">"+num2);
        } else if(num1<num2 && num1>num3){
            JOptionPane.showMessageDialog(null, "Orden: "+num2+">"+num1+">"+num3);
        } else if(num1<num3 && num2>num3){
            JOptionPane.showMessageDialog(null, "Orden: "+num1+">"+num2+">"+num3);
        } else if(num1>num2 && num2>num3){
            JOptionPane.showMessageDialog(null, "Orden: "+num3+">"+num2+">"+num1);
        } else if(num3>num1 && num1>num2){
            JOptionPane.showMessageDialog(null, "Orden: "+num3+">"+num1+">"+num2);
        } else {  
            JOptionPane.showMessageDialog(null, "Orden: "+num3+">"+num2+">"+num1);
        }
        
   
        
    }
    
}
