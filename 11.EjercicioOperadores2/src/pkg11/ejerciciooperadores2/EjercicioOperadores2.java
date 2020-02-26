
package pkg11.ejerciciooperadores2;

import java.util.Scanner;

public class EjercicioOperadores2 {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float horas, salario, coste;
        
        System.out.print("Introduzca horas trabajadas: ");
        horas=in.nextFloat();
        System.out.print("Introduzca el precio/hora: ");
        coste=in.nextFloat();
        
        salario=horas*coste;
        
        System.out.println("El empleado a trabajado "+horas+" horas y va a cobrar "+salario+" euros");
    }
    
}
