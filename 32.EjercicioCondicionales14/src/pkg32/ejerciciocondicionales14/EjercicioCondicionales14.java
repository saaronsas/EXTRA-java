
package pkg32.ejerciciocondicionales14;

import javax.swing.JOptionPane;


public class EjercicioCondicionales14 {

    
    public static void main(String[] args) {
        
        float kg, nueva;
        int opc;
        
        opc = Integer.parseInt(JOptionPane.showInputDialog("TRANSFORMANDO EL PESO\n\n"
                + "1. Toneladas\n"
                + "2. Hectogramos\n"
                + "3. Gramos\n"
                + "4. Deciagramos\n"
                + "5. Centigramos\n"
                + "6. Miligramos\n"
                + "SALIR -> Cualquier tecla"));
        
        kg = Float.parseFloat(JOptionPane.showInputDialog("Introduzca los KiloGramos(Kg)"));
        
        switch(opc){
            case 1:
                nueva = kg/1000;
                JOptionPane.showMessageDialog(null, "La nueva cantidad son "+nueva+" toneladas");
                break;
            case 2:
                nueva = kg*10;
                JOptionPane.showMessageDialog(null, "La nueva cantidad son "+nueva+" hectagramos");
                break;
            case 3:
                nueva = kg*1000;
                JOptionPane.showMessageDialog(null, "La nueva cantidad son "+nueva+" gramos");
                break;
            case 4:
                nueva = kg*10000;
                JOptionPane.showMessageDialog(null, "La nueva cantidad son "+nueva+" decigramos");
                break;
            case 5:
                nueva = kg*100000;
                JOptionPane.showMessageDialog(null, "La nueva cantidad son "+nueva+" centigramo");
                break;
            case 6:
                nueva = kg*1000000;
                JOptionPane.showMessageDialog(null, "La nueva cantidad son "+nueva+" miligramos");
                break;
            default:
                break;
        }
        
        
        
    }
    
}
