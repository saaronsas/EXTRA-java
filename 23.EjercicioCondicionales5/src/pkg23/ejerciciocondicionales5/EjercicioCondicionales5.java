
package pkg23.ejerciciocondicionales5;

import javax.swing.JOptionPane;


public class EjercicioCondicionales5 {

    
    public static void main(String[] args) {
        int horas;
        float salario;
        
        horas = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad de horas"));
        
        if(horas>40){
            salario = 40*16+(horas-40)+20;
        } else {
            salario = horas*16;
        }
        
        JOptionPane.showMessageDialog(null, "El salario del trabajador es de "+salario);
    }
    
}
