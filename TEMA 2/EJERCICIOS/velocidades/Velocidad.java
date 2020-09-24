import java.util.Scanner;

public class Velocidad{
  public static void main(String[] args){
 
    Scanner in = new Scanner(System.in);
    double veloz = 0, trans = 0;

    System.out.println("¿Vamos a transformar de  km/h  a  m/s ");
    System.out.println("");

    System.out.println("¿Cual es la velocidad que deseas transformar?");
    veloz = in.nextInt();
    System.out.println("");

    trans = veloz / 3.6;

    System.out.println("La respuesta es = " + trans + " m/s");


  }

}