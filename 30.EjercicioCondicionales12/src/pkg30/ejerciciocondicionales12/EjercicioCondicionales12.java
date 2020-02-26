
package pkg30.ejerciciocondicionales12;

import javax.swing.JOptionPane;


public class EjercicioCondicionales12 {

    
    public static void main(String[] args) {
        
        float nota; int not;
        
        nota = Float.parseFloat(JOptionPane.showInputDialog("Introduzc su nota..."));
        not = Math.round(nota);
        
        switch(not){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                JOptionPane.showMessageDialog(null, "El alumno a sacado un "+not+"->Insuficiente");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "El alumno a sacado un "+not+"->Suficiente");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "El alumno a sacado un "+not+"->Bien");
                break;
            case 7:
            case 8:
                JOptionPane.showMessageDialog(null, "El alumno a sacado un "+not+"->Notable");
                break;
            case 9:
            case 10:
                JOptionPane.showMessageDialog(null, "El alumno a sacado un "+not+"->Sobresaliente");
                break;
            default:
                JOptionPane.showMessageDialog(null, "La nota no esta en el rango de (0-10)");
                break;
            
            
        }
        
        
    }
    
}
