import java.util.Scanner;

public class Dec{
  public static void main(String[] args){

    Scanner in = new Scanner(System.in);
    double num1 = 0, num2 = 0, suma = 0, resta = 0, multi = 0, divis = 0, modul = 0;

    
    System.out.println("VAMOS A SUMAR, DIVIDIR, MULTIPLICAR Y CALCULAR EL MODULO DE DOS NUMEROS DECIMALES");
    System.out.println("");

    System.out.println("Tu primer numero");
    num1 = in.nextDouble();
    System.out.println("");

    System.out.println("Tu segundo numero");
    num2 = in.nextDouble();
    System.out.println("");


    suma = num1 + num2;
    
    resta = num1 - num2;
    
    multi = num1 * num2;

    divis = num1 / num2;
 
    modul = num1 % num2;


    System.out.println("La suma es = " + suma);
    System.out.println("");

    System.out.println("La resta es = " + resta);
    System.out.println("");

    System.out.println("La multiplicacion es = " + multi);
    System.out.println("");

    System.out.println("La division es = " + divis);
    System.out.println("");

    System.out.println("El modulo es = " + modul);
    System.out.println("");
            


  }

}