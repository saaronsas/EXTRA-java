/*

BUSQUEDA SECUENCIAL

*/

package pkg81.busquedas;

import javax.swing.JOptionPane;


public class Busquedas {

    
    public static void main(String[] args) {
        
        int arreglo[]={4,3,2,1,5};
        int dato;
        boolean var=false;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("Introduzca su numero"));
        
        //Busqueda Secuencial
        int i=0;
        while(i<5 && var==false){
            if(arreglo[i]==dato){
                var = true;
            }
            i++;
        }
        if(var==false){
            JOptionPane.showMessageDialog(null, "El numero no se encuentra en el arreglo");
        } else{
            JOptionPane.showMessageDialog(null, "El numero "+dato+" ha sido encontrado en "+(i-1));
            
        }
        
    }
    
}
