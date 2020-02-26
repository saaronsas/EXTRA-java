
package pkg54.ejerciciobucles19;

import javax.swing.JOptionPane;


public class EjercicioBucles19 {

    
    public static void main(String[] args) {
        
        float nota;
        int aprobados=0, suspensos=0, sufi=0;
        
        for(int i=0; i<6; i++){
            do{
                nota = Float.parseFloat(JOptionPane.showInputDialog("Introduzca la nota "+(i+1)));
            }while(nota<0||nota>10);
            
            if(nota==4){
                sufi++;
            }else if(nota>5){
                aprobados++;
            }else if(nota<4){
                suspensos++;
            }
                
        }
        System.out.println("Cantidad de aprovados "+aprobados);
        System.out.println("Cantidad de condicionados "+sufi);
        System.out.println("Cantidad de suspensos "+suspensos);
        
        
    }
    
}
