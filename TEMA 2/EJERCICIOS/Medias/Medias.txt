import java.util.Scanner;

public class Medias{
  public static void main(String[] args){

    Scanner in = new Scanner(System.in);
    String nombre = "", apellidos = "";
    double nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0, nota5 = 0, nota6 = 0, nota7 = 0, nota8 = 0, media = 0;


    System.out.println("¿Cual es tu nombre?");
    nombre = in.nextLine();
    System.out.println("");
    
    System.out.println("¿Cual es son tus apellidos?");
    apellidos = in.nextLine();
    System.out.println("");

    System.out.println("Ahora vamos a calcular tu media");
    System.out.println("");

    System.out.println("¿Cual es tu primera nota?");
    nota1 = in.nextInt();
    System.out.println("");

    System.out.println("¿Cual es tu segunda nota?");
    nota2 = in.nextInt();
    System.out.println("");

    System.out.println("¿Cual es tu tercera nota?");
    nota3 = in.nextInt();
    System.out.println("");

    System.out.println("¿Cual es tu cuarta nota?");
    nota4 = in.nextInt();
    System.out.println("");

    System.out.println("¿Cual es tu quinta nota?");
    nota5 = in.nextInt();
    System.out.println("");

    System.out.println("¿Cual es tu sexta nota?");
    nota6 = in.nextInt();
    System.out.println("");
 
    System.out.println("¿Cual es tu septima nota?");
    nota7 = in.nextInt();
    System.out.println("");   

    System.out.println("¿Cual es tu octava nota?");
    nota8 = in.nextInt();
    System.out.println("");

    
    media = ( nota1 + nota2 + nota3 + nota4 + nota5 + nota6 + nota7 + nota8 ) / 8;

    System.out.println("El alumno " + nombre + " " + apellidos + " tiene una media de " + media);

  }

}