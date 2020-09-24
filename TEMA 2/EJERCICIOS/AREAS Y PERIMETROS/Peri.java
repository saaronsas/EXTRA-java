import java.util.Scanner;

public class Peri{
  public static void main(String[] args){

    Scanner in = new Scanner(System.in);
    int lado1 = 0, lado2 = 0, perimetro = 0, area = 0;

    System.out.println("Dame un lado del rectangulo");
    lado1 = in.nextInt();
    System.out.println("");

    System.out.println("Dame el otro lado del rectangulo");
    lado2 = in.nextInt();
    System.out.println("");

    perimetro = lado1 * 2 + lado2 * 2;
    area = lado1 * lado2;
    System.out.println("El perimetro es =" + perimetro + "y el area es =" + area);

    
  }

}
