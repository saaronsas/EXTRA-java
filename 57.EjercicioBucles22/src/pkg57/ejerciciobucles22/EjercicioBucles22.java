
package pkg57.ejerciciobucles22;

import javax.swing.JOptionPane;


public class EjercicioBucles22 {

    
    public static void main(String[] args) {
        
        float nota;
        boolean suspenso=false;
        
        for(int i=0; i<5; i++){
            do{
                nota = Float.parseFloat(JOptionPane.showInputDialog("Introduzca la nota "+(i+1)));
            }while(nota<0||nota>10);
            
            
            if(nota<5){
                suspenso=true;
            }
        }
        if(suspenso==true){
            System.out.println("Hay algun suspendido");
        }else{
            System.out.println("No hay ningun suspendido5");
        }
    }
    
}
