
package pkg29.ejerciciocondicionales11;

import javax.swing.JOptionPane;


public class EjercicioCondicionales11 {

    
    public static void main(String[] args) {
        
        char var;
        int a, b; float suma, resta, multiplicacion, division;
        
        
        var = JOptionPane.showInputDialog("Introduzca una de estas opciones...\nS->Suma\nR->Resta\nM->Multiplicacion\nD->Division").charAt(0);
        
        a = Integer.parseInt(JOptionPane.showInputDialog("a"));
        b = Integer.parseInt(JOptionPane.showInputDialog("b"));
        
        switch(var){
            case 'S':
            case 's':
                suma = a+b;       
                JOptionPane.showMessageDialog(null, a+" + "+b+" = "+suma);
                break;
            case 'R':
            case 'r':
                resta=a-b;
                JOptionPane.showMessageDialog(null, a+" - "+b+" = "+resta);
                break;
            case 'M':
            case 'm':
                multiplicacion=a*b;
                JOptionPane.showMessageDialog(null, a+" * "+b+" = "+multiplicacion);
                break;
            case 'D':
            case 'd':
                division=a/b;
                JOptionPane.showMessageDialog(null, a+" / "+b+" = "+division);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error se equivoco de operacion");
        }
    }
    
}
