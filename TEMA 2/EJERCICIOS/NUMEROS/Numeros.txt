import java.util.Scanner;

public class Num{
  public static void main(String[] args){

    Scanner in = new Scanner(System.in);
    int numt = 0, num1 = 0, num2 = 0, num3 = 0;

    System.out.println("Ahora vamos a descomprimir un numero de 3 cifras");
    System.out.println("");

    System.out.println("¿Cual es tu numero de 3 cifras?");
    numt = in.nextInt();
    System.out.println("");

    num1 = numt / 100;
    num2 = ( numt - num1 * 100 ) / 10;
    num3 = ( numt - ( num1 * 100 + num2 * 10 ) );

    System.out.println("los numero descomprimidos son  " + num1 + ", " + num2 + ", " + num3);
 
 }

}