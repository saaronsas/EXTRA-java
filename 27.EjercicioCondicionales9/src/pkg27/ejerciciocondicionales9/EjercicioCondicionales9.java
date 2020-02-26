
package pkg27.ejerciciocondicionales9;

import javax.swing.JOptionPane;


public class EjercicioCondicionales9 {

    
    public static void main(String[] args) {
        int dia, mes, año;
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el dia"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el mes"));
        año = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el año"));
        
        if(dia>=1 && dia<=30){
            if(mes>=1 && mes<=12){
                if(año!=0){
                    JOptionPane.showMessageDialog(null, "Fecha correcta >> "+dia+"-"+mes+"-"+año);
                }else{
                    JOptionPane.showMessageDialog(null, "La fecha es incorrecta (año)");
                }
            }else{
                JOptionPane.showMessageDialog(null, "La fecha es incorrecta (mes) ");
            }
        } else {
            JOptionPane.showMessageDialog(null, "La fecha es incorrecta (dias)");
        }
    }
    
}
