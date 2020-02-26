
package pkg46.ejerciciobucles11;

import javax.swing.JOptionPane;


public class EjercicioBucles11 {

    
    public static void main(String[] args) {
        
        long pro=1;
        float num;
        
        for(int i=1; i<=20; i+=2){
            pro*=i;
        }
        JOptionPane.showMessageDialog(null, "El producto de los numeros impares es "+pro);
        
    }
    
}
