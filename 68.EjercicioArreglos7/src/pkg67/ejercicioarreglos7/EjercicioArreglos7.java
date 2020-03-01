
package pkg67.ejercicioarreglos7;

import javax.swing.JOptionPane;


public class EjercicioArreglos7 {

    
    public static void main(String[] args) {
        
        int arreglo[] = new int[5];
        int var=0;
        
        for(int i=0; i<5; i++){
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Numero "+(i+1)));
        }
        for(int i=0; i<4; i++){
            if(arreglo[i]<arreglo[i+1]){
                var++;
            }
        }
        switch(var){
            case 0:
                JOptionPane.showMessageDialog(null, "El arreglo esta en forma descendente");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "El arreglo esta en forma ascendente");
                break;
            default:
                JOptionPane.showMessageDialog(null, "El arreglo esta desordenado");
                break;
        }
        
    }
    
}
