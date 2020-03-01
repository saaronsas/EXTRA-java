
package pkg72.ejercicioarreglos11;

import javax.swing.JOptionPane;


public class EjercicioArreglos11 {

    
    public static void main(String[] args) {
        
        int arreglo[]=new int[6];
        int num, pos=0;
        boolean ordenado=true;
        
        
        do{
            for(int i=0; i<5; i++){
                arreglo[i]=Integer.parseInt(JOptionPane.showInputDialog("Numero "+(i+1)));
            }
            for(int i=0; i<4; i++){
                if(arreglo[i]>arreglo[i+1]){
                    ordenado=false;
                    JOptionPane.showMessageDialog(null, "El arreglo esta desordenado...");
                    break;
                }
            }
        }while(ordenado==false);
        
        num =Integer.parseInt(JOptionPane.showInputDialog("Introduzca un nuevo numero"));
        
        int j=0;
        
        while(arreglo[j]<num&&j<5){
            pos++;
            j++;
        }
        for(int i=4; i>=pos; i--){
            arreglo[i+1]=arreglo[i];
        }
        arreglo[pos]=num;
        
        for(int i:arreglo){
            System.out.println(i+"  ");
        }
    }
    
}
